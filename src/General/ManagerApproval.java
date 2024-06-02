package General;

import Utilities.FileHandling;
import Utilities.UserRegistrationInfo;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import javax.swing.table.DefaultTableModel;


public class ManagerApproval extends javax.swing.JFrame {
    
    UserRegistrationInfo mgr = new UserRegistrationInfo();
    FileHandling fh  = new FileHandling();
    private final String MGRACCFILE = "mgrAccount.txt";
   
    public ManagerApproval(String userID, String userPassword) throws IOException {
        initComponents();
        setTitle("APU Cafeteria Ordering System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        mgr.setUserID(userID);
        mgr.setUserPassword(userPassword);
        loadManagerTable();
    }
    
    //Used to load the mannager accounts table
    private void loadManagerTable() throws IOException {
        //Creating object for the JTable
        DefaultTableModel mgrApprovalTableModel = (DefaultTableModel) mgrApprovalTable.getModel();
        mgrApprovalTableModel.setRowCount(0); //Setting the row count back to 0
        File file = new File(MGRACCFILE);
        
        try {
            String line;
            BufferedReader br = new BufferedReader(new FileReader(file));
            try{
                while((line = br.readLine()) != null){  
                    
                    //Splits the line into multiple sections
                    String data[] = line.split("\\|");     
                    //Adds each line into the table row by row
                    mgrApprovalTableModel.addRow(new Object[] {data[0], data[1], data[3], data[4]});
                }
                br.close();
            } catch (IOException e) {
                Logger.error("Approval","Exception occurred - " + e.toString());
                JOptionPane.showMessageDialog(null, "Error: File cannot be read.");
            }            
        }catch (FileNotFoundException e){
            Logger.error("Approval","Exception occurred - " + e.toString());
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        headerPanel = new javax.swing.JPanel();
        custHomeHeader = new javax.swing.JLabel();
        contentPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        mgrApprovalTable = new javax.swing.JTable();
        mgrApprovalBtn = new javax.swing.JButton();
        mgrRejectBtn = new javax.swing.JButton();
        mgrBackBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(244, 244, 244));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        headerPanel.setBackground(new java.awt.Color(255, 255, 255));

        custHomeHeader.setFont(new java.awt.Font("SF Pro Text", 1, 48)); // NOI18N
        custHomeHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        custHomeHeader.setText("MANAGER APPROVAL");
        custHomeHeader.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        custHomeHeader.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(custHomeHeader, javax.swing.GroupLayout.DEFAULT_SIZE, 930, Short.MAX_VALUE)
                .addContainerGap())
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(custHomeHeader, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(headerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 23, -1, -1));

        contentPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("SF Pro Text", 1, 18)); // NOI18N

        mgrApprovalTable.setFont(new java.awt.Font("SF Pro Text", 0, 12)); // NOI18N
        mgrApprovalTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Manager ID", "Name", "Email", "Approval Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(mgrApprovalTable);

        javax.swing.GroupLayout contentPanelLayout = new javax.swing.GroupLayout(contentPanel);
        contentPanel.setLayout(contentPanelLayout);
        contentPanelLayout.setHorizontalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 721, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(183, 183, 183)
                .addComponent(jLabel2))
        );
        contentPanelLayout.setVerticalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addGap(345, 345, 345)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.add(contentPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 143, 735, -1));

        mgrApprovalBtn.setBackground(new java.awt.Color(0, 48, 73));
        mgrApprovalBtn.setFont(new java.awt.Font("SF Pro Text", 1, 24)); // NOI18N
        mgrApprovalBtn.setForeground(new java.awt.Color(255, 255, 255));
        mgrApprovalBtn.setText("APPROVE");
        mgrApprovalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mgrApprovalBtnActionPerformed(evt);
            }
        });
        jPanel1.add(mgrApprovalBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(839, 179, 171, 71));

        mgrRejectBtn.setBackground(new java.awt.Color(0, 48, 73));
        mgrRejectBtn.setFont(new java.awt.Font("SF Pro Text", 1, 24)); // NOI18N
        mgrRejectBtn.setForeground(new java.awt.Color(255, 255, 255));
        mgrRejectBtn.setText("REJECT");
        mgrRejectBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mgrRejectBtnActionPerformed(evt);
            }
        });
        jPanel1.add(mgrRejectBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(839, 299, 171, 70));

        mgrBackBtn.setBackground(new java.awt.Color(0, 48, 73));
        mgrBackBtn.setFont(new java.awt.Font("SF Pro Text", 1, 24)); // NOI18N
        mgrBackBtn.setForeground(new java.awt.Color(255, 255, 255));
        mgrBackBtn.setText("BACK");
        mgrBackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mgrBackBtnActionPerformed(evt);
            }
        });
        jPanel1.add(mgrBackBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(839, 419, 171, 71));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/General/wood final.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 620));

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
            Logger.info("Approval","Manager " + mgr.getUserID() + " has attempted to view Manager Home page.");
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(ManagerApproval.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mgrBackBtnActionPerformed

    //Removes managers credentials from both the table and the text file
    private void mgrRejectBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mgrRejectBtnActionPerformed
        DefaultTableModel mgrApprovalTableModel = (DefaultTableModel) mgrApprovalTable.getModel();
        String managerID;
        
        if (mgrApprovalTable.getSelectedRowCount() >= 1) {
            
            // Uses the selected row from the table and stores it in a variable
            managerID = mgrApprovalTableModel.getValueAt(mgrApprovalTable.getSelectedRow(),0).toString();
            File file = new File(MGRACCFILE);

            // Removes the selected row from the file entirely
            fh.removeLine(file, 0, managerID);

            try {
                // Loads the manager table again
                loadManagerTable();
            } catch (IOException ex) {
                java.util.logging.Logger.getLogger(ManagerApproval.class.getName()).log(Level.SEVERE, null, ex);
            }
        
            JOptionPane.showMessageDialog(null, "Manager " + managerID + " has been rejected successfully.");
            try {
                Logger.info("Approval","Manager " + mgr.getUserID() + " has rejected Manager " + managerID + ".");
            } catch (IOException ex) {
                java.util.logging.Logger.getLogger(ManagerApproval.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } else if (mgrApprovalTable.getRowCount() == 0){
            JOptionPane.showMessageDialog(null, "Table is empty!");
        } else {
            JOptionPane.showMessageDialog(null, "No row is selected for rejection!");
        }
        
    }//GEN-LAST:event_mgrRejectBtnActionPerformed

    //Edits the managers approval status to "APPROVED"
    private void mgrApprovalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mgrApprovalBtnActionPerformed
        DefaultTableModel mgrApprovalTableModel = (DefaultTableModel) mgrApprovalTable.getModel();
        String managerID;
        if (mgrApprovalTable.getSelectedRowCount() >= 1) {
            
           // Uses the selected row from the table and stores it in a variable
            managerID = mgrApprovalTableModel.getValueAt(mgrApprovalTable.getSelectedRow(),0).toString();
            File file = new File(MGRACCFILE);

            // Rewrites the contents of the file with the new editted line for the manager to be "APPROVED"
            fh.rewriteContent(file, 0, managerID, "APPROVED");

            try {
                // Loads the manager table again
                loadManagerTable();
            } catch (IOException ex) {
                java.util.logging.Logger.getLogger(ManagerApproval.class.getName()).log(Level.SEVERE, null, ex);
            }
        
            JOptionPane.showMessageDialog(null, "Manager " + managerID + " has been approved successfully.");
            try {
                Logger.info("Approval","Manager " + mgr.getUserID() + " has approved Manager " + managerID + ".");
            } catch (IOException ex) {
                java.util.logging.Logger.getLogger(ManagerApproval.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } else if (mgrApprovalTable.getRowCount() == 0){
            JOptionPane.showMessageDialog(null, "Table is empty!");
        } else {
            JOptionPane.showMessageDialog(null, "No row is selected for approval!");
        }
        
    }//GEN-LAST:event_mgrApprovalBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contentPanel;
    private javax.swing.JLabel custHomeHeader;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton mgrApprovalBtn;
    private javax.swing.JTable mgrApprovalTable;
    private javax.swing.JButton mgrBackBtn;
    private javax.swing.JButton mgrRejectBtn;
    // End of variables declaration//GEN-END:variables
}
