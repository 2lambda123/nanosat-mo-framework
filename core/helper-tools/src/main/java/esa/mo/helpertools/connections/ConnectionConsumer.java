/* ----------------------------------------------------------------------------
 * Copyright (C) 2015      European Space Agency
 *                         European Space Operations Centre
 *                         Darmstadt
 *                         Germany
 * ----------------------------------------------------------------------------
 * System                : ESA NanoSat MO Framework
 * ----------------------------------------------------------------------------
 * Licensed under the European Space Agency Public License, Version 2.0
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
package esa.mo.helpertools.connections;

import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.util.Properties;
import java.util.Random;
import org.ccsds.moims.mo.mal.MALContext;
import org.ccsds.moims.mo.mal.MALContextFactory;
import org.ccsds.moims.mo.mal.MALException;
import org.ccsds.moims.mo.mal.MALService;
import org.ccsds.moims.mo.mal.consumer.MALConsumer;
import org.ccsds.moims.mo.mal.consumer.MALConsumerManager;
import org.ccsds.moims.mo.mal.structures.AttributeList;
import org.ccsds.moims.mo.mal.structures.Blob;
import org.ccsds.moims.mo.mal.structures.Identifier;
import org.ccsds.moims.mo.mal.structures.IdentifierList;
import org.ccsds.moims.mo.mal.structures.NamedValue;
import org.ccsds.moims.mo.mal.structures.NamedValueList;
import org.ccsds.moims.mo.mal.structures.QoSLevel;
import org.ccsds.moims.mo.mal.structures.QoSLevelList;
import org.ccsds.moims.mo.mal.structures.Subscription;
import org.ccsds.moims.mo.mal.structures.SubscriptionFilter;
import org.ccsds.moims.mo.mal.structures.SubscriptionFilterList;
import org.ccsds.moims.mo.mal.structures.UInteger;
import org.ccsds.moims.mo.mal.structures.URI;
import org.ccsds.moims.mo.mal.structures.Union;

/**
 * The class responsible for starting the MAL layer and takes care of
 * establishing the connection to the Provider set. The URIs of the service and
 * broker must be provided directly to the operations. The class contains a
 * holder for the connection details but it does not necessarily means that the
 * class is connected to these.
 *
 * @author Cesar Coelho
 */
public class ConnectionConsumer {

    private final ConfigurationConsumer configuration = new ConfigurationConsumer();
    private MALContextFactory malFactory;
    private MALContext mal;
    private MALConsumerManager consumerMgr;
    private ServicesConnectionDetails servicesDetails = new ServicesConnectionDetails();
    private MALConsumer tmConsumer;

    public ServicesConnectionDetails getServicesDetails() {
        return servicesDetails;
    }

    public void setServicesDetails(ServicesConnectionDetails servicesDetails) {
        this.servicesDetails = servicesDetails;
    }

    public void setProperty(String property, String value) {
        System.setProperty(property, value);
    }

    /**
     * A getter for the ConfigurationConsumer class.
     *
     * @return the configuration
     */
    public ConfigurationConsumer getConfiguration() {
        return configuration;
    }

    /**
     * Returns the consumers local URI or null if the consumer was not started.
     *
     * @return The URI.
     */
    public URI getConsumerURI() {
        return (tmConsumer == null) ? null : tmConsumer.getURI();
    }

    /**
     * Initializes the MAL
     *
     * @throws org.ccsds.moims.mo.mal.MALException when there's an error during
     * the initialization of the MAL
     */
    public void startMAL() throws MALException {
        malFactory = MALContextFactory.newFactory();
        Properties props = new Properties();
        props.putAll(System.getProperties());
        mal = malFactory.createMALContext(props);
        consumerMgr = mal.createConsumerManager();
    }

    /**
     * Starts the MALConsumer and creates the MAL consumer for the provided URIs
     * and domain.
     *
     * @param uriP The service provider URI
     * @param uriB The broker URI
     * @param domain The service domain
     * @param malService Definition of the consumed service
     * @return The MALConsumer
     * @throws org.ccsds.moims.mo.mal.MALException when there's an error during
     * the initialization of the MAL
     * @throws java.net.MalformedURLException when the MALconsumer is not
     * initialized correctly
     */
    public MALConsumer startService(final URI uriP, final URI uriB,
            final IdentifierList domain, final MALService malService)
            throws MALException, MalformedURLException {
        this.startMAL();
        return this.createMALconsumer(uriP, uriB, domain, malService);
    }

    /**
     * Creates the MAL consumer for the provided URIs and domain.
     *
     * @param uriP The service provider URI
     * @param uriB The broker URI
     * @param domain The service domain
     * @param malService Definition of the consumed service
     * @return The MALConsumer
     * @throws org.ccsds.moims.mo.mal.MALException when there's an error during
     * the initialization of the MAL
     * @throws java.net.MalformedURLException when the MALconsumer is not
     * initialized correctly
     */
    public MALConsumer createMALconsumer(final URI uriP, final URI uriB,
            final IdentifierList domain, final MALService malService)
            throws MALException, MalformedURLException {

        Properties props = new Properties();
        props.putAll(System.getProperties());

        tmConsumer = consumerMgr.createConsumer((String) null,
                uriP,
                uriB,
                malService,
                new Blob("".getBytes()),
                domain,
                configuration.getNetwork(),
                configuration.getSession(),
                configuration.getSessionName(),
                QoSLevel.ASSURED,
                props,
                new UInteger(0),
                new NamedValueList());

        return tmConsumer;
    }

    /**
     * Creates the MAL consumer for the provided URIs, domain and properties.
     *
     * @param uriP The service provider URI
     * @param uriB The broker URI
     * @param domain The service domain
     * @param qosLevels
     * @param priorityLevels
     * @param malService Definition of the consumed service
     * @return The MALConsumer
     * @throws org.ccsds.moims.mo.mal.MALException when there's an error during
     * the initialization of the MAL
     * @throws java.net.MalformedURLException when the MALconsumer is not
     * initialized correctly
     */
    public MALConsumer startService(final URI uriP, final URI uriB,
            final IdentifierList domain, final QoSLevelList qosLevels,
            final UInteger priorityLevels, final MALService malService)
            throws MALException, MalformedURLException {

        this.startMAL();
        QoSLevel qosLevel = QoSLevel.BESTEFFORT;  // Worst case scenario

        for (QoSLevel entry : qosLevels) {  // Check if ASSURED is available
            if (entry.equals(QoSLevel.BESTEFFORT)) {
                qosLevel = entry;
            }
        }

        Properties props = new Properties();
        props.putAll(System.getProperties());

        tmConsumer = consumerMgr.createConsumer((String) null,
                uriP,
                uriB,
                malService,
                new Blob("".getBytes()),
                domain,
                configuration.getNetwork(),
                configuration.getSession(),
                configuration.getSessionName(),
                qosLevel,
                props,
                priorityLevels,
                new NamedValueList());

        return tmConsumer;
    }

    /**
     * Loads the URIs from the default properties file
     *
     * @return The connection details object generated from the file
     * @throws java.net.MalformedURLException when the MALconsumer is not
     * initialized correctly
     * @throws java.io.FileNotFoundException if the file with URIs has not been found
     */
    public ServicesConnectionDetails loadURIs() throws MalformedURLException, FileNotFoundException {
        return servicesDetails.loadURIFromFiles();
    }

    /**
     * Loads the URIs from the selected file
     *
     * @param filename The filename of the file
     * @return The connection details object generated from the file
     * @throws java.net.MalformedURLException when the MALconsumer is not
     * initialized correctly
     * @throws java.io.FileNotFoundException if the file with URIs has not been found
     */
    public ServicesConnectionDetails loadURIs(String filename) throws MalformedURLException, FileNotFoundException {
        return servicesDetails.loadURIFromFiles(filename);
    }

    /**
     * Returns a subscription object with wildcards in all four fields of the
     * entity keys field
     *
     * @return The subscription object
     */
    public static Subscription subscriptionWildcard() {
        final Identifier subscriptionId = new Identifier("SUB");
        return ConnectionConsumer.subscriptionWildcard(subscriptionId);
    }

    /**
     * Returns a subscription object with wildcards in all four fields of the
     * entity keys field
     *
     * @return The subscription object
     */
    public static Subscription subscriptionWildcardRandom() {
        final Random random = new Random();
        final Identifier subscriptionId = new Identifier("SUB" + Integer.toString(random.nextInt()));
        return ConnectionConsumer.subscriptionWildcard(subscriptionId);
    }

    /**
     * Returns a subscription object with the entity keys field set as the
     * provided keys
     *
     * @param key1 First key
     * @param key2 Second key
     * @param key3 Third key
     * @param key4 Fourth key
     * @return The subscription object
     */
    public static Subscription subscriptionKeys(final Identifier key1,
            final Long key2, final Long key3, final Long key4) {
        final Identifier subscriptionId = new Identifier("SUB");
        SubscriptionFilterList subkeys = new SubscriptionFilterList();
        subkeys.add(new SubscriptionFilter(new Identifier("key1"), new AttributeList(key1)));
        subkeys.add(new SubscriptionFilter(new Identifier("key2"), new AttributeList(new Union(key2))));
        subkeys.add(new SubscriptionFilter(new Identifier("key3"), new AttributeList(new Union(key3))));
        subkeys.add(new SubscriptionFilter(new Identifier("key4"), new AttributeList(new Union(key4))));
        return ConnectionConsumer.subscriptionKeys(subscriptionId, subkeys);
    }

    /**
     * Returns a subscription object with wildcards in all four fields of the
     * entity keys field
     *
     * @param subscriptionId The subscription Identifier
     * @return The subscription object
     */
    public static Subscription subscriptionWildcard(final Identifier subscriptionId) {
        return new Subscription(subscriptionId, null, null, null);
    }

    /**
     * Returns a subscription object with the entity keys field set as the
     * provided keys
     *
     * @param subscriptionId The subscription Identifier
     * @param filters The subscription filters.
     * @return The subscription object
     */
    public static Subscription subscriptionKeys(final Identifier subscriptionId,
            SubscriptionFilterList filters) {
        return new Subscription(subscriptionId, null, null, filters);
    }

}
