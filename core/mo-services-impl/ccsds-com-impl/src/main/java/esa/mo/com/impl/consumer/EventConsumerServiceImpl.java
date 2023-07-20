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
package esa.mo.com.impl.consumer;

import esa.mo.com.impl.util.EventCOMObject;
import esa.mo.com.impl.util.EventReceivedListener;
import esa.mo.com.impl.util.HelperCOM;
import esa.mo.helpertools.connections.SingleConnectionDetails;
import esa.mo.helpertools.helpers.HelperAttributes;
import esa.mo.helpertools.misc.ConsumerServiceImpl;
import java.net.MalformedURLException;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.ccsds.moims.mo.com.COMHelper;
import org.ccsds.moims.mo.com.event.EventHelper;
import org.ccsds.moims.mo.com.event.consumer.EventAdapter;
import org.ccsds.moims.mo.com.event.consumer.EventStub;
import org.ccsds.moims.mo.com.structures.ObjectDetails;
import org.ccsds.moims.mo.com.structures.ObjectType;
import org.ccsds.moims.mo.mal.MALContextFactory;
import org.ccsds.moims.mo.mal.MALException;
import org.ccsds.moims.mo.mal.MALHelper;
import org.ccsds.moims.mo.mal.MALInteractionException;
import org.ccsds.moims.mo.mal.consumer.MALConsumer;
import org.ccsds.moims.mo.mal.structures.AttributeList;
import org.ccsds.moims.mo.mal.structures.Element;
import org.ccsds.moims.mo.mal.structures.Identifier;
import org.ccsds.moims.mo.mal.structures.IdentifierList;
import org.ccsds.moims.mo.mal.structures.Subscription;
import org.ccsds.moims.mo.mal.structures.SubscriptionList;
import org.ccsds.moims.mo.mal.structures.UShort;
import org.ccsds.moims.mo.mal.structures.UpdateHeader;
import org.ccsds.moims.mo.mal.transport.MALMessageHeader;

/**
 *
 * @author Cesar Coelho
 */
public class EventConsumerServiceImpl extends ConsumerServiceImpl {

    private EventStub eventService = null;
    private SubscriptionList subs = new SubscriptionList();

    @Override
    public Object generateServiceStub(MALConsumer tmConsumer) {
        return new EventStub(tmConsumer);
    }

    @Override
    public Object getStub() {
        return this.getEventStub();
    }

    public EventStub getEventStub() {
        return eventService;
    }

    public EventConsumerServiceImpl(SingleConnectionDetails connectionDetails) throws MALException, MALInteractionException, MalformedURLException {
        if (MALContextFactory.lookupArea(MALHelper.MAL_AREA_NAME, MALHelper.MAL_AREA_VERSION) == null) {
            MALHelper.init(MALContextFactory.getElementsRegistry());
        }

        if (MALContextFactory.lookupArea(COMHelper.COM_AREA_NAME, COMHelper.COM_AREA_VERSION) == null) {
            COMHelper.init(MALContextFactory.getElementsRegistry());
        }

        try {
            EventHelper.init(MALContextFactory.getElementsRegistry());
        } catch (MALException ex) {
            // nothing to be done..
        }

        this.connectionDetails = connectionDetails;

        // Close old connection
        if (tmConsumer != null) {
            try {
                final Identifier subscriptionId = new Identifier("SUB");
                final IdentifierList subLst = new IdentifierList();
                subLst.add(subscriptionId);

                for (Subscription sub : subs) {
                    subLst.add(sub.getSubscriptionId());
                }

                if (eventService != null) {
                    eventService.monitorEventDeregister(subLst);
                }

                subs = new SubscriptionList();
                tmConsumer.close();
            } catch (MALException ex) {
                Logger.getLogger(EventConsumerServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            } catch (MALInteractionException ex) {
                Logger.getLogger(EventConsumerServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        tmConsumer = connection.startService(
                this.connectionDetails.getProviderURI(),
                this.connectionDetails.getBrokerURI(),
                this.connectionDetails.getDomain(),
                EventHelper.EVENT_SERVICE);

        this.eventService = new EventStub(tmConsumer);
    }

    public void addEventReceivedListener(final Subscription subscription, final EventReceivedListener eventReceivedListener) {

        // Make the event adapter to call the eventReceivedListener when there's a new object available
        class EventReceivedAdapter extends EventAdapter {

            @Override
            public void monitorEventNotifyReceived(final MALMessageHeader msgHeader,
                    final Identifier lIdentifier, final UpdateHeader lUpdateHeader,
                    final ObjectDetails objectDetails, final Element element,
                    Map qosProperties) {

                        /*
                        Identifier entityKey1 = lUpdateHeaderList.get(i).getKey().getFirstSubKey();
                        Long entityKey2 = lUpdateHeaderList.get(i).getKey().getSecondSubKey();
                        Long entityKey3 = lUpdateHeaderList.get(i).getKey().getThirdSubKey();
                        Long entityKey4 = lUpdateHeaderList.get(i).getKey().getFourthSubKey(); // ObjType of the source
                        */

                        AttributeList subkeys = lUpdateHeader.getKeyValues();
                        Identifier entityKey1 = (Identifier) subkeys.get(0);
                        Long entityKey2 = (Long) subkeys.get(1);
                        Long entityKey3 = (Long) subkeys.get(2);
                        Long entityKey4 = (Long) subkeys.get(3); // ObjType of the source
                        /*
                        Long entityKey2 = (Long) HelperAttributes.attribute2JavaType(subkeys.get(1).getValue());
                        Long entityKey3 = (Long) HelperAttributes.attribute2JavaType(subkeys.get(2).getValue());
                        Long entityKey4 = (Long) HelperAttributes.attribute2JavaType(subkeys.get(3).getValue()); // ObjType of the source
                        */
                        // (UShort area, UShort service, UOctet version, UShort number)
                        // (UShort area, UShort service, UOctet version, 0)
                        ObjectType objType = HelperCOM.objectTypeId2objectType(entityKey2);
                        objType.setNumber(new UShort(Integer.parseInt(entityKey1.toString())));

                        Object nativeBody = element;
                        Element body = (Element) HelperAttributes.javaType2Attribute(nativeBody);

                        // ----
                        EventCOMObject newEvent = new EventCOMObject();
//                        newEvent.setDomain(msgHeader.getDomain());
                        newEvent.setDomain(connectionDetails.getDomain());
                        newEvent.setObjType(objType);
                        newEvent.setObjId(entityKey3);

                        newEvent.setSource(objectDetails.getSource());
                        newEvent.setRelated(objectDetails.getRelated());
                        newEvent.setBody(body);

                        newEvent.setTimestamp(msgHeader.getTimestamp());
                        newEvent.setSourceURI(msgHeader.getFromURI());
                        //newEvent.setNetworkZone(msgHeader.getNetworkZone());
                        // ----

                        // Push the data to the listener
                        eventReceivedListener.onDataReceived(newEvent);
                    }
        }

        try {  // Register with the subscription key provided
            this.getEventStub().monitorEventRegister(subscription, new EventReceivedAdapter());
            subs.add(subscription);
        } catch (MALInteractionException ex) {
            Logger.getLogger(EventConsumerServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MALException ex) {
            Logger.getLogger(EventConsumerServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Closes the tmConsumer connection
     *
     */
    @Override
    public void closeConnection() {
        // Close old connection
        if (tmConsumer != null) {
            try {
                final IdentifierList subLst = new IdentifierList();

                for (Subscription sub : subs) {
                    subLst.add(sub.getSubscriptionId());
                }

                if (eventService != null) {
                    try {
                        eventService.monitorEventDeregister(subLst);
                    } catch (MALInteractionException ex) {
                        Logger.getLogger(EventConsumerServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

                tmConsumer.close();
            } catch (MALException ex) {
                Logger.getLogger(ConsumerServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
