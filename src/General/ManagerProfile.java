package General;

import Utilities.FileHandling;
import Utilities.UserRegistrationInfo;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import javax.swing.JFrame;

public class ManagerProfile extends javax.swing.JFrame {

    UserRegistrationInfo mgr = new UserRegistrationInfo();
    
    public ManagerProfile(String userID, String userPassword) throws IOException {
        initComponents();
        setTitle("APU Cafeteria Ordering System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        mgr.setUserID(userID);
        mgr.setUserPassword(userPassword);
        
        //For Dispalying the Current Balance
        String line = "";
        FileHandling custFile = new FileHandling();
        File file = new File("mgrAccount.txt");
        try {
            //Locates line in file and stores in variable
            line = custFile.locateItemInFile(mgr.getUserID(), file, 0);
        } catch (IOException e) {
            Logger.error("Profile","Exception occurred - " + e.toString());
        }
        
        //Splits line into multiple sections
        String [] section = line.split("\\|");
        
        //Sets the manager credentials iwthin the text fields
        mgrID.setText(userID);
        mgrName.setText(section[1]);
        mgrPassword.setText(userPassword);
        mgrEmail.setText(section[3]);
        
        //Ensures textfields cannot be edited
        mgrID.setEditable(false);
        mgrName.setEditable(false);
        mgrPassword.setEditable(false);
        mgrEmail.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        headerPanel2 = new javax.swing.JPanel();
        custHomeHeader2 = new javax.swing.JLabel();
        custIDLabel1 = new javax.swing.JLabel();
        mgrID = new javax.swing.JTextField();
        custNameLabel = new javax.swing.JLabel();
        mgrName = new javax.swing.JTextField();
        custPasswordLabel = new javax.swing.JLabel();
        mgrPassword = new javax.swing.JPasswordField();
        showPassword = new javax.swing.JCheckBox();
        custEmailLabel = new javax.swing.JLabel();
        mgrEmail = new javax.swing.JTextField();
        mgrBackBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(244, 244, 244));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        headerPanel2.setBackground(new java.awt.Color(255, 255, 255));

        custHomeHeader2.setFont(new java.awt.Font("SF Pro Text", 1, 48)); // NOI18N
        custHomeHeader2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        custHomeHeader2.setText("MANAGER PROFILE");
        custHomeHeader2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        custHomeHeader2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout headerPanel2Layout = new javax.swing.GroupLayout(headerPanel2);
        headerPanel2.setLayout(headerPanel2Layout);
        headerPanel2Layout.setHorizontalGroup(
            headerPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(custHomeHeader2, javax.swing.GroupLayout.PREFERRED_SIZE, 874, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        headerPanel2Layout.setVerticalGroup(
            headerPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(custHomeHeader2, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(headerPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 16, 810, -1));

        custIDLabel1.setBackground(new java.awt.Color(0, 0, 0));
        custIDLabel1.setFont(new java.awt.Font("SF Pro Text", 1, 18)); // NOI18N
        custIDLabel1.setForeground(new java.awt.Color(242, 242, 242));
        custIDLabel1.setText("Manager ID:");
        jPanel1.add(custIDLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, -1, 31));

        mgrID.setBackground(new java.awt.Color(244, 244, 244));
        mgrID.setFont(new java.awt.Font("SF Pro Text", 0, 12)); // NOI18N
        mgrID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        mgrID.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(244, 244, 244)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(244, 244, 244))); // NOI18N
        jPanel1.add(mgrID, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, 310, 50));

        custNameLabel.setBackground(new java.awt.Color(0, 0, 0));
        custNameLabel.setFont(new java.awt.Font("SF Pro Text", 1, 18)); // NOI18N
        custNameLabel.setForeground(new java.awt.Color(242, 242, 242));
        custNameLabel.setText("Manager Name:");
        jPanel1.add(custNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, -1, 31));

        mgrName.setBackground(new java.awt.Color(244, 244, 244));
        mgrName.setFont(new java.awt.Font("SF Pro Text", 0, 12)); // NOI18N
        mgrName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        mgrName.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(244, 244, 244)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(244, 244, 244))); // NOI18N
        jPanel1.add(mgrName, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, 310, 50));

        custPasswordLabel.setBackground(new java.awt.Color(0, 0, 0));
        custPasswordLabel.setFont(new java.awt.Font("SF Pro Text", 1, 18)); // NOI18N
        custPasswordLabel.setForeground(new java.awt.Color(242, 242, 242));
        custPasswordLabel.setText("Password:");
        jPanel1.add(custPasswordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, -1, 35));

        mgrPassword.setBackground(new java.awt.Color(244, 244, 244));
        mgrPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        mgrPassword.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(244, 244, 244))); // NOI18N
        jPanel1.add(mgrPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 310, 310, 50));

        showPassword.setForeground(new java.awt.Color(242, 242, 242));
        showPassword.setText("Show Password");
        showPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(showPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 360, -1, -1));

        custEmailLabel.setBackground(new java.awt.Color(0, 0, 0));
        custEmailLabel.setFont(new java.awt.Font("SF Pro Text", 1, 18)); // NOI18N
        custEmailLabel.setForeground(new java.awt.Color(242, 242, 242));
        custEmailLabel.setText("Email:");
        jPanel1.add(custEmailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 400, -1, 31));

        mgrEmail.setBackground(new java.awt.Color(244, 244, 244));
        mgrEmail.setFont(new java.awt.Font("SF Pro Text", 0, 12)); // NOI18N
        mgrEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        mgrEmail.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(244, 244, 244)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(244, 244, 244))); // NOI18N
        jPanel1.add(mgrEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 400, 310, 40));

        mgrBackBtn.setBackground(new java.awt.Color(0, 48, 73));
        mgrBackBtn.setFont(new java.awt.Font("SF Pro Text", 1, 18)); // NOI18N
        mgrBackBtn.setForeground(new java.awt.Color(255, 255, 255));
        mgrBackBtn.setText("BACK");
        mgrBackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mgrBackBtnActionPerformed(evt);
            }
        });
        jPanel1.add(mgrBackBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 540, 120, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/General/wood final.png"))); // NOI18N
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

    private void mgrBackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mgrBackBtnActionPerformed
        ManagerHome mgrBack = new ManagerHome(mgr.getUserID(), mgr.getUserPassword());
        mgrBack.setVisible(true);
        this.dispose();
        try {
            Logger.info("Profile","User " + mgr.getUserID() + " has attempted to view Manager Home page.");
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(ManagerProfile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mgrBackBtnActionPerformed

    //Check box button to show and hide the password
    private void showPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPasswordActionPerformed
        if(showPassword.isSelected()){
            mgrPassword.setEchoChar((char)0); 
        } else {
            mgrPassword.setEchoChar('*');
        }
    }//GEN-LAST:event_showPasswordActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel custEmailLabel;
    private javax.swing.JLabel custHomeHeader2;
    private javax.swing.JLabel custIDLabel1;
    private javax.swing.JLabel custNameLabel;
    private javax.swing.JLabel custPasswordLabel;
    private javax.swing.JPanel headerPanel2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton mgrBackBtn;
    private javax.swing.JTextField mgrEmail;
    private javax.swing.JTextField mgrID;
    private javax.swing.JTextField mgrName;
    private javax.swing.JPasswordField mgrPassword;
    private javax.swing.JCheckBox showPassword;
    // End of variables declaration//GEN-END:variables
}
