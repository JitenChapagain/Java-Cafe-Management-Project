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

public class ManagerLogin extends javax.swing.JFrame {
    
    UserRegistrationInfo mgr = new UserRegistrationInfo();
    PasswordHashing password = new PasswordHashing();
   
    public ManagerLogin() {
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
        mgrLoginHeader = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        mgrIDLabel = new javax.swing.JLabel();
        mgrPasswordField = new javax.swing.JPasswordField();
        mgrIDField = new javax.swing.JTextField();
        mgrBackBtn = new javax.swing.JButton();
        mgrClearBtn = new javax.swing.JButton();
        mgrLoginBtn = new javax.swing.JButton();
        mgrPasswordLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(244, 244, 244));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mgrLoginHeader.setFont(new java.awt.Font("SF Pro Text", 1, 48)); // NOI18N
        mgrLoginHeader.setForeground(new java.awt.Color(242, 242, 242));
        mgrLoginHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mgrLoginHeader.setText("MANAGER LOGIN");
        mgrLoginHeader.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel1.add(mgrLoginHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 31, 979, 104));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("SF Pro Text", 1, 18)); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(541, 304, -1, 31));

        mgrIDLabel.setBackground(new java.awt.Color(0, 0, 0));
        mgrIDLabel.setFont(new java.awt.Font("SF Pro Text", 1, 24)); // NOI18N
        mgrIDLabel.setForeground(new java.awt.Color(242, 242, 242));
        mgrIDLabel.setText("Manager ID:");
        jPanel1.add(mgrIDLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 262, -1, 31));

        mgrPasswordField.setBackground(new java.awt.Color(244, 244, 244));
        mgrPasswordField.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        mgrPasswordField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(244, 244, 244))); // NOI18N
        mgrPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mgrPasswordFieldActionPerformed(evt);
            }
        });
        mgrPasswordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                mgrPasswordFieldKeyPressed(evt);
            }
        });
        jPanel1.add(mgrPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 340, 400, 54));

        mgrIDField.setBackground(new java.awt.Color(244, 244, 244));
        mgrIDField.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        mgrIDField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(244, 244, 244))); // NOI18N
        mgrIDField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mgrIDFieldActionPerformed(evt);
            }
        });
        jPanel1.add(mgrIDField, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 250, 400, 54));

        mgrBackBtn.setBackground(new java.awt.Color(0, 48, 73));
        mgrBackBtn.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        mgrBackBtn.setForeground(new java.awt.Color(255, 255, 255));
        mgrBackBtn.setText("BACK");
        mgrBackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mgrBackBtnActionPerformed(evt);
            }
        });
        jPanel1.add(mgrBackBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(759, 506, 95, 40));

        mgrClearBtn.setBackground(new java.awt.Color(0, 48, 73));
        mgrClearBtn.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        mgrClearBtn.setForeground(new java.awt.Color(255, 255, 255));
        mgrClearBtn.setText("CLEAR");
        mgrClearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mgrClearBtnActionPerformed(evt);
            }
        });
        jPanel1.add(mgrClearBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(597, 506, 95, 40));

        mgrLoginBtn.setBackground(new java.awt.Color(0, 48, 73));
        mgrLoginBtn.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        mgrLoginBtn.setForeground(new java.awt.Color(255, 255, 255));
        mgrLoginBtn.setText("LOGIN");
        mgrLoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mgrLoginBtnActionPerformed(evt);
            }
        });
        jPanel1.add(mgrLoginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 506, 95, 40));

        mgrPasswordLabel.setBackground(new java.awt.Color(0, 0, 0));
        mgrPasswordLabel.setFont(new java.awt.Font("SF Pro Text", 1, 24)); // NOI18N
        mgrPasswordLabel.setText("Password:");
        jPanel1.add(mgrPasswordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(341, 347, -1, 31));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/General/coffee final.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 640));

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

    private void mgrLoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mgrLoginBtnActionPerformed

        //Gets the user ID and password from the text fields and converts the password to SHA-256 format
        mgr.setUserID(mgrIDField.getText());
        try {
            mgr.setUserPassword(password.toHexString(password.getSHA(String.valueOf(mgrPasswordField.getPassword()))));
        } catch (NoSuchAlgorithmException e) {
            try {
                Logger.error("ManagerLogin","Exception occurred - " + e.toString());
            } catch (IOException ex) {
                java.util.logging.Logger.getLogger(ManagerLogin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        FileHandling mgrFile = new FileHandling();
        File file = new File("mgrAccount.txt");

        //If the user ID keyed in is admin and the password is "admin123" it will be logged in as the administrator
        if (mgr.getUserID().equals("JITEN") && mgr.getUserPassword().equals("3abfdd454efe98461f3b20036db98e6d067cd2b1241e45d6571fd0888504aa35"))
        {
            JOptionPane.showMessageDialog(null, "Login Successful! Welcome, Administrator.");
            ManagerHome mgrLogin = new ManagerHome(mgr.getUserID(), String.valueOf(mgrPasswordField.getPassword()));
            mgrLogin.setVisible(true);
            this.dispose();
        }
        else if (mgr.getUserID().equals("SATINDRA") && mgr.getUserPassword().equals("f5cbe9dd03b8e66b3e16dbbb91f5f1261ec7d1a9b4e8785b1a5804f36d2e1a47"))
        {
            JOptionPane.showMessageDialog(null, "Login Successful! Welcome, Account section.");
            ManagerHome mgrLogin = new ManagerHome(mgr.getUserID(), String.valueOf(mgrPasswordField.getPassword()));
            mgrLogin.setVisible(true);
            this.dispose();
        }

        //If it's not the admin id and password the login will be as a manager account
        else {
            try {
                //The manager file is first checked if the user ID is present and the if the account is set to APPROVED
                if (!"NA".equals(mgrFile.locateItemInFile(mgr.getUserID(), "APPROVED", file, 0, 4))){

                    //Next, if the password is equivalent to the password within the same line it will log the user in
                    if (!"NA".equals(mgrFile.locateItemInFile(mgr.getUserID(), mgr.getUserPassword(), file, 0,2))){
                        JOptionPane.showMessageDialog(null, "Login Successful!");
                        ManagerHome mgrLogin = new ManagerHome(mgr.getUserID(), String.valueOf(mgrPasswordField.getPassword()));
                        mgrLogin.setVisible(true);
                        this.dispose();
                        Logger.login("ManagerLogin","Manager " + mgr.getUserID() + " has logged in successfully.");

                        //If the password does not match the user ID or password, then the user won't be logged in and an error message is shown
                    } else {
                        JOptionPane.showMessageDialog(null, "Error: Login Unsuccessful. Incorrect ID or Password.");
                        Logger.error("ManagerLogin","A user has failed to login with an incorrect ID or Password.");
                    }

                    //If the manager ID is not found in the manager text file then it will show an error
                } else {
                    JOptionPane.showMessageDialog(null, "Error: Manager ID does not exist.");
                    Logger.error("ManagerLogin","A user has typed in a Manager ID that does not exist.");
                }
            } catch (IOException e) {
                try {
                    Logger.error("ManagerLogin","Exception occurred - " + e.toString());
                } catch (IOException ex) {
                    java.util.logging.Logger.getLogger(ManagerLogin.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_mgrLoginBtnActionPerformed

    private void mgrClearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mgrClearBtnActionPerformed
        mgrIDField.setText(null);
        mgrPasswordField.setText(null);
        try {
            Logger.info("ManagerLogin","A user has cleared the fields in Customer Login page.");
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(ManagerLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mgrClearBtnActionPerformed

    private void mgrBackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mgrBackBtnActionPerformed
        WelcomePage mgrBack = new WelcomePage();
        mgrBack.setVisible(true);
        this.dispose();
        try {
            Logger.info("ManagerLogin","A user has attempted to view Welcome page.");
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(ManagerLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mgrBackBtnActionPerformed

    private void mgrIDFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mgrIDFieldActionPerformed

    }//GEN-LAST:event_mgrIDFieldActionPerformed

    private void mgrPasswordFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mgrPasswordFieldKeyPressed

        //Code is identical to the login button above with one added feature of pressing the Enter key to log in
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER){
            mgr.setUserID(mgrIDField.getText());
            try {
                mgr.setUserPassword(password.toHexString(password.getSHA(String.valueOf(mgrPasswordField.getPassword()))));
            } catch (NoSuchAlgorithmException e) {
                try {
                    Logger.error("ManagerLogin","Exception occurred - " + e.toString());
                } catch (IOException ex) {
                    java.util.logging.Logger.getLogger(ManagerLogin.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            FileHandling mgrFile = new FileHandling();
            File file = new File("mgrAccount.txt");

            if (mgr.getUserID().equals("JITEN") && mgr.getUserPassword().equals("3abfdd454efe98461f3b20036db98e6d067cd2b1241e45d6571fd0888504aa35")){
                JOptionPane.showMessageDialog(null, "Login Successful! Welcome, Administrator.");
                ManagerHome mgrLogin = new ManagerHome(mgr.getUserID(), String.valueOf(mgrPasswordField.getPassword()));
                mgrLogin.setVisible(true);
                this.dispose();
                try {
                    Logger.login("ManagerLogin","Admin " + mgr.getUserID() + " has logged in successfully.");
                } catch (IOException ex) {
                    java.util.logging.Logger.getLogger(ManagerLogin.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if(mgr.getUserID().equals("SATINDRA") && mgr.getUserPassword().equals("f5cbe9dd03b8e66b3e16dbbb91f5f1261ec7d1a9b4e8785b1a5804f36d2e1a47")){
                JOptionPane.showMessageDialog(null, "Login Successful! Welcome, Account section.");
                ManagerHome mgrLogin = new ManagerHome(mgr.getUserID(), String.valueOf(mgrPasswordField.getPassword()));
                mgrLogin.setVisible(true);
                this.dispose();
                try {
                    Logger.login("ManagerLogin","Admin " + mgr.getUserID() + " has logged in successfully.");
                } catch (IOException ex) {
                    java.util.logging.Logger.getLogger(ManagerLogin.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            else{
                try {

                    if (!"NA".equals(mgrFile.locateItemInFile(mgr.getUserID(), "APPROVED", file, 0, 4))){
                        if (!"NA".equals(mgrFile.locateItemInFile(mgr.getUserID(), mgr.getUserPassword(), file, 0,2))){
                            JOptionPane.showMessageDialog(null, "Login Successful!");
                            ManagerHome mgrLogin = new ManagerHome(mgr.getUserID(), String.valueOf(mgrPasswordField.getPassword()));
                            mgrLogin.setVisible(true);
                            this.dispose();
                            Logger.login("ManagerLogin","User " + mgr.getUserID() + " has logged in successfully.");
                        }

                        else{
                            JOptionPane.showMessageDialog(null, "Error: Login Unsuccessful. Incorrect ID or Password.");
                            Logger.error("ManagerLogin","A user has failed to login with an incorrect ID or Password.");
                        }
                    }

                    else{
                        JOptionPane.showMessageDialog(null, "Error: Manager ID does not exist.");
                        Logger.error("ManagerLogin","A user has typed in a Manager ID that does not exist.");
                    }
                } catch (IOException e) {
                    try {
                        Logger.error("ManagerLogin","Exception occurred - " + e.toString());
                    } catch (IOException ex) {
                        java.util.logging.Logger.getLogger(ManagerLogin.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
    }//GEN-LAST:event_mgrPasswordFieldKeyPressed

    private void mgrPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mgrPasswordFieldActionPerformed

    }//GEN-LAST:event_mgrPasswordFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton mgrBackBtn;
    private javax.swing.JButton mgrClearBtn;
    private javax.swing.JTextField mgrIDField;
    private javax.swing.JLabel mgrIDLabel;
    private javax.swing.JButton mgrLoginBtn;
    private javax.swing.JLabel mgrLoginHeader;
    private javax.swing.JPasswordField mgrPasswordField;
    private javax.swing.JLabel mgrPasswordLabel;
    // End of variables declaration//GEN-END:variables
}
