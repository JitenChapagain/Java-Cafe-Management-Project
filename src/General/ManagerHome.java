package General;

import Utilities.UserRegistrationInfo;
import java.io.IOException;
import java.util.logging.Level;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class ManagerHome extends javax.swing.JFrame {

    UserRegistrationInfo mgr = new UserRegistrationInfo();
      
    public ManagerHome(String userID, String userPassword) {
        initComponents();
        setTitle("APU Cafeteria Ordering System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
        
        // Set the user ID
        mgr.setUserID(userID);
        mgr.setUserPassword(userPassword);
        userIDTF.setText(userID);
        
        
        if (userID.equals("JITEN")){
            mgrHomeHeader.setText("ADMIN HOME");
            mgrAuditLogBtn.setVisible(true);
            mgrAccountApprovalBtn.setVisible(true);
        } else {
            mgrHomeHeader.setText("MANAGER HOME");
            mgrAuditLogBtn.setVisible(false);
            mgrAccountApprovalBtn.setVisible(false);
        }
        
        
        if (userID.equals("SATINDRA")){
            mgrHomeHeader.setText("ACCOUNT HOME");
            mgrAuditLogBtn.setVisible(false);
            mgrAccountApprovalBtn.setVisible(false);
            mgrFeedbackBtn.setVisible(false);
            mgrProfileBtn.setVisible(false);
            mgrSalesReportBtn.setVisible(false);
        } 
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        userDisplayLabel1 = new javax.swing.JLabel();
        userIDTF = new javax.swing.JLabel();
        mgrHomeHeader = new javax.swing.JLabel();
        mgrUpdateMenuBtn = new javax.swing.JButton();
        mgrOrderHistoryBtn = new javax.swing.JButton();
        mgrManageOrderBtn = new javax.swing.JButton();
        mgrFeedbackBtn = new javax.swing.JButton();
        mgrSalesReportBtn = new javax.swing.JButton();
        mgrProfileBtn = new javax.swing.JButton();
        mgrAuditLogBtn = new javax.swing.JButton();
        mgrLogoutBtn = new javax.swing.JButton();
        mgrAccountApprovalBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(244, 244, 244));
        jPanel1.setForeground(new java.awt.Color(244, 244, 244));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userDisplayLabel1.setBackground(new java.awt.Color(18, 18, 18));
        userDisplayLabel1.setFont(new java.awt.Font("SF Pro Text", 1, 24)); // NOI18N
        userDisplayLabel1.setForeground(new java.awt.Color(242, 242, 242));
        userDisplayLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userDisplayLabel1.setText("USER ID");
        jPanel1.add(userDisplayLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 21, 120, 40));

        userIDTF.setBackground(new java.awt.Color(18, 18, 18));
        userIDTF.setFont(new java.awt.Font("SF Pro Text", 1, 18)); // NOI18N
        userIDTF.setForeground(new java.awt.Color(242, 242, 242));
        userIDTF.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userIDTF.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(242, 242, 242), 3, true));
        jPanel1.add(userIDTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 67, 120, 70));

        mgrHomeHeader.setFont(new java.awt.Font("SF Pro Text", 1, 48)); // NOI18N
        mgrHomeHeader.setForeground(new java.awt.Color(242, 242, 242));
        mgrHomeHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mgrHomeHeader.setText("MANAGER HOME");
        mgrHomeHeader.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        mgrHomeHeader.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(mgrHomeHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 36, 745, 101));

        mgrUpdateMenuBtn.setBackground(new java.awt.Color(0, 48, 73));
        mgrUpdateMenuBtn.setFont(new java.awt.Font("SF Pro Text", 1, 24)); // NOI18N
        mgrUpdateMenuBtn.setForeground(new java.awt.Color(255, 255, 255));
        mgrUpdateMenuBtn.setText("Update Menu");
        mgrUpdateMenuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mgrUpdateMenuBtnActionPerformed(evt);
            }
        });
        jPanel1.add(mgrUpdateMenuBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 183, 203, 97));

        mgrOrderHistoryBtn.setBackground(new java.awt.Color(0, 48, 73));
        mgrOrderHistoryBtn.setFont(new java.awt.Font("SF Pro Text", 1, 24)); // NOI18N
        mgrOrderHistoryBtn.setForeground(new java.awt.Color(255, 255, 255));
        mgrOrderHistoryBtn.setText("Order History");
        mgrOrderHistoryBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mgrOrderHistoryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mgrOrderHistoryBtnActionPerformed(evt);
            }
        });
        jPanel1.add(mgrOrderHistoryBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 183, 221, 97));

        mgrManageOrderBtn.setBackground(new java.awt.Color(0, 48, 73));
        mgrManageOrderBtn.setFont(new java.awt.Font("SF Pro Text", 1, 24)); // NOI18N
        mgrManageOrderBtn.setForeground(new java.awt.Color(255, 255, 255));
        mgrManageOrderBtn.setText("Manage Order");
        mgrManageOrderBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mgrManageOrderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mgrManageOrderBtnActionPerformed(evt);
            }
        });
        jPanel1.add(mgrManageOrderBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(624, 183, 258, 97));

        mgrFeedbackBtn.setBackground(new java.awt.Color(0, 48, 73));
        mgrFeedbackBtn.setFont(new java.awt.Font("SF Pro Text", 1, 24)); // NOI18N
        mgrFeedbackBtn.setForeground(new java.awt.Color(255, 255, 255));
        mgrFeedbackBtn.setText("Feedback");
        mgrFeedbackBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mgrFeedbackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mgrFeedbackBtnActionPerformed(evt);
            }
        });
        jPanel1.add(mgrFeedbackBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 322, 193, 87));

        mgrSalesReportBtn.setBackground(new java.awt.Color(0, 48, 73));
        mgrSalesReportBtn.setFont(new java.awt.Font("SF Pro Text", 1, 24)); // NOI18N
        mgrSalesReportBtn.setForeground(new java.awt.Color(255, 255, 255));
        mgrSalesReportBtn.setText("Sales Report");
        mgrSalesReportBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mgrSalesReportBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mgrSalesReportBtnActionPerformed(evt);
            }
        });
        jPanel1.add(mgrSalesReportBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 322, 221, 87));

        mgrProfileBtn.setBackground(new java.awt.Color(0, 48, 73));
        mgrProfileBtn.setFont(new java.awt.Font("SF Pro Text", 1, 24)); // NOI18N
        mgrProfileBtn.setForeground(new java.awt.Color(255, 255, 255));
        mgrProfileBtn.setText("Profile");
        mgrProfileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mgrProfileBtnActionPerformed(evt);
            }
        });
        jPanel1.add(mgrProfileBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(624, 323, 258, 86));

        mgrAuditLogBtn.setBackground(new java.awt.Color(0, 48, 73));
        mgrAuditLogBtn.setFont(new java.awt.Font("SF Pro Text", 1, 24)); // NOI18N
        mgrAuditLogBtn.setForeground(new java.awt.Color(255, 255, 255));
        mgrAuditLogBtn.setText("Audit Log");
        mgrAuditLogBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mgrAuditLogBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mgrAuditLogBtnActionPerformed(evt);
            }
        });
        jPanel1.add(mgrAuditLogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 450, 224, 90));

        mgrLogoutBtn.setBackground(new java.awt.Color(0, 48, 73));
        mgrLogoutBtn.setFont(new java.awt.Font("SF Pro Text", 1, 14)); // NOI18N
        mgrLogoutBtn.setForeground(new java.awt.Color(255, 255, 255));
        mgrLogoutBtn.setText("LOGOUT");
        mgrLogoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mgrLogoutBtnActionPerformed(evt);
            }
        });
        jPanel1.add(mgrLogoutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(869, 644, 120, 46));

        mgrAccountApprovalBtn.setBackground(new java.awt.Color(0, 48, 73));
        mgrAccountApprovalBtn.setFont(new java.awt.Font("SF Pro Text", 1, 24)); // NOI18N
        mgrAccountApprovalBtn.setForeground(new java.awt.Color(255, 255, 255));
        mgrAccountApprovalBtn.setText("Account Approval");
        mgrAccountApprovalBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mgrAccountApprovalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mgrAccountApprovalBtnActionPerformed(evt);
            }
        });
        jPanel1.add(mgrAccountApprovalBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 450, -1, 86));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/General/coffee final.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1010, 680));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1010, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mgrLogoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mgrLogoutBtnActionPerformed
        WelcomePage mgrLogout = new WelcomePage();
        mgrLogout.setVisible(true);
        this.dispose();
        try {
            Logger.logout("ManagerHome","Manager " + mgr.getUserID() + " has logout and  attempted to view Welcome page.");
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(ManagerHome.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mgrLogoutBtnActionPerformed

    private void mgrFeedbackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mgrFeedbackBtnActionPerformed
        try {                                               
            ManagerFeedback mgrFeedback = new ManagerFeedback(mgr.getUserID(), mgr.getUserPassword());
            mgrFeedback.setVisible(true);
            this.dispose();
            try {
                Logger.info("ManagerHome","Manager " + mgr.getUserID() + " has attempted to view Manager Feedback page.");
            } catch (IOException ex) {
                java.util.logging.Logger.getLogger(ManagerHome.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(ManagerHome.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mgrFeedbackBtnActionPerformed

    private void mgrUpdateMenuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mgrUpdateMenuBtnActionPerformed
        ManagerMenu mgrMenu = new ManagerMenu(mgr.getUserID(), mgr.getUserPassword());
        mgrMenu.setVisible(true);
        this.dispose();
        try {
            Logger.info("ManagerHome","Manager " + mgr.getUserID() + " has attempted to view Manager Menu page.");
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(ManagerHome.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mgrUpdateMenuBtnActionPerformed

    private void mgrOrderHistoryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mgrOrderHistoryBtnActionPerformed
        ManagerOrderHistory mgrOrderHistory = new ManagerOrderHistory(mgr.getUserID(), mgr.getUserPassword());
        mgrOrderHistory.setVisible(true);
        this.dispose();
        try {
            Logger.info("ManagerHome","Manager " + mgr.getUserID() + " has attempted to view Manager Order History page.");
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(ManagerHome.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mgrOrderHistoryBtnActionPerformed

    private void mgrProfileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mgrProfileBtnActionPerformed
        try {                                              
            ManagerProfile mgrProfile = new ManagerProfile(mgr.getUserID(), mgr.getUserPassword());
            mgrProfile.setVisible(true);
            this.dispose();
            try {
                Logger.info("ManagerHome","Manager " + mgr.getUserID() + " has attempted to view Manager Profile page.");
            } catch (IOException ex) {
                java.util.logging.Logger.getLogger(ManagerHome.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(ManagerHome.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mgrProfileBtnActionPerformed

    private void mgrSalesReportBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mgrSalesReportBtnActionPerformed
        ManagerSalesReport mgrSalesReport;
        try {
            mgrSalesReport = new ManagerSalesReport(mgr.getUserID(), mgr.getUserPassword());
            mgrSalesReport.setVisible(true);
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(ManagerHome.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
        try {
            Logger.info("ManagerHome","Manager " + mgr.getUserID() + " has attempted to view Manager Sales Report page.");
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(ManagerHome.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mgrSalesReportBtnActionPerformed

    private void mgrManageOrderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mgrManageOrderBtnActionPerformed
        try {                                                  
            ManagerManageOrder mgrManageOrder = new ManagerManageOrder(mgr.getUserID(), mgr.getUserPassword());
            mgrManageOrder.setVisible(true);
            this.dispose();
            try {
                Logger.info("ManagerHome","Manager " + mgr.getUserID() + " has attempted to view Manager Manage Order page.");
            } catch (IOException ex) {
                java.util.logging.Logger.getLogger(ManagerHome.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(ManagerHome.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mgrManageOrderBtnActionPerformed

    private void mgrAccountApprovalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mgrAccountApprovalBtnActionPerformed
        if (mgr.getUserID().equals("JITEN")){    
            try {
                ManagerApproval mgrApproval = new ManagerApproval(mgr.getUserID(),mgr.getUserPassword());
                if (mgr.getUserID().equals("JITEN"))
                {
                    mgrApproval.setVisible(true);
                    this.dispose();
                    try {
                        Logger.info("ManagerHome","Manager " + mgr.getUserID() + " has attempted to view Manager Account Approval page.");
                    } catch (IOException ex) {
                        java.util.logging.Logger.getLogger(ManagerHome.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else{
                    mgrApproval.setVisible(false);
                }
            } catch (IOException ex) {
                java.util.logging.Logger.getLogger(ManagerHome.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else {
            try {
                ManagerApproval mgrApproval = new ManagerApproval(mgr.getUserID(),mgr.getUserPassword());
                mgrApproval.setVisible(false);
                mgrAccountApprovalBtn.setVisible(false);
                try {
                    Logger.info("ManagerHome","Manager " + mgr.getUserID() + " that did not have admin level access has attempted to view Manager Account Approval page.");
                } catch (IOException ex) {
                    java.util.logging.Logger.getLogger(ManagerHome.class.getName()).log(Level.SEVERE, null, ex);
                }
                JOptionPane.showMessageDialog(null, "Page requires admin level access.");
            } catch (IOException ex) {
                java.util.logging.Logger.getLogger(ManagerHome.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_mgrAccountApprovalBtnActionPerformed

    private void mgrAuditLogBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mgrAuditLogBtnActionPerformed
        if (mgr.getUserID().equals("JITEN")){
            try {
                ManagerAuditLog mgrAuditLog  = new ManagerAuditLog (mgr.getUserID(), mgr.getUserPassword());
                mgrAuditLog.setVisible(true);
                this.dispose();
                try {
                    Logger.info("ManagerHome","Manager " + mgr.getUserID() + " has attempted to view Manager Audit Log page.");
                } catch (IOException ex) {
                    java.util.logging.Logger.getLogger(ManagerHome.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (IOException ex) {
                java.util.logging.Logger.getLogger(ManagerHome.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else{
            mgrAuditLogBtn.setVisible(false);
            try {
                Logger.info("ManagerHome","Manager " + mgr.getUserID() + " that did not have admin level access has attempted to view Manager Account Approval page.");
            } catch (IOException ex) {
                java.util.logging.Logger.getLogger(ManagerHome.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null, "Page requires admin level access.");
        }
    }//GEN-LAST:event_mgrAuditLogBtnActionPerformed
/**/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton mgrAccountApprovalBtn;
    private javax.swing.JButton mgrAuditLogBtn;
    private javax.swing.JButton mgrFeedbackBtn;
    private javax.swing.JLabel mgrHomeHeader;
    private javax.swing.JButton mgrLogoutBtn;
    private javax.swing.JButton mgrManageOrderBtn;
    private javax.swing.JButton mgrOrderHistoryBtn;
    private javax.swing.JButton mgrProfileBtn;
    private javax.swing.JButton mgrSalesReportBtn;
    private javax.swing.JButton mgrUpdateMenuBtn;
    private javax.swing.JLabel userDisplayLabel1;
    private javax.swing.JLabel userIDTF;
    // End of variables declaration//GEN-END:variables
}
