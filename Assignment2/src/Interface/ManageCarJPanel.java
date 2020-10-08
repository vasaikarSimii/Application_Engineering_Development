/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Car;
import Business.CarFleetCatalog;
import java.awt.CardLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Seemin
 */
public class ManageCarJPanel extends javax.swing.JPanel {
    private CarFleetCatalog carList;
    private JPanel userProcessContainer;
    
    private CarFleetCatalog searchArray;
    /**
     * Creates new form ManageCarJPanel
     */
    ManageCarJPanel(JPanel userProcessContainer, CarFleetCatalog carList) {
        initComponents();
        this.carList = carList ;
        this.userProcessContainer = userProcessContainer;
        populateTable();
        availableCars();
       
        
    }
    
    private void populateTable(){
       DefaultTableModel dtm = (DefaultTableModel)tblCars.getModel();
        dtm.setRowCount(0);
        for (Car c : carList.getCar()){
            //define number of columns in that table 
            Object[] row = new Object[4];
            row[0] = c;
            row[1] = c.getManufacturerName();
            row[2] = c.getModelNumber();
            row[3] = c.getCity();
            
            dtm.addRow(row);
            
        } 
    }
    private void availableCars(){
        int availCarCount =0;
        int unavailcarCount = 0;
        for(Car c :carList.getCar()){
        if (c.isCheckAvailability()==true)
        {
            availCarCount++;
        }
        else unavailcarCount++;
        txtCarAvail.setText(Integer.toString(availCarCount));
        txtCarUnavail.setText(Integer.toString(unavailcarCount));
        
    }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ManageCarLbl = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        DeleteCarBtn = new javax.swing.JButton();
        ViewCarBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCars = new javax.swing.JTable();
        ViewCarLbl = new javax.swing.JLabel();
        findbyattributesJPanel = new javax.swing.JPanel();
        comboFilters = new javax.swing.JComboBox<>();
        seatAvailLbl1 = new javax.swing.JTextField();
        findCarbySeatBtn = new javax.swing.JButton();
        txtMinseats = new javax.swing.JTextField();
        txtmaxSeats = new javax.swing.JTextField();
        txtSearch = new javax.swing.JTextField();
        SearchBtn = new javax.swing.JButton();
        CarUnavailNoLbl = new javax.swing.JTextField();
        CarAvailNoLbl = new javax.swing.JTextField();
        txtCarUnavail = new javax.swing.JTextField();
        txtCarAvail = new javax.swing.JTextField();
        lastupdatebtn = new javax.swing.JButton();
        txtLastUpdate = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 255, 204));

        ManageCarLbl.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        ManageCarLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ManageCarLbl.setText("MANAGE CAR ENTRY");
        ManageCarLbl.setFocusable(false);
        ManageCarLbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        backBtn.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        backBtn.setText("<< Back");
        backBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        backBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        DeleteCarBtn.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        DeleteCarBtn.setText("Delete Car Entry");
        DeleteCarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteCarBtnActionPerformed(evt);
            }
        });

        ViewCarBtn.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        ViewCarBtn.setText("View Car Entry");
        ViewCarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewCarBtnActionPerformed(evt);
            }
        });

        tblCars.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Serial Number", "Manufacturor Name", "Model Number", "City"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblCars);
        if (tblCars.getColumnModel().getColumnCount() > 0) {
            tblCars.getColumnModel().getColumn(0).setResizable(false);
            tblCars.getColumnModel().getColumn(1).setResizable(false);
            tblCars.getColumnModel().getColumn(2).setResizable(false);
            tblCars.getColumnModel().getColumn(3).setResizable(false);
        }

        ViewCarLbl.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        ViewCarLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ViewCarLbl.setText("FIND CARS BY VARIOUS CATEGORIES");
        ViewCarLbl.setFocusable(false);
        ViewCarLbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        findbyattributesJPanel.setBackground(new java.awt.Color(255, 255, 255));
        findbyattributesJPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Find By Car Attributes.."));

        comboFilters.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        comboFilters.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "First Available Car", "List all cars by Manufacturer Name", "List all cars by Manufacturing year", "List all cars by Model Number", "List all cars by City", "List cars with expired maintenance certificate", "Find Car by Serial Number" }));
        comboFilters.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboFiltersActionPerformed(evt);
            }
        });

        seatAvailLbl1.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        seatAvailLbl1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        seatAvailLbl1.setText("Find Car by Number of Seats :");
        seatAvailLbl1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seatAvailLbl1ActionPerformed(evt);
            }
        });

        findCarbySeatBtn.setText("Find");
        findCarbySeatBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findCarbySeatBtnActionPerformed(evt);
            }
        });

        txtMinseats.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        txtMinseats.setText("Min Seats");

        txtmaxSeats.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        txtmaxSeats.setText("Max Seats");

        txtSearch.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        SearchBtn.setText("Search");
        SearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBtnActionPerformed(evt);
            }
        });

        CarUnavailNoLbl.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        CarUnavailNoLbl.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CarUnavailNoLbl.setText("Unavailable Cars :");
        CarUnavailNoLbl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CarUnavailNoLblActionPerformed(evt);
            }
        });

        CarAvailNoLbl.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        CarAvailNoLbl.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CarAvailNoLbl.setText("Available Cars :");
        CarAvailNoLbl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CarAvailNoLblActionPerformed(evt);
            }
        });

        txtCarUnavail.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        txtCarUnavail.setEnabled(false);

        txtCarAvail.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        txtCarAvail.setEnabled(false);

        javax.swing.GroupLayout findbyattributesJPanelLayout = new javax.swing.GroupLayout(findbyattributesJPanel);
        findbyattributesJPanel.setLayout(findbyattributesJPanelLayout);
        findbyattributesJPanelLayout.setHorizontalGroup(
            findbyattributesJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(findbyattributesJPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(findbyattributesJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(findbyattributesJPanelLayout.createSequentialGroup()
                        .addGroup(findbyattributesJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(comboFilters, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(findbyattributesJPanelLayout.createSequentialGroup()
                                .addComponent(seatAvailLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(txtMinseats, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(findbyattributesJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtmaxSeats, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                            .addComponent(txtSearch)))
                    .addGroup(findbyattributesJPanelLayout.createSequentialGroup()
                        .addComponent(CarAvailNoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(txtCarAvail, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(CarUnavailNoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(findbyattributesJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(findbyattributesJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(findCarbySeatBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(SearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtCarUnavail, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        findbyattributesJPanelLayout.setVerticalGroup(
            findbyattributesJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(findbyattributesJPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(findbyattributesJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboFilters, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(findbyattributesJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(findCarbySeatBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtmaxSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMinseats, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seatAvailLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(findbyattributesJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CarAvailNoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCarUnavail, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CarUnavailNoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCarAvail, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
        );

        lastupdatebtn.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        lastupdatebtn.setText("Find Last Update Date");
        lastupdatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastupdatebtnActionPerformed(evt);
            }
        });

        txtLastUpdate.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ManageCarLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(143, 143, 143))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(13, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(findbyattributesJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DeleteCarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastupdatebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(txtLastUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ViewCarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(250, 250, 250))
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(ViewCarLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(backBtn)
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ManageCarLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(DeleteCarBtn)
                        .addGap(18, 18, 18)
                        .addComponent(ViewCarBtn)
                        .addGap(32, 32, 32)
                        .addComponent(lastupdatebtn)
                        .addGap(21, 21, 21)
                        .addComponent(txtLastUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ViewCarLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(findbyattributesJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void DeleteCarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteCarBtnActionPerformed
        int selectedRow = tblCars.getSelectedRow();
        
        if (selectedRow >=0){
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null, "Would you like to delete the car details?", "Warning", JOptionPane.WARNING_MESSAGE);
            if (dialogResult == JOptionPane.YES_OPTION){
                Car car = (Car) tblCars.getValueAt(selectedRow, 0);
                carList.deleteCar(car);
                populateTable();
            }
        }
        else 
            JOptionPane.showMessageDialog(null, "Please select a row from table first", "Warning", JOptionPane.WARNING_MESSAGE);
        
        
    }//GEN-LAST:event_DeleteCarBtnActionPerformed

    private void ViewCarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewCarBtnActionPerformed
        int selectedRow = tblCars.getSelectedRow();
        if(selectedRow <0){
            JOptionPane.showMessageDialog(null, "Please select a row from table first", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else{
            Car car = (Car)tblCars.getValueAt(selectedRow, 0);
            ViewCarJPanel panel = new ViewCarJPanel(userProcessContainer, car);
            userProcessContainer.add("ViewCarJPanel", panel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
            
            }
            
    }//GEN-LAST:event_ViewCarBtnActionPerformed

    private void CarAvailNoLblActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CarAvailNoLblActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CarAvailNoLblActionPerformed

    private void CarUnavailNoLblActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CarUnavailNoLblActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CarUnavailNoLblActionPerformed

    private void SearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBtnActionPerformed
      //Filters
      //First Available Car, List all cars by Manufacturer Name, List all cars by Manufacturing year, List all cars by Model Number, List all cars by City, List cars with expired maintenance certificate, Find Car by Serial Number
      DefaultComboBoxModel dcm = (DefaultComboBoxModel) comboFilters.getModel();
        if (dcm.getSelectedItem().equals("First Available Car")){
            
             DefaultTableModel dtm = (DefaultTableModel)tblCars.getModel();
               dtm.setRowCount(0);
               for(Car c :carList.getCar()){
                   if(Boolean.toString(c.isCheckAvailability()).equals("true")){
                    Object[] row = new Object[4];
                    row[0] = c;
                    row[1] = c.getManufacturerName();
                    row[2] = c.getModelNumber();
                    row[3] = c.getCity();  
                    dtm.addRow(row);
                    
                   }
               }
              
        }
        else if(dcm.getSelectedItem().equals("List all cars by Manufacturer Name")){
          DefaultTableModel dtm = (DefaultTableModel)tblCars.getModel();
          dtm.setRowCount(0);
           
                   for(Car c :carList.getCar()){
                   if(c.getManufacturerName().equals(txtSearch.getText())){
                       
                       Object[] row = new Object[4];
                        row[0] = c;
                   row[1] = c.getManufacturerName();
                   row[2] = c.getModelNumber();
                   row[3] = c.getCity();  
                   dtm.addRow(row);
                   }

               }
               if(dtm.getRowCount()<=0)
            {
                JOptionPane.showMessageDialog(null, "The text entered doesn't match");
                populateTable();
            }
            
            
        }
        
        else if(dcm.getSelectedItem().equals("List all cars by Manufacturing year")){
            DefaultTableModel dtm = (DefaultTableModel)tblCars.getModel();
               dtm.setRowCount(0);
               
               for(Car c :carList.getCar()){
                   if(Integer.toString(c.getDateofManufacturing()).equals(txtSearch.getText())){
                    Object[] row = new Object[4];
                    row[0] = c;
                    row[1] = c.getManufacturerName();
                    row[2] = c.getModelNumber();
                    row[3] = c.getCity();  
                    dtm.addRow(row);
                    
                   }
               }
               if(dtm.getRowCount()<=0)
            {
                JOptionPane.showMessageDialog(null, "The text entered doesn't match");
                populateTable();
            }
            
        
        }
        else if(dcm.getSelectedItem().equals("List all cars by Model Number")){
            
            DefaultTableModel dtm = (DefaultTableModel)tblCars.getModel();
               dtm.setRowCount(0);
               
               for(Car c :carList.getCar()){
                   if(c.getModelNumber().equals(txtSearch.getText())){
                    Object[] row = new Object[4];
                    row[0] = c;
                    row[1] = c.getManufacturerName();
                    row[2] = c.getModelNumber();
                    row[3] = c.getCity();  
                    dtm.addRow(row);
                    
                   }
               }
               if(dtm.getRowCount()<=0)
            {
                JOptionPane.showMessageDialog(null, "The text entered doesn't match");
                populateTable();
            }
            
        
        }
        else if(dcm.getSelectedItem().equals("List all cars by City")){
            DefaultTableModel dtm = (DefaultTableModel)tblCars.getModel();
               dtm.setRowCount(0);
               
               for(Car c :carList.getCar()){
                   if(c.getCity().equals(txtSearch.getText())){
                       
                    Object[] row = new Object[4];
                    row[0] = c;
                    row[1] = c.getManufacturerName();
                    row[2] = c.getModelNumber();
                    row[3] = c.getCity();  
                    dtm.addRow(row);
                    
                   }
               }
               if(dtm.getRowCount()<=0)
            {
                JOptionPane.showMessageDialog(null, "The text entered doesn't match");
                populateTable();
            }
            
            
        
        }
        else if(dcm.getSelectedItem().equals("List cars with expired maintenance certificate")){
            
            DefaultTableModel dtm = (DefaultTableModel)tblCars.getModel();
               dtm.setRowCount(0);
               
               for(Car c :carList.getCar()){
                     
                   if(Boolean.toString(c.isMaintenanceCertificateExpirtDate()).equals("true")){
                    Object[] row = new Object[4];
                    row[0] = c;
                    row[1] = c.getManufacturerName();
                    row[2] = c.getModelNumber();
                    row[3] = c.getCity();  
                    dtm.addRow(row);
                    
                   }
               }
               if(dtm.getRowCount()<=0)
            {
                JOptionPane.showMessageDialog(null, "The text entered doesn't match");
                populateTable();
            }
        
        
        }
        else if(dcm.getSelectedItem().equals("Find Car by Serial Number")){
            
            DefaultTableModel dtm = (DefaultTableModel)tblCars.getModel();
               dtm.setRowCount(0);
               
               for(Car c :carList.getCar()){
                   if(c.getSerialNumber().equals(txtSearch.getText())){
                    Object[] row = new Object[4];
                    row[0] = c;
                    row[1] = c.getManufacturerName();
                    row[2] = c.getModelNumber();
                    row[3] = c.getCity();  
                    dtm.addRow(row);
                    
                   }
               }
               if(dtm.getRowCount()<=0)
            {
                JOptionPane.showMessageDialog(null, "The text entered doesn't match");
                populateTable();
            }
        
        }
    }//GEN-LAST:event_SearchBtnActionPerformed

    private void findCarbySeatBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findCarbySeatBtnActionPerformed

    int minSeat = Integer.parseInt(txtMinseats.getText());
    int maxSeat = Integer.parseInt(txtmaxSeats.getText());
    DefaultTableModel dtm = (DefaultTableModel)tblCars.getModel();
    dtm.setRowCount(0);
    
    for(Car c : carList.getCar()){
        if( c.isCheckAvailability() == true && minSeat == c.getMinNumOfSeats() && c.getMaxNumOfSeats() <= maxSeat ){
                {
                    Object[] row = new Object[dtm.getColumnCount()];
                    row[0] = c;
                    row[1] = c.getManufacturerName();
                    row[2] = c.getModelNumber();
                    row[3] = c.getCity();  
                    
                    dtm.addRow(row);
                    
                   } 
        }
    }
    
    }//GEN-LAST:event_findCarbySeatBtnActionPerformed

    private void seatAvailLbl1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seatAvailLbl1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seatAvailLbl1ActionPerformed

    private void comboFiltersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboFiltersActionPerformed
       
        

    }//GEN-LAST:event_comboFiltersActionPerformed

    private void lastupdatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastupdatebtnActionPerformed
//      String LastUpdateDate = car.getLastUpdated();
//        txtLastUpdate.setText(LastUpdateDate);
        
        
    }//GEN-LAST:event_lastupdatebtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CarAvailNoLbl;
    private javax.swing.JTextField CarUnavailNoLbl;
    private javax.swing.JButton DeleteCarBtn;
    private javax.swing.JLabel ManageCarLbl;
    private javax.swing.JButton SearchBtn;
    private javax.swing.JButton ViewCarBtn;
    private javax.swing.JLabel ViewCarLbl;
    private javax.swing.JButton backBtn;
    private javax.swing.JComboBox<String> comboFilters;
    private javax.swing.JButton findCarbySeatBtn;
    private javax.swing.JPanel findbyattributesJPanel;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton lastupdatebtn;
    private javax.swing.JTextField seatAvailLbl1;
    private javax.swing.JTable tblCars;
    private javax.swing.JTextField txtCarAvail;
    private javax.swing.JTextField txtCarUnavail;
    private javax.swing.JTextField txtLastUpdate;
    private javax.swing.JTextField txtMinseats;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtmaxSeats;
    // End of variables declaration//GEN-END:variables
}