package General;

import Utilities.FileHandling;
import Utilities.UserRegistrationInfo;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class CustomerProfile extends javax.swing.JFrame {

    UserRegistrationInfo cust = new UserRegistrationInfo();
       
    public CustomerProfile(String userID, String userPassword) throws IOException {
        initComponents();
        setTitle("APU Cafeteria Ordering System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        cust.setUserID(userID);
        cust.setUserPassword(userPassword);
        
        //For Dispalying the Current Balance
        String line = "";
        FileHandling custFile = new FileHandling();
        File file = new File("custAccount.txt");
        try {
            line = custFile.locateItemInFile(cust.getUserID(), file, 0);
        } catch (IOException e) {
            Logger.error("CustomerProfile","Exception occurred - " + e.toString());
        }
        
        //Splits line into multiple sections
        String [] section = line.split("\\|");
        
        //Sets the customer credentials iwthin the text fields
        custID.setText(cust.getUserID());
        custName.setText(section[1]);
        custPassword.setText(cust.getUserPassword());
        custEmail.setText(section[3]);
        currentBalance.setText("RM " + section[4]);
        
        //Ensures textfields cannot be edited
        custID.setEditable(false);
        custName.setEditable(false);
        custPassword.setEditable(false);
        custEmail.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        headerPanel2 = new javax.swing.JPanel();
        custHomeHeader2 = new javax.swing.JLabel();
        contentPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        custBackBtn = new javax.swing.JButton();
        custPasswordLabel = new javax.swing.JLabel();
        custNameLabel = new javax.swing.JLabel();
        custEmailLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        mgrTopUpBtn = new javax.swing.JButton();
        currentBalance = new javax.swing.JLabel();
        custIDLabel = new javax.swing.JLabel();
        topUpInput = new javax.swing.JTextField();
        custIDLabel1 = new javax.swing.JLabel();
        custID = new javax.swing.JTextField();
        custName = new javax.swing.JTextField();
        custPassword = new javax.swing.JPasswordField();
        custEmail = new javax.swing.JTextField();
        showPassword = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(244, 244, 244));
        jPanel1.setForeground(new java.awt.Color(244, 244, 244));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        headerPanel2.setBackground(new java.awt.Color(58, 37, 41));
        headerPanel2.setForeground(new java.awt.Color(242, 242, 242));

        custHomeHeader2.setFont(new java.awt.Font("SF Pro Text", 1, 48)); // NOI18N
        custHomeHeader2.setForeground(new java.awt.Color(242, 242, 242));
        custHomeHeader2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        custHomeHeader2.setText("CUSTOMER PROFILE");
        custHomeHeader2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout headerPanel2Layout = new javax.swing.GroupLayout(headerPanel2);
        headerPanel2.setLayout(headerPanel2Layout);
        headerPanel2Layout.setHorizontalGroup(
            headerPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(custHomeHeader2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        headerPanel2Layout.setVerticalGroup(
            headerPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(custHomeHeader2, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(headerPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 24, 925, -1));

        contentPanel.setBackground(new java.awt.Color(58, 37, 41));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("SF Pro Text", 1, 18)); // NOI18N

        custBackBtn.setBackground(new java.awt.Color(0, 48, 73));
        custBackBtn.setFont(new java.awt.Font("SF Pro Text", 1, 14)); // NOI18N
        custBackBtn.setForeground(new java.awt.Color(255, 255, 255));
        custBackBtn.setText("BACK");
        custBackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custBackBtnActionPerformed(evt);
            }
        });

        custPasswordLabel.setBackground(new java.awt.Color(0, 0, 0));
        custPasswordLabel.setFont(new java.awt.Font("SF Pro Text", 1, 18)); // NOI18N
        custPasswordLabel.setForeground(new java.awt.Color(242, 242, 242));
        custPasswordLabel.setText("Password:");

        custNameLabel.setBackground(new java.awt.Color(0, 0, 0));
        custNameLabel.setFont(new java.awt.Font("SF Pro Text", 1, 18)); // NOI18N
        custNameLabel.setForeground(new java.awt.Color(242, 242, 242));
        custNameLabel.setText("Customer Name:");

        custEmailLabel.setBackground(new java.awt.Color(0, 0, 0));
        custEmailLabel.setFont(new java.awt.Font("SF Pro Text", 1, 18)); // NOI18N
        custEmailLabel.setForeground(new java.awt.Color(242, 242, 242));
        custEmailLabel.setText("Email:");

        jPanel2.setBackground(new java.awt.Color(58, 37, 41));
        jPanel2.setPreferredSize(new java.awt.Dimension(250, 250));

        mgrTopUpBtn.setBackground(new java.awt.Color(0, 48, 73));
        mgrTopUpBtn.setFont(new java.awt.Font("SF Pro Text", 1, 24)); // NOI18N
        mgrTopUpBtn.setForeground(new java.awt.Color(255, 255, 255));
        mgrTopUpBtn.setText("TOP UP");
        mgrTopUpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mgrTopUpBtnActionPerformed(evt);
            }
        });

        currentBalance.setBackground(new java.awt.Color(255, 255, 255));
        currentBalance.setFont(new java.awt.Font("SF Pro Text", 0, 12)); // NOI18N
        currentBalance.setForeground(new java.awt.Color(242, 242, 242));
        currentBalance.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        currentBalance.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        currentBalance.setPreferredSize(new java.awt.Dimension(300, 35));

        custIDLabel.setBackground(new java.awt.Color(0, 0, 0));
        custIDLabel.setFont(new java.awt.Font("SF Pro Text", 1, 18)); // NOI18N
        custIDLabel.setForeground(new java.awt.Color(242, 242, 242));
        custIDLabel.setText("Current Balance:");
        custIDLabel.setPreferredSize(new java.awt.Dimension(160, 160));

        topUpInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        topUpInput.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        topUpInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                topUpInputActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(currentBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(topUpInput, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(custIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(mgrTopUpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(topUpInput, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(mgrTopUpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(custIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(currentBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        custIDLabel1.setBackground(new java.awt.Color(0, 0, 0));
        custIDLabel1.setFont(new java.awt.Font("SF Pro Text", 1, 18)); // NOI18N
        custIDLabel1.setForeground(new java.awt.Color(242, 242, 242));
        custIDLabel1.setText("Customer ID:");

        custID.setBackground(new java.awt.Color(244, 244, 244));
        custID.setFont(new java.awt.Font("SF Pro Text", 0, 12)); // NOI18N
        custID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        custID.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(244, 244, 244)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(244, 244, 244))); // NOI18N

        custName.setBackground(new java.awt.Color(244, 244, 244));
        custName.setFont(new java.awt.Font("SF Pro Text", 0, 12)); // NOI18N
        custName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        custName.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(244, 244, 244)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(244, 244, 244))); // NOI18N

        custPassword.setBackground(new java.awt.Color(244, 244, 244));
        custPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        custPassword.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(244, 244, 244))); // NOI18N

        custEmail.setBackground(new java.awt.Color(244, 244, 244));
        custEmail.setFont(new java.awt.Font("SF Pro Text", 0, 12)); // NOI18N
        custEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        custEmail.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(244, 244, 244)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(244, 244, 244))); // NOI18N

        showPassword.setForeground(new java.awt.Color(242, 242, 242));
        showPassword.setText("Show Password");
        showPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contentPanelLayout = new javax.swing.GroupLayout(contentPanel);
        contentPanel.setLayout(contentPanelLayout);
        contentPanelLayout.setHorizontalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(custPasswordLabel))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPanelLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(custNameLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(custIDLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(custEmailLabel, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(18, 18, 18)
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(custID, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                .addComponent(custName))
                            .addComponent(custPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(33, 33, 33))
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(custEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(showPassword))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addComponent(custBackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        contentPanelLayout.setVerticalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPanelLayout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPanelLayout.createSequentialGroup()
                                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(custIDLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(custID, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)
                                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(custNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(custName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(contentPanelLayout.createSequentialGroup()
                                        .addComponent(custPasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(custEmailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(contentPanelLayout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(custPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(showPassword)
                                        .addGap(17, 17, 17)
                                        .addComponent(custEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(32, 32, 32)
                .addComponent(custBackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(contentPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 150, -1, -1));

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

    private void custBackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custBackBtnActionPerformed
        CustomerHome mgrBack = new CustomerHome(cust.getUserID(), cust.getUserPassword());
        mgrBack.setVisible(true);
        this.dispose();
        try {
            Logger.info("CustomerProfile","User " + cust.getUserID() + " has attempted to view Customer Home page.");
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(CustomerProfile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_custBackBtnActionPerformed

    private void mgrTopUpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mgrTopUpBtnActionPerformed
            String line = "";
            FileHandling custFile = new FileHandling();
            File file = new File("custAccount.txt");

            try {
                Double topUpAmount;
                topUpAmount = Double.parseDouble(topUpInput.getText());
                
                // If the top up amount does not meet the condition an error message is shown
                if (topUpAmount > 500 || topUpAmount < 1){
                    Logger.error("CustomerProfile","Customer " + cust.getUserID() + " has inputted a top up amount outside the range.");
                    JOptionPane.showMessageDialog(null, "Error: Please input an amount between RM 1 and RM 500.");
                    topUpInput.setText("");
                    topUpAmount = 0.0;
                }
                
                else{
                    // Adds the top up amount with the previous value from the line within the text file
                    Double newAmount = topUpAmount + Double.parseDouble(currentBalance.getText().replace("RM ", ""));
                    newAmount = (double) Math.round(newAmount * 100) / 100;

                    // Rewrites the line with the new top up amount back into the text file
                    custFile.rewriteContent(file, 0, custID.getText(), String.valueOf(newAmount));
                    Logger.info("CustomerProfile","User " + cust.getUserID() + " has topped up RM" + topUpAmount + " to their account. User " 
                            + cust.getUserID() + " current balance is RM" + newAmount);
                    JOptionPane.showMessageDialog(null, "Top up successful! RM" + topUpAmount + " has been added to your account.");

                    try {
                        // Stores the line from the customer file 
                        line = custFile.locateItemInFile(cust.getUserID(), file, 0);
                    } catch (IOException e) {
                        try {
                            Logger.error("CustomerProfile","Exception occurred - " + e.toString());
                        } catch (IOException ex) {
                            java.util.logging.Logger.getLogger(CustomerProfile.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
                    }

                    // Splits the line into multiple sections and sets the current balance text area to the new value 
                    String [] section = line.split("\\|");
                    currentBalance.setText("RM " + section[4]);

                    //Resets the top up input text field to blank again
                    topUpInput.setText("");
                }

        }catch (NumberFormatException e){
                try {
                    Logger.error("CustomerProfile","Exception occurred - " + e.toString());
                } catch (IOException ex) {
                    java.util.logging.Logger.getLogger(CustomerProfile.class.getName()).log(Level.SEVERE, null, ex);
                }
            JOptionPane.showMessageDialog(null, "Error: Please input a valid amount to top up.");
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(CustomerProfile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mgrTopUpBtnActionPerformed

    private void topUpInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_topUpInputActionPerformed
       
    }//GEN-LAST:event_topUpInputActionPerformed
    
    //Check box button to show and hide the password
    private void showPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPasswordActionPerformed
        if(showPassword.isSelected()){
            custPassword.setEchoChar((char)0); 
        } else {
            custPassword.setEchoChar('*');
        }
    }//GEN-LAST:event_showPasswordActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contentPanel;
    private javax.swing.JLabel currentBalance;
    private javax.swing.JButton custBackBtn;
    private javax.swing.JTextField custEmail;
    private javax.swing.JLabel custEmailLabel;
    private javax.swing.JLabel custHomeHeader2;
    private javax.swing.JTextField custID;
    private javax.swing.JLabel custIDLabel;
    private javax.swing.JLabel custIDLabel1;
    private javax.swing.JTextField custName;
    private javax.swing.JLabel custNameLabel;
    private javax.swing.JPasswordField custPassword;
    private javax.swing.JLabel custPasswordLabel;
    private javax.swing.JPanel headerPanel2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton mgrTopUpBtn;
    private javax.swing.JCheckBox showPassword;
    private javax.swing.JTextField topUpInput;
    // End of variables declaration//GEN-END:variables
}
