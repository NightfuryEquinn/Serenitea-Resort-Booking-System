package com.University.JavaProjects.Java_Assignment;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class History_GUI extends javax.swing.JFrame {

    /**
     * Creates new form History_GUI
     */
    public History_GUI() {
        initComponents();
        
        // Disable past date in Datechooser
        displayCheckout.getJCalendar().setMinSelectableDate(new Date());
        
        // Disable edit update delete button by default
        EditBTN.setEnabled(false);
        CountBTN.setEnabled(false);
        UpdateBTN.setEnabled(false);
        DeleteBTN.setEnabled(false);
    }

    /**
    * DO NOT TOUCH
    */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        historyBackground = new javax.swing.JPanel();
        historySearch = new javax.swing.JLabel();
        inputHistorySearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        displayHistoryTable = new javax.swing.JTable();
        historyPreview = new javax.swing.JPanel();
        HistoryPreviewLBL = new javax.swing.JLabel();
        HistoryPreviewDivider = new javax.swing.JPanel();
        RoomLBL = new javax.swing.JLabel();
        CustomerNameLBL = new javax.swing.JLabel();
        ICLBL = new javax.swing.JLabel();
        ContactLBL = new javax.swing.JLabel();
        EmailLBL = new javax.swing.JLabel();
        CheckinLBL = new javax.swing.JLabel();
        CheckoutLBL = new javax.swing.JLabel();
        StayLBL = new javax.swing.JLabel();
        BaseLBL = new javax.swing.JLabel();
        TourismTaxLBL = new javax.swing.JLabel();
        ServiceTaxLBL = new javax.swing.JLabel();
        TotalLBL = new javax.swing.JLabel();
        displayRoomID = new javax.swing.JTextField();
        displayCustomerName = new javax.swing.JTextField();
        displayIC = new javax.swing.JTextField();
        displayContact = new javax.swing.JTextField();
        displayEmail = new javax.swing.JTextField();
        displayStay = new javax.swing.JTextField();
        displayBasePrice = new javax.swing.JTextField();
        displayTourismTax = new javax.swing.JTextField();
        displayServiceTax = new javax.swing.JTextField();
        displayTotal = new javax.swing.JTextField();
        displayCheckout = new com.toedter.calendar.JDateChooser();
        displayCheckin = new javax.swing.JTextField();
        EditBTN = new javax.swing.JButton();
        UpdateBTN = new javax.swing.JButton();
        DeleteBTN = new javax.swing.JButton();
        BackBTN = new javax.swing.JButton();
        SearchBTN = new javax.swing.JButton();
        CountBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        historyBackground.setBackground(new java.awt.Color(127, 203, 188));

        historySearch.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        historySearch.setText("Search Customer Name:");

        inputHistorySearch.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N

        displayHistoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Room ID", "Customer Name", "Check-in Date", "Check-out Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        displayHistoryTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                displayHistoryTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(displayHistoryTable);

        HistoryPreviewLBL.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        HistoryPreviewLBL.setText("History Preview");

        HistoryPreviewDivider.setBackground(new java.awt.Color(0, 102, 102));
        HistoryPreviewDivider.setPreferredSize(new java.awt.Dimension(300, 5));

        javax.swing.GroupLayout HistoryPreviewDividerLayout = new javax.swing.GroupLayout(HistoryPreviewDivider);
        HistoryPreviewDivider.setLayout(HistoryPreviewDividerLayout);
        HistoryPreviewDividerLayout.setHorizontalGroup(
            HistoryPreviewDividerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 370, Short.MAX_VALUE)
        );
        HistoryPreviewDividerLayout.setVerticalGroup(
            HistoryPreviewDividerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        RoomLBL.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        RoomLBL.setText("Room ID:");

        CustomerNameLBL.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        CustomerNameLBL.setText("Customer Name:");

        ICLBL.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        ICLBL.setText("IC/Passport:");

        ContactLBL.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        ContactLBL.setText("Contact:");

        EmailLBL.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        EmailLBL.setText("Email:");

        CheckinLBL.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        CheckinLBL.setText("Check-in Date:");

        CheckoutLBL.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        CheckoutLBL.setText("Check-out Date:");

        StayLBL.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        StayLBL.setText("Days of Stay:");

        BaseLBL.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        BaseLBL.setText("Base Price:");

        TourismTaxLBL.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        TourismTaxLBL.setText("Tourism Tax (per night):");

        ServiceTaxLBL.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        ServiceTaxLBL.setText("Service Tax (10%):");

        TotalLBL.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        TotalLBL.setText("Total Charges:");

        displayRoomID.setEditable(false);
        displayRoomID.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N

        displayCustomerName.setEditable(false);
        displayCustomerName.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N

        displayIC.setEditable(false);
        displayIC.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N

        displayContact.setEditable(false);
        displayContact.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N

        displayEmail.setEditable(false);
        displayEmail.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N

        displayStay.setEditable(false);
        displayStay.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N

        displayBasePrice.setEditable(false);
        displayBasePrice.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N

        displayTourismTax.setEditable(false);
        displayTourismTax.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N

        displayServiceTax.setEditable(false);
        displayServiceTax.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N

        displayTotal.setEditable(false);
        displayTotal.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N

        displayCheckout.setDateFormatString("dd-MM-yyyy");
        displayCheckout.setEnabled(false);
        displayCheckout.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N

        displayCheckin.setEditable(false);
        displayCheckin.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N

        javax.swing.GroupLayout historyPreviewLayout = new javax.swing.GroupLayout(historyPreview);
        historyPreview.setLayout(historyPreviewLayout);
        historyPreviewLayout.setHorizontalGroup(
            historyPreviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(historyPreviewLayout.createSequentialGroup()
                .addGroup(historyPreviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(historyPreviewLayout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(HistoryPreviewLBL))
                    .addGroup(historyPreviewLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(HistoryPreviewDivider, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(historyPreviewLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(historyPreviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TourismTaxLBL)
                            .addComponent(TotalLBL, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BaseLBL, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(StayLBL, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CheckoutLBL, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CheckinLBL, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(EmailLBL, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ContactLBL, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ICLBL, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CustomerNameLBL, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(RoomLBL, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ServiceTaxLBL, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(historyPreviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(displayRoomID, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(displayCustomerName, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(displayIC, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(displayContact, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(displayEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(displayStay, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(displayBasePrice, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(displayTourismTax, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(displayServiceTax, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(displayTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(displayCheckout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(displayCheckin, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        historyPreviewLayout.setVerticalGroup(
            historyPreviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(historyPreviewLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(HistoryPreviewLBL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(HistoryPreviewDivider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(historyPreviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RoomLBL)
                    .addComponent(displayRoomID, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(historyPreviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CustomerNameLBL)
                    .addComponent(displayCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(historyPreviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ICLBL)
                    .addComponent(displayIC, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(historyPreviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ContactLBL)
                    .addComponent(displayContact, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(historyPreviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmailLBL)
                    .addComponent(displayEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(historyPreviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CheckinLBL)
                    .addComponent(displayCheckin, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(historyPreviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CheckoutLBL)
                    .addComponent(displayCheckout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(historyPreviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StayLBL)
                    .addComponent(displayStay, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(historyPreviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BaseLBL)
                    .addComponent(displayBasePrice, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(historyPreviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TourismTaxLBL)
                    .addComponent(displayTourismTax, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(historyPreviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ServiceTaxLBL)
                    .addComponent(displayServiceTax, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(historyPreviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TotalLBL)
                    .addComponent(displayTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        EditBTN.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        EditBTN.setText("Edit");
        EditBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditBTNActionPerformed(evt);
            }
        });

        UpdateBTN.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        UpdateBTN.setText("Update");
        UpdateBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBTNActionPerformed(evt);
            }
        });

        DeleteBTN.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        DeleteBTN.setText("Delete");
        DeleteBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBTNActionPerformed(evt);
            }
        });

        BackBTN.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        BackBTN.setText("Back");
        BackBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBTNActionPerformed(evt);
            }
        });

        SearchBTN.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        SearchBTN.setText("Search");
        SearchBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBTNActionPerformed(evt);
            }
        });

        CountBTN.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        CountBTN.setText("Count");
        CountBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CountBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout historyBackgroundLayout = new javax.swing.GroupLayout(historyBackground);
        historyBackground.setLayout(historyBackgroundLayout);
        historyBackgroundLayout.setHorizontalGroup(
            historyBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(historyBackgroundLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(historyBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(historyBackgroundLayout.createSequentialGroup()
                        .addComponent(historySearch)
                        .addGap(18, 18, 18)
                        .addComponent(inputHistorySearch)
                        .addGap(18, 18, 18)
                        .addComponent(SearchBTN))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(historyBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(historyBackgroundLayout.createSequentialGroup()
                        .addComponent(EditBTN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CountBTN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UpdateBTN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DeleteBTN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BackBTN))
                    .addComponent(historyPreview, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );
        historyBackgroundLayout.setVerticalGroup(
            historyBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(historyBackgroundLayout.createSequentialGroup()
                .addGroup(historyBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(historyBackgroundLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(historyBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(historySearch)
                            .addComponent(inputHistorySearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SearchBTN))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(historyBackgroundLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(historyPreview, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(historyBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EditBTN)
                            .addComponent(DeleteBTN)
                            .addComponent(BackBTN)
                            .addComponent(CountBTN)
                            .addComponent(UpdateBTN))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(historyBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(historyBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Back Button
     */
    private void BackBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBTNActionPerformed
        // Close History Jframes without opening new Main Jframes
        dispose();
    }//GEN-LAST:event_BackBTNActionPerformed

    /**
     * Search Button 
     */
    private void SearchBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBTNActionPerformed
        // Get search input
        String searchName = inputHistorySearch.getText();
        
        // OOP Normal Method - Search and Display 
        OOP_Normal_History oop = new OOP_Normal_History();
        oop.search(searchName, displayHistoryTable);
    }//GEN-LAST:event_SearchBTNActionPerformed

    /**
     * Display All History in Table
     */
    private void displayHistoryTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_displayHistoryTableMouseClicked
        // Enable datechooser
        displayCheckout.setEnabled(true);
        
        // Enable edit and delete buttons 
        EditBTN.setEnabled(true);
        DeleteBTN.setEnabled(true);

        // Get Selected Row in Table
        int row = displayHistoryTable.getSelectedRow();
        
        // Get Table Model
        DefaultTableModel model = (DefaultTableModel) displayHistoryTable.getModel();
        
        // Get values to compare with file data
        String cRoom = model.getValueAt(row, 0).toString();
        String cName = model.getValueAt(row, 1).toString();
        String cCheckin = model.getValueAt(row, 2).toString();
        
        // OOP Normal Method - Display full data from file
        OOP_Normal_History oop = new OOP_Normal_History();
        oop.viewSelected(cRoom, cName, cCheckin, displayRoomID, displayCustomerName, displayIC, displayContact, displayEmail, displayCheckin, displayCheckout, displayStay, displayBasePrice, displayTourismTax, displayServiceTax, displayTotal);
    }//GEN-LAST:event_displayHistoryTableMouseClicked

    /**
     * Edit Button
     */
    private void EditBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBTNActionPerformed
        // Enable count button
        CountBTN.setEnabled(true);
        
        // Set All Textfield to Editable
        JTextField[] fieldArr = new JTextField[] {displayIC, displayContact, displayEmail};
        
        for(int i = 0; i < fieldArr.length; i++)
        {
            fieldArr[i].setEditable(true);
        }
    }//GEN-LAST:event_EditBTNActionPerformed

    /**
     * Count Button 
     */
    private void CountBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CountBTNActionPerformed
        // Enable update button
        UpdateBTN.setEnabled(true);

        // Get new edited data
        String nIC = displayIC.getText();
        String nContact = displayContact.getText();
        String nEmail = displayEmail.getText();
        String nCheckin = displayCheckin.getText();
        
        SimpleDateFormat dmyFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date xCheckout = displayCheckout.getDate();
        String nCheckout = dmyFormat.format(xCheckout);
        
        // OOP Normal Method - Count new days of stay and price
        OOP_Normal_History oop = new OOP_Normal_History();
        oop.editSelected(nIC, nContact, nEmail, nCheckin, nCheckout, displayIC, displayContact, displayEmail, displayStay, displayBasePrice, displayTourismTax, displayServiceTax, displayTotal);
    }//GEN-LAST:event_CountBTNActionPerformed

    /**
    * Update Button
    */
    private void UpdateBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBTNActionPerformed
        // Get Selected Row in Table
        int row = displayHistoryTable.getSelectedRow();
        
        // Get Table Model
        DefaultTableModel model = (DefaultTableModel) displayHistoryTable.getModel();
        
        // Get values to compare with file data
        String cRoom = model.getValueAt(row, 0).toString();
        String cName = model.getValueAt(row, 1).toString();
        String cCheckin = model.getValueAt(row, 2).toString();
        
        // Confirm update
        int confirmUpdate;
        confirmUpdate = JOptionPane.showConfirmDialog(null, "Proceed to update existing data to new data?", "Confirm Update", JOptionPane.YES_NO_OPTION);
        
        if(confirmUpdate == JOptionPane.NO_OPTION)
        {
            JOptionPane.showMessageDialog(null, "History update was cancelled.");
            
            // Clear textfields
            JTextField[] fieldArr = new JTextField[] {displayRoomID, displayCustomerName, displayIC, displayContact, displayEmail, displayCheckin, displayStay, displayBasePrice, displayTourismTax, displayServiceTax, displayTotal}; 
            
            for(int i = 0; i < fieldArr.length; i++)
            {
                fieldArr[i].setText("");
            }
            
            displayCheckout.setDate(null);
            
            // Disable Textfield and DateChooser
            JTextField[] fieldArr2 = new JTextField[] {displayIC, displayContact, displayEmail};

            for(int i = 0; i < fieldArr2.length; i++)
            {
                fieldArr2[i].setEditable(false);
            }

            displayCheckout.setEnabled(false);
            
            // Disable button
            EditBTN.setEnabled(false);
            CountBTN.setEnabled(false);
            UpdateBTN.setEnabled(false);
            DeleteBTN.setEnabled(false);
        }
        else if(confirmUpdate == JOptionPane.YES_OPTION)
        {
            JOptionPane.showMessageDialog(null, "History was updated and recorded successfully.\nTo book, proceed to Main.\nTo view invoice, proceed to Receipt.");
            
            // OOP Normal Method - Update
            OOP_Normal_History oop = new OOP_Normal_History();
            oop.update(cRoom, cName, cCheckin, displayIC, displayContact, displayEmail, displayCheckout, displayStay, displayBasePrice, displayTourismTax, displayServiceTax, displayTotal);
            
            // Clear textfields
            JTextField[] fieldArr = new JTextField[] {displayRoomID, displayCustomerName, displayIC, displayContact, displayEmail, displayCheckin, displayStay, displayBasePrice, displayTourismTax, displayServiceTax, displayTotal}; 
            
            for(int i = 0; i < fieldArr.length; i++)
            {
                fieldArr[i].setText("");
            }
            
            displayCheckout.setDate(null);
            
            // Disable Textfield and DateChooser
            JTextField[] fieldArr2 = new JTextField[] {displayIC, displayContact, displayEmail};

            for(int i = 0; i < fieldArr2.length; i++)
            {
                fieldArr2[i].setEditable(false);
            }

            displayCheckout.setEnabled(false);
            
            // Disable button
            EditBTN.setEnabled(false);
            CountBTN.setEnabled(false);
            UpdateBTN.setEnabled(false);
            DeleteBTN.setEnabled(false);
        }
    }//GEN-LAST:event_UpdateBTNActionPerformed
    /**
    * Delete Button
    */
    private void DeleteBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBTNActionPerformed
        // Get Selected Row in Table
        int row = displayHistoryTable.getSelectedRow();
        
        // Get Table Model
        DefaultTableModel model = (DefaultTableModel) displayHistoryTable.getModel();
        
        // Get values to compare with file data
        String cRoom = model.getValueAt(row, 0).toString();
        String cName = model.getValueAt(row, 1).toString();
        String cCheckin = model.getValueAt(row, 2).toString();
        
        // Confirm delete
        int confirmDelete;
        confirmDelete = JOptionPane.showConfirmDialog(null, "Proceed to delete selected data? This CANNOT be undone.", "Confirm Delete", JOptionPane.YES_NO_OPTION);
        
        if(confirmDelete == JOptionPane.NO_OPTION)
        {
            JOptionPane.showMessageDialog(null, "Deletion was cancelled.");
            
            // Clear textfields
            JTextField[] fieldArr = new JTextField[] {displayRoomID, displayCustomerName, displayIC, displayContact, displayEmail, displayCheckin, displayStay, displayBasePrice, displayTourismTax, displayServiceTax, displayTotal}; 
            
            for(int i = 0; i < fieldArr.length; i++)
            {
                fieldArr[i].setText("");
            }
            
            displayCheckout.setDate(null);
            
            // Disable button
            EditBTN.setEnabled(false);
            DeleteBTN.setEnabled(false);
        }
        else if(confirmDelete == JOptionPane.YES_OPTION)
        {
            JOptionPane.showMessageDialog(null, "Selected record was deleted successfully.\nTo book, proceed to Main.\nTo view invoice, proceed to Receipt.");

            // OOP Normal Method - Delete
            OOP_Normal_History oop = new OOP_Normal_History();
            oop.delete(cRoom, cName, cCheckin);
            
            // Clear textfields
            JTextField[] fieldArr = new JTextField[] {displayRoomID, displayCustomerName, displayIC, displayContact, displayEmail, displayCheckin, displayStay, displayBasePrice, displayTourismTax, displayServiceTax, displayTotal}; 
            
            for(int i = 0; i < fieldArr.length; i++)
            {
                fieldArr[i].setText("");
            }
            
            displayCheckout.setDate(null);
            
            // Disable button
            EditBTN.setEnabled(false);
            DeleteBTN.setEnabled(false);
        }
    }//GEN-LAST:event_DeleteBTNActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // Set the Nimbus look and feel
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(History_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        // Create and display the form
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new History_GUI().setVisible(true);
            }
        });
    }

    /**
    * DO NOT TOUCH
    */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBTN;
    private javax.swing.JLabel BaseLBL;
    private javax.swing.JLabel CheckinLBL;
    private javax.swing.JLabel CheckoutLBL;
    private javax.swing.JLabel ContactLBL;
    private javax.swing.JButton CountBTN;
    private javax.swing.JLabel CustomerNameLBL;
    private javax.swing.JButton DeleteBTN;
    private javax.swing.JButton EditBTN;
    private javax.swing.JLabel EmailLBL;
    private javax.swing.JPanel HistoryPreviewDivider;
    private javax.swing.JLabel HistoryPreviewLBL;
    private javax.swing.JLabel ICLBL;
    private javax.swing.JLabel RoomLBL;
    private javax.swing.JButton SearchBTN;
    private javax.swing.JLabel ServiceTaxLBL;
    private javax.swing.JLabel StayLBL;
    private javax.swing.JLabel TotalLBL;
    private javax.swing.JLabel TourismTaxLBL;
    private javax.swing.JButton UpdateBTN;
    private javax.swing.JTextField displayBasePrice;
    private javax.swing.JTextField displayCheckin;
    private com.toedter.calendar.JDateChooser displayCheckout;
    private javax.swing.JTextField displayContact;
    private javax.swing.JTextField displayCustomerName;
    private javax.swing.JTextField displayEmail;
    private javax.swing.JTable displayHistoryTable;
    private javax.swing.JTextField displayIC;
    private javax.swing.JTextField displayRoomID;
    private javax.swing.JTextField displayServiceTax;
    private javax.swing.JTextField displayStay;
    private javax.swing.JTextField displayTotal;
    private javax.swing.JTextField displayTourismTax;
    private javax.swing.JPanel historyBackground;
    private javax.swing.JPanel historyPreview;
    private javax.swing.JLabel historySearch;
    private javax.swing.JTextField inputHistorySearch;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
