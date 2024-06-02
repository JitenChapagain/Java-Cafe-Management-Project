package General;

import Utilities.FileHandling;
import Utilities.UserRegistrationInfo;
import Utilities.PasswordHashing;
import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ManagerRegistration extends javax.swing.JFrame {

    UserRegistrationInfo mgr = new UserRegistrationInfo();
    PasswordHashing password = new PasswordHashing();
    
    public ManagerRegistration() {
        initComponents();
        setTitle("APU Cafeteria Ordering System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        mgrRegHeader = new javax.swing.JLabel();
        mgrIDLabel = new javax.swing.JLabel();
        mgrNameLabel = new javax.swing.JLabel();
        mgrPasswordLabel = new javax.swing.JLabel();
        mgrEmailLabel = new javax.swing.JLabel();
        mgrRegisterBtn = new javax.swing.JButton();
        mgrClearBtn = new javax.swing.JButton();
        mgrBackBtn = new javax.swing.JButton();
        mgrIDField = new javax.swing.JTextField();
        mgrNameField = new javax.swing.JTextField();
        mgrPasswordField = new javax.swing.JPasswordField();
        mgrEmailField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(244, 244, 244));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mgrRegHeader.setFont(new java.awt.Font("SF Pro Text", 1, 48)); // NOI18N
        mgrRegHeader.setForeground(new java.awt.Color(242, 242, 242));
        mgrRegHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mgrRegHeader.setText("MANAGER REGISTRATION");
        jPanel2.add(mgrRegHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 48, 892, 91));

        mgrIDLabel.setBackground(new java.awt.Color(0, 0, 0));
        mgrIDLabel.setFont(new java.awt.Font("SF Pro Text", 1, 18)); // NOI18N
        mgrIDLabel.setForeground(new java.awt.Color(242, 242, 242));
        mgrIDLabel.setText("Manager ID:");
        jPanel2.add(mgrIDLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 117, 46));

        mgrNameLabel.setBackground(new java.awt.Color(0, 0, 0));
        mgrNameLabel.setFont(new java.awt.Font("SF Pro Text", 1, 18)); // NOI18N
        mgrNameLabel.setForeground(new java.awt.Color(242, 242, 242));
        mgrNameLabel.setText("Manager Name:");
        jPanel2.add(mgrNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 145, 44));

        mgrPasswordLabel.setBackground(new java.awt.Color(0, 0, 0));
        mgrPasswordLabel.setFont(new java.awt.Font("SF Pro Text", 1, 18)); // NOI18N
        mgrPasswordLabel.setText("Password:");
        jPanel2.add(mgrPasswordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, 115, 52));

        mgrEmailLabel.setBackground(new java.awt.Color(0, 0, 0));
        mgrEmailLabel.setFont(new java.awt.Font("SF Pro Text", 1, 18)); // NOI18N
        mgrEmailLabel.setForeground(new java.awt.Color(242, 242, 242));
        mgrEmailLabel.setText("Email:");
        jPanel2.add(mgrEmailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 430, 79, 50));

        mgrRegisterBtn.setBackground(new java.awt.Color(0, 48, 73));
        mgrRegisterBtn.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        mgrRegisterBtn.setForeground(new java.awt.Color(255, 255, 255));
        mgrRegisterBtn.setText("REGISTER");
        mgrRegisterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mgrRegisterBtnActionPerformed(evt);
            }
        });
        jPanel2.add(mgrRegisterBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 520, 124, 49));

        mgrClearBtn.setBackground(new java.awt.Color(0, 48, 73));
        mgrClearBtn.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        mgrClearBtn.setForeground(new java.awt.Color(255, 255, 255));
        mgrClearBtn.setText("CLEAR");
        mgrClearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mgrClearBtnActionPerformed(evt);
            }
        });
        jPanel2.add(mgrClearBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 520, 115, 49));

        mgrBackBtn.setBackground(new java.awt.Color(0, 48, 73));
        mgrBackBtn.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        mgrBackBtn.setForeground(new java.awt.Color(255, 255, 255));
        mgrBackBtn.setText("BACK");
        mgrBackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mgrBackBtnActionPerformed(evt);
            }
        });
        jPanel2.add(mgrBackBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 520, 101, 49));

        mgrIDField.setBackground(new java.awt.Color(244, 244, 244));
        mgrIDField.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        mgrIDField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(244, 244, 244))); // NOI18N
        mgrIDField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mgrIDFieldActionPerformed(evt);
            }
        });
        jPanel2.add(mgrIDField, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, 348, 46));

        mgrNameField.setBackground(new java.awt.Color(244, 244, 244));
        mgrNameField.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        mgrNameField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(244, 244, 244))); // NOI18N
        jPanel2.add(mgrNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, 348, 44));

        mgrPasswordField.setBackground(new java.awt.Color(244, 244, 244));
        mgrPasswordField.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        mgrPasswordField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(244, 244, 244))); // NOI18N
        mgrPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mgrPasswordFieldActionPerformed(evt);
            }
        });
        jPanel2.add(mgrPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 360, 348, 52));

        mgrEmailField.setBackground(new java.awt.Color(244, 244, 244));
        mgrEmailField.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        mgrEmailField.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(244, 244, 244))); // NOI18N
        mgrEmailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mgrEmailFieldActionPerformed(evt);
            }
        });
        jPanel2.add(mgrEmailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 440, 348, 42));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/General/coffee final.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 660));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mgrPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mgrPasswordFieldActionPerformed

    }//GEN-LAST:event_mgrPasswordFieldActionPerformed

    private void mgrEmailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mgrEmailFieldActionPerformed

    }//GEN-LAST:event_mgrEmailFieldActionPerformed

    private void mgrIDFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mgrIDFieldActionPerformed

    }//GEN-LAST:event_mgrIDFieldActionPerformed

    private void mgrClearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mgrClearBtnActionPerformed
        mgrIDField.setText(null);
        mgrNameField.setText(null);
        mgrPasswordField.setText(null);
        mgrEmailField.setText(null);
        try {
            Logger.info("ManagerReg","A user has cleared the fields in Customer Registration page.");
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(ManagerRegistration.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mgrClearBtnActionPerformed

    private void mgrRegisterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mgrRegisterBtnActionPerformed
        
        //Converts UserID and UserName to UpperCase
        mgr.setUserID(mgrIDField.getText().toUpperCase());
        mgr.setUserName(mgrNameField.getText().toUpperCase());
        
        //Converts password into hash format of SHA-256
        try {
            mgr.setUserPassword(password.toHexString(password.getSHA(String.valueOf(mgrPasswordField.getPassword()))));
        } catch (NoSuchAlgorithmException e) {
            try {
                Logger.error("ManagerReg","Exception occurred - " + e.toString());
            } catch (IOException ex) {
                java.util.logging.Logger.getLogger(ManagerRegistration.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        mgr.setUserEmail(mgrEmailField.getText());
        
        //Stores contents string of credentials into variable to be appended into the file later
        String mgrRegCredentials = mgr.concatenateCredentials() + "|TO BE APPROVED";
        
        //Create FileHandling object and file object to store data into the the manager account text file    
        FileHandling mgrFile = new FileHandling();
        File file = new File("mgrAccount.txt");
        
        try {
            
            //If any of the text fields are blank then an error message is shown
            if (mgr.getUserID().equals("")||mgr.getUserName().equals("")||
                mgr.getUserPassword().equals("")||mgr.getUserEmail().equals("")){
                Logger.error("ManagerReg","A user did not enter all data fields.");
                JOptionPane.showMessageDialog(null, "Error: All text fields must be filled out.");
            }
            
            //If any the Manager ID is not exactly 9 characters or contains "MGR" error message is shown
            else if (!(mgr.getUserID().substring(0,3).equals("SIR") && mgr.getUserID().length()==9)){
                Logger.error("ManagerReg","A user entered an invalid Manager ID.");
                JOptionPane.showMessageDialog(null, "Error: Please enter a valid Manager ID.");
            }
           
            // If the Manager ID exists within the text file, an error message will be shown
            else if (!"NA".equals(mgrFile.locateItemInFile(mgr.getUserID(), file, 0))){
                Logger.error("ManagerReg","A user entered an existing Manager ID.");
                JOptionPane.showMessageDialog(null, "Error: Manager ID already exists.");
            }
            
            // If the Manager Password does not meet the set range
            else if (mgrPasswordField.getText().length() < 6 || mgrPasswordField.getText().length() > 20){
                Logger.error("ManagerReg","A user entered an invalid password.");
                JOptionPane.showMessageDialog(null, "Error: Please enter a password between 6 and 20 characters in length.");
            }
            
            //If the user entered an invalid email format, an error message will be shown
            else if(validateManagerEmail(mgr.getUserEmail()) == false){
                Logger.error("ManagerReg","A user entered an invalid email format.");
                JOptionPane.showMessageDialog(null, "Error: Please enter a valid email address.");
            }
            
            //If the user entered an existing email within the text file, an error message will be shown
            else if (!"NA".equals(mgrFile.locateItemInFile(mgr.getUserEmail(), file, 3))){
                Logger.error("ManagerReg","A user entered an existing Email.");
                JOptionPane.showMessageDialog(null, "Error: Manager Email already exists.");
            }
            
            //If the user entered an invalid email format, an error message will be shown
            else if(validateManagerEmail(mgr.getUserEmail()) == false){
                Logger.error("ManagerReg","A user entered an invalid email format.");
                JOptionPane.showMessageDialog(null, "Error: Please enter a valid email address.");
            }
            
            //If all the other conditions are met then the user will be registered successfully
            else {
                mgrFile.appendToFile(mgrRegCredentials, file);
                JOptionPane.showMessageDialog(null, "Registration successful!");
                Logger.info("ManagerReg","Manager " + mgr.getUserID() + " has been registered successfully.");
                WelcomePage mgrBack = new WelcomePage();
                mgrBack.setVisible(true);
                this.dispose();
                Logger.info("ManagerReg","Manager " + mgrIDField.getText().toUpperCase() + " has attempted to view Welcome page.");
            }
            
        } catch (IOException e) {
            try {
                Logger.error("ManagerReg","Exception occurred - " + e.toString());
            } catch (IOException ex) {
                java.util.logging.Logger.getLogger(ManagerRegistration.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_mgrRegisterBtnActionPerformed

    private void mgrBackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mgrBackBtnActionPerformed
        WelcomePage mgrBack = new WelcomePage();
        mgrBack.setVisible(true);
        this.dispose();
        try {
            Logger.info("ManagerReg","A user has attempted to view Welcome page.");
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(ManagerRegistration.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mgrBackBtnActionPerformed
 
    public static boolean validateManagerEmail(String userEmail){
        String emailRegex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        Pattern emailPattern = Pattern.compile(emailRegex,Pattern.CASE_INSENSITIVE);
        Matcher emailMatcher = emailPattern.matcher(userEmail);
        
        return emailMatcher.find();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton mgrBackBtn;
    private javax.swing.JButton mgrClearBtn;
    private javax.swing.JTextField mgrEmailField;
    private javax.swing.JLabel mgrEmailLabel;
    private javax.swing.JTextField mgrIDField;
    private javax.swing.JLabel mgrIDLabel;
    private javax.swing.JTextField mgrNameField;
    private javax.swing.JLabel mgrNameLabel;
    private javax.swing.JPasswordField mgrPasswordField;
    private javax.swing.JLabel mgrPasswordLabel;
    private javax.swing.JLabel mgrRegHeader;
    private javax.swing.JButton mgrRegisterBtn;
    // End of variables declaration//GEN-END:variables
}
