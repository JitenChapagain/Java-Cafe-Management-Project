package General;


import Utilities.FileHandling;
import Utilities.UserRegistrationInfo;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CustomerOrderHistory extends javax.swing.JFrame implements OrderHistory {

    UserRegistrationInfo cust = new UserRegistrationInfo();
        
    public CustomerOrderHistory(String userID, String userPassword) {
        initComponents();
        setTitle("APU Cafeteria Ordering System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        
        reviewTextArea.setLineWrap(true);
        reviewTextArea.setWrapStyleWord(true);
        
        // Set the user ID
        cust.setUserID(userID);
        cust.setUserPassword(userPassword);
        userIDTF.setText(userID);
        
        loadOrderHistoryTable();
    }
    
    // Loads the order history of completed orders in the JTable
    @Override
    public void loadOrderHistoryTable(){
        DefaultTableModel orderHistoryTableModel = (DefaultTableModel) custOrderHistoryTable.getModel();
        File file = new File(COFILE);
        
        try {
            String str;
            BufferedReader br = new BufferedReader(new FileReader(file));
            try {   
                while((str = br.readLine()) != null){
                    // Spliting the data into different section using the | delimeter
                    String data[] = str.split("\\|");
                    // Only adding the users orders in the order history
                    if (data[1].equals(cust.getUserID())) {
                        
                        // Calculating the total price and add the data into the order history table
                        Double totalPrice;
                        totalPrice = Double.parseDouble(data[4]) * Integer.parseInt(data[5]);
                        totalPrice = Math.round(totalPrice * 100.0) / 100.0;
                        String totalPriceStr;
                        totalPriceStr = totalPrice.toString();
                        orderHistoryTableModel.addRow(new Object[]{data[0], data[2], data[3], 
                                                data[4], data[5], totalPriceStr, idToDateConversion(data[0])});
                    }
                }
                br.close();
            } catch (IOException e) {
                try {
                    Logger.error("CustomerOrderHistory","Exception occurred - " + e.toString());
                } catch (IOException ex) {
                    java.util.logging.Logger.getLogger(CustomerOrderHistory.class.getName()).log(Level.SEVERE, null, ex);
                }
                JOptionPane.showMessageDialog(null, "Error: File cannot be read.");
            }
        } catch (FileNotFoundException e) {
            try {
                Logger.error("CustomerOrderHistory","Exception occurred - " + e.toString());
            } catch (IOException ex) {
                java.util.logging.Logger.getLogger(CustomerOrderHistory.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null, "Error: File does not exist!");
        }
    }
    
    // Extracts the date from the order ID and converts it into a date format
    @Override
    public String idToDateConversion(String orderID) {
        
        String day = orderID.substring(0, 2);
        String month = orderID.substring(2,4);
        String year = orderID.substring(4,8);         
        String date = day + "-" + month + "-" + year;

        return date;
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        headerPanel1 = new javax.swing.JPanel();
        custHomeHeader1 = new javax.swing.JLabel();
        contentPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        custBackBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        custOrderHistoryTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        orderHistoryLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        orderHistoryLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        reviewTextArea = new javax.swing.JTextArea();
        custSubmitReviewBtn = new javax.swing.JButton();
        userPanel = new javax.swing.JPanel();
        userDisplayLabel = new javax.swing.JLabel();
        userIDTF = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(244, 244, 244));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        headerPanel1.setBackground(java.awt.SystemColor.activeCaptionBorder);
        headerPanel1.setForeground(new java.awt.Color(242, 242, 242));

        custHomeHeader1.setBackground(javax.swing.UIManager.getDefaults().getColor("Slider.tickColor"));
        custHomeHeader1.setFont(new java.awt.Font("SF Pro Text", 1, 48)); // NOI18N
        custHomeHeader1.setForeground(new java.awt.Color(0, 0, 102));
        custHomeHeader1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        custHomeHeader1.setText("ORDER HISTORY");
        custHomeHeader1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        custHomeHeader1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout headerPanel1Layout = new javax.swing.GroupLayout(headerPanel1);
        headerPanel1.setLayout(headerPanel1Layout);
        headerPanel1Layout.setHorizontalGroup(
            headerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(custHomeHeader1, javax.swing.GroupLayout.DEFAULT_SIZE, 777, Short.MAX_VALUE)
                .addContainerGap())
        );
        headerPanel1Layout.setVerticalGroup(
            headerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(custHomeHeader1, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(headerPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(221, 6, 789, 108));

        contentPanel.setBackground(java.awt.SystemColor.activeCaptionBorder);

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

        custOrderHistoryTable.setFont(new java.awt.Font("SF Pro Text", 0, 11)); // NOI18N
        custOrderHistoryTable.setForeground(new java.awt.Color(0, 0, 102));
        custOrderHistoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order ID", "Food ID", "Food", "Price", "Quantity", "Total Price", "Ordered Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        custOrderHistoryTable.setToolTipText("");
        custOrderHistoryTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                custOrderHistoryTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(custOrderHistoryTable);
        if (custOrderHistoryTable.getColumnModel().getColumnCount() > 0) {
            custOrderHistoryTable.getColumnModel().getColumn(0).setPreferredWidth(120);
            custOrderHistoryTable.getColumnModel().getColumn(1).setPreferredWidth(60);
            custOrderHistoryTable.getColumnModel().getColumn(2).setPreferredWidth(120);
            custOrderHistoryTable.getColumnModel().getColumn(3).setPreferredWidth(60);
            custOrderHistoryTable.getColumnModel().getColumn(4).setPreferredWidth(60);
            custOrderHistoryTable.getColumnModel().getColumn(5).setPreferredWidth(70);
        }

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        orderHistoryLabel.setFont(new java.awt.Font("SF Pro Text", 1, 24)); // NOI18N
        orderHistoryLabel.setForeground(new java.awt.Color(0, 0, 102));
        orderHistoryLabel.setText("Order History");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(orderHistoryLabel)
                .addGap(23, 23, 23))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(orderHistoryLabel)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        orderHistoryLabel1.setFont(new java.awt.Font("SF Pro Text", 1, 24)); // NOI18N
        orderHistoryLabel1.setForeground(new java.awt.Color(0, 0, 102));
        orderHistoryLabel1.setText("Review");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(orderHistoryLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(orderHistoryLabel1)
                .addContainerGap())
        );

        reviewTextArea.setColumns(20);
        reviewTextArea.setForeground(new java.awt.Color(0, 0, 102));
        reviewTextArea.setRows(5);
        jScrollPane1.setViewportView(reviewTextArea);

        custSubmitReviewBtn.setBackground(new java.awt.Color(0, 48, 73));
        custSubmitReviewBtn.setFont(new java.awt.Font("SF Pro Text", 1, 14)); // NOI18N
        custSubmitReviewBtn.setForeground(new java.awt.Color(255, 255, 255));
        custSubmitReviewBtn.setText("SUBMIT REVIEW");
        custSubmitReviewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custSubmitReviewBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contentPanelLayout = new javax.swing.GroupLayout(contentPanel);
        contentPanel.setLayout(contentPanelLayout);
        contentPanelLayout.setHorizontalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(450, 450, 450)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(contentPanelLayout.createSequentialGroup()
                            .addComponent(custBackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(custSubmitReviewBtn))
                        .addGroup(contentPanelLayout.createSequentialGroup()
                            .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(contentPanelLayout.createSequentialGroup()
                                    .addGap(267, 267, 267)
                                    .addComponent(jLabel2)))
                            .addGap(20, 20, 20)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, Short.MAX_VALUE))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        contentPanelLayout.setVerticalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(141, 141, 141))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)))
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(custBackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(custSubmitReviewBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1.add(contentPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 120, -1, -1));

        userPanel.setBackground(java.awt.SystemColor.activeCaptionBorder);
        userPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userDisplayLabel.setBackground(new java.awt.Color(18, 18, 18));
        userDisplayLabel.setFont(new java.awt.Font("SF Pro Text", 1, 24)); // NOI18N
        userDisplayLabel.setForeground(new java.awt.Color(0, 0, 102));
        userDisplayLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userDisplayLabel.setText("USER ID");
        userPanel.add(userDisplayLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 40));

        userIDTF.setBackground(new java.awt.Color(18, 18, 18));
        userIDTF.setFont(new java.awt.Font("SF Pro Text", 1, 18)); // NOI18N
        userIDTF.setForeground(new java.awt.Color(0, 0, 102));
        userIDTF.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userIDTF.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 3, true));
        userPanel.add(userIDTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 48, 120, 60));

        jPanel1.add(userPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 6, 140, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/General/wood final.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 660));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void custBackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custBackBtnActionPerformed
        CustomerHome mgrBack = new CustomerHome(cust.getUserID(), cust.getUserPassword());
        mgrBack.setVisible(true);
        dispose();
        try {
            Logger.info("CustomerOrderHistory","User " + cust.getUserID() + " has attempted to view Customer Home page.");
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(CustomerOrderHistory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_custBackBtnActionPerformed

    private void custOrderHistoryTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_custOrderHistoryTableMouseClicked
        
    }//GEN-LAST:event_custOrderHistoryTableMouseClicked
    
    //Appends customer review into the text file
    private void custSubmitReviewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custSubmitReviewBtnActionPerformed
        FileHandling fh = new FileHandling();
        File reviewFile = new File("customerReviews.txt");
        DefaultTableModel orderHistoryTableModel = (DefaultTableModel) custOrderHistoryTable.getModel();
        try {
            Logger.info("CustomerOrderHistory",orderHistoryTableModel.getValueAt(custOrderHistoryTable.getSelectedRow(), 0).toString() +
                    orderHistoryTableModel.getValueAt(custOrderHistoryTable.getSelectedRow(), 1).toString());
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(CustomerOrderHistory.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            
            //Searches the text file to see if a review has already been submitted
            if (!"NA".equals(fh.locateItemInFile(orderHistoryTableModel.getValueAt(
                            custOrderHistoryTable.getSelectedRow(), 0).toString(), orderHistoryTableModel.getValueAt(
                            custOrderHistoryTable.getSelectedRow(), 1).toString(), reviewFile, 0, 2))){
                javax.swing.JOptionPane.showMessageDialog(null, "Order has already been reviewed.");
                reviewTextArea.setText(null);
            }
            else{
                //If the feedback for a particular order is not in the text file it will proceed to add it in
                if(custOrderHistoryTable.getSelectedRowCount() == 1){
                
                //If the length of the review is less than 4 characters it will show an error
                    if(reviewTextArea.getText().length()<4){
                        javax.swing.JOptionPane.showMessageDialog(null, "Error: Please enter a minimum of 4 characters.");
                    }

                    //If length of the review is between 4 and 300 characters in length it will store the data the table line into a variable
                    else if (reviewTextArea.getText().length()<300||reviewTextArea.getText().length()>4){
                        String reviewContents = orderHistoryTableModel.getValueAt(custOrderHistoryTable.getSelectedRow(), 0).toString() 
                                + "|" + cust.getUserID()
                                + "|" + orderHistoryTableModel.getValueAt(custOrderHistoryTable.getSelectedRow(), 1).toString()
                                + "|" + orderHistoryTableModel.getValueAt(custOrderHistoryTable.getSelectedRow(), 2).toString()
                                + "|" + orderHistoryTableModel.getValueAt(custOrderHistoryTable.getSelectedRow(), 6).toString()
                                + "|" + reviewTextArea.getText();
                        reviewTextArea.setText(null); // Text area is set back to null for user to provide next review
                        try {

                            // Appends the contents of the review into the file again
                            fh.appendToFile(reviewContents, reviewFile);
                            Logger.info("CustomerOrderHistory","User " + cust.getUserID() + " has submitted a review for Order ID " 
                                    + orderHistoryTableModel.getValueAt(custOrderHistoryTable.getSelectedRow(), 0).toString());
                            javax.swing.JOptionPane.showMessageDialog(null, "Order review submitted.");

                        } catch (IOException e) {
                            Logger.error("CustomerOrderHistory","Exception occurred - " + e.toString());
                            javax.swing.JOptionPane.showMessageDialog(null, "File cannot be opened.");
                        }
                    }
                    else{
                        javax.swing.JOptionPane.showMessageDialog(null, "Error: Only a maximum of 300 characters.");
                    }
                }
            }
            
        } catch (IOException e) {
            try {
                Logger.error("CustomerOrderHistory","Exception occurred - " + e.toString());
            } catch (IOException ex) {
                java.util.logging.Logger.getLogger(CustomerOrderHistory.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_custSubmitReviewBtnActionPerformed

    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contentPanel;
    private javax.swing.JButton custBackBtn;
    private javax.swing.JLabel custHomeHeader1;
    private javax.swing.JTable custOrderHistoryTable;
    private javax.swing.JButton custSubmitReviewBtn;
    private javax.swing.JPanel headerPanel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel orderHistoryLabel;
    private javax.swing.JLabel orderHistoryLabel1;
    private javax.swing.JTextArea reviewTextArea;
    private javax.swing.JLabel userDisplayLabel;
    private javax.swing.JLabel userIDTF;
    private javax.swing.JPanel userPanel;
    // End of variables declaration//GEN-END:variables
}
