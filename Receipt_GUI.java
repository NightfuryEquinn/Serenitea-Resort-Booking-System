package com.University.JavaProjects.Java_Assignment;

import javax.swing.table.DefaultTableModel;

public class Receipt_GUI extends javax.swing.JFrame {

    /**
     * Creates new form Receipt_GUI
     */
    public Receipt_GUI() {
        initComponents();
    }

    /**
    * DO NOT TOUCH
    */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        receiptBackground = new javax.swing.JPanel();
        receiptSearch = new javax.swing.JLabel();
        inputReceiptSearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        displayReceiptTable = new javax.swing.JTable();
        historyPreview = new javax.swing.JPanel();
        ReceiptPreviewLBL = new javax.swing.JLabel();
        ReceiptPreviewDivider = new javax.swing.JPanel();
        RoomLBL = new javax.swing.JLabel();
        CustomerNameLBL = new javax.swing.JLabel();
        AdminNameLBL = new javax.swing.JLabel();
        PaymentDateLBL = new javax.swing.JLabel();
        CheckinLBL = new javax.swing.JLabel();
        CheckoutLBL = new javax.swing.JLabel();
        StayLBL = new javax.swing.JLabel();
        BaseLBL = new javax.swing.JLabel();
        TourismTaxLBL = new javax.swing.JLabel();
        ServiceTaxLBL = new javax.swing.JLabel();
        TotalLBL = new javax.swing.JLabel();
        displayRoomID = new javax.swing.JTextField();
        displayCustomerName = new javax.swing.JTextField();
        displayAdmin = new javax.swing.JTextField();
        displayPaymentDate = new javax.swing.JTextField();
        displayCheckin = new javax.swing.JTextField();
        displayCheckout = new javax.swing.JTextField();
        displayStay = new javax.swing.JTextField();
        displayBasePrice = new javax.swing.JTextField();
        displayTourismTax = new javax.swing.JTextField();
        displayServiceTax = new javax.swing.JTextField();
        displayTotal = new javax.swing.JTextField();
        BackBTN = new javax.swing.JButton();
        SearchBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        receiptBackground.setBackground(new java.awt.Color(127, 203, 188));

        receiptSearch.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        receiptSearch.setText("Search Customer Name:");

        inputReceiptSearch.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N

        displayReceiptTable.setModel(new javax.swing.table.DefaultTableModel(
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
        displayReceiptTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                displayReceiptTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(displayReceiptTable);

        ReceiptPreviewLBL.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        ReceiptPreviewLBL.setText("Receipt Preview");

        ReceiptPreviewDivider.setBackground(new java.awt.Color(0, 102, 102));
        ReceiptPreviewDivider.setPreferredSize(new java.awt.Dimension(300, 5));

        javax.swing.GroupLayout ReceiptPreviewDividerLayout = new javax.swing.GroupLayout(ReceiptPreviewDivider);
        ReceiptPreviewDivider.setLayout(ReceiptPreviewDividerLayout);
        ReceiptPreviewDividerLayout.setHorizontalGroup(
            ReceiptPreviewDividerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 370, Short.MAX_VALUE)
        );
        ReceiptPreviewDividerLayout.setVerticalGroup(
            ReceiptPreviewDividerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        RoomLBL.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        RoomLBL.setText("Room ID:");

        CustomerNameLBL.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        CustomerNameLBL.setText("Customer Name:");

        AdminNameLBL.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        AdminNameLBL.setText("Admin Name:");

        PaymentDateLBL.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        PaymentDateLBL.setText("Payment Date:");

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

        displayAdmin.setEditable(false);
        displayAdmin.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N

        displayPaymentDate.setEditable(false);
        displayPaymentDate.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N

        displayCheckin.setEditable(false);
        displayCheckin.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N

        displayCheckout.setEditable(false);
        displayCheckout.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N

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

        javax.swing.GroupLayout historyPreviewLayout = new javax.swing.GroupLayout(historyPreview);
        historyPreview.setLayout(historyPreviewLayout);
        historyPreviewLayout.setHorizontalGroup(
            historyPreviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(historyPreviewLayout.createSequentialGroup()
                .addGroup(historyPreviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(historyPreviewLayout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(ReceiptPreviewLBL))
                    .addGroup(historyPreviewLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(ReceiptPreviewDivider, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(historyPreviewLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(historyPreviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TourismTaxLBL)
                            .addComponent(TotalLBL, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BaseLBL, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(StayLBL, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CheckoutLBL, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CheckinLBL, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(PaymentDateLBL, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(AdminNameLBL, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CustomerNameLBL, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(RoomLBL, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ServiceTaxLBL, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(historyPreviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(displayRoomID, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(displayCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(displayAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(displayPaymentDate, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(displayCheckin, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(displayCheckout, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(displayStay, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(displayBasePrice, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(displayTourismTax, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(displayServiceTax, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(displayTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        historyPreviewLayout.setVerticalGroup(
            historyPreviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(historyPreviewLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ReceiptPreviewLBL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ReceiptPreviewDivider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(AdminNameLBL)
                    .addComponent(displayAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(historyPreviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PaymentDateLBL)
                    .addComponent(displayPaymentDate, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(historyPreviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CheckinLBL)
                    .addComponent(displayCheckin, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(historyPreviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CheckoutLBL)
                    .addComponent(displayCheckout, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addContainerGap(54, Short.MAX_VALUE))
        );

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

        javax.swing.GroupLayout receiptBackgroundLayout = new javax.swing.GroupLayout(receiptBackground);
        receiptBackground.setLayout(receiptBackgroundLayout);
        receiptBackgroundLayout.setHorizontalGroup(
            receiptBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(receiptBackgroundLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(receiptBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(receiptBackgroundLayout.createSequentialGroup()
                        .addComponent(receiptSearch)
                        .addGap(18, 18, 18)
                        .addComponent(inputReceiptSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(SearchBTN)))
                .addGap(30, 30, 30)
                .addGroup(receiptBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(historyPreview, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BackBTN))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        receiptBackgroundLayout.setVerticalGroup(
            receiptBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(receiptBackgroundLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(receiptBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(receiptBackgroundLayout.createSequentialGroup()
                        .addComponent(historyPreview, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BackBTN))
                    .addGroup(receiptBackgroundLayout.createSequentialGroup()
                        .addGroup(receiptBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(receiptSearch)
                            .addComponent(inputReceiptSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SearchBTN))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(receiptBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(receiptBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
    * Back Button
    */
    private void BackBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBTNActionPerformed
        dispose();
    }//GEN-LAST:event_BackBTNActionPerformed

    /**
    * Search Button
    */
    private void SearchBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBTNActionPerformed
        // Get search input
        String searchName = inputReceiptSearch.getText();
        
        // OOP Normal Method - Search and Display 
        OOP_Normal_Receipt oop = new OOP_Normal_Receipt();
        oop.search(searchName, displayReceiptTable);
    }//GEN-LAST:event_SearchBTNActionPerformed

    /**
    * Display All Invoice in Table
    */
    private void displayReceiptTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_displayReceiptTableMouseClicked
        // Get Selected Row in Table
        int row = displayReceiptTable.getSelectedRow();
        
        // Get Table Model
        DefaultTableModel model = (DefaultTableModel) displayReceiptTable.getModel();
        
        // Get values to compare with file data
        String cRoom = model.getValueAt(row, 0).toString();
        String cName = model.getValueAt(row, 1).toString();
        String cCheckin = model.getValueAt(row, 2).toString();
        
        // OOP Normal Method - Display full data from file
        OOP_Normal_Receipt oop = new OOP_Normal_Receipt();
        oop.viewSelected(cRoom, cName, cCheckin, displayRoomID, displayCustomerName, displayAdmin, displayPaymentDate, displayCheckin, displayCheckout, displayStay, displayBasePrice, displayTourismTax, displayServiceTax, displayTotal);
    }//GEN-LAST:event_displayReceiptTableMouseClicked

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
            java.util.logging.Logger.getLogger(Receipt_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        // Create and display the form
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Receipt_GUI().setVisible(true);
            }
        });
    }

    /**
    * DO NOT TOUCH
    */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdminNameLBL;
    private javax.swing.JButton BackBTN;
    private javax.swing.JLabel BaseLBL;
    private javax.swing.JLabel CheckinLBL;
    private javax.swing.JLabel CheckoutLBL;
    private javax.swing.JLabel CustomerNameLBL;
    private javax.swing.JLabel PaymentDateLBL;
    private javax.swing.JPanel ReceiptPreviewDivider;
    private javax.swing.JLabel ReceiptPreviewLBL;
    private javax.swing.JLabel RoomLBL;
    private javax.swing.JButton SearchBTN;
    private javax.swing.JLabel ServiceTaxLBL;
    private javax.swing.JLabel StayLBL;
    private javax.swing.JLabel TotalLBL;
    private javax.swing.JLabel TourismTaxLBL;
    private javax.swing.JTextField displayAdmin;
    private javax.swing.JTextField displayBasePrice;
    private javax.swing.JTextField displayCheckin;
    private javax.swing.JTextField displayCheckout;
    private javax.swing.JTextField displayCustomerName;
    private javax.swing.JTextField displayPaymentDate;
    private javax.swing.JTable displayReceiptTable;
    private javax.swing.JTextField displayRoomID;
    private javax.swing.JTextField displayServiceTax;
    private javax.swing.JTextField displayStay;
    private javax.swing.JTextField displayTotal;
    private javax.swing.JTextField displayTourismTax;
    private javax.swing.JPanel historyPreview;
    private javax.swing.JTextField inputReceiptSearch;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel receiptBackground;
    private javax.swing.JLabel receiptSearch;
    // End of variables declaration//GEN-END:variables
}
