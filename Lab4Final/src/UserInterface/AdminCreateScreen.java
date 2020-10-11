/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.Abstract.User;
import Business.CustomerDirectory;
import Business.Product;
import Business.ProductDirectory;
import Business.SupplierDirectory;
import Business.Users.Admin;
import Business.Users.Customer;
import Business.Users.Supplier;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import static jdk.internal.util.StaticProperty.userName;

/**
 *
 * @author AEDSpring2019
 */
public class AdminCreateScreen extends javax.swing.JPanel {
   
    /**
     * Creates new form AdminScreen
     */
    private JPanel panelRight;
    private Admin admin;
      
           
    public AdminCreateScreen(JPanel panelRight, Admin admin) {
        initComponents();
        this.panelRight = panelRight;
        this.admin = admin;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCreate = new javax.swing.JButton();
        txtUser = new javax.swing.JTextField();
        txtPword = new javax.swing.JTextField();
        txtRePword = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        radioCustomer = new javax.swing.JRadioButton();
        radioSupplier = new javax.swing.JRadioButton();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 204));

        btnCreate.setBackground(new java.awt.Color(255, 51, 51));
        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        txtUser.setText("xx_xx@xx.xx");
        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });

        txtPword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPwordActionPerformed(evt);
            }
        });

        txtRePword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRePwordActionPerformed(evt);
            }
        });

        jLabel1.setText("username:");

        jLabel2.setText("password:");

        jLabel3.setText("re-enter password :");

        radioCustomer.setText("Customer");
        radioCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioCustomerActionPerformed(evt);
            }
        });

        radioSupplier.setText("Supplier");
        radioSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioSupplierActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(255, 51, 51));
        btnBack.setText("< BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPword, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRePword, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(radioSupplier)
                                    .addComponent(radioCustomer)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(btnBack)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRePword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radioCustomer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioSupplier)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCreate)
                .addContainerGap(47, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
    
    if(usernamePatternCorrect() == true)
    {
       JOptionPane.showMessageDialog(null, "Username is valid"); 
     }
    else { 
        txtUser.setBackground(Color.red);
        JOptionPane.showMessageDialog(null, "Enter user name of the following format : xx_xx@xx.xx ");
    }         
    
    if (passwordPatternCorrect()== true){
            JOptionPane.showMessageDialog(null, "Password is valid"); 
         if (txtRePword.getText().equals(txtPword.getText())){
            JOptionPane.showMessageDialog(null, "Password matches");
            }  
         else if(!txtRePword.getText().equals(txtPword.getText())) { 
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null, "Password does not match ", "Warning", JOptionPane.WARNING_MESSAGE);
            if (dialogResult == JOptionPane.YES_OPTION){
                txtUser.setText("");
                txtPword.setText("");
                txtRePword.setText("");
            }   
        }
    }
        
        else {
        txtPword.setBackground(Color.red);
        JOptionPane.showMessageDialog(null, "Invalid Password. Password should be at least 6 digits and contain at least one upper case letter, one lower case letter, one digit and one special character"); 
        
       } 
      
    if (usernamePatternCorrect() == true && passwordPatternCorrect()== true && radioCustomer.isSelected()== true )
    {
           Date dateCreated = new Date();
           String password = txtPword.getText();
           String userName = txtUser.getText();
           Customer cust = new Customer(password, userName);
           admin.getCustDir().getCustomerList().add(cust);
           JOptionPane.showMessageDialog(null, "Customer has been created successfully"); 
        }
        
        else if(usernamePatternCorrect() == true && passwordPatternCorrect()== true && radioSupplier.isSelected()== true) {
                
                String password = txtPword.getText();
                String userName = txtUser.getText();
                Supplier supp = new Supplier(password, userName);
                admin.getSuppDir().getSupplierList().add(supp);
                JOptionPane.showMessageDialog(null, "Supplier has been created successfully"); 
                }
        
        else {
            JOptionPane.showMessageDialog(null, "Please Select User type : Customer/Supplier");
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null, "Invalid Username/Password", "Warning", JOptionPane.WARNING_MESSAGE);
            if (dialogResult == JOptionPane.YES_OPTION){
                txtUser.setText("");
                txtPword.setText("");
                txtRePword.setText("");
                
                }
            
        } 
     
     
   
        txtUser.setText("");
        txtPword.setText("");
        txtRePword.setText("");
        radioCustomer.setSelected(false);
        radioSupplier.setSelected(false);
       
            
    }//GEN-LAST:event_btnCreateActionPerformed
        
    private void radioCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioCustomerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioCustomerActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        CardLayout layout = (CardLayout)panelRight.getLayout();
        panelRight.remove(this);
        layout.previous(panelRight);
    }//GEN-LAST:event_btnBackActionPerformed

    private void radioSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioSupplierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioSupplierActionPerformed

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
    //Regex Validation : Username should be in the format of xx_xx@xx.xx
  
    }//GEN-LAST:event_txtUserActionPerformed

    private void txtPwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPwordActionPerformed
        // TODO add your handling code here: 
       
    }//GEN-LAST:event_txtPwordActionPerformed

    private void txtRePwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRePwordActionPerformed
        
    }//GEN-LAST:event_txtRePwordActionPerformed
    
    public boolean usernamePatternCorrect(){
        Pattern p = Pattern.compile("^[a-zA-Z0-9]+_[a-zA-Z0-9]+@[a-zA-Z0-9]+.[a-zA-Z0-9]+$");
        Matcher m = p.matcher(txtUser.getText());
        boolean b = m.matches();
        return b;
    }
    
    public boolean passwordPatternCorrect(){
        Pattern t = Pattern.compile("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})");
        Matcher m = t.matcher(txtPword.getText());
        boolean c = m.matches();
        return c;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton radioCustomer;
    private javax.swing.JRadioButton radioSupplier;
    private javax.swing.JTextField txtPword;
    private javax.swing.JTextField txtRePword;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
