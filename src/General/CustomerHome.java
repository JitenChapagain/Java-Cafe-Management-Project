package General;

import Utilities.UserRegistrationInfo;
import java.io.IOException;
import java.util.logging.Level;
import javax.swing.JFrame;

public class CustomerHome extends javax.swing.JFrame {

    UserRegistrationInfo cust = new UserRegistrationInfo();
   
    
    
    public CustomerHome(String userID, String userPassword) {
        initComponents();
        setTitle("APU Cafeteria Ordering System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
          
        // Set the user ID
        cust.setUserID(userID);
        cust.setUserPassword(userPassword);
        userIDTF.setText(userID);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        userDisplayLabel = new javax.swing.JLabel();
        userIDTF = new javax.swing.JLabel();
        custHomeHeader = new javax.swing.JLabel();
        custLogoutBtn = new javax.swing.JButton();
        custOrderHistoryBtn = new javax.swing.JButton();
        custProfileBtn = new javax.swing.JButton();
        custMenuBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(244, 244, 244));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userDisplayLabel.setBackground(new java.awt.Color(18, 18, 18));
        userDisplayLabel.setFont(new java.awt.Font("SF Pro Text", 1, 24)); // NOI18N
        userDisplayLabel.setForeground(new java.awt.Color(242, 242, 242));
        userDisplayLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userDisplayLabel.setText("USER ID");
        jPanel1.add(userDisplayLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 120, 40));

        userIDTF.setBackground(new java.awt.Color(18, 18, 18));
        userIDTF.setFont(new java.awt.Font("SF Pro Text", 1, 18)); // NOI18N
        userIDTF.setForeground(new java.awt.Color(242, 242, 242));
        userIDTF.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userIDTF.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(242, 242, 242), 3, true));
        jPanel1.add(userIDTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 110, 60));

        custHomeHeader.setFont(new java.awt.Font("SF Pro Text", 1, 48)); // NOI18N
        custHomeHeader.setForeground(new java.awt.Color(242, 242, 242));
        custHomeHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        custHomeHeader.setText("HOME");
        custHomeHeader.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(custHomeHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 630, 102));

        custLogoutBtn.setBackground(new java.awt.Color(0, 48, 73));
        custLogoutBtn.setFont(new java.awt.Font("SF Pro Text", 1, 14)); // NOI18N
        custLogoutBtn.setForeground(new java.awt.Color(255, 255, 255));
        custLogoutBtn.setText("LOGOUT");
        custLogoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custLogoutBtnActionPerformed(evt);
            }
        });
        jPanel1.add(custLogoutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(839, 550, 154, 71));

        custOrderHistoryBtn.setBackground(new java.awt.Color(0, 48, 73));
        custOrderHistoryBtn.setFont(new java.awt.Font("SF Pro Text", 1, 36)); // NOI18N
        custOrderHistoryBtn.setForeground(new java.awt.Color(255, 255, 255));
        custOrderHistoryBtn.setText("Order History");
        custOrderHistoryBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        custOrderHistoryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custOrderHistoryBtnActionPerformed(evt);
            }
        });
        jPanel1.add(custOrderHistoryBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(382, 393, 303, 139));

        custProfileBtn.setBackground(new java.awt.Color(0, 48, 73));
        custProfileBtn.setFont(new java.awt.Font("SF Pro Text", 1, 36)); // NOI18N
        custProfileBtn.setForeground(new java.awt.Color(255, 255, 255));
        custProfileBtn.setText("Profile");
        custProfileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custProfileBtnActionPerformed(evt);
            }
        });
        jPanel1.add(custProfileBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(571, 222, 301, 136));

        custMenuBtn.setBackground(new java.awt.Color(0, 48, 73));
        custMenuBtn.setFont(new java.awt.Font("SF Pro Text", 1, 36)); // NOI18N
        custMenuBtn.setForeground(new java.awt.Color(255, 255, 255));
        custMenuBtn.setText("Menu");
        custMenuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custMenuBtnActionPerformed(evt);
            }
        });
        jPanel1.add(custMenuBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 222, 304, 136));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/General/coffee final.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 640));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void custOrderHistoryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custOrderHistoryBtnActionPerformed
        CustomerOrderHistory custOrderHistory = new CustomerOrderHistory(cust.getUserID(), cust.getUserPassword());
        custOrderHistory.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_custOrderHistoryBtnActionPerformed

    private void custProfileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custProfileBtnActionPerformed
        try {
            CustomerProfile custProfile = new CustomerProfile(cust.getUserID(), String.valueOf(cust.getUserPassword()));
            custProfile.setVisible(true);
            this.dispose();
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(CustomerHome.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_custProfileBtnActionPerformed

    private void custMenuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custMenuBtnActionPerformed
        CustomerMenu custMenu = new CustomerMenu(cust.getUserID(), cust.getUserPassword());
        custMenu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_custMenuBtnActionPerformed

    private void custLogoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custLogoutBtnActionPerformed
        WelcomePage custBack = new WelcomePage();
        custBack.setVisible(true);
        this.dispose();
        try {
            Logger.logout("CustomerHome","User " + cust.getUserID() + " has logged out of the system.");
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(CustomerHome.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_custLogoutBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel custHomeHeader;
    private javax.swing.JButton custLogoutBtn;
    private javax.swing.JButton custMenuBtn;
    private javax.swing.JButton custOrderHistoryBtn;
    private javax.swing.JButton custProfileBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel userDisplayLabel;
    private javax.swing.JLabel userIDTF;
    // End of variables declaration//GEN-END:variables
}
