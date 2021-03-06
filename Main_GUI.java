package com.University.JavaProjects.Java_Assignment;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.io.*;
import java.text.ParseException;
import javax.swing.*;

public class Main_GUI extends javax.swing.JFrame {

    /**
     * Creates new form Main_GUI
     */
    public Main_GUI() {
        initComponents();
        
        // Disable past date in Datechooser
        inputCheckin.getJCalendar().setMinSelectableDate(new Date());
        inputCheckout.getJCalendar().setMinSelectableDate(new Date());
        
        // Disable Book Button by default
        BookBTN.setEnabled(false);
        
        // Disable Textfields by default
        JTextField[] fieldArr = new JTextField[] {inputCustomerName, inputIC, inputContact, inputEmail};
        
        for(int i = 0; i < fieldArr.length; i++)
        {
            fieldArr[i].setEditable(false);
        }
        
        inputCheckin.setEnabled(false);
        inputCheckout.setEnabled(false);
        
        // Disable Room Button by default
        JPanel[] panelArr = new JPanel[] {SR1, SR2, SR3, SR4, SR5, SR6, SR7, SR8, SR9, SR10, JR1, JR2, JR3, JR4, JR5, JR6, JR7, JR8, JR9, JR10};
        JButton[] buttonArr = new JButton[] {SR1BTN, SR2BTN, SR3BTN, SR4BTN, SR5BTN, SR6BTN, SR7BTN, SR8BTN, SR9BTN, SR10BTN, JR1BTN, JR2BTN, JR3BTN, JR4BTN, JR5BTN, JR6BTN, JR7BTN, JR8BTN, JR9BTN, JR10BTN};
        
        for(int i = 0; i < panelArr.length; i++)
        {
            panelArr[i].setEnabled(false);
            buttonArr[i].setEnabled(false);
        }
    }

    /**
    * DO NOT TOUCH
    */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBackground = new javax.swing.JPanel();
        JungleViewLBL = new javax.swing.JLabel();
        SeaViewLBL = new javax.swing.JLabel();
        mainDivider = new javax.swing.JPanel();
        BookBTN = new javax.swing.JButton();
        FilterBTN = new javax.swing.JButton();
        ExitBTN = new javax.swing.JButton();
        SR1 = new javax.swing.JPanel();
        SR1BTN = new javax.swing.JButton();
        JR1 = new javax.swing.JPanel();
        JR1BTN = new javax.swing.JButton();
        SR2 = new javax.swing.JPanel();
        SR2BTN = new javax.swing.JButton();
        JR2 = new javax.swing.JPanel();
        JR2BTN = new javax.swing.JButton();
        SR3 = new javax.swing.JPanel();
        SR3BTN = new javax.swing.JButton();
        JR3 = new javax.swing.JPanel();
        JR3BTN = new javax.swing.JButton();
        SR4 = new javax.swing.JPanel();
        SR4BTN = new javax.swing.JButton();
        JR4 = new javax.swing.JPanel();
        JR4BTN = new javax.swing.JButton();
        SR5 = new javax.swing.JPanel();
        SR5BTN = new javax.swing.JButton();
        JR5 = new javax.swing.JPanel();
        JR5BTN = new javax.swing.JButton();
        SR6 = new javax.swing.JPanel();
        SR6BTN = new javax.swing.JButton();
        JR6 = new javax.swing.JPanel();
        JR6BTN = new javax.swing.JButton();
        SR7 = new javax.swing.JPanel();
        SR7BTN = new javax.swing.JButton();
        JR7 = new javax.swing.JPanel();
        JR7BTN = new javax.swing.JButton();
        SR8 = new javax.swing.JPanel();
        SR8BTN = new javax.swing.JButton();
        JR8 = new javax.swing.JPanel();
        JR8BTN = new javax.swing.JButton();
        SR9 = new javax.swing.JPanel();
        SR9BTN = new javax.swing.JButton();
        JR9 = new javax.swing.JPanel();
        JR9BTN = new javax.swing.JButton();
        SR10 = new javax.swing.JPanel();
        SR10BTN = new javax.swing.JButton();
        JR10 = new javax.swing.JPanel();
        JR10BTN = new javax.swing.JButton();
        CalendarLBL = new javax.swing.JPanel();
        filterCalendar = new com.toedter.calendar.JCalendar();
        RoomLBL = new javax.swing.JPanel();
        RoomDetailsLBL = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        RoomIDLBL = new javax.swing.JLabel();
        CustomerNameLBL = new javax.swing.JLabel();
        ICLBL = new javax.swing.JLabel();
        ContactLBL = new javax.swing.JLabel();
        EmailLBL = new javax.swing.JLabel();
        CheckinLBL = new javax.swing.JLabel();
        CheckoutLBL = new javax.swing.JLabel();
        StayLBL = new javax.swing.JLabel();
        inputRoomID = new javax.swing.JTextField();
        inputCustomerName = new javax.swing.JTextField();
        inputIC = new javax.swing.JTextField();
        inputContact = new javax.swing.JTextField();
        inputEmail = new javax.swing.JTextField();
        inputStay = new javax.swing.JTextField();
        inputCheckin = new com.toedter.calendar.JDateChooser();
        inputCheckout = new com.toedter.calendar.JDateChooser();
        HistoryBTN = new javax.swing.JButton();
        ReceiptBTN = new javax.swing.JButton();
        CountBTN = new javax.swing.JButton();
        filterDate = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuBackground.setBackground(new java.awt.Color(127, 203, 188));
        menuBackground.setPreferredSize(new java.awt.Dimension(1040, 635));

        JungleViewLBL.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        JungleViewLBL.setText("Jungle View Rooms");

        SeaViewLBL.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        SeaViewLBL.setText("Sea View Rooms");

        mainDivider.setBackground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout mainDividerLayout = new javax.swing.GroupLayout(mainDivider);
        mainDivider.setLayout(mainDividerLayout);
        mainDividerLayout.setHorizontalGroup(
            mainDividerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        mainDividerLayout.setVerticalGroup(
            mainDividerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        BookBTN.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        BookBTN.setText("Book");
        BookBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookBTNActionPerformed(evt);
            }
        });

        FilterBTN.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        FilterBTN.setText("Filter");
        FilterBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FilterBTNActionPerformed(evt);
            }
        });

        ExitBTN.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        ExitBTN.setText("Exit");
        ExitBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitBTNActionPerformed(evt);
            }
        });

        SR1BTN.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        SR1BTN.setText("SR1");
        SR1BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SR1BTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SR1Layout = new javax.swing.GroupLayout(SR1);
        SR1.setLayout(SR1Layout);
        SR1Layout.setHorizontalGroup(
            SR1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SR1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SR1BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        SR1Layout.setVerticalGroup(
            SR1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SR1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(SR1BTN)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        JR1BTN.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        JR1BTN.setText("JR1");
        JR1BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JR1BTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JR1Layout = new javax.swing.GroupLayout(JR1);
        JR1.setLayout(JR1Layout);
        JR1Layout.setHorizontalGroup(
            JR1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JR1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JR1BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JR1Layout.setVerticalGroup(
            JR1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JR1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(JR1BTN)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        SR2BTN.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        SR2BTN.setText("SR2");
        SR2BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SR2BTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SR2Layout = new javax.swing.GroupLayout(SR2);
        SR2.setLayout(SR2Layout);
        SR2Layout.setHorizontalGroup(
            SR2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SR2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SR2BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SR2Layout.setVerticalGroup(
            SR2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SR2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(SR2BTN)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        JR2BTN.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        JR2BTN.setText("JR2");
        JR2BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JR2BTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JR2Layout = new javax.swing.GroupLayout(JR2);
        JR2.setLayout(JR2Layout);
        JR2Layout.setHorizontalGroup(
            JR2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JR2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JR2BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JR2Layout.setVerticalGroup(
            JR2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JR2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(JR2BTN)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        SR3BTN.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        SR3BTN.setText("SR3");
        SR3BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SR3BTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SR3Layout = new javax.swing.GroupLayout(SR3);
        SR3.setLayout(SR3Layout);
        SR3Layout.setHorizontalGroup(
            SR3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SR3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SR3BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SR3Layout.setVerticalGroup(
            SR3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SR3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(SR3BTN)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        JR3BTN.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        JR3BTN.setText("JR3");
        JR3BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JR3BTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JR3Layout = new javax.swing.GroupLayout(JR3);
        JR3.setLayout(JR3Layout);
        JR3Layout.setHorizontalGroup(
            JR3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JR3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JR3BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JR3Layout.setVerticalGroup(
            JR3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JR3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(JR3BTN)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        SR4BTN.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        SR4BTN.setText("SR4");
        SR4BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SR4BTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SR4Layout = new javax.swing.GroupLayout(SR4);
        SR4.setLayout(SR4Layout);
        SR4Layout.setHorizontalGroup(
            SR4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SR4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SR4BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SR4Layout.setVerticalGroup(
            SR4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SR4Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(SR4BTN)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        JR4BTN.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        JR4BTN.setText("JR4");
        JR4BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JR4BTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JR4Layout = new javax.swing.GroupLayout(JR4);
        JR4.setLayout(JR4Layout);
        JR4Layout.setHorizontalGroup(
            JR4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JR4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JR4BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        JR4Layout.setVerticalGroup(
            JR4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JR4Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(JR4BTN)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        SR5BTN.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        SR5BTN.setText("SR5");
        SR5BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SR5BTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SR5Layout = new javax.swing.GroupLayout(SR5);
        SR5.setLayout(SR5Layout);
        SR5Layout.setHorizontalGroup(
            SR5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SR5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SR5BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        SR5Layout.setVerticalGroup(
            SR5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SR5Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(SR5BTN)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        JR5BTN.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        JR5BTN.setText("JR5");
        JR5BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JR5BTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JR5Layout = new javax.swing.GroupLayout(JR5);
        JR5.setLayout(JR5Layout);
        JR5Layout.setHorizontalGroup(
            JR5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JR5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JR5BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JR5Layout.setVerticalGroup(
            JR5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JR5Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(JR5BTN)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        SR6BTN.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        SR6BTN.setText("SR6");
        SR6BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SR6BTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SR6Layout = new javax.swing.GroupLayout(SR6);
        SR6.setLayout(SR6Layout);
        SR6Layout.setHorizontalGroup(
            SR6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SR6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SR6BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        SR6Layout.setVerticalGroup(
            SR6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SR6Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(SR6BTN)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        JR6BTN.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        JR6BTN.setText("JR6");
        JR6BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JR6BTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JR6Layout = new javax.swing.GroupLayout(JR6);
        JR6.setLayout(JR6Layout);
        JR6Layout.setHorizontalGroup(
            JR6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JR6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JR6BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JR6Layout.setVerticalGroup(
            JR6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JR6Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(JR6BTN)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        SR7BTN.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        SR7BTN.setText("SR7");
        SR7BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SR7BTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SR7Layout = new javax.swing.GroupLayout(SR7);
        SR7.setLayout(SR7Layout);
        SR7Layout.setHorizontalGroup(
            SR7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SR7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SR7BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SR7Layout.setVerticalGroup(
            SR7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SR7Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(SR7BTN)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        JR7BTN.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        JR7BTN.setText("JR7");
        JR7BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JR7BTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JR7Layout = new javax.swing.GroupLayout(JR7);
        JR7.setLayout(JR7Layout);
        JR7Layout.setHorizontalGroup(
            JR7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JR7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JR7BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JR7Layout.setVerticalGroup(
            JR7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JR7Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(JR7BTN)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        SR8BTN.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        SR8BTN.setText("SR8");
        SR8BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SR8BTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SR8Layout = new javax.swing.GroupLayout(SR8);
        SR8.setLayout(SR8Layout);
        SR8Layout.setHorizontalGroup(
            SR8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SR8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SR8BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SR8Layout.setVerticalGroup(
            SR8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SR8Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(SR8BTN)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        JR8BTN.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        JR8BTN.setText("JR8");
        JR8BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JR8BTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JR8Layout = new javax.swing.GroupLayout(JR8);
        JR8.setLayout(JR8Layout);
        JR8Layout.setHorizontalGroup(
            JR8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JR8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JR8BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JR8Layout.setVerticalGroup(
            JR8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JR8Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(JR8BTN)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        SR9BTN.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        SR9BTN.setText("SR9");
        SR9BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SR9BTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SR9Layout = new javax.swing.GroupLayout(SR9);
        SR9.setLayout(SR9Layout);
        SR9Layout.setHorizontalGroup(
            SR9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SR9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SR9BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        SR9Layout.setVerticalGroup(
            SR9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SR9Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(SR9BTN)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        JR9BTN.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        JR9BTN.setText("JR9");
        JR9BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JR9BTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JR9Layout = new javax.swing.GroupLayout(JR9);
        JR9.setLayout(JR9Layout);
        JR9Layout.setHorizontalGroup(
            JR9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JR9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JR9BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        JR9Layout.setVerticalGroup(
            JR9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JR9Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(JR9BTN)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        SR10BTN.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        SR10BTN.setText("SR10");
        SR10BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SR10BTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SR10Layout = new javax.swing.GroupLayout(SR10);
        SR10.setLayout(SR10Layout);
        SR10Layout.setHorizontalGroup(
            SR10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SR10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SR10BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        SR10Layout.setVerticalGroup(
            SR10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SR10Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(SR10BTN)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        JR10BTN.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        JR10BTN.setText("JR10");
        JR10BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JR10BTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JR10Layout = new javax.swing.GroupLayout(JR10);
        JR10.setLayout(JR10Layout);
        JR10Layout.setHorizontalGroup(
            JR10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JR10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JR10BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JR10Layout.setVerticalGroup(
            JR10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JR10Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(JR10BTN)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        CalendarLBL.setPreferredSize(new java.awt.Dimension(375, 330));

        filterCalendar.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N

        javax.swing.GroupLayout CalendarLBLLayout = new javax.swing.GroupLayout(CalendarLBL);
        CalendarLBL.setLayout(CalendarLBLLayout);
        CalendarLBLLayout.setHorizontalGroup(
            CalendarLBLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CalendarLBLLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(filterCalendar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        CalendarLBLLayout.setVerticalGroup(
            CalendarLBLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CalendarLBLLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(filterCalendar, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                .addContainerGap())
        );

        RoomDetailsLBL.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        RoomDetailsLBL.setText("Room Details");

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(360, 5));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        RoomIDLBL.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        RoomIDLBL.setText("Room ID:");

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

        inputRoomID.setEditable(false);
        inputRoomID.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N

        inputCustomerName.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N

        inputIC.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N

        inputContact.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N

        inputEmail.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N

        inputStay.setEditable(false);
        inputStay.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N

        inputCheckin.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N

        inputCheckout.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N

        javax.swing.GroupLayout RoomLBLLayout = new javax.swing.GroupLayout(RoomLBL);
        RoomLBL.setLayout(RoomLBLLayout);
        RoomLBLLayout.setHorizontalGroup(
            RoomLBLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RoomLBLLayout.createSequentialGroup()
                .addGroup(RoomLBLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RoomLBLLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(RoomLBLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RoomDetailsLBL)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(RoomLBLLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(RoomLBLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CustomerNameLBL)
                            .addComponent(RoomIDLBL)
                            .addComponent(ICLBL)
                            .addComponent(ContactLBL)
                            .addComponent(EmailLBL)
                            .addComponent(CheckinLBL)
                            .addComponent(CheckoutLBL)
                            .addComponent(StayLBL))
                        .addGap(18, 18, 18)
                        .addGroup(RoomLBLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(inputRoomID)
                            .addComponent(inputCustomerName, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(inputIC, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(inputContact, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(inputEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(inputStay, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(inputCheckin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(inputCheckout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        RoomLBLLayout.setVerticalGroup(
            RoomLBLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RoomLBLLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(RoomDetailsLBL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RoomLBLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(RoomLBLLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(RoomLBLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RoomIDLBL)
                            .addComponent(inputRoomID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(RoomLBLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CustomerNameLBL)
                            .addComponent(inputCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(RoomLBLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ICLBL)
                            .addComponent(inputIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(RoomLBLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ContactLBL)
                            .addComponent(inputContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(RoomLBLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EmailLBL)
                            .addComponent(inputEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CheckinLBL))
                    .addComponent(inputCheckin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(RoomLBLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RoomLBLLayout.createSequentialGroup()
                        .addComponent(CheckoutLBL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(RoomLBLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(StayLBL)
                            .addComponent(inputStay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(inputCheckout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        HistoryBTN.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        HistoryBTN.setText("History");
        HistoryBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HistoryBTNActionPerformed(evt);
            }
        });

        ReceiptBTN.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        ReceiptBTN.setText("Receipt");
        ReceiptBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReceiptBTNActionPerformed(evt);
            }
        });

        CountBTN.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        CountBTN.setText("Count");
        CountBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CountBTNActionPerformed(evt);
            }
        });

        filterDate.setEditable(false);
        filterDate.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N

        javax.swing.GroupLayout menuBackgroundLayout = new javax.swing.GroupLayout(menuBackground);
        menuBackground.setLayout(menuBackgroundLayout);
        menuBackgroundLayout.setHorizontalGroup(
            menuBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainDivider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(menuBackgroundLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(menuBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JungleViewLBL)
                    .addComponent(SeaViewLBL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(menuBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SR1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JR1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(menuBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JR2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SR2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(menuBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JR3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SR3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(menuBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JR4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SR4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(menuBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SR5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JR5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(menuBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SR6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JR6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(menuBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SR7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JR7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(menuBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SR8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JR8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(menuBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JR9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SR9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(menuBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(JR10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SR10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 31, Short.MAX_VALUE))
            .addGroup(menuBackgroundLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(menuBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuBackgroundLayout.createSequentialGroup()
                        .addComponent(filterDate)
                        .addGap(18, 18, 18)
                        .addComponent(FilterBTN)
                        .addGap(214, 214, 214))
                    .addGroup(menuBackgroundLayout.createSequentialGroup()
                        .addComponent(CalendarLBL, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(ExitBTN)))
                .addGap(18, 18, 18)
                .addComponent(RoomLBL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(menuBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HistoryBTN)
                    .addComponent(ReceiptBTN)
                    .addComponent(BookBTN)
                    .addComponent(CountBTN))
                .addGap(17, 17, 17))
        );
        menuBackgroundLayout.setVerticalGroup(
            menuBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuBackgroundLayout.createSequentialGroup()
                .addGroup(menuBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(menuBackgroundLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(menuBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(menuBackgroundLayout.createSequentialGroup()
                                .addGroup(menuBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SR1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SR3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SR5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SR7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SR9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(menuBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JR1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JR3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JR5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JR7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JR9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(menuBackgroundLayout.createSequentialGroup()
                                .addComponent(SR2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JR2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(menuBackgroundLayout.createSequentialGroup()
                                .addComponent(SR4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JR4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(menuBackgroundLayout.createSequentialGroup()
                                .addComponent(SR6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JR6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(menuBackgroundLayout.createSequentialGroup()
                                .addComponent(SR8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JR8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(menuBackgroundLayout.createSequentialGroup()
                                .addComponent(SR10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JR10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(12, 12, 12))
                    .addGroup(menuBackgroundLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(SeaViewLBL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JungleViewLBL)
                        .addGap(54, 54, 54)))
                .addComponent(mainDivider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(menuBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(menuBackgroundLayout.createSequentialGroup()
                        .addComponent(ReceiptBTN)
                        .addGap(12, 12, 12)
                        .addComponent(HistoryBTN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CountBTN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BookBTN))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuBackgroundLayout.createSequentialGroup()
                        .addGroup(menuBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FilterBTN)
                            .addComponent(filterDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ExitBTN))
                    .addComponent(RoomLBL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CalendarLBL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuBackground, javax.swing.GroupLayout.DEFAULT_SIZE, 655, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
    * Exit Button
    */
    private void ExitBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitBTNActionPerformed
        new Login_GUI().setVisible(true);
        dispose();
    }//GEN-LAST:event_ExitBTNActionPerformed

    /**
    * History Button
    */
    private void HistoryBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HistoryBTNActionPerformed
        new History_GUI().setVisible(true);
    }//GEN-LAST:event_HistoryBTNActionPerformed

    /**
    * Receipt Button
    */
    private void ReceiptBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReceiptBTNActionPerformed
        new Receipt_GUI().setVisible(true);
    }//GEN-LAST:event_ReceiptBTNActionPerformed

    /**
    * Count Button
    */
    private void CountBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CountBTNActionPerformed
        // Get Check-in Check-out Date
        SimpleDateFormat dmyFormat = new SimpleDateFormat("dd-MM-yyyy");
        String checkinDate = dmyFormat.format(inputCheckin.getDate());
        String checkoutDate = dmyFormat.format(inputCheckout.getDate());
        
        // Calculate Days of Stay
        try
        {
            Date checkin = dmyFormat.parse(checkinDate);
            Date checkout = dmyFormat.parse(checkoutDate);
            long daysOfStay = checkout.getTime() - checkin.getTime();
            long convertTime = TimeUnit.DAYS.convert(daysOfStay, TimeUnit.MILLISECONDS);
            
            // Set the days of stay
            inputStay.setText(String.valueOf(convertTime));
            
            // Enabled Book Button
            BookBTN.setEnabled(true);
        }
        catch(ParseException e)
        {
            System.out.println("Error");
        }
    }//GEN-LAST:event_CountBTNActionPerformed

    /**
    * Book Button
    */
    private void BookBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookBTNActionPerformed
        // Get Admin Input
        String roomID = inputRoomID.getText();
        String customerName = inputCustomerName.getText();
        String IC = inputIC.getText();
        String contact = inputContact.getText();
        String email = inputEmail.getText();
        
        // Get Admin Name and Payment Date
        String adminName = "Admin";
        
        // Get Payment Check-in Check-out Date
        SimpleDateFormat dmyFormat = new SimpleDateFormat("dd-MM-yyyy");
        String paymentDate = dmyFormat.format(inputCheckin.getDate());
        String checkinDate = dmyFormat.format(inputCheckin.getDate());
        String checkoutDate = dmyFormat.format(inputCheckout.getDate());
        String stay = inputStay.getText();
        
        // Calculate Room Price and Taxes
        int bP = Integer.parseInt(stay) * 350;
        int tT = Integer.parseInt(stay) * 10;
        int sT = (int) (bP * 0.1);
        int tP = bP + tT + sT;
                
        String basePrice = String.valueOf(bP);
        String tourTax = String.valueOf(tT);
        String serviceTax = String.valueOf(sT);
        String totalPrice = String.valueOf(tP);
        
        // Confirm Booking
        int confirmBook;
        confirmBook = JOptionPane.showConfirmDialog(null, "Proceed and record this booking?", "Confirm Booking", JOptionPane.YES_NO_OPTION);

        if(confirmBook == JOptionPane.NO_OPTION)
        {
            JOptionPane.showMessageDialog(null, "Booking was cancelled and are not recorded.");
            
            // Clear Text Fields and Date Chooser
            JTextField inputArr[] = new JTextField[] {inputRoomID, inputCustomerName, inputIC, inputContact, inputEmail, inputStay};
    
            for(int i = 0; i < inputArr.length; i++)
            {
                inputArr[i].setText("");
            }

            inputCheckin.setDate(null);
            inputCheckout.setDate(null);
            
            // Disable Textfields by default
            JTextField[] fieldArr = new JTextField[] {inputCustomerName, inputIC, inputContact, inputEmail};

            for(int i = 0; i < fieldArr.length; i++)
            {
                fieldArr[i].setEditable(false);
            }

            inputCheckin.setEnabled(false);
            inputCheckout.setEnabled(false);
            
            // Disable Button
            CountBTN.setEnabled(false);
            BookBTN.setEnabled(false);
        }
        else if(confirmBook == JOptionPane.YES_OPTION)
        {
            JOptionPane.showMessageDialog(null, "Booking was successful and are recorded.\nTo manage, proceed to History.\nTo view invoice, proceed to Receipt.");
            
            try
            {
                /**
                 * File Operation for Resort_History text file
                 */
                // Extract available data from file
                File f = new File("Resort_History.txt");
                BufferedReader br = new BufferedReader(new FileReader(f));
                
                // Get Number of Lines in File
                int lineLength = 0;
        
                LineNumberReader lnr = new LineNumberReader(new FileReader(f));
                
                while(lnr.readLine() != null) 
                {
                    lineLength++;
                }

                lineLength = lnr.getLineNumber() + 1;

                // Create Array in Array
                String[] fileData;

                String[][] tempData = new String[lineLength][12];
                
                String line;
                
                // For Loop Exisiting Data into Array in Array
                int pass = 0;

                while((line = br.readLine()) != null)
                {
                    fileData = line.split("\\s\\|\\s");

                    for(int i = 0; i < fileData.length; i++)
                    {
                        tempData[pass][i] = fileData[i];
                    }

                    pass++;
                }
                    
                /**
                 * Write Old and New Data into File
                 */
                // New Data
                String[] newFileData = new String[] {roomID, customerName, IC, contact, email, checkinDate, checkoutDate, stay, basePrice, tourTax, serviceTax, totalPrice};
        
                // Add New Data to Array in Array
                for(int i = 0; i < newFileData.length; i++)
                {
                    tempData[lineLength - 1][i] = newFileData[i];
                }

                // Write File
                BufferedWriter bw = new BufferedWriter(new FileWriter(f));

                // Clear exisitng data in file
                bw.flush();

                // For loop old and new data back into the file
                for(int i = 0; i < tempData.length; i++)
                {
                    for(int j = 0; j < 12; j++)
                    {
                        if(j != 11)
                        {
                            bw.write(tempData[i][j] + " | ");
                        }
                        else
                        {
                            bw.write(tempData[i][j]);
                            bw.write("\n");
                        }
                    }
                }

                // Close All Opened File
                br.close();
                bw.close();
                lnr.close();
            }
            catch(IOException e)
            {
                System.out.println("Error 2");
            }
            
            /**
             * File Operation for Customer_Receipt text file
             */
            // Extract existing data from file
            try
            {
                File f = new File("Customer_Receipt.txt");
                BufferedReader br = new BufferedReader(new FileReader(f));
                
                // Get Number of Lines in File
                int lineLength = 0;
        
                LineNumberReader lnr = new LineNumberReader(new FileReader(f));
                
                while(lnr.readLine() != null) 
                {
                    lineLength++;
                }

                lineLength = lnr.getLineNumber() + 1;

                // Create Array in Array
                String[] fileData;

                String[][] tempData = new String[lineLength][11];
                
                String line;
                
                // For Loop Exisiting Data into Array in Array
                int pass = 0;

                while((line = br.readLine()) != null)
                {
                    fileData = line.split("\\s\\|\\s");

                    for(int i = 0; i < fileData.length; i++)
                    {
                        tempData[pass][i] = fileData[i];
                    }

                    pass++;
                }
                
                /**
                 * Write Old and New Data into File
                 */
                // New Data
                String[] newFileData = new String[] {roomID, customerName, adminName, paymentDate, checkinDate, checkoutDate, stay, basePrice, tourTax, serviceTax, totalPrice};
        
                // Add New Data to Array in Array
                for(int i = 0; i < newFileData.length; i++)
                {
                    tempData[lineLength - 1][i] = newFileData[i];
                }

                // Write File
                BufferedWriter bw = new BufferedWriter(new FileWriter(f));

                // Clear exisitng data in file
                bw.flush();

                // For loop old and new data back into the file
                for(int i = 0; i < tempData.length; i++)
                {
                    for(int j = 0; j < 11; j++)
                    {
                        if(j != 10)
                        {
                            bw.write(tempData[i][j] + " | ");
                        }
                        else
                        {
                            bw.write(tempData[i][j]);
                            bw.write("\n");
                        }
                    }
                }

                // Close All Opened File
                br.close();
                bw.close();
                lnr.close();
            }
            catch(IOException e)
            {
                System.out.println("Error 3");
            }
            
            // Clear Text Fields and Date Chooser
            JTextField inputArr[] = new JTextField[] {inputRoomID, inputCustomerName, inputIC, inputContact, inputEmail, inputStay};
    
            for(int i = 0; i < inputArr.length; i++)
            {
                inputArr[i].setText("");
            }

            inputCheckin.setDate(null);
            inputCheckout.setDate(null);
            
            // Disable Textfields by default
            JTextField[] fieldArr = new JTextField[] {inputCustomerName, inputIC, inputContact, inputEmail};

            for(int i = 0; i < fieldArr.length; i++)
            {
                fieldArr[i].setEditable(false);
            }

            inputCheckin.setEnabled(false);
            inputCheckout.setEnabled(false);
            
            // Disable Button
            CountBTN.setEnabled(false);
            BookBTN.setEnabled(false);
        }
    }//GEN-LAST:event_BookBTNActionPerformed

    /**
    * Filter Button
    */
    private void FilterBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FilterBTNActionPerformed
        // Get and display filter date
        SimpleDateFormat dmyFormat = new SimpleDateFormat("dd-MM-yyyy");
        String sDate = dmyFormat.format(filterCalendar.getDate());
        filterDate.setText(sDate);
        
        // OOP Constructor Method
        String[][] history;
        OOP_Constructor_Main constructor = new OOP_Constructor_Main();
        
        history = constructor.historyData();
        
        // Create array for Label and Button
        JPanel[] panelArr = new JPanel[] {SR1, SR2, SR3, SR4, SR5, SR6, SR7, SR8, SR9, SR10, JR1, JR2, JR3, JR4, JR5, JR6, JR7, JR8, JR9, JR10};
        JButton[] buttonArr = new JButton[] {SR1BTN, SR2BTN, SR3BTN, SR4BTN, SR5BTN, SR6BTN, SR7BTN, SR8BTN, SR9BTN, SR10BTN, JR1BTN, JR2BTN, JR3BTN, JR4BTN, JR5BTN, JR6BTN, JR7BTN, JR8BTN, JR9BTN, JR10BTN};
        
        // Enable room button
        for(int i = 0; i < panelArr.length; i++)
        {
            panelArr[i].setEnabled(true);
            buttonArr[i].setEnabled(true);
        }
        
        // Filter
        for(int i = 0; i < panelArr.length; i++)
        {
            for(int j = 0; j < history.length; j++)
            {
                try
                {
                    var dateOffSet = 1;
                    var checkin = dmyFormat.parse(history[j][5]);
                    var checkout = dmyFormat.parse(history[j][6]);

                    checkin.setDate(checkin.getDate() - dateOffSet);
                    checkout.setDate(checkout.getDate() + 1);

                    Date selectedFilter = dmyFormat.parse(sDate);
                    
                    if(buttonArr[i].getText().equals(history[j][0]))
                    {
                        if(selectedFilter.after(checkin) && selectedFilter.before(checkout))
                        {
                            panelArr[i].setBackground(Color.red);
                            buttonArr[i].setEnabled(false);
                        }
                        else
                        {
                            panelArr[i].setBackground(Color.green);
                            buttonArr[i].setEnabled(true);
                        }
                    }
                }
                catch(Exception e)
                {
                    System.out.println("F-Error");
                }
            }
        }
        
        // Enable Textfields
        JTextField[] fieldArr = new JTextField[] {inputCustomerName, inputIC, inputContact, inputEmail};
        
        for(int i = 0; i < fieldArr.length; i++)
        {
            fieldArr[i].setEditable(true);
        }
        
        inputCheckin.setEnabled(true);
        inputCheckout.setEnabled(true);
        
        // Enable button
        CountBTN.setEnabled(true);
    }//GEN-LAST:event_FilterBTNActionPerformed

    private void SR1BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SR1BTNActionPerformed
        inputRoomID.setText("SR1");
    }//GEN-LAST:event_SR1BTNActionPerformed

    private void SR2BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SR2BTNActionPerformed
        inputRoomID.setText("SR2");
    }//GEN-LAST:event_SR2BTNActionPerformed

    private void SR3BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SR3BTNActionPerformed
        inputRoomID.setText("SR3");
    }//GEN-LAST:event_SR3BTNActionPerformed

    private void SR4BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SR4BTNActionPerformed
        inputRoomID.setText("SR4");
    }//GEN-LAST:event_SR4BTNActionPerformed

    private void SR5BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SR5BTNActionPerformed
        inputRoomID.setText("SR5");
    }//GEN-LAST:event_SR5BTNActionPerformed

    private void SR6BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SR6BTNActionPerformed
        inputRoomID.setText("SR6");
    }//GEN-LAST:event_SR6BTNActionPerformed

    private void SR7BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SR7BTNActionPerformed
        inputRoomID.setText("SR7");
    }//GEN-LAST:event_SR7BTNActionPerformed

    private void SR8BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SR8BTNActionPerformed
        inputRoomID.setText("SR8");
    }//GEN-LAST:event_SR8BTNActionPerformed

    private void SR9BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SR9BTNActionPerformed
        inputRoomID.setText("SR9");
    }//GEN-LAST:event_SR9BTNActionPerformed

    private void SR10BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SR10BTNActionPerformed
        inputRoomID.setText("SR10");
    }//GEN-LAST:event_SR10BTNActionPerformed

    private void JR1BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JR1BTNActionPerformed
        inputRoomID.setText("JR1");
    }//GEN-LAST:event_JR1BTNActionPerformed

    private void JR2BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JR2BTNActionPerformed
        inputRoomID.setText("JR2");
    }//GEN-LAST:event_JR2BTNActionPerformed

    private void JR3BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JR3BTNActionPerformed
        inputRoomID.setText("JR3");
    }//GEN-LAST:event_JR3BTNActionPerformed

    private void JR4BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JR4BTNActionPerformed
        inputRoomID.setText("JR4");
    }//GEN-LAST:event_JR4BTNActionPerformed

    private void JR5BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JR5BTNActionPerformed
        inputRoomID.setText("JR5");
    }//GEN-LAST:event_JR5BTNActionPerformed

    private void JR6BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JR6BTNActionPerformed
        inputRoomID.setText("JR6");
    }//GEN-LAST:event_JR6BTNActionPerformed

    private void JR7BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JR7BTNActionPerformed
        inputRoomID.setText("JR7");
    }//GEN-LAST:event_JR7BTNActionPerformed

    private void JR8BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JR8BTNActionPerformed
        inputRoomID.setText("JR8");
    }//GEN-LAST:event_JR8BTNActionPerformed

    private void JR9BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JR9BTNActionPerformed
        inputRoomID.setText("JR9");
    }//GEN-LAST:event_JR9BTNActionPerformed

    private void JR10BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JR10BTNActionPerformed
        inputRoomID.setText("JR10");
    }//GEN-LAST:event_JR10BTNActionPerformed

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
            java.util.logging.Logger.getLogger(Main_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        // Create and display the form
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_GUI().setVisible(true);
            }
        });
    }

    /**
    * DO NOT TOUCH
    */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BookBTN;
    private javax.swing.JPanel CalendarLBL;
    private javax.swing.JLabel CheckinLBL;
    private javax.swing.JLabel CheckoutLBL;
    private javax.swing.JLabel ContactLBL;
    private javax.swing.JButton CountBTN;
    private javax.swing.JLabel CustomerNameLBL;
    private javax.swing.JLabel EmailLBL;
    private javax.swing.JButton ExitBTN;
    private javax.swing.JButton FilterBTN;
    private javax.swing.JButton HistoryBTN;
    private javax.swing.JLabel ICLBL;
    private javax.swing.JPanel JR1;
    private javax.swing.JPanel JR10;
    private javax.swing.JButton JR10BTN;
    private javax.swing.JButton JR1BTN;
    private javax.swing.JPanel JR2;
    private javax.swing.JButton JR2BTN;
    private javax.swing.JPanel JR3;
    private javax.swing.JButton JR3BTN;
    private javax.swing.JPanel JR4;
    private javax.swing.JButton JR4BTN;
    private javax.swing.JPanel JR5;
    private javax.swing.JButton JR5BTN;
    private javax.swing.JPanel JR6;
    private javax.swing.JButton JR6BTN;
    private javax.swing.JPanel JR7;
    private javax.swing.JButton JR7BTN;
    private javax.swing.JPanel JR8;
    private javax.swing.JButton JR8BTN;
    private javax.swing.JPanel JR9;
    private javax.swing.JButton JR9BTN;
    private javax.swing.JLabel JungleViewLBL;
    private javax.swing.JButton ReceiptBTN;
    private javax.swing.JLabel RoomDetailsLBL;
    private javax.swing.JLabel RoomIDLBL;
    private javax.swing.JPanel RoomLBL;
    private javax.swing.JPanel SR1;
    private javax.swing.JPanel SR10;
    private javax.swing.JButton SR10BTN;
    private javax.swing.JButton SR1BTN;
    private javax.swing.JPanel SR2;
    private javax.swing.JButton SR2BTN;
    private javax.swing.JPanel SR3;
    private javax.swing.JButton SR3BTN;
    private javax.swing.JPanel SR4;
    private javax.swing.JButton SR4BTN;
    private javax.swing.JPanel SR5;
    private javax.swing.JButton SR5BTN;
    private javax.swing.JPanel SR6;
    private javax.swing.JButton SR6BTN;
    private javax.swing.JPanel SR7;
    private javax.swing.JButton SR7BTN;
    private javax.swing.JPanel SR8;
    private javax.swing.JButton SR8BTN;
    private javax.swing.JPanel SR9;
    private javax.swing.JButton SR9BTN;
    private javax.swing.JLabel SeaViewLBL;
    private javax.swing.JLabel StayLBL;
    private com.toedter.calendar.JCalendar filterCalendar;
    private javax.swing.JTextField filterDate;
    private com.toedter.calendar.JDateChooser inputCheckin;
    private com.toedter.calendar.JDateChooser inputCheckout;
    private javax.swing.JTextField inputContact;
    private javax.swing.JTextField inputCustomerName;
    private javax.swing.JTextField inputEmail;
    private javax.swing.JTextField inputIC;
    private javax.swing.JTextField inputRoomID;
    private javax.swing.JTextField inputStay;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel mainDivider;
    private javax.swing.JPanel menuBackground;
    // End of variables declaration//GEN-END:variables
}
