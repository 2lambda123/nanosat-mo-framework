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
package esa.mo.nmf.ctt.services.mc;

import esa.mo.com.impl.provider.ArchivePersistenceObject;
import esa.mo.com.impl.util.HelperArchive;
import esa.mo.helpertools.connections.ConnectionConsumer;
import esa.mo.mc.impl.consumer.AggregationConsumerServiceImpl;
import esa.mo.tools.mowindow.MOWindow;
import java.io.InterruptedIOException;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.ccsds.moims.mo.com.structures.InstanceBooleanPair;
import org.ccsds.moims.mo.com.structures.InstanceBooleanPairList;
import org.ccsds.moims.mo.mal.MALException;
import org.ccsds.moims.mo.mal.MALInteractionException;
import org.ccsds.moims.mo.mal.MALStandardError;
import org.ccsds.moims.mo.mal.helpertools.helpers.HelperAttributes;
import org.ccsds.moims.mo.mal.structures.AttributeList;
import org.ccsds.moims.mo.mal.structures.Duration;
import org.ccsds.moims.mo.mal.structures.Identifier;
import org.ccsds.moims.mo.mal.structures.IdentifierList;
import org.ccsds.moims.mo.mal.structures.LongList;
import org.ccsds.moims.mo.mal.structures.Subscription;
import org.ccsds.moims.mo.mal.structures.UOctet;
import org.ccsds.moims.mo.mal.structures.UpdateHeader;
import org.ccsds.moims.mo.mal.transport.MALMessageHeader;
import org.ccsds.moims.mo.mc.aggregation.AggregationHelper;
import org.ccsds.moims.mo.mc.aggregation.consumer.AggregationAdapter;
import org.ccsds.moims.mo.mc.aggregation.structures.AggregationCreationRequest;
import org.ccsds.moims.mo.mc.aggregation.structures.AggregationCreationRequestList;
import org.ccsds.moims.mo.mc.aggregation.structures.AggregationDefinitionDetails;
import org.ccsds.moims.mo.mc.aggregation.structures.AggregationDefinitionDetailsList;
import org.ccsds.moims.mo.mc.aggregation.structures.AggregationParameterSet;
import org.ccsds.moims.mo.mc.aggregation.structures.AggregationParameterSetList;
import org.ccsds.moims.mo.mc.aggregation.structures.AggregationSetValue;
import org.ccsds.moims.mo.mc.aggregation.structures.AggregationValue;
import org.ccsds.moims.mo.mc.aggregation.structures.AggregationValueDetails;
import org.ccsds.moims.mo.mc.aggregation.structures.AggregationValueDetailsList;
import org.ccsds.moims.mo.mc.parameter.structures.ParameterValue;
import org.ccsds.moims.mo.mc.structures.ObjectInstancePair;
import org.ccsds.moims.mo.mc.structures.ObjectInstancePairList;

/**
 *
 * @author Cesar Coelho
 */
public class AggregationConsumerPanel extends javax.swing.JPanel {

    private final AggregationConsumerServiceImpl serviceMCAggregation;
    private final AggregationTablePanel aggregationTable;

    /**
     *
     * @param serviceMCAggregation
     */
    public AggregationConsumerPanel(AggregationConsumerServiceImpl serviceMCAggregation) {
        initComponents();

        this.serviceMCAggregation = serviceMCAggregation;
        aggregationTable = new AggregationTablePanel(serviceMCAggregation.getCOMServices().getArchiveService());
        jScrollPane2.setViewportView(aggregationTable);
    }

    public void init() {
        this.listDefinitionAllButtonActionPerformed(null);

        // Subscribe to ParametersValues
        Subscription subscription = ConnectionConsumer.subscriptionWildcard();
        try {
            serviceMCAggregation.getAggregationStub().monitorValueRegister(subscription, new AggregationConsumerAdapter());
        } catch (MALInteractionException ex) {
            Logger.getLogger(AggregationConsumerPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MALException ex) {
            Logger.getLogger(AggregationConsumerPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the
     * formAddModifyParameter. WARNING: Do NOT modify this code. The content of
     * this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        actionDefinitionsTable = new javax.swing.JTable();
        parameterTab = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        getValueButtonAgg1 = new javax.swing.JButton();
        getValueAllButtonAgg = new javax.swing.JButton();
        enableDefinitionButtonAgg = new javax.swing.JButton();
        enableDefinitionAllAgg = new javax.swing.JButton();
        enableFilterButtonAgg = new javax.swing.JButton();
        enableFilterAllAgg = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        addDefinitionButton = new javax.swing.JButton();
        updateDefinitionButton = new javax.swing.JButton();
        removeDefinitionButton = new javax.swing.JButton();
        listDefinitionButton = new javax.swing.JButton();
        listDefinitionAllButton = new javax.swing.JButton();
        removeDefinitionAllButton = new javax.swing.JButton();
        msgBoxOn = new javax.swing.JCheckBox();

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Aggregation Service");
        jLabel6.setToolTipText("");

        jScrollPane2.setHorizontalScrollBar(null);
        jScrollPane2.setPreferredSize(new java.awt.Dimension(796, 380));
        jScrollPane2.setRequestFocusEnabled(false);

        actionDefinitionsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null,  new Boolean(true), null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Obj Inst Id", "name", "description", "rawType", "rawUnit", "generationEnabled", "updateInterval"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.Boolean.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        actionDefinitionsTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        actionDefinitionsTable.setAutoscrolls(false);
        actionDefinitionsTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        actionDefinitionsTable.setMaximumSize(null);
        actionDefinitionsTable.setMinimumSize(null);
        actionDefinitionsTable.setPreferredSize(null);
        actionDefinitionsTable.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                actionDefinitionsTableComponentAdded(evt);
            }
        });
        jScrollPane2.setViewportView(actionDefinitionsTable);

        parameterTab.setLayout(new java.awt.GridLayout(2, 1));

        getValueButtonAgg1.setText("getValue");
        getValueButtonAgg1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getValueButtonAgg1ActionPerformed(evt);
            }
        });
        jPanel1.add(getValueButtonAgg1);

        getValueAllButtonAgg.setText("getValue(0)");
        getValueAllButtonAgg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getValueAllButtonAggActionPerformed(evt);
            }
        });
        jPanel1.add(getValueAllButtonAgg);

        enableDefinitionButtonAgg.setText("enableGeneration");
        enableDefinitionButtonAgg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enableDefinitionButtonAggActionPerformed(evt);
            }
        });
        jPanel1.add(enableDefinitionButtonAgg);

        enableDefinitionAllAgg.setText("enableGeneration(group=false, 0)");
        enableDefinitionAllAgg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enableDefinitionAllAggActionPerformed(evt);
            }
        });
        jPanel1.add(enableDefinitionAllAgg);

        enableFilterButtonAgg.setText("enableFilter");
        enableFilterButtonAgg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enableFilterButtonAggActionPerformed(evt);
            }
        });
        jPanel1.add(enableFilterButtonAgg);

        enableFilterAllAgg.setText("enableFilter(group=false, 0)");
        enableFilterAllAgg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enableFilterAllAggActionPerformed(evt);
            }
        });
        jPanel1.add(enableFilterAllAgg);

        parameterTab.add(jPanel1);

        addDefinitionButton.setText("addDefinition");
        addDefinitionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDefinitionButtonActionPerformed(evt);
            }
        });
        jPanel5.add(addDefinitionButton);

        updateDefinitionButton.setText("updateDefinition");
        updateDefinitionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateDefinitionButtonActionPerformed(evt);
            }
        });
        jPanel5.add(updateDefinitionButton);

        removeDefinitionButton.setText("removeDefinition");
        removeDefinitionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeDefinitionButtonActionPerformed(evt);
            }
        });
        jPanel5.add(removeDefinitionButton);

        listDefinitionButton.setText("listDefinition()");
        listDefinitionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listDefinitionButtonActionPerformed(evt);
            }
        });
        jPanel5.add(listDefinitionButton);

        listDefinitionAllButton.setText("listDefinition(\"*\")");
        listDefinitionAllButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listDefinitionAllButtonActionPerformed(evt);
            }
        });
        jPanel5.add(listDefinitionAllButton);

        removeDefinitionAllButton.setText("removeDefinition(0)");
        removeDefinitionAllButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeDefinitionAllButtonActionPerformed(evt);
            }
        });
        jPanel5.add(removeDefinitionAllButton);

        msgBoxOn.setText("Display Published AggregationValues");
        msgBoxOn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                msgBoxOnActionPerformed(evt);
            }
        });
        jPanel5.add(msgBoxOn);

        parameterTab.add(jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(parameterTab, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 963, Short.MAX_VALUE)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(parameterTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void listDefinitionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listDefinitionButtonActionPerformed
        IdentifierList aggregationNames = new IdentifierList();
        MOWindow aggregationNamesWindow = new MOWindow(aggregationNames, true);

        try {
            IdentifierList list;
            try {
                list = (IdentifierList) aggregationNamesWindow.getObject();
            } catch (InterruptedIOException ex) {
                return;
            }

            ObjectInstancePairList objIds = this.serviceMCAggregation.getAggregationStub().listDefinition(list);

            String str = "Object instance identifiers on the provider: \n";
            for (ObjectInstancePair objId : objIds) {
                str += "ObjId Def: " + objId.getObjDefInstanceId().toString()
                        + " Identity: " + objId.getObjIdentityInstanceId().toString() + "\n";
            }

            JOptionPane.showMessageDialog(null, str, "Returned List from the Provider", JOptionPane.PLAIN_MESSAGE);
        } catch (MALInteractionException ex) {
            Logger.getLogger(AggregationConsumerPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MALException ex) {
            Logger.getLogger(AggregationConsumerPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_listDefinitionButtonActionPerformed

    private void addDefinitionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDefinitionButtonActionPerformed
        // Create and Show the Action Definition to the user
        AggregationDefinitionDetails aggregationDefinition = new AggregationDefinitionDetails();
        aggregationDefinition.setDescription("A aggregation of 2 parameters.");
        aggregationDefinition.setCategory(new UOctet((short) 0));
        aggregationDefinition.setGenerationEnabled(true);
        aggregationDefinition.setReportInterval(new Duration(2));
        aggregationDefinition.setFilterEnabled(false);
        aggregationDefinition.setSendDefinitions(false);
        aggregationDefinition.setSendUnchanged(false);
        aggregationDefinition.setFilteredTimeout(new Duration(5));

        AggregationParameterSetList aggSetList = new AggregationParameterSetList();

        AggregationParameterSet aggSet = new AggregationParameterSet();
        aggSet.setDomain(this.serviceMCAggregation.getConnectionDetails().getDomain());
        aggSet.setParameters(new LongList());
        aggSet.setSampleInterval(new Duration(2));
        aggSet.setReportFilter(null);

        aggSetList.add(aggSet);
        aggregationDefinition.setParameterSets(aggSetList);

        AggregationCreationRequest request = new AggregationCreationRequest();
        request.setAggDefDetails(aggregationDefinition);
        request.setName(new Identifier("Map"));
        MOWindow aggregationDefinitionWindow = new MOWindow(request, true);

        AggregationCreationRequestList requestList = new AggregationCreationRequestList();
        try {
            requestList.add((AggregationCreationRequest) aggregationDefinitionWindow.getObject());
        } catch (InterruptedIOException ex) {
            return;
        }

        try {
            ObjectInstancePairList objIds = this.serviceMCAggregation.getAggregationStub().addAggregation(requestList);

            if (objIds.isEmpty()) {
                return;
            }

            // Get the stored Parameter Definition from the Archive
            ArchivePersistenceObject comObject = HelperArchive.getArchiveCOMObject(
                    this.serviceMCAggregation.getCOMServices().getArchiveService().getArchiveStub(),
                    AggregationHelper.AGGREGATIONDEFINITION_OBJECT_TYPE,
                    serviceMCAggregation.getConnectionDetails().getDomain(),
                    objIds.get(0).getObjDefInstanceId());

            // Add the Action Definition to the table
            aggregationTable.addEntry(requestList.get(0).getName(), comObject);
        } catch (MALInteractionException ex) {
            JOptionPane.showMessageDialog(null, "There was an error with the submitted Aggregation Definition.", "Error", JOptionPane.PLAIN_MESSAGE);
            Logger.getLogger(AggregationConsumerPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MALException ex) {
            JOptionPane.showMessageDialog(null, "There was an error with the submitted Aggregation Definition.", "Error", JOptionPane.PLAIN_MESSAGE);
            Logger.getLogger(AggregationConsumerPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_addDefinitionButtonActionPerformed

    private void updateDefinitionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateDefinitionButtonActionPerformed
        if (aggregationTable.getSelectedRow() == -1) { // The row is not selected?
            return;  // Well, then nothing to be done here folks!
        }

        ArchivePersistenceObject obj = aggregationTable.getSelectedCOMObject();
        MOWindow moObject = new MOWindow(obj.getObject(), true);

        LongList objIds = new LongList();
        objIds.add(aggregationTable.getSelectedIdentityObjId());

        AggregationDefinitionDetailsList defs = new AggregationDefinitionDetailsList();
        try {
            defs.add((AggregationDefinitionDetails) moObject.getObject());
        } catch (InterruptedIOException ex) {
            return;
        }

        try {
            this.serviceMCAggregation.getAggregationStub().updateDefinition(objIds, defs);
            this.listDefinitionAllButtonActionPerformed(null);
        } catch (MALInteractionException ex) {
            Logger.getLogger(AggregationConsumerPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MALException ex) {
            Logger.getLogger(AggregationConsumerPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_updateDefinitionButtonActionPerformed

    private void removeDefinitionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeDefinitionButtonActionPerformed
        if (aggregationTable.getSelectedRow() == -1) { // The row is not selected?
            return;  // Well, then nothing to be done here folks!
        }

        LongList longlist = new LongList();
        longlist.add(aggregationTable.getSelectedIdentityObjId());

        try {
            this.serviceMCAggregation.getAggregationStub().removeAggregation(longlist);
            aggregationTable.removeSelectedEntry();
        } catch (MALInteractionException ex) {
            Logger.getLogger(AggregationConsumerPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MALException ex) {
            Logger.getLogger(AggregationConsumerPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_removeDefinitionButtonActionPerformed

    private void listDefinitionAllButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listDefinitionAllButtonActionPerformed
        IdentifierList idList = new IdentifierList();
        idList.add(new Identifier("*"));
        /*
        ObjectInstancePairList output;
        try {
            output = this.serviceMCAggregation.getAggregationStub().listDefinition(idList);
            aggregationTable.refreshTableWithIds(output, serviceMCAggregation.getConnectionDetails().getDomain(), AggregationHelper.AGGREGATIONDEFINITION_OBJECT_TYPE);
        } catch (MALInteractionException ex) {
            JOptionPane.showMessageDialog(null, "There was an error during the listDefinition operation.", "Error", JOptionPane.PLAIN_MESSAGE);
            Logger.getLogger(AggregationConsumerPanel.class.getName()).log(Level.SEVERE, null, ex);
            return;
        } catch (MALException ex) {
            JOptionPane.showMessageDialog(null, "There was an error during the listDefinition operation.", "Error", JOptionPane.PLAIN_MESSAGE);
            Logger.getLogger(AggregationConsumerPanel.class.getName()).log(Level.SEVERE, null, ex);
            return;
        }
        
        Logger.getLogger(AggregationConsumerPanel.class.getName()).log(Level.INFO, "listDefinition(\"*\") returned {0} object instance identifiers", output.size());
         */

        try {
            this.serviceMCAggregation.getAggregationStub().asyncListDefinition(idList, new AggregationAdapter() {
                @Override
                public void listDefinitionResponseReceived(MALMessageHeader msgHeader, ObjectInstancePairList objInstIds, Map qosProperties) {
                    aggregationTable.refreshTableWithIds(objInstIds, serviceMCAggregation.getConnectionDetails().getDomain(), AggregationHelper.AGGREGATIONDEFINITION_OBJECT_TYPE);
                    Logger.getLogger(AggregationConsumerPanel.class.getName()).log(Level.INFO, "listDefinition(\"*\") returned {0} object instance identifiers", objInstIds.size());
                }

                @Override
                public void listDefinitionErrorReceived(MALMessageHeader msgHeader, MALStandardError error, Map qosProperties) {
                    JOptionPane.showMessageDialog(null, "There was an error during the listDefinition operation.", "Error", JOptionPane.PLAIN_MESSAGE);
                    Logger.getLogger(AggregationConsumerPanel.class.getName()).log(Level.SEVERE, null, error);
                }
            }
            );
        } catch (MALInteractionException ex) {
            Logger.getLogger(AggregationConsumerPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MALException ex) {
            Logger.getLogger(AggregationConsumerPanel.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_listDefinitionAllButtonActionPerformed

    private void removeDefinitionAllButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeDefinitionAllButtonActionPerformed
        Long objId = (long) 0;
        LongList longlist = new LongList();
        longlist.add(objId);

        try {
            this.serviceMCAggregation.getAggregationStub().removeAggregation(longlist);
            aggregationTable.removeAllEntries();
        } catch (MALInteractionException ex) {
            Logger.getLogger(AggregationConsumerPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MALException ex) {
            Logger.getLogger(AggregationConsumerPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_removeDefinitionAllButtonActionPerformed

    private void actionDefinitionsTableComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_actionDefinitionsTableComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_actionDefinitionsTableComponentAdded

    private void enableDefinitionAllAggActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enableDefinitionAllAggActionPerformed
        Boolean curState;

        if (aggregationTable.getSelectedRow() == -1) {  // Used to avoid problems if no row is selected
            AggregationDefinitionDetails aggregationDefinition = (AggregationDefinitionDetails) aggregationTable.getFirstCOMObject().getObject();
            if (aggregationDefinition != null) {
                curState = aggregationDefinition.getGenerationEnabled();
            } else {
                curState = true;
            }
        } else {
            curState = ((AggregationDefinitionDetails) aggregationTable.getSelectedCOMObject().getObject()).getGenerationEnabled();
        }

        InstanceBooleanPairList BoolPairList = new InstanceBooleanPairList();
        BoolPairList.add(new InstanceBooleanPair((long) 0, !curState));  // Zero is the wildcard

        try {
            this.serviceMCAggregation.getAggregationStub().enableGeneration(false, BoolPairList);
            aggregationTable.switchEnabledstatusAll(!curState);
        } catch (MALInteractionException ex) {
            Logger.getLogger(AggregationConsumerPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MALException ex) {
            Logger.getLogger(AggregationConsumerPanel.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_enableDefinitionAllAggActionPerformed

    private void enableDefinitionButtonAggActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enableDefinitionButtonAggActionPerformed
        if (aggregationTable.getSelectedRow() == -1) { // The row is not selected?
            return;  // Well, then nothing to be done here folks!
        }

        Boolean curState = ((AggregationDefinitionDetails) aggregationTable.getSelectedCOMObject().getObject()).getGenerationEnabled();
        InstanceBooleanPairList BoolPairList = new InstanceBooleanPairList();
        BoolPairList.add(new InstanceBooleanPair(aggregationTable.getSelectedIdentityObjId(), !curState));  // Zero is the wildcard

        try {
            this.serviceMCAggregation.getAggregationStub().enableGeneration(false, BoolPairList);
            aggregationTable.switchEnabledstatus(!curState);
        } catch (MALInteractionException ex) {
            Logger.getLogger(AggregationConsumerPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MALException ex) {
            Logger.getLogger(AggregationConsumerPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_enableDefinitionButtonAggActionPerformed

    private void msgBoxOnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_msgBoxOnActionPerformed


    }//GEN-LAST:event_msgBoxOnActionPerformed

    private void getValueAllButtonAggActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getValueAllButtonAggActionPerformed
        Long objId = (long) 0;
        LongList longlist = new LongList();
        longlist.add(objId);

        try {
            AggregationValueDetailsList values = serviceMCAggregation.getAggregationStub().getValue(longlist);

            String str = "";
            for (int h = 0; h < values.size(); h++) {
                AggregationValueDetails value = values.get(h);

                str += "The value for objId " + value.getAggId().toString() + " (AggregationValue index: " + h + ") is:" + "\n";
                for (int i = 0; i < value.getValue().getParameterSetValues().size(); i++) {
                    for (int j = 0; j < value.getValue().getParameterSetValues().get(i).getValues().size(); j++) {
                        if (value.getValue().getParameterSetValues().get(i).getValues().get(j) == null) {
                            continue;
                        }

                        ParameterValue paramValue = value.getValue().getParameterSetValues().get(i).getValues().get(j).getValue();
                        str += "(parameterSetValue index: " + i + ") " + "validityState: "
                                + paramValue.getValidityState().toString() + "\n";

                        if (paramValue.getRawValue() != null) {
                            str += "(parameterSetValue index: " + i + ") " + "rawValue: " + paramValue.getRawValue().toString() + "\n";
                        }
                        if (paramValue.getConvertedValue() != null) {
                            str += "(parameterSetValue index: " + i + ") " + "convertedValue: " + paramValue.getConvertedValue().toString() + "\n";
                        }
                        str += "\n";
                    }
                }
                str += "---------------------------------------\n";
            }

            JOptionPane.showMessageDialog(null, str, "Returned List from the Provider", JOptionPane.PLAIN_MESSAGE);

        } catch (MALInteractionException ex) {
            Logger.getLogger(AggregationConsumerPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MALException ex) {
            Logger.getLogger(AggregationConsumerPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_getValueAllButtonAggActionPerformed

    private void enableFilterAllAggActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enableFilterAllAggActionPerformed

        String str;
        if (aggregationTable.getSelectedRow() == -1) {  // Used to avoid problems if no row is selected
            str = ((AggregationDefinitionDetails) aggregationTable.getSelectedCOMObject().getObject()).getFilterEnabled().toString(); // Get the status from selection
        } else {
            str = "true";
        }
        Boolean curState = (str.equals("true")); // String to Boolean conversion
        InstanceBooleanPairList boolPairList = new InstanceBooleanPairList();
        boolPairList.add(new InstanceBooleanPair((long) 0, !curState));  // Zero is the wildcard
        try {
            serviceMCAggregation.getAggregationStub().enableFilter(false, boolPairList);  // false: no group service
            aggregationTable.switchFilterEnabledstatusAll(!curState);
        } catch (MALInteractionException ex) {
            Logger.getLogger(AggregationConsumerPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MALException ex) {
            Logger.getLogger(AggregationConsumerPanel.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_enableFilterAllAggActionPerformed

    private void enableFilterButtonAggActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enableFilterButtonAggActionPerformed
        if (aggregationTable.getSelectedRow() == -1) { // The row is not selected?
            return;  // Well, then nothing to be done here folks!
        }

        Long objId = aggregationTable.getSelectedCOMObject().getArchiveDetails().getInstId();
        Boolean curState = ((AggregationDefinitionDetails) aggregationTable.getSelectedCOMObject().getObject()).getFilterEnabled(); // String to Boolean conversion
        InstanceBooleanPairList boolPairList = new InstanceBooleanPairList();
        boolPairList.add(new InstanceBooleanPair(objId, !curState));

        try {
            serviceMCAggregation.getAggregationStub().enableFilter(false, boolPairList);
            aggregationTable.switchFilterEnabledstatus(!curState);
        } catch (MALInteractionException ex) {
            Logger.getLogger(AggregationConsumerPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MALException ex) {
            Logger.getLogger(AggregationConsumerPanel.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_enableFilterButtonAggActionPerformed

    private void getValueButtonAgg1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getValueButtonAgg1ActionPerformed
        if (aggregationTable.getSelectedRow() == -1) { // The row is not selected?
            return;  // Well, then nothing to be done here folks!
        }

        Long objId = aggregationTable.getSelectedCOMObject().getArchiveDetails().getInstId();
        LongList longlist = new LongList();
        longlist.add(objId);

        try {
            AggregationValueDetailsList values = serviceMCAggregation.getAggregationStub().getValue(longlist);

            String str = "";
            for (int h = 0; h < values.size(); h++) {
                AggregationValueDetails value = values.get(h);

                str += "The value for objId " + value.getAggId().toString() + " (AggregationValue index: " + h + ") is:" + "\n";
                for (int i = 0; i < value.getValue().getParameterSetValues().size(); i++) {
                    for (int j = 0; j < value.getValue().getParameterSetValues().get(i).getValues().size(); j++) {
                        if (value.getValue().getParameterSetValues().get(i).getValues().get(j) == null) {
                            continue;
                        }

                        ParameterValue paramValue = value.getValue().getParameterSetValues().get(i).getValues().get(j).getValue();
                        str += "(parameterSetValue index: " + i + ") " + "validityState: "
                                + paramValue.getValidityState().toString() + "\n";

                        if (paramValue.getRawValue() != null) {
                            str += "(parameterSetValue index: " + i + ") " + "rawValue: " + paramValue.getRawValue().toString() + "\n";
                        }
                        if (paramValue.getConvertedValue() != null) {
                            str += "(parameterSetValue index: " + i + ") " + "convertedValue: " + paramValue.getConvertedValue().toString() + "\n";
                        }
                        str += "\n";
                    }
                }
                str += "---------------------------------------\n";
            }

            JOptionPane.showMessageDialog(null, str, "Returned List from the Provider", JOptionPane.PLAIN_MESSAGE);

        } catch (MALInteractionException ex) {
            Logger.getLogger(AggregationConsumerPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MALException ex) {
            Logger.getLogger(AggregationConsumerPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_getValueButtonAgg1ActionPerformed

    public class AggregationConsumerAdapter extends AggregationAdapter {

        @Override
        public void monitorValueNotifyReceived(org.ccsds.moims.mo.mal.transport.MALMessageHeader msgHeader,
                org.ccsds.moims.mo.mal.structures.Identifier identifier,
                org.ccsds.moims.mo.mal.structures.UpdateHeaderList lUpdateHeaderList,
                org.ccsds.moims.mo.com.structures.ObjectIdList _ObjectIdList2,
                org.ccsds.moims.mo.mc.aggregation.structures.AggregationValueList lAggregationValueList,
                java.util.Map qosProperties) {

            final long iDiff = System.currentTimeMillis() - msgHeader.getTimestamp().getValue();

            final UpdateHeader updateHeader = lUpdateHeaderList.get(0);
            final AttributeList keyValues = updateHeader.getKeyValues();
            final String Aggname = HelperAttributes.attribute2string(keyValues.get(0));
            final int objId = (int) HelperAttributes.attribute2JavaType(keyValues.get(1));
            /*
            final String Aggname = updateHeader.getKey().getFirstSubKey().getValue();
            final int objId = updateHeader.getKey().getSecondSubKey().intValue();
            */

            try {
                if (msgBoxOn.isSelected() && !lUpdateHeaderList.isEmpty() && lAggregationValueList.size() != 0) {
                    String str = "";
                    final AggregationValue aggregationValue = lAggregationValueList.get(0);
                    str += "AggregationValue generationMode: " + aggregationValue.getGenerationMode().toString()
                            + " (filtered: " + aggregationValue.getFiltered().toString() + ")" + "\n";

                    str += "Aggregation objId " + objId + " (name: " + Aggname + "):" + "\n";

                    for (int i = 0; i < aggregationValue.getParameterSetValues().size(); i++) {  // Cycle through parameterSetValues
                        str += "- AggregationParameterSet values index: " + i + "\n";
                        str += "deltaTime: " + aggregationValue.getParameterSetValues().get(i).getDeltaTime();
                        str += " and intervalTime: " + aggregationValue.getParameterSetValues().get(i).getIntervalTime() + "\n";
                        AggregationSetValue parameterSetsValue = aggregationValue.getParameterSetValues().get(i);

                        for (int j = 0; j < parameterSetsValue.getValues().size(); j++) { // Cycle through the values
                            if (parameterSetsValue.getValues().get(j) == null) {
                                continue;
                            }

                            ParameterValue paramValue = parameterSetsValue.getValues().get(j).getValue();

                            str += "values index: " + j + "\n";
                            str += "validityState: " + paramValue.getValidityState().toString() + "\n";
                            if (paramValue.getRawValue() != null) {
                                str += "rawValue: " + paramValue.getRawValue().toString() + "\n";
                            }
                            if (paramValue.getConvertedValue() != null) {
                                str += "convertedValue: " + paramValue.getConvertedValue().toString() + "\n";
                            }
                            str += "\n";
                        }
                    }

                    JOptionPane.showMessageDialog(null, str, "Returned Values from the Provider", JOptionPane.PLAIN_MESSAGE);
                }

            } catch (NumberFormatException ex) {
            }
        }
    }

    public AggregationTablePanel getAggregationTable() {
        return aggregationTable;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable actionDefinitionsTable;
    private javax.swing.JButton addDefinitionButton;
    private javax.swing.JButton enableDefinitionAllAgg;
    private javax.swing.JButton enableDefinitionButtonAgg;
    private javax.swing.JButton enableFilterAllAgg;
    private javax.swing.JButton enableFilterButtonAgg;
    private javax.swing.JButton getValueAllButtonAgg;
    private javax.swing.JButton getValueButtonAgg1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton listDefinitionAllButton;
    private javax.swing.JButton listDefinitionButton;
    private javax.swing.JCheckBox msgBoxOn;
    private javax.swing.JPanel parameterTab;
    private javax.swing.JButton removeDefinitionAllButton;
    private javax.swing.JButton removeDefinitionButton;
    private javax.swing.JButton updateDefinitionButton;
    // End of variables declaration//GEN-END:variables
}
