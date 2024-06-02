package General;


import Utilities.FileHandling;
import Utilities.UserRegistrationInfo;
import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ManagerMenu extends javax.swing.JFrame implements Menu {
      
    private String foodID;
    private String food;
    private double price;
    private String type;
    private String status;
    
    UserRegistrationInfo mgr = new UserRegistrationInfo();
        
    // Create new form "ManagerMenu"
    public ManagerMenu(String userID, String userPassword) {
        initComponents();
        setContentPane(mainPanel);
        setTitle("APU Cafeteria Ordering System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        setSize(1080,635); 

        // Set the user ID
        mgr.setUserID(userID);
        mgr.setUserPassword(userPassword);
        userIDTF.setText(userID);

        // Load the menu as soon as the window loads
        loadMenu();
        
        // Set a formatted date and time in the datetime text field
        LocalDateTime dateObj = LocalDateTime.now();
        DateTimeFormatter formatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = dateObj.format(formatObj);
        datetimeTF.setText(formattedDate);
        datetimeTF.repaint();
    }
    
    // Clearing the input for the menu
    @Override
    public void refreshMenuSelection() {
        foodIDTF.setText(null);
        foodTF.setText(null);
        priceTF.setText(null);
        typeDDL.setSelectedItem("Select type");
        statusDDL.setSelectedItem("Select type");
    }

    // To load the menu by putting everything in menu.txt to menu table
    @Override
    public void loadMenu() {
        DefaultTableModel menuTableModel = (DefaultTableModel) menuTable.getModel();
        menuTableModel.setRowCount(0);
        File file = new File(MENUFILE);
        try {
            String str;
            BufferedReader br = new BufferedReader(new FileReader(file));
            try {
                while((str = br.readLine()) != null){
                    // Spliting the data into different section using the | delimeter
                    String data[] = str.split("\\|");
                    // Adding the data into the menu table
                    menuTableModel.addRow(new Object[]{data[0], data[1], data[2], data[3], data[4]});
                }
                br.close();
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Error: File cannot be read.");
                try {
                    Logger.error("UpdateMenu","IOException occured: " + e.getMessage());
                } catch (IOException ex) {
                    java.util.logging.Logger.getLogger(ManagerMenu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error: File does not exist!");
            try {
                Logger.error("UpdateMenu","FileNotFoundException occured: " + e.getMessage());
            } catch (IOException ex) {
                java.util.logging.Logger.getLogger(ManagerMenu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        backButton = new javax.swing.JButton();
        refreshButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        menuTable = new javax.swing.JTable();
        menuLabel = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        typeLabel = new javax.swing.JLabel();
        typeDDL = new javax.swing.JComboBox<>();
        statusLabel = new javax.swing.JLabel();
        statusDDL = new javax.swing.JComboBox<>();
        priceTF = new javax.swing.JTextField();
        priceLabel = new javax.swing.JLabel();
        foodTF = new javax.swing.JTextField();
        foodLabel = new javax.swing.JLabel();
        foodIDTF = new javax.swing.JTextField();
        foodIDLabel = new javax.swing.JLabel();
        userDisplayLabel = new javax.swing.JLabel();
        userIDTF = new javax.swing.JLabel();
        datetimeTF = new javax.swing.JTextField();
        timeLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        welcomeLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setMinimumSize(new java.awt.Dimension(1080, 600));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainPanel.setBackground(new java.awt.Color(244, 244, 244));
        mainPanel.setPreferredSize(new java.awt.Dimension(1080, 600));
        mainPanel.setLayout(null);

        backButton.setBackground(new java.awt.Color(0, 48, 73));
        backButton.setFont(new java.awt.Font("SF Pro Text", 1, 18)); // NOI18N
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        mainPanel.add(backButton);
        backButton.setBounds(18, 168, 117, 78);

        refreshButton.setBackground(new java.awt.Color(0, 48, 73));
        refreshButton.setFont(new java.awt.Font("SF Pro Text", 1, 18)); // NOI18N
        refreshButton.setForeground(new java.awt.Color(255, 255, 255));
        refreshButton.setText("Refresh");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });
        mainPanel.add(refreshButton);
        refreshButton.setBounds(18, 504, 117, 78);

        menuTable.setFont(new java.awt.Font("SF Pro Text", 0, 11)); // NOI18N
        menuTable.setForeground(new java.awt.Color(0, 0, 51));
        menuTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Food ID", "Food", "Price", "Type", "Status"
            }
        ));
        menuTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(menuTable);
        if (menuTable.getColumnModel().getColumnCount() > 0) {
            menuTable.getColumnModel().getColumn(0).setResizable(false);
            menuTable.getColumnModel().getColumn(1).setResizable(false);
            menuTable.getColumnModel().getColumn(2).setResizable(false);
            menuTable.getColumnModel().getColumn(4).setResizable(false);
        }

        mainPanel.add(jScrollPane1);
        jScrollPane1.setBounds(170, 204, 489, 399);

        menuLabel.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        menuLabel.setForeground(new java.awt.Color(242, 242, 242));
        menuLabel.setText("MENU");
        mainPanel.add(menuLabel);
        menuLabel.setBounds(170, 168, 66, 24);

        addButton.setBackground(new java.awt.Color(0, 48, 73));
        addButton.setFont(new java.awt.Font("SF Pro Text", 1, 18)); // NOI18N
        addButton.setForeground(new java.awt.Color(255, 255, 255));
        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        mainPanel.add(addButton);
        addButton.setBounds(830, 490, 105, 96);

        deleteButton.setBackground(new java.awt.Color(0, 48, 73));
        deleteButton.setFont(new java.awt.Font("SF Pro Text", 1, 18)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        mainPanel.add(deleteButton);
        deleteButton.setBounds(950, 490, 102, 96);

        updateButton.setBackground(new java.awt.Color(0, 48, 73));
        updateButton.setFont(new java.awt.Font("SF Pro Text", 1, 18)); // NOI18N
        updateButton.setForeground(new java.awt.Color(255, 255, 255));
        updateButton.setText("Update");
        updateButton.setMaximumSize(new java.awt.Dimension(76, 28));
        updateButton.setMinimumSize(new java.awt.Dimension(76, 28));
        updateButton.setPreferredSize(new java.awt.Dimension(76, 28));
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        mainPanel.add(updateButton);
        updateButton.setBounds(700, 490, 105, 96);

        typeLabel.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        typeLabel.setForeground(new java.awt.Color(242, 242, 242));
        typeLabel.setText("Type :");
        mainPanel.add(typeLabel);
        typeLabel.setBounds(710, 410, 61, 24);

        typeDDL.setFont(new java.awt.Font("SF Pro Text", 0, 12)); // NOI18N
        typeDDL.setForeground(new java.awt.Color(18, 18, 18));
        typeDDL.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select type", "DRINK", "SNACKS", "DESERT" }));
        mainPanel.add(typeDDL);
        typeDDL.setBounds(710, 440, 93, 22);

        statusLabel.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        statusLabel.setForeground(new java.awt.Color(242, 242, 242));
        statusLabel.setText("Status :");
        mainPanel.add(statusLabel);
        statusLabel.setBounds(940, 410, 61, 20);

        statusDDL.setFont(new java.awt.Font("SF Pro Text", 0, 12)); // NOI18N
        statusDDL.setForeground(new java.awt.Color(18, 18, 18));
        statusDDL.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select type", "Available", "Out of Stock" }));
        mainPanel.add(statusDDL);
        statusDDL.setBounds(950, 440, 99, 22);

        priceTF.setFont(new java.awt.Font("SF Pro Text", 0, 24)); // NOI18N
        priceTF.setForeground(new java.awt.Color(0, 0, 51));
        priceTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceTFActionPerformed(evt);
            }
        });
        mainPanel.add(priceTF);
        priceTF.setBounds(710, 350, 362, 45);

        priceLabel.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        priceLabel.setForeground(new java.awt.Color(242, 242, 242));
        priceLabel.setText("Price :");
        mainPanel.add(priceLabel);
        priceLabel.setBounds(710, 320, 75, 24);

        foodTF.setFont(new java.awt.Font("SF Pro Text", 0, 24)); // NOI18N
        foodTF.setForeground(new java.awt.Color(0, 0, 51));
        foodTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foodTFActionPerformed(evt);
            }
        });
        mainPanel.add(foodTF);
        foodTF.setBounds(710, 250, 362, 47);

        foodLabel.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        foodLabel.setForeground(new java.awt.Color(242, 242, 242));
        foodLabel.setText("Food :");
        mainPanel.add(foodLabel);
        foodLabel.setBounds(710, 210, 65, 24);

        foodIDTF.setFont(new java.awt.Font("SF Pro Text", 0, 24)); // NOI18N
        foodIDTF.setForeground(new java.awt.Color(0, 0, 51));
        foodIDTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foodIDTFActionPerformed(evt);
            }
        });
        mainPanel.add(foodIDTF);
        foodIDTF.setBounds(710, 150, 362, 42);

        foodIDLabel.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        foodIDLabel.setForeground(new java.awt.Color(242, 242, 242));
        foodIDLabel.setText("Food ID:");
        mainPanel.add(foodIDLabel);
        foodIDLabel.setBounds(710, 120, 82, 24);

        userDisplayLabel.setBackground(new java.awt.Color(18, 18, 18));
        userDisplayLabel.setFont(new java.awt.Font("SF Pro Text", 1, 24)); // NOI18N
        userDisplayLabel.setForeground(new java.awt.Color(242, 242, 242));
        userDisplayLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userDisplayLabel.setText("USER ID");
        mainPanel.add(userDisplayLabel);
        userDisplayLabel.setBounds(18, 12, 117, 48);

        userIDTF.setBackground(new java.awt.Color(18, 18, 18));
        userIDTF.setFont(new java.awt.Font("SF Pro Text", 1, 18)); // NOI18N
        userIDTF.setForeground(new java.awt.Color(242, 242, 242));
        userIDTF.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userIDTF.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(242, 242, 242), 3, true));
        mainPanel.add(userIDTF);
        userIDTF.setBounds(24, 66, 128, 84);

        datetimeTF.setEditable(false);
        datetimeTF.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        datetimeTF.setForeground(new java.awt.Color(0, 0, 51));
        datetimeTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        datetimeTF.setEnabled(false);
        datetimeTF.setFocusable(false);
        datetimeTF.setRequestFocusEnabled(false);
        datetimeTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datetimeTFActionPerformed(evt);
            }
        });
        mainPanel.add(datetimeTF);
        datetimeTF.setBounds(204, 125, 224, 25);

        timeLabel.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        timeLabel.setForeground(new java.awt.Color(242, 242, 242));
        timeLabel.setText("Time:");
        mainPanel.add(timeLabel);
        timeLabel.setBounds(204, 86, 87, 33);

        welcomeLabel.setBackground(new java.awt.Color(18, 18, 18));
        welcomeLabel.setFont(new java.awt.Font("SF Pro Text", 1, 24)); // NOI18N
        welcomeLabel.setForeground(new java.awt.Color(0, 0, 51));
        welcomeLabel.setText("Welcome To The APU Cafeteria Ordering System !");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 25, Short.MAX_VALUE)
                    .addComponent(welcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 25, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(welcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        mainPanel.add(jPanel1);
        jPanel1.setBounds(250, 10, 640, 80);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/General/wood final.png"))); // NOI18N
        mainPanel.add(jLabel1);
        jLabel1.setBounds(0, 0, 1327, 886);

        getContentPane().add(mainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        try {
            ManagerHome mgrHome = new ManagerHome(mgr.getUserID(), mgr.getUserPassword());
            mgrHome.setVisible(true);
            this.dispose();
            Logger.info("UpdateMenu","Manager " + mgr.getUserID() + " has attempted to view Manager Home page.");
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(ManagerMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_backButtonActionPerformed

    // Putting everything from the menu table to menu.txt
    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        DefaultTableModel menuTableModel = (DefaultTableModel) menuTable.getModel();
        try {
            File file = new File(MENUFILE);
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            
            // Getting the data in menu table by row and column
            for(int row = 0; row < menuTableModel.getRowCount(); row++) {
                for(int col = 0; col < menuTableModel.getColumnCount(); col++) {
                    String data = (String)menuTableModel.getValueAt(row, col);
                    // Appending | delimeter after every entry
                    bw.write(data + "|");
                }
                bw.newLine();
            }
            // REMEMBER TO CLOSE BufferedWriter FIRST !
            bw.close();
            fw.close();
        } catch (IOException e) {
            try {
                Logger.error("UpdateMenu","Exception occurred - " + e.toString());
            } catch (IOException ex) {
                java.util.logging.Logger.getLogger(ManagerMenu.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }

        // Clearing the input for the menu
        refreshMenuSelection();
    }//GEN-LAST:event_updateButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        
        FileHandling fh = new FileHandling();
        File file = new File(MENUFILE);

        // Getting user input
        foodID = foodIDTF.getText().toUpperCase();
        try {
            // If the Food ID already exists, show error
            if (!"NA".equals(fh.locateItemInFile(foodID, file, 0))) {
                Logger.error("UpdateMenu","Exception occured: User " + mgr.getUserID() + " entered an existing Food ID.");
                JOptionPane.showMessageDialog(null, "Error: Food ID already exist.");
            
            // If the Food ID doesn't exist, proceed
            } else {
                food = foodTF.getText().toUpperCase();
                
                try {
                    String strPrice = priceTF.getText();
                    price = Double.parseDouble(strPrice);
                    price = Math.round(price * 100.0) / 100.0;
                } catch (NumberFormatException e){
                    // Throw error if it can't be converted to double
                    Logger.error("UpdateMenu","Exception occurred - " + e.toString());
                    JOptionPane.showMessageDialog(null, "Please insert numbers only.");
                }
                type = typeDDL.getSelectedItem().toString().toUpperCase();
                status = statusDDL.getSelectedItem().toString().toUpperCase();


                // If any of the 5 fields is left blank then show a message, if not, put it into menu.txt & menu
                if(foodIDTF.getText().equals("") || foodTF.getText().equals("") || priceTF.getText().equals("") || 
                    typeDDL.getSelectedItem().toString().equals("Select type") || statusDDL.getSelectedItem().toString().equals("Select type")) {
                    // If any of the 5 fields is left blank then show a message
                    Logger.error("UpdateMenu","Exception occured: User " + mgr.getUserID() + " did not enter all data fields.");
                    JOptionPane.showMessageDialog(null, "Error: Please enter all data fields!");
 
                } else {
                    DefaultTableModel menuTableModel = (DefaultTableModel) menuTable.getModel();

                    // Store inputted data into a String array
                    String[] data = {foodID, food, Double.toString(price), type, status};

                    // Add string array data to menu
                    menuTableModel.addRow(data);
                    Logger.info("UpdateMenu","User " + mgr.getUserID() + " has added Food ID " + foodIDTF.getText() + "into the Menu.");
                    JOptionPane.showMessageDialog(null,"Data added successfully!");

                    // Add string data to menu.txt
                    try {
                        String fileData = foodID + "|" + food + "|" + price + "|" + type + "|" + status;
                        fh.appendToFile(fileData, file);
                    } catch (IOException e) {
                        Logger.error("UpdateMenu","Exception occurred - " + e.toString());
                        JOptionPane.showMessageDialog(null, "File does not exist!");
                    }

                    // Clearing the input for the menu
                    refreshMenuSelection();
                }
            }
        } catch (HeadlessException | IOException e) {
            try {
                Logger.error("UpdateMenu","Exception occurred - " + e.toString());
            } catch (IOException ex) {
                java.util.logging.Logger.getLogger(ManagerMenu.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }//GEN-LAST:event_addButtonActionPerformed

    // Delete selected rows
    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        DefaultTableModel menuTableModel = (DefaultTableModel) menuTable.getModel();
        
        if (menuTable.getSelectedRowCount() >= 1) {
            menuTableModel.removeRow(menuTable.getSelectedRow());
            try {
                Logger.error("UpdateMenu","User " + mgr.getUserID() + " deleted an item from the menu.");
            } catch (IOException ex) {
                java.util.logging.Logger.getLogger(ManagerMenu.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null, "Item successfully deleted from menu!");
            
        } else if (menuTable.getRowCount() == 0){
            javax.swing.JOptionPane.showMessageDialog(null, "Table is empty!");
        } else {
            javax.swing.JOptionPane.showMessageDialog(null, "No row is selected for deleting!");
        }
    
        // Clearing the input for the menu
        refreshMenuSelection();
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void priceTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceTFActionPerformed
   
    }//GEN-LAST:event_priceTFActionPerformed

    private void foodTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foodTFActionPerformed

    }//GEN-LAST:event_foodTFActionPerformed

    private void foodIDTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foodIDTFActionPerformed

    }//GEN-LAST:event_foodIDTFActionPerformed

    private void datetimeTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datetimeTFActionPerformed

    }//GEN-LAST:event_datetimeTFActionPerformed

    // Refreshes the table by putting everything in menu.txt to menu table
    // - To avoid someone making changes by clicking on menu table and doesn't update
    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        loadMenu();
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void menuTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuTableMouseClicked
        DefaultTableModel menuTableModel = (DefaultTableModel) menuTable.getModel();
        
        foodIDTF.setText(menuTableModel.getValueAt(menuTable.getSelectedRow(),0 ).toString());
        foodTF.setText(menuTableModel.getValueAt(menuTable.getSelectedRow(),1 ).toString());
        priceTF.setText(menuTableModel.getValueAt(menuTable.getSelectedRow(),2 ).toString());
        typeDDL.setSelectedItem("Select type");
        statusDDL.setSelectedItem("Select type");
    }//GEN-LAST:event_menuTableMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton backButton;
    private javax.swing.JTextField datetimeTF;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel foodIDLabel;
    private javax.swing.JTextField foodIDTF;
    private javax.swing.JLabel foodLabel;
    private javax.swing.JTextField foodTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel menuLabel;
    private javax.swing.JTable menuTable;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JTextField priceTF;
    private javax.swing.JButton refreshButton;
    private javax.swing.JComboBox<String> statusDDL;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JLabel timeLabel;
    private javax.swing.JComboBox<String> typeDDL;
    private javax.swing.JLabel typeLabel;
    private javax.swing.JButton updateButton;
    private javax.swing.JLabel userDisplayLabel;
    private javax.swing.JLabel userIDTF;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables
    
}
