/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Account;
import Business.AccountDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Seemin
 */
public class CreateAccountJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private AccountDirectory accountDirectory;
    /**
     * Creates new form CreateAccountJPanel
     */
    
    public CreateAccountJPanel(JPanel userProcessContainer, AccountDirectory accountDirectory) {
        initComponents();
        this.accountDirectory = accountDirectory;
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

        txtRoutingNumber = new javax.swing.JTextField();
        txtAccountNumber = new javax.swing.JTextField();
        txtBalance = new javax.swing.JTextField();
        CreateAccountLbl = new javax.swing.JLabel();
        RoutingNumberLbl = new javax.swing.JLabel();
        AccountNumberLbl = new javax.swing.JLabel();
        BankNameLbl = new javax.swing.JLabel();
        txtBankName = new javax.swing.JTextField();
        BalanceLbl = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        CreateBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));

        txtRoutingNumber.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtAccountNumber.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtBalance.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        CreateAccountLbl.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        CreateAccountLbl.setForeground(new java.awt.Color(255, 0, 0));
        CreateAccountLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CreateAccountLbl.setText("CREATE ACCOUNT");
        CreateAccountLbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        RoutingNumberLbl.setBackground(new java.awt.Color(255, 102, 102));
        RoutingNumberLbl.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        RoutingNumberLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        RoutingNumberLbl.setText("Routing Number :");

        AccountNumberLbl.setBackground(new java.awt.Color(255, 102, 102));
        AccountNumberLbl.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        AccountNumberLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        AccountNumberLbl.setText("Account Number :");

        BankNameLbl.setBackground(new java.awt.Color(255, 102, 102));
        BankNameLbl.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        BankNameLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        BankNameLbl.setText("Bank Name :");

        txtBankName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        BalanceLbl.setBackground(new java.awt.Color(255, 102, 102));
        BalanceLbl.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        BalanceLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        BalanceLbl.setText("Balance :");

        backBtn.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        backBtn.setText("<< Back");
        backBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        backBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(RoutingNumberLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AccountNumberLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAccountNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
                            .addComponent(txtRoutingNumber)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BankNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BalanceLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBalance)
                            .addComponent(txtBankName))))
                .addGap(258, 258, 258))
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(CreateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(396, 396, 396))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(CreateAccountLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(213, 213, 213))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(CreateAccountLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRoutingNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RoutingNumberLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AccountNumberLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBankName, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BankNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BalanceLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(CreateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 207, Short.MAX_VALUE)
                .addComponent(backBtn)
                .addGap(65, 65, 65))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_backBtnActionPerformed

    private void CreateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateBtnActionPerformed
        
        String routingNumber = txtRoutingNumber.getText();
        String accountNumber = txtAccountNumber.getText();
        String bankName = txtBankName.getText();
        int balance = Integer.parseInt(txtBalance.getText());

        // create account of type Account and add it to directory
        Account account = accountDirectory.addAccount();
        account.setRoutingNumber(routingNumber);
        account.setAccountNumber(accountNumber);
        account.setBankName(bankName);
        account.setBalance(balance);

        JOptionPane.showMessageDialog(null, "Account created successfully");
        txtRoutingNumber.setText("");
        txtAccountNumber.setText("");
        txtBankName.setText("");
        txtBalance.setText("");
        
    }//GEN-LAST:event_CreateBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AccountNumberLbl;
    private javax.swing.JLabel BalanceLbl;
    private javax.swing.JLabel BankNameLbl;
    private javax.swing.JLabel CreateAccountLbl;
    private javax.swing.JButton CreateBtn;
    private javax.swing.JLabel RoutingNumberLbl;
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField txtAccountNumber;
    private javax.swing.JTextField txtBalance;
    private javax.swing.JTextField txtBankName;
    private javax.swing.JTextField txtRoutingNumber;
    // End of variables declaration//GEN-END:variables
}