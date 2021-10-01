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
package esa.mo.nmf.nmfpackage;

import esa.mo.helpertools.helpers.HelperMisc;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.CRC32;

/**
 *
 * @author Cesar Coelho
 */
public class HelperNMFPackage {

    public static final String RECEIPT_FILENAME = "nmfPackage.receipt";
    public static final String DS_FILENAME = "digitalSignature.key";
    public static final String PRIVATE_KEY_FILENAME = "privateKey.key";
    public static final String NMF_PACKAGE_DESCRIPTOR_VERSION = "NMFPackageDescriptorVersion=";

    public static long calculateCRCFromFile(final String filepath) throws IOException {
        InputStream inputStream = new BufferedInputStream(new FileInputStream(filepath));
        long crc = calculateCRCFromInputStream(inputStream);
        inputStream.close();
        return crc;
    }

    public static long calculateCRCFromInputStream(final InputStream inputStream) throws IOException {
        CRC32 crc = new CRC32();
        int cnt;

        while ((cnt = inputStream.read()) != -1) {
            crc.update(cnt);
        }

        return crc.getValue();
    }

    private static String getBanner(){
        StringBuilder str = new StringBuilder();
        str.append("#######################################################\n");
        str.append("#  This file was auto-generated by the NMF\n");
        str.append("#  during the installation of this App\n");
        str.append("#  We do not advise to change it directly!\n");
        str.append("#  The file is generated by the class: HelperNMFPackage\n");
        str.append("#######################################################\n");
        str.append("\n");
        return str.toString();
    }

    public static String generateLinuxStartAppScript(String javaCommand,
            String mainclass, String jarFilename, String maxHeap) throws IOException {
        StringBuilder str = new StringBuilder();
        str.append("#!/bin/sh\n");
        str.append(getBanner());
        str.append("cd ${0%/*}\n");
        str.append("\n");

        str.append("# Constants set at installation time:\n");
        str.append("JAVA_CMD=").append(javaCommand).append("\n");
        str.append("MAIN_JAR_NAME=").append(jarFilename).append("\n");
        str.append("MAIN_CLASS_NAME=").append(mainclass).append("\n");
        str.append("MAX_HEAP=").append(maxHeap).append("\n");
        // The NMF_LIB must be also hard-coded! The following code must be changed:
        str.append("NMF_LIB=").append("`cd ../../libs > /dev/null; pwd`").append("\n");
        str.append("\n");

        str.append("if [ -z \"$JAVA_OPTS\" ] ; then\n");
        str.append("    JAVA_OPTS=\"-Xms32m -Xmx$MAX_HEAP $JAVA_OPTS\"\n");
        str.append("fi\n");
        str.append("\n");

        str.append("export JAVA_OPTS\n");
        str.append("export NMF_LIB\n");
        str.append("\n");

        str.append("exec $JAVA_CMD $JAVA_OPTS \\\n");
        str.append("  -classpath \"$NMF_LIB/*:$MAIN_JAR_NAME\" \\\n");
        str.append("  \"$MAIN_CLASS_NAME\" \\\n");
        str.append("  \"$@\"\n");

        return str.toString();
    }

    public static String generateProviderProperties(String runAs) throws IOException {
        StringBuilder str = new StringBuilder();
        str.append(getBanner());
        str.append("# MO App configurations\n");
        str.append(HelperMisc.PROP_ORGANIZATION_NAME).append("=").append("esa\n");
        str.append(HelperMisc.APP_CATEGORY).append("=").append("NMF_App\n");
        if (runAs != null) {
            str.append(HelperMisc.APP_USER).append("=").append(runAs).append("\n");
        }
        str.append("\n");

        str.append("# Enables the new Home directory mode: \n");
        str.append(HelperMisc.PROP_WORK_DIR_STORAGE_MODE + "=" + "2\n");
        str.append("\n");
        str.append("# NanoSat MO Framework transport configuration\n");
        str.append("helpertools.configurations.provider.transportfilepath=transport.properties\n");
        str.append("\n");
        str.append("# NanoSat MO Framework Settings\n");
        str.append("esa.mo.nanosatmoframework.provider.settings=settings.properties\n");
        str.append("\n");
        str.append("# NanoSat MO Framework dynamic configurations\n");
        str.append("esa.mo.nanosatmoframework.provider.dynamicchanges=true\n");
        str.append("\n");
        str.append("# Cleanup space archive from synchronised objects\n");
        str.append("esa.mo.nanosatmoframework.archivesync.purgearchive=true\n");

        return str.toString();
    }

    public static String generateTransportProperties() throws IOException {
        StringBuilder str = new StringBuilder();
        str.append(getBanner());
        str.append("# The following property sets the protocol to be used:\n");
        str.append("org.ccsds.moims.mo.mal.transport.default.protocol = maltcp://\n");
        str.append("\n");

        str.append("# TCP/IP protocol properties:\n");
        str.append("org.ccsds.moims.mo.mal.transport.protocol.maltcp=esa.mo.mal.transport.tcpip.TCPIPTransportFactoryImpl\n");
        str.append("org.ccsds.moims.mo.mal.encoding.protocol.maltcp=esa.mo.mal.encoder.binary.fixed.FixedBinaryStreamFactory\n");

        // Bind to localhost
        str.append("org.ccsds.moims.mo.mal.transport.tcpip.autohost=false\n");
        str.append("org.ccsds.moims.mo.mal.transport.tcpip.host=localhost\n");
        str.append("org.ccsds.moims.mo.mal.transport.tcpip.port=1025\n");

        /*
        str.append("org.ccsds.moims.mo.mal.transport.tcpip.autohost=true\n");
        str.append("#org.ccsds.moims.mo.mal.transport.tcpip.host=xxx.xxx.xxx.xxx\n");
        str.append("#org.ccsds.moims.mo.mal.transport.tcpip.port=54321\n");
         */
        return str.toString();
    }

    public static File findAppJarInFolder(File folder) throws IOException {
        File[] fList = folder.listFiles();
        ArrayList<File> possibleOptions = new ArrayList();

        for (File file : fList) {
            if (file.isDirectory()) {
                continue; // Jump over if it is a directory
            }

            if (!file.getAbsolutePath().endsWith(".jar")) {
                continue; // It is not a Jar file
            }

            possibleOptions.add(file);
        }

        if (possibleOptions.isEmpty()) {
            throw new IOException("Not found!");
        }

        if (possibleOptions.size() == 1) {
            return possibleOptions.get(0);
        }

        if (possibleOptions.size() == 2) {
            for (File option : possibleOptions) {
                if (option.getName().contains("-jar-with-dependencies.jar")) {
                    return option;
                }
            }
        }

        throw new IOException("There are too many jars inside the target folder!");
    }

    /**
     * Find the best Java Runtime Environment inside an nmf directory. The best
     * JRE will be determined based on arguments containing a recommended
     * version, a minimum version, and a maximum version.
     *
     * @param recommended The recommended version to run the App.
     * @param min The minimum version needed to run the App.
     * @param max The maximum version to run the App.
     * @return The Best JRE available for .
     */
    public static String findJREPath(File nmfDir, int recommended, int min, int max) {
        if (min < max) {
            Logger.getLogger(HelperNMFPackage.class.getName()).log(Level.WARNING,
                    "The JRE minimum version cannot be greater than the maximum!");
        }

        if (recommended < min || recommended > max) {
            Logger.getLogger(HelperNMFPackage.class.getName()).log(Level.WARNING,
                    "The JRE recommended version should be between the min and max!");
        }

        File javaNMFDir = new File(nmfDir.getAbsolutePath() + File.separator + "java");
        String bestJRE = "java"; // Default value and worst-case scenario

        if (!javaNMFDir.exists()) {
            return bestJRE; // Return the default value
        }

        final String VERSION_PROP = "JAVA_VERSION";
        File[] list = javaNMFDir.listFiles();

        for (File dir : list) {
            if (!dir.isDirectory()) {
                continue; // Jump over if it is not a directory
            }

            try {
                // Check which java version it is from the release file...
                String path = dir.getAbsolutePath();
                File release = new File(path + File.separator + "release");

                if (!release.exists()) {
                    Logger.getLogger(HelperNMFPackage.class.getName()).log(
                            Level.WARNING, "The JRE release file does not "
                            + "exist in: " + release.getAbsolutePath());
                    continue;
                }

                Properties props = new Properties();
                props.load(new FileInputStream(release));
                String version = (String) props.get(VERSION_PROP);

                if (version == null) {
                    Logger.getLogger(HelperNMFPackage.class.getName()).log(
                            Level.WARNING, "The JAVA_VERSION property "
                            + "was not be found on release file: " + path);
                    continue;
                }

                String[] subs = version.replace("\"", "").split("\\.");

                if (subs.length < 3) {
                    Logger.getLogger(HelperNMFPackage.class.getName()).log(
                            Level.WARNING, "The JRE version '" + version
                            + "' could not be determined from the release file: "
                            + release.getAbsolutePath());
                    continue;
                }

                // Java version used to start with 1 until at least Java 8
                int java_version = (Integer.parseInt(subs[0]) != 1)
                        ? Integer.parseInt(subs[0])
                        : Integer.parseInt(subs[1]);

                String jre = dir.getAbsolutePath() + File.separator
                        + "bin" + File.separator + "java";

                if (!(new File(jre)).exists()) {
                    Logger.getLogger(HelperNMFPackage.class.getName()).log(
                            Level.WARNING,
                            "The JRE could not found in directory: " + path);
                    continue;
                }

                if (java_version == recommended) {
                    // Perfect, just return it directly!
                    Logger.getLogger(HelperNMFPackage.class.getName()).log(
                            Level.INFO, "The JRE version " + java_version
                            + " was successfully found in directory:"
                            + "\n          >> " + jre);

                    return jre;
                }

                // The version is outside boundaries?
                if (java_version < min && java_version > max) {
                    continue;
                }
                bestJRE = jre;
                // The code here will need to be improved...
                // The objective should be to return the
                // highest available version within the choices
            } catch (FileNotFoundException ex) {
                Logger.getLogger(HelperNMFPackage.class.getName()).log(
                        Level.WARNING, "Something went wrong...", ex);
            } catch (IOException ex) {
                Logger.getLogger(HelperNMFPackage.class.getName()).log(
                        Level.WARNING, "Something went wrong...", ex);
            }
        }

        return bestJRE;
    }
}
