
package General;

import Utilities.FileHandling;
import Utilities.UserRegistrationInfo;
import java.io.File;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TopUpCustomer extends javax.swing.JFrame {
UserRegistrationInfo cust = new UserRegistrationInfo();
    
    public TopUpCustomer() {
        initComponents();
        setTitle("APU Cafeteria Ordering System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        cust.setUserID(CustomerID.getText());
        
        
        //For Dispalying the Current Balance
        String line = "";
        FileHandling custFile = new FileHandling();
        File fl = new File("custAccount.txt");
        try {
            line = custFile.locateItemInFile(cust.getUserID(), fl, 0);
        } catch (IOException e) {
            System.err.println("Exception occurred - " + e.toString());
        }
        
        //Splits line into multiple sections
        String [] section = line.split("\\|");
        
        //Sets the customer credentials iwthin the text fields
        
        currentAmount.setText("RM " + section[4]);
            
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        custHomeHeader2 = new javax.swing.JLabel();
        amount = new javax.swing.JTextField();
        mgrTopUpBtn = new javax.swing.JButton();
        custIDLabel = new javax.swing.JLabel();
        custBackBtn = new javax.swing.JButton();
        custIDLabel1 = new javax.swing.JLabel();
        custIDLabel2 = new javax.swing.JLabel();
        CustomerID = new javax.swing.JTextField();
        currentAmount = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        custHomeHeader2.setFont(new java.awt.Font("SF Pro Text", 1, 48)); // NOI18N
        custHomeHeader2.setForeground(new java.awt.Color(255, 255, 204));
        custHomeHeader2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        custHomeHeader2.setText("CUSTOMER TOPUP");
        custHomeHeader2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        custHomeHeader2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(custHomeHeader2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 971, 101));

        amount.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        amount.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountActionPerformed(evt);
            }
        });
        getContentPane().add(amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 310, 330, 51));

        mgrTopUpBtn.setBackground(new java.awt.Color(0, 48, 73));
        mgrTopUpBtn.setFont(new java.awt.Font("SF Pro Text", 1, 24)); // NOI18N
        mgrTopUpBtn.setForeground(new java.awt.Color(255, 255, 255));
        mgrTopUpBtn.setText("TOP UP");
        mgrTopUpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mgrTopUpBtnActionPerformed(evt);
            }
        });
        getContentPane().add(mgrTopUpBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 400, 130, 70));

        custIDLabel.setBackground(new java.awt.Color(0, 0, 0));
        custIDLabel.setFont(new java.awt.Font("SF Pro Text", 1, 18)); // NOI18N
        custIDLabel.setForeground(new java.awt.Color(255, 255, 204));
        custIDLabel.setText("Current Balance:");
        custIDLabel.setPreferredSize(new java.awt.Dimension(160, 160));
        getContentPane().add(custIDLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 520, -1, 30));

        custBackBtn.setBackground(new java.awt.Color(0, 48, 73));
        custBackBtn.setFont(new java.awt.Font("SF Pro Text", 1, 14)); // NOI18N
        custBackBtn.setForeground(new java.awt.Color(255, 255, 255));
        custBackBtn.setText("BACK");
        custBackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custBackBtnActionPerformed(evt);
            }
        });
        getContentPane().add(custBackBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 590, 95, 40));

        custIDLabel1.setBackground(new java.awt.Color(0, 0, 0));
        custIDLabel1.setFont(new java.awt.Font("SF Pro Text", 1, 18)); // NOI18N
        custIDLabel1.setForeground(new java.awt.Color(255, 255, 204));
        custIDLabel1.setText("Customer ID:");
        custIDLabel1.setPreferredSize(new java.awt.Dimension(160, 160));
        getContentPane().add(custIDLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 114, 30));

        custIDLabel2.setBackground(new java.awt.Color(0, 0, 0));
        custIDLabel2.setFont(new java.awt.Font("SF Pro Text", 1, 18)); // NOI18N
        custIDLabel2.setForeground(new java.awt.Color(255, 255, 204));
        custIDLabel2.setText("Amount To Add:");
        custIDLabel2.setPreferredSize(new java.awt.Dimension(160, 160));
        getContentPane().add(custIDLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, 145, 30));

        CustomerID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CustomerID.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        CustomerID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerIDActionPerformed(evt);
            }
        });
        getContentPane().add(CustomerID, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, 330, 51));

        currentAmount.setBackground(new java.awt.Color(255, 255, 255));
        currentAmount.setFont(new java.awt.Font("SF Pro Text", 0, 12)); // NOI18N
        currentAmount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        currentAmount.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        currentAmount.setPreferredSize(new java.awt.Dimension(300, 35));
        getContentPane().add(currentAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 500, 220, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/General/wood final.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void amountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountActionPerformed

    }//GEN-LAST:event_amountActionPerformed

    private void mgrTopUpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mgrTopUpBtnActionPerformed
        cust.setUserID(CustomerID.getText());
        String line = "";
        FileHandling custFile = new FileHandling();
        File fl = new File("custAccount.txt");
        Double topUpAmount;
        topUpAmount = Double.parseDouble(amount.getText());
        
        
        try {
            

            // If the top up amount does not meet the condition an error message is shown
            if (topUpAmount > 500 || topUpAmount < 1){
                System.err.println("Customer " + cust.getUserID() + " has inputted a top up amount outside the range.");
                JOptionPane.showMessageDialog(null, "Error: Please input an amount between RM 1 and RM 500.");
                amount.setText("");
                topUpAmount = 0.0;
            }

            else{
                // Adds the top up amount with the previous value from the line within the text file
                Double newAmount = topUpAmount + Double.parseDouble(currentAmount.getText().replace("RM ", ""));
                newAmount = (double) Math.round(newAmount * 100) / 100;

                // Rewrites the line with the new top up amount back into the text file
                custFile.rewriteContent(fl, 0, CustomerID.getText(), String.valueOf(newAmount));
                System.out.println("User " + cust.getUserID() + " has topped up RM" + topUpAmount + " to their account. User "
                    + cust.getUserID() + " current balance is RM" + newAmount);
                JOptionPane.showMessageDialog(null, "Top up successful! RM" + topUpAmount + " has been added to your account.");

                try {
                    // Stores the line from the customer file
                    line = custFile.locateItemInFile(cust.getUserID(), fl, 0);
                } catch (IOException e) {
                    System.err.println("Exception occurred - " + e.toString());
                    JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
                }

                // Splits the line into multiple sections and sets the current balance text area to the new value
                String [] section = line.split("\\|");
                currentAmount.setText("RM " + section[4]);

                //Resets the top up input text field to blank again
                amount.setText("");
            }

        }catch (NumberFormatException e){
            System.out.println("balance"+ currentAmount);
            System.err.println("Exception occurred - " + e.toString());
            JOptionPane.showMessageDialog(null, "Error: Please input a valid amount to top up.");
        }
    }//GEN-LAST:event_mgrTopUpBtnActionPerformed

    private void custBackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custBackBtnActionPerformed
        ManagerHome mgrBack = new ManagerHome(cust.getUserID(), cust.getUserPassword());
        mgrBack.setVisible(true);
        this.dispose();
        System.out.println("User " + cust.getUserID() + " has attempted to view home page.");
    }//GEN-LAST:event_custBackBtnActionPerformed

    private void CustomerIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerIDActionPerformed
        
    }//GEN-LAST:event_CustomerIDActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CustomerID;
    private javax.swing.JTextField amount;
    private javax.swing.JLabel currentAmount;
    private javax.swing.JButton custBackBtn;
    private javax.swing.JLabel custHomeHeader2;
    private javax.swing.JLabel custIDLabel;
    private javax.swing.JLabel custIDLabel1;
    private javax.swing.JLabel custIDLabel2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton mgrTopUpBtn;
    // End of variables declaration//GEN-END:variables
}
