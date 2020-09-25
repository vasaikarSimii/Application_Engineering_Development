/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import Business.VitalSignsHistory;
import Business.VitalSigns;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Seemin
 */
public class ViewVitalsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewVitalsJPanel
     */
    
    private VitalSignsHistory vsh;
    
     public ViewVitalsJPanel(VitalSignsHistory vsh) {
        initComponents();
        this.vsh = vsh;
      populateTable();
     }
        
     public void populateTable(){
         DefaultTableModel dtm = (DefaultTableModel)tblVitalSigns.getModel();
         dtm.setRowCount(0);
        //        VitalSigns vs = new VitalSigns();
        
        for (VitalSigns vs : vsh.getVitalSignsHistory()){
            Object row[] = new Object[2];
            row[0] = vs;
            row[1] = vs.getBloodPressure();
            dtm.addRow(row);
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

        CreateLbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVitalSigns = new javax.swing.JTable();
        ViewDetailsBtn = new javax.swing.JButton();
        javax.swing.JButton DeleteBtn = new javax.swing.JButton();
        DateTextField = new javax.swing.JTextField();
        TemperatureLbl = new javax.swing.JLabel();
        PulseLbl = new javax.swing.JLabel();
        DateLbl = new javax.swing.JLabel();
        BloodPressureLbl = new javax.swing.JLabel();
        TemperatureTextField = new javax.swing.JTextField();
        BloodPressureTextField = new javax.swing.JTextField();
        PulseTextField = new javax.swing.JTextField();

        CreateLbl.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        CreateLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CreateLbl.setText("VIEW VITAL SIGNS");

        tblVitalSigns.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Temperature"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblVitalSigns);

        ViewDetailsBtn.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        ViewDetailsBtn.setText("View Details");
        ViewDetailsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewDetailsBtnActionPerformed(evt);
            }
        });

        DeleteBtn.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        DeleteBtn.setText("Delete");
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });

        DateTextField.setEnabled(false);
        DateTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DateTextFieldActionPerformed(evt);
            }
        });

        TemperatureLbl.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        TemperatureLbl.setText("Temperature :");

        PulseLbl.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        PulseLbl.setText("Pulse :");

        DateLbl.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        DateLbl.setText("Date :");

        BloodPressureLbl.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        BloodPressureLbl.setText("Blood Pressure");

        TemperatureTextField.setEnabled(false);
        TemperatureTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TemperatureTextFieldActionPerformed(evt);
            }
        });

        BloodPressureTextField.setEnabled(false);
        BloodPressureTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BloodPressureTextFieldActionPerformed(evt);
            }
        });

        PulseTextField.setEnabled(false);
        PulseTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PulseTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(268, 268, 268)
                        .addComponent(ViewDetailsBtn)
                        .addGap(40, 40, 40)
                        .addComponent(DeleteBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BloodPressureLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PulseLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DateLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TemperatureLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TemperatureTextField)
                                    .addComponent(BloodPressureTextField)
                                    .addComponent(PulseTextField)
                                    .addComponent(DateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(CreateLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(126, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(CreateLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ViewDetailsBtn)
                    .addComponent(DeleteBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TemperatureLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TemperatureTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BloodPressureLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BloodPressureTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PulseLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PulseTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DateLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(69, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ViewDetailsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewDetailsBtnActionPerformed
        // TODO add your handling code here:
        int selectedrow = tblVitalSigns.getSelectedRow();
        
        if (selectedrow >=0){
            //why?
            VitalSigns vs = (VitalSigns)tblVitalSigns.getValueAt(selectedrow, 0);
            TemperatureTextField.setText(String.valueOf(vs.getTemperature()));
            BloodPressureTextField.setText(String.valueOf(vs.getBloodPressure()));
            PulseTextField.setText(String.valueOf(vs.getPulse()));
            DateTextField.setText(vs.getDate());
            
        }
        else 
            JOptionPane.showMessageDialog(null, "Please select a row");
    }//GEN-LAST:event_ViewDetailsBtnActionPerformed

    private void TemperatureTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TemperatureTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TemperatureTextFieldActionPerformed

    private void PulseTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PulseTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PulseTextFieldActionPerformed

    private void DateTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DateTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DateTextFieldActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        // TODO add your handling code here:
        
       int selectedrow = tblVitalSigns.getSelectedRow();
       
       if(selectedrow >=0){
           VitalSigns vs = (VitalSigns)tblVitalSigns.getValueAt(selectedrow, 0);
           vsh.deleteVital(vs);
           JOptionPane.showConfirmDialog(null, "Delete this Vital Sign?");
           populateTable();
       }
       else 
           JOptionPane.showMessageDialog(null, "Please select a row");
       
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void BloodPressureTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BloodPressureTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BloodPressureTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BloodPressureLbl;
    private javax.swing.JTextField BloodPressureTextField;
    private javax.swing.JLabel CreateLbl;
    private javax.swing.JLabel DateLbl;
    private javax.swing.JTextField DateTextField;
    private javax.swing.JLabel PulseLbl;
    private javax.swing.JTextField PulseTextField;
    private javax.swing.JLabel TemperatureLbl;
    private javax.swing.JTextField TemperatureTextField;
    private javax.swing.JButton ViewDetailsBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblVitalSigns;
    // End of variables declaration//GEN-END:variables

    

    
}
