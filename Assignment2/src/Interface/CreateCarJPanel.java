/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Car;
import Business.CarFleetCatalog;
import javax.swing.JPanel;
import java.awt.CardLayout;
import java.awt.Checkbox;
import javax.swing.JOptionPane;

/**
 *
 * @author Seemin
 */
public class CreateCarJPanel extends javax.swing.JPanel {
    private CarFleetCatalog carList;
    private JPanel userProcessContainer;
    boolean CheckAvailability = false;
    
   
    /**
     * Creates new form CreateCarJPanel
     */
    CreateCarJPanel(JPanel userProcessContainer, CarFleetCatalog carList) {
        initComponents();
        this.carList = carList ;
        this.userProcessContainer = userProcessContainer;
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CreateCarLbl = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        carAvailabilitylbl = new javax.swing.JLabel();
        yesAvailCheckBox = new javax.swing.JCheckBox();
        NoAvailCheckBox = new javax.swing.JCheckBox();
        CreateBtn = new javax.swing.JButton();
        ModelNumberLbl1 = new javax.swing.JLabel();
        txtModelNumber = new javax.swing.JTextField();
        CityLbl = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        SerialNumberLbl1 = new javax.swing.JLabel();
        txtSerialNumber = new javax.swing.JTextField();
        ManufactorerNameLbl = new javax.swing.JLabel();
        NumberofSeatsLbl1 = new javax.swing.JLabel();
        MCExpiryLbl = new javax.swing.JLabel();
        DateofManufactoringLbl1 = new javax.swing.JLabel();
        txtDateofManufactoring = new javax.swing.JTextField();
        txtmanufacturerName = new javax.swing.JTextField();
        txtmaxSeats = new javax.swing.JTextField();
        txtMinseats = new javax.swing.JTextField();
        noExpiryCheckBox = new javax.swing.JCheckBox();
        yesExpiryCheckBox = new javax.swing.JCheckBox();

        setBackground(new java.awt.Color(204, 255, 204));

        CreateCarLbl.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        CreateCarLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CreateCarLbl.setText("CREATE CAR ENTRY");
        CreateCarLbl.setFocusable(false);
        CreateCarLbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        backBtn.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        backBtn.setText("<< Back");
        backBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        backBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        carAvailabilitylbl.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        carAvailabilitylbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        carAvailabilitylbl.setText("Car Availability :");

        yesAvailCheckBox.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        yesAvailCheckBox.setText("Yes");
        yesAvailCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yesAvailCheckBoxActionPerformed(evt);
            }
        });

        NoAvailCheckBox.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        NoAvailCheckBox.setText("No");
        NoAvailCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoAvailCheckBoxActionPerformed(evt);
            }
        });

        CreateBtn.setBackground(new java.awt.Color(255, 255, 255));
        CreateBtn.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        CreateBtn.setText("Create");
        CreateBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        CreateBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        CreateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateBtnActionPerformed(evt);
            }
        });

        ModelNumberLbl1.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        ModelNumberLbl1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ModelNumberLbl1.setText("Model Number :");

        txtModelNumber.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N

        CityLbl.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        CityLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        CityLbl.setText("City :");

        txtCity.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N

        SerialNumberLbl1.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        SerialNumberLbl1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        SerialNumberLbl1.setText("Serial Number** :");

        txtSerialNumber.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        txtSerialNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSerialNumberActionPerformed(evt);
            }
        });

        ManufactorerNameLbl.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        ManufactorerNameLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ManufactorerNameLbl.setText("Manufactorer Name :");

        NumberofSeatsLbl1.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        NumberofSeatsLbl1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        NumberofSeatsLbl1.setText("Number of Seats in Car: ");

        MCExpiryLbl.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        MCExpiryLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        MCExpiryLbl.setText("Maintenance Certificate Expiry :");

        DateofManufactoringLbl1.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        DateofManufactoringLbl1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        DateofManufactoringLbl1.setText("Date of Manufactoring : ");

        txtDateofManufactoring.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N

        txtmanufacturerName.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N

        txtmaxSeats.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        txtmaxSeats.setText("Max Seats");

        txtMinseats.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        txtMinseats.setText("Min Seats");

        noExpiryCheckBox.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        noExpiryCheckBox.setText("No");
        noExpiryCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noExpiryCheckBoxActionPerformed(evt);
            }
        });

        yesExpiryCheckBox.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        yesExpiryCheckBox.setText("Yes");
        yesExpiryCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yesExpiryCheckBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ManufactorerNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carAvailabilitylbl, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtDateofManufactoring)
                    .addComponent(txtCity)
                    .addComponent(txtModelNumber)
                    .addComponent(txtmanufacturerName)
                    .addComponent(txtSerialNumber)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtMinseats, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(txtmaxSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(yesAvailCheckBox)
                            .addComponent(yesExpiryCheckBox))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(noExpiryCheckBox)
                            .addComponent(NoAvailCheckBox)
                            .addComponent(CreateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(74, 74, 74)))
                .addGap(0, 548, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(163, 163, 163)
                .addComponent(CreateCarLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(75, 75, 75)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(MCExpiryLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(87, 87, 87)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(SerialNumberLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ModelNumberLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DateofManufactoringLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(NumberofSeatsLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(CityLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGap(554, 802, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CreateCarLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ManufactorerNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtmanufacturerName, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDateofManufactoring, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtModelNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtSerialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtmaxSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMinseats, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yesExpiryCheckBox)
                    .addComponent(noExpiryCheckBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yesAvailCheckBox)
                    .addComponent(carAvailabilitylbl, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NoAvailCheckBox))
                .addGap(26, 26, 26)
                .addComponent(CreateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(236, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(85, 85, 85)
                    .addComponent(DateofManufactoringLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ModelNumberLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(CityLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(SerialNumberLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(NumberofSeatsLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(MCExpiryLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(337, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_backBtnActionPerformed

    private void CreateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateBtnActionPerformed
        String manufacturerName = txtmanufacturerName.getText();
        if(manufacturerName == null || manufacturerName.equals(""))
            {
               JOptionPane.showMessageDialog(null, "Please enter a value");
               return ; 
            }
        String dateofManufacturing = txtDateofManufactoring.getText();
        try
            {
                Integer.parseInt(dateofManufacturing);
            }
            catch (NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null," Please type a number ");
                return ;
            }
        
        String modelNumber = txtModelNumber.getText();
        if(modelNumber == null || modelNumber.equals(""))
            {
               JOptionPane.showMessageDialog(null, "Please enter a value");
               return ; 
            }
        String city = txtCity.getText();
        if(city == null || city.equals(""))
            {
               JOptionPane.showMessageDialog(null, "Please enter a value");
               return ; 
            }
        String serialNumber = txtSerialNumber.getText();
        if(serialNumber == null || serialNumber.equals(""))
            {
               JOptionPane.showMessageDialog(null, "Please enter a value");
               return ; 
            }
        String minNumOfSeats = txtMinseats.getText();
        if(minNumOfSeats == null || minNumOfSeats.equals(""))
            {
               JOptionPane.showMessageDialog(null, "Please enter a value");
               return ; 
            }
        String maxNumOfSeats = txtmaxSeats.getText();
        if(maxNumOfSeats == null || maxNumOfSeats.equals(""))
            {
               JOptionPane.showMessageDialog(null, "Please enter a value");
               return ; 
            }
         
        
        Car car = carList.addCar();
        
        car.setManufacturerName(manufacturerName);
        car.setDateofManufacturing(Integer.parseInt(dateofManufacturing));
        car.setModelNumber(modelNumber);
        car.setCity(city);
        car.setSerialNumber(serialNumber);
        car.setMaxNumOfSeats(Integer.parseInt(maxNumOfSeats));
        car.setMaxNumOfSeats(Integer.parseInt(minNumOfSeats));
        
        
        if (yesAvailCheckBox.isSelected()){
            car.setCheckAvailability(true);
            yesAvailCheckBox.setSelected(false);
         }
        else car.setCheckAvailability(true);
            NoAvailCheckBox.setSelected(false);
            
        if(yesExpiryCheckBox.isSelected()){
            car.setMaintenanceCertificateExpirtDate(true);
            }
        else car.setMaintenanceCertificateExpirtDate(false);
        
        JOptionPane.showMessageDialog(null, "Car Entry created successfully");   
        
        
        //Clearing FOrm
        
        txtmanufacturerName.setText("");
        txtDateofManufactoring.setText("");
        txtModelNumber.setText("");
        txtCity.setText("");
        txtSerialNumber.setText("");
        txtMinseats.setText("");
        txtmaxSeats.setText("");
        yesAvailCheckBox.setSelected(false);
        NoAvailCheckBox.setSelected(false);
        yesExpiryCheckBox.setSelected(false);
        noExpiryCheckBox.setSelected(false);
       
        
    }//GEN-LAST:event_CreateBtnActionPerformed

    private void txtSerialNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSerialNumberActionPerformed

    }//GEN-LAST:event_txtSerialNumberActionPerformed

    private void yesAvailCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yesAvailCheckBoxActionPerformed
      
       
    }//GEN-LAST:event_yesAvailCheckBoxActionPerformed

    private void NoAvailCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoAvailCheckBoxActionPerformed
        
    }//GEN-LAST:event_NoAvailCheckBoxActionPerformed

    private void noExpiryCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noExpiryCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noExpiryCheckBoxActionPerformed

    private void yesExpiryCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yesExpiryCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yesExpiryCheckBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CityLbl;
    private javax.swing.JButton CreateBtn;
    private javax.swing.JLabel CreateCarLbl;
    private javax.swing.JLabel DateofManufactoringLbl1;
    private javax.swing.JLabel MCExpiryLbl;
    private javax.swing.JLabel ManufactorerNameLbl;
    private javax.swing.JLabel ModelNumberLbl1;
    private javax.swing.JCheckBox NoAvailCheckBox;
    private javax.swing.JLabel NumberofSeatsLbl1;
    private javax.swing.JLabel SerialNumberLbl1;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel carAvailabilitylbl;
    private javax.swing.JCheckBox noExpiryCheckBox;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtDateofManufactoring;
    private javax.swing.JTextField txtMinseats;
    private javax.swing.JTextField txtModelNumber;
    private javax.swing.JTextField txtSerialNumber;
    private javax.swing.JTextField txtmanufacturerName;
    private javax.swing.JTextField txtmaxSeats;
    private javax.swing.JCheckBox yesAvailCheckBox;
    private javax.swing.JCheckBox yesExpiryCheckBox;
    // End of variables declaration//GEN-END:variables
}
