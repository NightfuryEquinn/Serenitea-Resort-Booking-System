package com.University.JavaProjects.Java_Assignment;

import javax.swing.JOptionPane;

public class Login_GUI extends javax.swing.JFrame {

    /**
     * Creates new form Login_GUI
     */
    public Login_GUI() {
        initComponents();
    }

    /**
     * DO NOT TOUCH
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginBackground = new javax.swing.JPanel();
        WelcomeLBL = new javax.swing.JLabel();
        UsernameLBL = new javax.swing.JLabel();
        PasswordLBL = new javax.swing.JLabel();
        inputUsername = new javax.swing.JTextField();
        inputPassword = new javax.swing.JTextField();
        WelcomeDivider = new javax.swing.JPanel();
        LoginBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(96, 179, 182));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));

        loginBackground.setBackground(new java.awt.Color(127, 203, 188));

        WelcomeLBL.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 36)); // NOI18N
        WelcomeLBL.setText("Serenitea Resort Booking System");

        UsernameLBL.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        UsernameLBL.setText("Username:");

        PasswordLBL.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        PasswordLBL.setText("Password:");

        inputUsername.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N

        inputPassword.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N

        WelcomeDivider.setBackground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout WelcomeDividerLayout = new javax.swing.GroupLayout(WelcomeDivider);
        WelcomeDivider.setLayout(WelcomeDividerLayout);
        WelcomeDividerLayout.setHorizontalGroup(
            WelcomeDividerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        WelcomeDividerLayout.setVerticalGroup(
            WelcomeDividerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        LoginBTN.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        LoginBTN.setText("Login");
        LoginBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginBackgroundLayout = new javax.swing.GroupLayout(loginBackground);
        loginBackground.setLayout(loginBackgroundLayout);
        loginBackgroundLayout.setHorizontalGroup(
            loginBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginBackgroundLayout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addGroup(loginBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(WelcomeLBL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(WelcomeDivider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(113, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginBackgroundLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(loginBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PasswordLBL)
                    .addGroup(loginBackgroundLayout.createSequentialGroup()
                        .addComponent(UsernameLBL)
                        .addGap(61, 61, 61)
                        .addGroup(loginBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(loginBackgroundLayout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(LoginBTN)))
                .addGap(275, 275, 275))
        );
        loginBackgroundLayout.setVerticalGroup(
            loginBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginBackgroundLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(WelcomeLBL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(WelcomeDivider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122)
                .addGroup(loginBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UsernameLBL)
                    .addComponent(inputUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(loginBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PasswordLBL)
                    .addComponent(inputPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(LoginBTN)
                .addGap(144, 144, 144))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Login Button
     */
    private void LoginBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginBTNActionPerformed
        // Get Admin Input
        String pendingUsername = inputUsername.getText();
        String pendingPassword = inputPassword.getText();
        
        // OOP Get Set Method
        OOP_GS_Credential gs = new OOP_GS_Credential();
        gs.setCredential(pendingUsername, pendingPassword);
        
        // Validate Admin Input with Credentials in Admin_Credential.txt
        String validateUsername, validatePassword;
        validateUsername = gs.getUsername();
        validatePassword = gs.getPassword();
        
        if((pendingUsername.equals(validateUsername)) && (pendingPassword.equals(validatePassword)))
        {
            new Main_GUI().setVisible(true);
            dispose();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Either your username or password is incorrect", "Invalid Credentials", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_LoginBTNActionPerformed

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
            java.util.logging.Logger.getLogger(Login_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        // Create and display the form 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_GUI().setVisible(true);
            }
        });
    }

    /**
    * DO NOT TOUCH
    */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton LoginBTN;
    private javax.swing.JLabel PasswordLBL;
    private javax.swing.JLabel UsernameLBL;
    private javax.swing.JPanel WelcomeDivider;
    private javax.swing.JLabel WelcomeLBL;
    private javax.swing.JTextField inputPassword;
    private javax.swing.JTextField inputUsername;
    private javax.swing.JPanel loginBackground;
    // End of variables declaration//GEN-END:variables
}
