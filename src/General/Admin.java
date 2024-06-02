
package General;

import Utilities.FileHandling;
import Utilities.UserRegistrationInfo;
import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import javax.swing.JOptionPane;
import Utilities.PasswordHashing;
import java.util.logging.Level;
import javax.swing.JFrame;

/**
 *
 * @author dell
 */
public class Admin extends javax.swing.JFrame {
    UserRegistrationInfo mgr = new UserRegistrationInfo();
    PasswordHashing password = new PasswordHashing();
    /**
     * Creates new form Admin
     */
    public Admin() {
        initComponents();
        setTitle("APU Cafeteria Ordering System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adminLoginHeader = new javax.swing.JLabel();
        adminIDLabel = new javax.swing.JLabel();
        adminIDField = new javax.swing.JTextField();
        adminPasswordLabel = new javax.swing.JLabel();
        adminPasswordField = new javax.swing.JPasswordField();
        adminLoginBtn = new javax.swing.JButton();
        adminClearBtn = new javax.swing.JButton();
        adminBackBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        adminLoginHeader.setFont(new java.awt.Font("SansSerif", 1, 48)); // NOI18N
        adminLoginHeader.setForeground(new java.awt.Color(242, 242, 242));
        adminLoginHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adminLoginHeader.setText("ADMIN LOGIN");
        adminLoginHeader.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(adminLoginHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 15, 878, 123));

        adminIDLabel.setBackground(new java.awt.Color(0, 0, 0));
        adminIDLabel.setFont(new java.awt.Font("SF Pro Text", 1, 24)); // NOI18N
        adminIDLabel.setForeground(new java.awt.Color(242, 242, 242));
        adminIDLabel.setText("ADMIN ID:");
        getContentPane().add(adminIDLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, -1, 31));

        adminIDField.setBackground(new java.awt.Color(244, 244, 244));
        adminIDField.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        adminIDField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(244, 244, 244))); // NOI18N
        adminIDField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminIDFieldActionPerformed(evt);
            }
        });
        getContentPane().add(adminIDField, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 291, 345, 54));

        adminPasswordLabel.setBackground(new java.awt.Color(0, 0, 0));
        adminPasswordLabel.setFont(new java.awt.Font("SF Pro Text", 1, 24)); // NOI18N
        adminPasswordLabel.setForeground(new java.awt.Color(0, 0, 51));
        adminPasswordLabel.setText("Password:");
        getContentPane().add(adminPasswordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 384, -1, 31));

        adminPasswordField.setBackground(new java.awt.Color(244, 244, 244));
        adminPasswordField.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        adminPasswordField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(244, 244, 244))); // NOI18N
        adminPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminPasswordFieldActionPerformed(evt);
            }
        });
        adminPasswordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                adminPasswordFieldKeyPressed(evt);
            }
        });
        getContentPane().add(adminPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 371, 345, 54));

        adminLoginBtn.setBackground(new java.awt.Color(0, 48, 73));
        adminLoginBtn.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        adminLoginBtn.setForeground(new java.awt.Color(255, 255, 255));
        adminLoginBtn.setText("LOGIN");
        adminLoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminLoginBtnActionPerformed(evt);
            }
        });
        getContentPane().add(adminLoginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 486, 95, 40));

        adminClearBtn.setBackground(new java.awt.Color(0, 48, 73));
        adminClearBtn.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        adminClearBtn.setForeground(new java.awt.Color(255, 255, 255));
        adminClearBtn.setText("CLEAR");
        adminClearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminClearBtnActionPerformed(evt);
            }
        });
        getContentPane().add(adminClearBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(566, 486, 95, 40));

        adminBackBtn.setBackground(new java.awt.Color(0, 48, 73));
        adminBackBtn.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        adminBackBtn.setForeground(new java.awt.Color(255, 255, 255));
        adminBackBtn.setText("BACK");
        adminBackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminBackBtnActionPerformed(evt);
            }
        });
        getContentPane().add(adminBackBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(679, 486, 95, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/General/coffee final.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adminIDFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminIDFieldActionPerformed

    }//GEN-LAST:event_adminIDFieldActionPerformed

    private void adminPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminPasswordFieldActionPerformed

    }//GEN-LAST:event_adminPasswordFieldActionPerformed

    private void adminPasswordFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_adminPasswordFieldKeyPressed

        //Code is identical to the login button above with one added feature of pressing the Enter key to log in
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER){
            mgr.setUserID(adminIDField.getText());
            try {
                mgr.setUserPassword(password.toHexString(password.getSHA(String.valueOf(adminPasswordField.getPassword()))));
            } catch (NoSuchAlgorithmException e) {
                try {
                    Logger.error("Admin","Exception occurred - " + e.toString());
                } catch (IOException ex) {
                    java.util.logging.Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            FileHandling mgrFile = new FileHandling();
            File file = new File("mgrAccount.txt");

            if (mgr.getUserID().equals("JITEN") && mgr.getUserPassword().equals("3abfdd454efe98461f3b20036db98e6d067cd2b1241e45d6571fd0888504aa35")){
                JOptionPane.showMessageDialog(null, "Login Successful! Welcome, Administrator.");
                ManagerHome mgrLogin = new ManagerHome(mgr.getUserID(), String.valueOf(adminPasswordField.getPassword()));
                mgrLogin.setVisible(true);
                this.dispose();
                try {
                    Logger.login("Admin","Admin " + mgr.getUserID() + " has logged in successfully.");
                } catch (IOException ex) {
                    java.util.logging.Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            else{
                try {

                    if (!"NA".equals(mgrFile.locateItemInFile(mgr.getUserID(), "APPROVED", file, 0, 4))){
                        if (!"NA".equals(mgrFile.locateItemInFile(mgr.getUserID(), mgr.getUserPassword(), file, 0,2))){
                            JOptionPane.showMessageDialog(null, "Login Successful!");
                            ManagerHome mgrLogin = new ManagerHome(mgr.getUserID(), String.valueOf(adminPasswordField.getPassword()));
                            mgrLogin.setVisible(true);
                            this.dispose();
                            Logger.login("Admin","User " + mgr.getUserID() + " has logged in successfully.");
                        }

                        else{
                            JOptionPane.showMessageDialog(null, "Error: Login Unsuccessful. Incorrect ID or Password.");
                            Logger.error("Admin","A user has failed to login with an incorrect ID or Password.");
                        }
                    }

                    else{
                        JOptionPane.showMessageDialog(null, "Error: Manager ID does not exist.");
                        Logger.error("Admin","A user has typed in a Manager ID that does not exist.");
                    }
                } catch (IOException e) {
                    try {
                        Logger.error("Admin","Exception occurred - " + e.toString());
                    } catch (IOException ex) {
                        java.util.logging.Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
    }//GEN-LAST:event_adminPasswordFieldKeyPressed

    private void adminLoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminLoginBtnActionPerformed

        //Gets the user ID and password from the text fields and converts the password to SHA-256 format
        mgr.setUserID(adminIDField.getText());
        try {
            mgr.setUserPassword(password.toHexString(password.getSHA(String.valueOf(adminPasswordField.getPassword()))));
        } catch (NoSuchAlgorithmException e) {
            try {
                Logger.error("Admin","Exception occurred - " + e.toString());
            } catch (IOException ex) {
                java.util.logging.Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        FileHandling mgrFile = new FileHandling();
        File file = new File("mgrAccount.txt");

        //If the user ID keyed in is admin and the password is "admin123" it will be logged in as the administrator
        if (mgr.getUserID().equals("JITEN") && mgr.getUserPassword().equals("3abfdd454efe98461f3b20036db98e6d067cd2b1241e45d6571fd0888504aa35")){
            JOptionPane.showMessageDialog(null, "Login Successful! Welcome, Administrator.");
            AdminHome mgrLogin = new AdminHome(mgr.getUserID(), String.valueOf(adminPasswordField.getPassword()));
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
                        ManagerHome mgrLogin = new ManagerHome(mgr.getUserID(), String.valueOf(adminPasswordField.getPassword()));
                        mgrLogin.setVisible(true);
                        this.dispose();
                        Logger.login("Admin","Manager " + mgr.getUserID() + " has logged in successfully.");

                        //If the password does not match the user ID or password, then the user won't be logged in and an error message is shown
                    } else {
                        JOptionPane.showMessageDialog(null, "Error: Login Unsuccessful. Incorrect ID or Password.");
                        Logger.error("Admin","A user has failed to login with an incorrect ID or Password.");
                    }

                    //If the manager ID is not found in the manager text file then it will show an error
                } else {
                    JOptionPane.showMessageDialog(null, "Error: Manager ID does not exist.");
                    Logger.error("Admin","A user has typed in a Manager ID that does not exist.");
                }
            } catch (IOException e) {
                try {
                    Logger.error("Admin","Exception occurred - " + e.toString());
                } catch (IOException ex) {
                    java.util.logging.Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_adminLoginBtnActionPerformed

    private void adminClearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminClearBtnActionPerformed
        adminIDField.setText(null);
        adminPasswordField.setText(null);
        try {
            Logger.info("Admin","A user has cleared the fields in Customer Login page.");
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_adminClearBtnActionPerformed

    private void adminBackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminBackBtnActionPerformed
        WelcomePage mgrBack = new WelcomePage();
        mgrBack.setVisible(true);
        this.dispose();
        try {
            Logger.info("Admin","A user has attempted to view Welcome page."); 
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_adminBackBtnActionPerformed

    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adminBackBtn;
    private javax.swing.JButton adminClearBtn;
    private javax.swing.JTextField adminIDField;
    private javax.swing.JLabel adminIDLabel;
    private javax.swing.JButton adminLoginBtn;
    private javax.swing.JLabel adminLoginHeader;
    private javax.swing.JPasswordField adminPasswordField;
    private javax.swing.JLabel adminPasswordLabel;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
