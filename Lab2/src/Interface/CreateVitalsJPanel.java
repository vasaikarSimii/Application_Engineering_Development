/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.VitalSignsHistory;
import Business.VitalSigns;
import javax.swing.JOptionPane;

/**
 *
 * @author Seemin
 */
public class CreateVitalsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateVitalsJPanel
     */
   
    //local variable
    @SuppressWarnings("FieldMayBeFinal")
        
      private VitalSignsHistory vsh;
    
     //parameterized constructor of Vitalsignshistory class
     public CreateVitalsJPanel(VitalSignsHistory vsh) {
         initComponents();
         //assigning global variable to local variable as we used same name 
         this.vsh = vsh;
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
        PulseTextField = new javax.swing.JTextField();
        TemperatureLbl = new javax.swing.JLabel();
        DateLbl = new javax.swing.JLabel();
        PulseLbl = new javax.swing.JLabel();
        TemperatureTextField = new javax.swing.JTextField();
        BloodPressureTextField = new javax.swing.JTextField();
        BtnSave = new javax.swing.JButton();
        DateTextField = new javax.swing.JTextField();
        BloodPressureLbl = new javax.swing.JLabel();

        CreateLbl.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        CreateLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CreateLbl.setText("CREATE VITAL SIGNS");

        PulseTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PulseTextFieldActionPerformed(evt);
            }
        });

        TemperatureLbl.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        TemperatureLbl.setText("Temperature :");

        DateLbl.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        DateLbl.setText("Date :");

        PulseLbl.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        PulseLbl.setText("Pulse :");

        TemperatureTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TemperatureTextFieldActionPerformed(evt);
            }
        });

        BtnSave.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        BtnSave.setText("Save");
        BtnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSaveActionPerformed(evt);
            }
        });

        BloodPressureLbl.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        BloodPressureLbl.setText("Blood Pressure");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TemperatureLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DateLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PulseLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BloodPressureLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PulseTextField)
                            .addComponent(TemperatureTextField)
                            .addComponent(BloodPressureTextField)
                            .addComponent(BtnSave)
                            .addComponent(DateTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(CreateLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(CreateLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
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
                .addGap(34, 34, 34)
                .addComponent(BtnSave)
                .addGap(200, 200, 200))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void PulseTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PulseTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PulseTextFieldActionPerformed

    private void TemperatureTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TemperatureTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TemperatureTextFieldActionPerformed

    private void BtnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSaveActionPerformed
        // TODO add your handling code here:
        double temperature = Double.parseDouble(TemperatureTextField.getText());
        double bloodpressure = Double.parseDouble(BloodPressureTextField.getText());
        int pulse = Integer.parseInt(PulseTextField.getText());
        String date = DateTextField.getText();
        VitalSigns v = vsh.addVital();
        v.setBloodPressure(bloodpressure);
        v.setTemperature(temperature);
        v.setPulse(pulse);
        v.setDate(date);
        JOptionPane.showMessageDialog(null, "Vital Sign saved successfully");
        
        TemperatureTextField.setText("");
        BloodPressureTextField.setText("");
        PulseTextField.setText("");
        DateTextField.setText("");
                
    }//GEN-LAST:event_BtnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BloodPressureLbl;
    private javax.swing.JTextField BloodPressureTextField;
    private javax.swing.JButton BtnSave;
    private javax.swing.JLabel CreateLbl;
    private javax.swing.JLabel DateLbl;
    private javax.swing.JTextField DateTextField;
    private javax.swing.JLabel PulseLbl;
    private javax.swing.JTextField PulseTextField;
    private javax.swing.JLabel TemperatureLbl;
    private javax.swing.JTextField TemperatureTextField;
    // End of variables declaration//GEN-END:variables

   
    }