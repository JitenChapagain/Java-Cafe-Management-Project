package General;

import java.io.IOException;
import java.util.logging.Level;
import javax.swing.JFrame;


public class WelcomePage extends javax.swing.JFrame {

    
    public WelcomePage() {
        initComponents();
        setTitle("APU Cafeteria Ordering System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        WelcomePanel = new javax.swing.JPanel();
        welcomeHeader = new javax.swing.JLabel();
        customerHeading = new javax.swing.JLabel();
        custRegOption = new javax.swing.JButton();
        custLoginOption = new javax.swing.JButton();
        managerHeading = new javax.swing.JLabel();
        mgrRegOption = new javax.swing.JButton();
        mgrLoginOption = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        WelcomePanel.setBackground(new java.awt.Color(244, 244, 244));
        WelcomePanel.setPreferredSize(new java.awt.Dimension(1080, 600));
        WelcomePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        welcomeHeader.setFont(new java.awt.Font("SF Pro Text", 3, 48)); // NOI18N
        welcomeHeader.setForeground(java.awt.SystemColor.activeCaption);
        welcomeHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcomeHeader.setText("WELCOME TO APU CAFE");
        WelcomePanel.add(welcomeHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 990, 110));

        customerHeading.setFont(new java.awt.Font("SF Pro Text", 1, 24)); // NOI18N
        customerHeading.setForeground(new java.awt.Color(242, 242, 242));
        customerHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        customerHeading.setText("CUSTOMER");
        WelcomePanel.add(customerHeading, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 380, 76));

        custRegOption.setBackground(new java.awt.Color(0, 48, 73));
        custRegOption.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        custRegOption.setForeground(new java.awt.Color(255, 255, 255));
        custRegOption.setText("REGISTER");
        custRegOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custRegOptionActionPerformed(evt);
            }
        });
        WelcomePanel.add(custRegOption, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 330, 76));

        custLoginOption.setBackground(new java.awt.Color(0, 48, 73));
        custLoginOption.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        custLoginOption.setForeground(new java.awt.Color(255, 255, 255));
        custLoginOption.setText("LOGIN");
        custLoginOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custLoginOptionActionPerformed(evt);
            }
        });
        WelcomePanel.add(custLoginOption, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, 330, 75));

        managerHeading.setFont(new java.awt.Font("SF Pro Text", 1, 24)); // NOI18N
        managerHeading.setForeground(new java.awt.Color(242, 242, 242));
        managerHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        managerHeading.setText("MANAGER");
        WelcomePanel.add(managerHeading, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 210, 210, 60));

        mgrRegOption.setBackground(new java.awt.Color(0, 48, 73));
        mgrRegOption.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        mgrRegOption.setForeground(new java.awt.Color(255, 255, 255));
        mgrRegOption.setText("REGISTER");
        mgrRegOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mgrRegOptionActionPerformed(evt);
            }
        });
        WelcomePanel.add(mgrRegOption, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 270, 330, 76));

        mgrLoginOption.setBackground(new java.awt.Color(0, 48, 73));
        mgrLoginOption.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        mgrLoginOption.setForeground(new java.awt.Color(255, 255, 255));
        mgrLoginOption.setText("LOGIN");
        mgrLoginOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mgrLoginOptionActionPerformed(evt);
            }
        });
        WelcomePanel.add(mgrLoginOption, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 360, 330, 76));

        jButton1.setBackground(new java.awt.Color(0, 48, 73));
        jButton1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(242, 242, 242));
        jButton1.setText("ADMIN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        WelcomePanel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 470, 190, 70));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/General/coffee final.png"))); // NOI18N
        WelcomePanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 590));

        getContentPane().add(WelcomePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void custLoginOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custLoginOptionActionPerformed
        CustomerLogin custLogin = new CustomerLogin();
        custLogin.setVisible(true);
        this.dispose();
        System.out.println("A user has attempted to view Customer Login page.");
        try {
            Logger.login("Welcome", "A user attempt to view customer login page.");
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(WelcomePage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_custLoginOptionActionPerformed

    private void custRegOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custRegOptionActionPerformed
        CustomerRegistration custRegister = new CustomerRegistration();
        custRegister.setVisible(true);
        this.dispose();
        System.out.println("A user has attempted to view Customer Registration page.");
        try {
            Logger.info("Welcome", "A user has attempted to view Customer Registration page.");
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(WelcomePage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_custRegOptionActionPerformed

    private void mgrRegOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mgrRegOptionActionPerformed
        ManagerRegistration mgrRegister = new ManagerRegistration();
        mgrRegister.setVisible(true);
        this.dispose();
        System.out.println("A user has attempted to view Manager Registration page.");
        try {
            Logger.info("Welcome", "A user has attempted to view Manager Registration page.");
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(WelcomePage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mgrRegOptionActionPerformed

    private void mgrLoginOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mgrLoginOptionActionPerformed
        ManagerLogin mgrLogin = new ManagerLogin();
        mgrLogin.setVisible(true);
        this.dispose();
        System.out.println("A user has attempted to view Manager Login page.");
        try {
            Logger.login("Welcome", "A user has attempted to view Manager Login page.");
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(WelcomePage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mgrLoginOptionActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         Admin adminLogin = new Admin();
        adminLogin.setVisible(true);
        this.dispose();
        System.out.println("A user has attempted to view ADMIN Login page.");
        try {
            Logger.login("Welcome", "A user has attempted to view ADMIN Login page.");
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(WelcomePage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(WelcomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WelcomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WelcomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WelcomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WelcomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel WelcomePanel;
    private javax.swing.JButton custLoginOption;
    private javax.swing.JButton custRegOption;
    private javax.swing.JLabel customerHeading;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel managerHeading;
    private javax.swing.JButton mgrLoginOption;
    private javax.swing.JButton mgrRegOption;
    private javax.swing.JLabel welcomeHeader;
    // End of variables declaration//GEN-END:variables
}
