package General;

import Utilities.FileHandling;
import Utilities.UserRegistrationInfo;
import Utilities.PasswordHashing;
import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class CustomerLogin extends javax.swing.JFrame {

    UserRegistrationInfo cust = new UserRegistrationInfo();
    PasswordHashing password = new PasswordHashing();
   
    
    public CustomerLogin() {
        initComponents();
        setTitle("APU Cafeteria Ordering System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        custLoginHeader = new javax.swing.JLabel();
        custIDLabel = new javax.swing.JLabel();
        custIDField = new javax.swing.JTextField();
        custPasswordLabel = new javax.swing.JLabel();
        custPasswordField = new javax.swing.JPasswordField();
        custLoginBtn = new javax.swing.JButton();
        custClearBtn = new javax.swing.JButton();
        custBackBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(244, 244, 244));

        jPanel1.setBackground(new java.awt.Color(244, 244, 244));
        jPanel1.setPreferredSize(new java.awt.Dimension(1080, 640));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        custLoginHeader.setFont(new java.awt.Font("SF Pro Text", 1, 48)); // NOI18N
        custLoginHeader.setForeground(new java.awt.Color(242, 242, 242));
        custLoginHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        custLoginHeader.setText("CUSTOMER LOGIN");
        custLoginHeader.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        custLoginHeader.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(custLoginHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 862, 102));

        custIDLabel.setBackground(new java.awt.Color(0, 0, 0));
        custIDLabel.setFont(new java.awt.Font("SF Pro Text", 1, 24)); // NOI18N
        custIDLabel.setForeground(new java.awt.Color(242, 242, 242));
        custIDLabel.setText("Customer ID:");
        jPanel1.add(custIDLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, -1, 31));

        custIDField.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        custIDField.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        custIDField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custIDFieldActionPerformed(evt);
            }
        });
        jPanel1.add(custIDField, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 180, 350, 54));

        custPasswordLabel.setBackground(new java.awt.Color(0, 0, 0));
        custPasswordLabel.setFont(new java.awt.Font("SF Pro Text", 1, 24)); // NOI18N
        custPasswordLabel.setForeground(new java.awt.Color(242, 242, 242));
        custPasswordLabel.setText("Password:");
        jPanel1.add(custPasswordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, -1, 31));

        custPasswordField.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        custPasswordField.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        custPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custPasswordFieldActionPerformed(evt);
            }
        });
        custPasswordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                custPasswordFieldKeyPressed(evt);
            }
        });
        jPanel1.add(custPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, 345, 54));

        custLoginBtn.setBackground(new java.awt.Color(0, 48, 73));
        custLoginBtn.setFont(new java.awt.Font("sansserif", 1, 8)); // NOI18N
        custLoginBtn.setForeground(new java.awt.Color(255, 255, 255));
        custLoginBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/login.png"))); // NOI18N
        custLoginBtn.setText("LOGIN");
        custLoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custLoginBtnActionPerformed(evt);
            }
        });
        jPanel1.add(custLoginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 390, 95, 40));

        custClearBtn.setBackground(new java.awt.Color(0, 48, 73));
        custClearBtn.setFont(new java.awt.Font("sansserif", 1, 8)); // NOI18N
        custClearBtn.setForeground(new java.awt.Color(255, 255, 255));
        custClearBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/clear.png"))); // NOI18N
        custClearBtn.setText("CLEAR");
        custClearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custClearBtnActionPerformed(evt);
            }
        });
        jPanel1.add(custClearBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 390, 95, 40));

        custBackBtn.setBackground(new java.awt.Color(0, 48, 73));
        custBackBtn.setFont(new java.awt.Font("sansserif", 1, 8)); // NOI18N
        custBackBtn.setForeground(new java.awt.Color(255, 255, 255));
        custBackBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logout.png"))); // NOI18N
        custBackBtn.setText("BACK");
        custBackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custBackBtnActionPerformed(evt);
            }
        });
        jPanel1.add(custBackBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 390, 95, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/General/coffee final.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 640));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void custClearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custClearBtnActionPerformed
        custIDField.setText(null);
        custPasswordField.setText(null);
        try {
            Logger.info("CustomerLogin","A user has cleared the fields in Customer Login page.");
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(CustomerLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_custClearBtnActionPerformed

    private void custBackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custBackBtnActionPerformed
        WelcomePage custBack = new WelcomePage();
        custBack.setVisible(true);
        this.dispose();
        try {
            Logger.info("CustomerLogin","A user has attempted to view Welcome page.");
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(CustomerLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_custBackBtnActionPerformed

    //Gets the user ID and password from the text fields and converts the password to SHA-256 format
    private void custLoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custLoginBtnActionPerformed
        cust.setUserID(custIDField.getText());
        try {
            cust.setUserPassword(password.toHexString(password.getSHA(String.valueOf(custPasswordField.getPassword()))));
        } catch (NoSuchAlgorithmException e) {
            try {
                Logger.error("CustomerLogin","Exception occurred - " + e.toString());
            } catch (IOException ex) {
                java.util.logging.Logger.getLogger(CustomerLogin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        FileHandling custFile = new FileHandling();
        File file = new File("custAccount.txt");

        try {

            //The customer file is first checked if the user ID is present and the if the account is set to APPROVED
            if (!"NA".equals(custFile.locateItemInFile(cust.getUserID(), file, 0))){

                //Next, if the password is equivalent to the password within the same line it will log the user in
                if (!"NA".equals(custFile.locateItemInFile(cust.getUserID(), cust.getUserPassword(), file, 0,2))){
                    JOptionPane.showMessageDialog(null, "Login Successful");
                    CustomerHome custLogin = new CustomerHome(cust.getUserID(), String.valueOf(custPasswordField.getPassword()));
                    custLogin.setVisible(true);
                    this.dispose();
                    Logger.login("CustomerLogin","User " + cust.getUserID() + " has logged in successfully.");
                    //Logger.login(cust.getUserID(), "CUSTOMER");
                    //Logger.error("Customer","A new life");
                }

                //If the password does not match the user ID or password, then the user won't be logged in and an error message is shown
                else{
                    JOptionPane.showMessageDialog(null, "Error: Login Unsuccessful. Incorrect ID or Password.");
                    Logger.error("CustomerLogin","A user has failed to login with an incorrect ID or Password.");
                }
            }
            //If the customer ID is not found in the manager text file then it will show an error
            else{
                JOptionPane.showMessageDialog(null, "Error: Customer ID does not exist.");
                Logger.error("CustomerLogin","A user has typed in a Customer ID that does not exist.");
            }
        } catch (IOException e) {
            try {
                Logger.error("CustomerLogin","Exception occurred - " + e.toString());
            } catch (IOException ex) {
                java.util.logging.Logger.getLogger(CustomerLogin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_custLoginBtnActionPerformed

    private void custIDFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custIDFieldActionPerformed

    }//GEN-LAST:event_custIDFieldActionPerformed

    private void custPasswordFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_custPasswordFieldKeyPressed

        //Code is identical to the login button above with one added feature of pressing the Enter key to log in
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER){
            cust.setUserID(custIDField.getText());
            try {
                cust.setUserPassword(password.toHexString(password.getSHA(String.valueOf(custPasswordField.getPassword()))));
            } catch (NoSuchAlgorithmException e) {
                try {
                    Logger.error("CustomerLogin","Exception occurred - " + e.toString());
                } catch (IOException ex) {
                    java.util.logging.Logger.getLogger(CustomerLogin.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            FileHandling custFile = new FileHandling();
            File file = new File("custAccount.txt");

            try {
                if (!"NA".equals(custFile.locateItemInFile(cust.getUserID(), file, 0))){
                    if (!"NA".equals(custFile.locateItemInFile(cust.getUserID(), cust.getUserPassword(), file, 0,2))){
                        JOptionPane.showMessageDialog(null, "Login Successful");
                        CustomerHome custLogin = new CustomerHome(cust.getUserID(), String.valueOf(custPasswordField.getPassword()));
                        custLogin.setVisible(true);
                        this.dispose();
                        Logger.login("CustomerLogin","User " + cust.getUserID() + " has logged in successfully.");
                    }

                    else{
                        JOptionPane.showMessageDialog(null, "Error: Login Unsuccessful. Incorrect ID or Password.");
                        Logger.error("CustomerLogin","A user has failed to login with an incorrect ID or Password.");
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "Error: Customer ID does not exist.");
                    Logger.error("CustomerLogin","A user has typed in a Customer ID that does not exist.");
                }
            } catch (IOException e) {
                try {
                    Logger.error("CustomerLogin","Exception occurred - " + e.toString());
                } catch (IOException ex) {
                    java.util.logging.Logger.getLogger(CustomerLogin.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_custPasswordFieldKeyPressed

    private void custPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custPasswordFieldActionPerformed

    }//GEN-LAST:event_custPasswordFieldActionPerformed
        


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton custBackBtn;
    private javax.swing.JButton custClearBtn;
    private javax.swing.JTextField custIDField;
    private javax.swing.JLabel custIDLabel;
    private javax.swing.JButton custLoginBtn;
    private javax.swing.JLabel custLoginHeader;
    private javax.swing.JPasswordField custPasswordField;
    private javax.swing.JLabel custPasswordLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
