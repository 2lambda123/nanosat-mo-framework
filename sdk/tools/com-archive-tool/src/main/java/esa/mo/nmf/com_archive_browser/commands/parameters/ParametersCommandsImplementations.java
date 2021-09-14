/* ----------------------------------------------------------------------------
 * Copyright (C) 2021      European Space Agency
 *                         European Space Operations Centre
 *                         Darmstadt
 *                         Germany
 * ----------------------------------------------------------------------------
 * System                : ESA NanoSat MO Framework
 * ----------------------------------------------------------------------------
 * Licensed under European Space Agency Public License (ESA-PL) Weak Copyleft – v2.4
 * You may not use this file except in compliance with the License.
 *
 * Except as expressly set forth in this License, the Software is provided to
 * You on an "as is" basis and without warranties of any kind, including without
 * limitation merchantability, fitness for a particular purpose, absence of
 * defects or errors, accuracy or non-infringement of intellectual property rights.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ----------------------------------------------------------------------------
 */
package esa.mo.nmf.com_archive_browser.commands.parameters;

import esa.mo.com.impl.provider.ArchiveProviderServiceImpl;
import esa.mo.helpertools.helpers.HelperTime;
import esa.mo.nmf.NMFConsumer;
import esa.mo.nmf.com_archive_browser.adapters.ArchiveToParametersAdapter;
import org.ccsds.moims.mo.com.archive.structures.ArchiveQuery;
import org.ccsds.moims.mo.com.archive.structures.ArchiveQueryList;
import org.ccsds.moims.mo.com.structures.ObjectType;
import org.ccsds.moims.mo.mal.structures.FineTime;
import org.ccsds.moims.mo.mal.structures.Identifier;
import org.ccsds.moims.mo.mal.structures.UShort;
import org.ccsds.moims.mo.mc.MCHelper;
import org.ccsds.moims.mo.mc.parameter.ParameterHelper;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import static esa.mo.nmf.com_archive_browser.ArchiveBrowserHelper.*;

/**
 * @author marcel.mikolajko
 */
public class ParametersCommandsImplementations {

    private static final Logger LOGGER = Logger.getLogger(ParametersCommandsImplementations.class.getName());

    /**
     * Lists parameters for the specified NMF app.
     *
     * @param databaseFile Local SQLite database file
     * @param providerURI The URI of the remote COM archive provider
     * @param appName Name of the NMF app we want the parameters for
     */
    public static void listParameters(String databaseFile, String providerURI, String appName) {
        NMFConsumer consumer = createConsumer(providerURI);

        if(consumer == null) {
            return;
        }
        // spawn our local provider on top of the given database file if needed
        ArchiveProviderServiceImpl localProvider = null;
        if (providerURI == null) {
            localProvider = spawnLocalArchiveProvider(databaseFile);
            providerURI =
                    localProvider.getConnection().getConnectionDetails().getProviderURI().getValue();
        }

        ArchiveQueryList archiveQueryList = new ArchiveQueryList();
        ArchiveQuery archiveQuery = new ArchiveQuery(null, null, null,
                                                     0L, null, null,
                                                     null, null, null);
        archiveQueryList.add(archiveQuery);

        ArchiveToParametersAdapter adapter = new ArchiveToParametersAdapter();
        // execute query
        queryArchive(ParameterHelper.PARAMETERIDENTITY_OBJECT_TYPE, archiveQueryList, adapter, adapter, consumer);

        // shutdown local provider if used
        if (localProvider != null) {
            localProvider.close();
        }

        // Display list of NMF apps that have logs
        List<Identifier> parameters = adapter.getParameterIdentities();
        if (parameters.size() <= 0) {
            System.out.println("No parameters found in the provided archive: " + appName);
        } else {
            System.out.println("Found the following parameters: ");
            for (Identifier parameter : parameters) {
                System.out.println("\t - " + parameter);
            }
        }
        closeConsumer(consumer);
    }

    /**
     * Dumps parameters of an NMF app to a file
     *
     * @param databaseFile Local SQLite database file
     * @param providerURI The URI of the remote COM archive provider
     * @param appName Name of the NMF app we want the logs for
     * @param startTime Restricts the dump to objects created after the given time
     * @param endTime Restricts the dump to objects created before the given time. If this option is
     *        provided without the -s option, returns the single object that has the closest time
     *        stamp to, but not greater than endTime.
     * @param file target file
     */
    public static void getParameters(String databaseFile, String providerURI, String appName,
                                     String startTime, String endTime, String file) {
        NMFConsumer consumer = createConsumer(providerURI);

        if(consumer == null) {
            return;
        }
        // Query all objects from SoftwareManagement area and CommandExecutor service,
        // filtering for StandardOutput and StandardError events is done in the query adapter
        ObjectType objectsTypes = new ObjectType(MCHelper.MC_AREA_NUMBER,
                                                 ParameterHelper.PARAMETER_SERVICE_NUMBER,
                                                 MCHelper.MC_AREA_VERSION,
                                                 new UShort(0));

        // spawn our local provider on top of the given database file if needed
        ArchiveProviderServiceImpl localProvider = null;
        if (providerURI == null) {
            localProvider = spawnLocalArchiveProvider(databaseFile);
            providerURI =
                    localProvider.getConnection().getConnectionDetails().getProviderURI().getValue();
        }

        // prepare domain, time and object id filters
        ArchiveQueryList archiveQueryList = new ArchiveQueryList();
        FineTime startTimeF = startTime == null ? null : HelperTime.readableString2FineTime(startTime);
        FineTime endTimeF = endTime == null ? null : HelperTime.readableString2FineTime(endTime);
        ArchiveQuery archiveQuery = new ArchiveQuery(null, null, null, 0L, null,
                                                     startTimeF, endTimeF, null, null);
        archiveQueryList.add(archiveQuery);

        // execute query
        ArchiveToParametersAdapter adapter = new ArchiveToParametersAdapter();
        queryArchive(objectsTypes, archiveQueryList, adapter, adapter, consumer);

        try {
            Map<Identifier, List<ArchiveToParametersAdapter.TimestampedParameterValue>> parameters = adapter.getParameterValues();
            FileWriter writer = new FileWriter(file);

            for(Map.Entry<Identifier, List<ArchiveToParametersAdapter.TimestampedParameterValue>> entry : parameters.entrySet()) {
                for(ArchiveToParametersAdapter.TimestampedParameterValue value : entry.getValue()) {
                    String line = entry.getKey() + "\t" + value.getTimestamp() + "\t" + value.getParameterValue().getRawValue() + "\n";
                    writer.write(line);
                }
            }

            writer.close();
        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, "Error when writing to file", e);
        }

        // shutdown local provider if used
        if (localProvider != null) {
            localProvider.close();
        }
        closeConsumer(consumer);
    }
}
