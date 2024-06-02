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
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class CustomerRegistration extends javax.swing.JFrame {

    UserRegistrationInfo cust = new UserRegistrationInfo();
    PasswordHashing password = new PasswordHashing();
       
    public CustomerRegistration() {
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
        custBackBtn = new javax.swing.JButton();
        custClearBtn = new javax.swing.JButton();
        custRegisterBtn = new javax.swing.JButton();
        custIDLabel = new javax.swing.JLabel();
        custNameLabel = new javax.swing.JLabel();
        custPasswordLabel = new javax.swing.JLabel();
        custEmailLabel = new javax.swing.JLabel();
        custIDField = new javax.swing.JTextField();
        custNameField = new javax.swing.JTextField();
        custPasswordField = new javax.swing.JPasswordField();
        custEmailField = new javax.swing.JTextField();
        custRegHeader = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(244, 244, 244));
        jPanel1.setPreferredSize(new java.awt.Dimension(1080, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        custBackBtn.setBackground(new java.awt.Color(0, 48, 73));
        custBackBtn.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        custBackBtn.setForeground(new java.awt.Color(255, 255, 255));
        custBackBtn.setText("BACK");
        custBackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custBackBtnActionPerformed(evt);
            }
        });
        jPanel1.add(custBackBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 470, 90, 30));

        custClearBtn.setBackground(new java.awt.Color(0, 48, 73));
        custClearBtn.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        custClearBtn.setForeground(new java.awt.Color(255, 255, 255));
        custClearBtn.setText("CLEAR");
        custClearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custClearBtnActionPerformed(evt);
            }
        });
        jPanel1.add(custClearBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 470, 100, 30));

        custRegisterBtn.setBackground(new java.awt.Color(0, 48, 73));
        custRegisterBtn.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        custRegisterBtn.setForeground(new java.awt.Color(255, 255, 255));
        custRegisterBtn.setText("REGISTER");
        custRegisterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custRegisterBtnActionPerformed(evt);
            }
        });
        jPanel1.add(custRegisterBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 470, 120, 30));

        custIDLabel.setBackground(new java.awt.Color(0, 0, 0));
        custIDLabel.setFont(new java.awt.Font("SF Pro Text", 1, 18)); // NOI18N
        custIDLabel.setForeground(new java.awt.Color(242, 242, 242));
        custIDLabel.setText("Customer ID:");
        jPanel1.add(custIDLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, -1, 31));

        custNameLabel.setBackground(new java.awt.Color(0, 0, 0));
        custNameLabel.setFont(new java.awt.Font("SF Pro Text", 1, 18)); // NOI18N
        custNameLabel.setForeground(new java.awt.Color(242, 242, 242));
        custNameLabel.setText("Customer Name:");
        jPanel1.add(custNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, -1, 31));

        custPasswordLabel.setBackground(new java.awt.Color(0, 0, 0));
        custPasswordLabel.setFont(new java.awt.Font("SF Pro Text", 1, 18)); // NOI18N
        custPasswordLabel.setForeground(new java.awt.Color(0, 0, 102));
        custPasswordLabel.setText("Password:");
        jPanel1.add(custPasswordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, -1, 31));

        custEmailLabel.setBackground(new java.awt.Color(0, 0, 0));
        custEmailLabel.setFont(new java.awt.Font("SF Pro Text", 1, 18)); // NOI18N
        custEmailLabel.setForeground(new java.awt.Color(242, 242, 242));
        custEmailLabel.setText("Email:");
        jPanel1.add(custEmailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 410, -1, 31));

        custIDField.setBackground(new java.awt.Color(242, 242, 242));
        custIDField.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        custIDField.setBorder(null);
        custIDField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custIDFieldActionPerformed(evt);
            }
        });
        jPanel1.add(custIDField, new org.netbeans.lib.awtextra.AbsoluteConstraints(436, 235, 360, 50));

        custNameField.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        custNameField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(244, 244, 244))); // NOI18N
        custNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custNameFieldActionPerformed(evt);
            }
        });
        jPanel1.add(custNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(436, 297, 360, 50));

        custPasswordField.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        custPasswordField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        custPasswordField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(244, 244, 244))); // NOI18N
        custPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custPasswordFieldActionPerformed(evt);
            }
        });
        jPanel1.add(custPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(436, 351, 360, 50));

        custEmailField.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        custEmailField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(244, 244, 244))); // NOI18N
        custEmailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custEmailFieldActionPerformed(evt);
            }
        });
        jPanel1.add(custEmailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(436, 405, 360, 50));

        custRegHeader.setFont(new java.awt.Font("SF Pro Text", 1, 48)); // NOI18N
        custRegHeader.setForeground(new java.awt.Color(242, 242, 242));
        custRegHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        custRegHeader.setText("CUSTOMER REGISTRATION");
        jPanel1.add(custRegHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 752, 111));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/General/coffee final.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 1250, 670));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1240, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void custEmailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custEmailFieldActionPerformed

    }//GEN-LAST:event_custEmailFieldActionPerformed

    private void custPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custPasswordFieldActionPerformed

    }//GEN-LAST:event_custPasswordFieldActionPerformed

    private void custNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custNameFieldActionPerformed

    }//GEN-LAST:event_custNameFieldActionPerformed

    private void custIDFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custIDFieldActionPerformed

    }//GEN-LAST:event_custIDFieldActionPerformed

    private void custRegisterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custRegisterBtnActionPerformed

        //Converts UserID and UserName to UpperCase
        cust.setUserID(custIDField.getText().toUpperCase());
        cust.setUserName(custNameField.getText().toUpperCase());
        try {
            cust.setUserPassword(password.toHexString(
                password.getSHA(String.valueOf(custPasswordField.getPassword()))));
        } catch (NoSuchAlgorithmException e) {
            try {
                Logger.error("CustomerReg","Exception occurred - " + e.toString());
            } catch (IOException ex) {
                java.util.logging.Logger.getLogger(CustomerRegistration.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        cust.setUserEmail(custEmailField.getText());

        // Setting the default balance among users
        String custRegCredentials = cust.concatenateCredentials() + "|50.0";

        //Create FileHandling object and file object to store data into the the customer account text file
        FileHandling custFile = new FileHandling();
        File file = new File("custAccount.txt");

        try {
            //If any of the text fields are blank then an error message is shown
            if (cust.getUserID().equals("")||cust.getUserName().equals("")||
                cust.getUserPassword().equals("")||cust.getUserEmail().equals("")){
                Logger.error("CustomerReg","A user did not enter all data fields.");
                JOptionPane.showMessageDialog(null, "Error: Please fill out all text fields.");
            }

            //If any the Customer ID is not exactly 9 characters or contains "TP", an error message is shown
            else if (!(cust.getUserID().substring(0,3).equals("NPI") && cust.getUserID().length()==9)){
                Logger.error("CustomerReg","A user entered an invalid Customer ID.");
                JOptionPane.showMessageDialog(null, "Error: Please enter a valid Customer ID.");
            }

            // If the Cusotmer ID exists within the text file, an error message will be shown
            else if (!"NA".equals(custFile.locateItemInFile(cust.getUserID(), file, 0))){
                Logger.error("CustomerReg","A user entered an existing Customer ID.");
                JOptionPane.showMessageDialog(null, "Error: Customer ID already exists.");
            }

            // If the Customer Password does not meet the set range
            else if (custPasswordField.getText().length() < 6 || custPasswordField.getText().length() > 20){
                Logger.error("CustomerReg","A user entered an invalid password.");
                JOptionPane.showMessageDialog(null, "Error: Please enter a password \nbetween 6 and 20 characters in length.");
            }

            //If the user entered an invalid email format, an error message will be shown
            else if(validateCustomerEmail(cust.getUserEmail()) == false){
                Logger.error("CustomerReg","A user entered an invalid email format.");
                JOptionPane.showMessageDialog(null, "Error: Please enter a valid email address.");
            }

            //If the user entered an existing email within the text file, an error message will be shown
            else if (!"NA".equals(custFile.locateItemInFile(cust.getUserEmail(), file, 3))){
                Logger.error("CustomerReg","A user entered an existing Email.");
                JOptionPane.showMessageDialog(null, "Error: Customer Email already exists.");
            }

            //If all the other conditions are met then the user will be registered successfully
            else {
                custFile.appendToFile(custRegCredentials, file);
                JOptionPane.showMessageDialog(null, "Registration successful!");
                Logger.info("Customer","User" + cust.getUserID() + " has been registered successfully.");
                WelcomePage custBack = new WelcomePage();
                custBack.setVisible(true);
                this.dispose();
                Logger.info("CustomerReg","User has attempted to view Welcome page with customerID."+custIDField.getText().toUpperCase());
            }

        } catch (IOException e) {
            try {
                Logger.error("CustomerReg", " Exception occurred - " + e.toString());
            } catch (IOException ex) {
                java.util.logging.Logger.getLogger(CustomerRegistration.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_custRegisterBtnActionPerformed

    //Clears the text fields to null upon click
    private void custClearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custClearBtnActionPerformed
        custIDField.setText(null);
        custNameField.setText(null);
        custPasswordField.setText(null);
        custEmailField.setText(null);
        try {
            Logger.info("CustomerReg","A user has cleared the fields in Customer Registration page.");
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(CustomerRegistration.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_custClearBtnActionPerformed

    private void custBackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custBackBtnActionPerformed
        WelcomePage custBack = new WelcomePage();
        custBack.setVisible(true);
        this.dispose();
        try {
            Logger.info("CustomerReg","A user has attempted to view Welcome page.");
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(CustomerRegistration.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_custBackBtnActionPerformed

    public static boolean validateCustomerEmail(String userEmail){
        String emailRegex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        Pattern emailPattern = Pattern.compile(emailRegex,Pattern.CASE_INSENSITIVE);
        Matcher emailMatcher = emailPattern.matcher(userEmail);
        
        return emailMatcher.find();
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton custBackBtn;
    private javax.swing.JButton custClearBtn;
    private javax.swing.JTextField custEmailField;
    private javax.swing.JLabel custEmailLabel;
    private javax.swing.JTextField custIDField;
    private javax.swing.JLabel custIDLabel;
    private javax.swing.JTextField custNameField;
    private javax.swing.JLabel custNameLabel;
    private javax.swing.JPasswordField custPasswordField;
    private javax.swing.JLabel custPasswordLabel;
    private javax.swing.JLabel custRegHeader;
    private javax.swing.JButton custRegisterBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
