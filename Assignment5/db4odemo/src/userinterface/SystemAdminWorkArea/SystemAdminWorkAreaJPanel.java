/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;


import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;

import Business.Organization.Organization;

import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author seemin
 */
public class SystemAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminWorkAreaJPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    
    public SystemAdminWorkAreaJPanel(JPanel userProcessContainer,EcoSystem ecosystem) {
        
        this.userProcessContainer=userProcessContainer;
        this.ecosystem=ecosystem;
        initComponents();
        populateTree();
    }
    public void populateTree(){
        DefaultTreeModel model=(DefaultTreeModel)jTree.getModel();
        ArrayList<Network> networkList=ecosystem.getNetworkList();
        ArrayList<Enterprise> enterpriseList;
        ArrayList<Organization> organizationList;
        
        Network network;
        Enterprise enterprise;
        Organization organization;
        
        DefaultMutableTreeNode networks=new DefaultMutableTreeNode("Networks");
        DefaultMutableTreeNode root=(DefaultMutableTreeNode)model.getRoot();
        root.removeAllChildren();
        root.insert(networks, 0);
        
        DefaultMutableTreeNode networkNode;
        DefaultMutableTreeNode enterpriseNode;
        DefaultMutableTreeNode organizationNode;
        
        for(int i=0;i<networkList.size();i++){
            network=networkList.get(i);
            networkNode=new DefaultMutableTreeNode(network.getName());
            networks.insert(networkNode, i);
            
            enterpriseList=network.getEnterpriseDirectory().getEnterpriseList();
            for(int j=0; j<enterpriseList.size();j++){
                enterprise=enterpriseList.get(j);
                enterpriseNode=new DefaultMutableTreeNode(enterprise.getName());
                networkNode.insert(enterpriseNode, j);
                
                organizationList=enterprise.getOrganizationDirectory().getOrganizationList();
                for(int k=0;k<organizationList.size();k++){
                    organization=organizationList.get(i);
                    organizationNode=new DefaultMutableTreeNode(organization.getName());
                    enterpriseNode.insert(organizationNode, k);
                }
            }
        }
        model.reload();
    }
    
    
    //public void populateTree(){
//       Organization organization;
//       Restaurant restaurant = null;
//       Customer customer = null;
//       DeliveryMan deliveryMan = null;
//        DefaultTreeModel model=(DefaultTreeModel)jTree.getModel();
//       // Add the code for draw your system structure shown by JTree
//       ArrayList<Restaurant> restaurantList;
//       ArrayList<Customer> customerList = null;
//       ArrayList<DeliveryMan> deliveryManList= null;
//       
//       
//       
//       
//       DefaultMutableTreeNode restaurants=new DefaultMutableTreeNode("Food Delivery");
//       DefaultMutableTreeNode root=(DefaultMutableTreeNode)model.getRoot();
//       root.removeAllChildren();
//       root.insert(restaurants, 0);
//       
//       DefaultMutableTreeNode restaurantNode;
//       DefaultMutableTreeNode customerNode;
//       DefaultMutableTreeNode deliveryManNode;
//       
//       
//       restaurantList =  ecosystem.getRestaurantDirectory().getRestaurantList();
//     for(int i=0;i<restaurantList.size();i++){
//            restaurant=restaurantList.get(i);
//            restaurantNode=new DefaultMutableTreeNode(restaurant.getName());
//            restaurants.insert(restaurantNode, i);
//            
//            customerList = customer.getCustomerDirectory().getCustomerList();
//            for(int j=0; j<customerList.size();j++){
//                customer=customerList.get(j);
//                customerNode=new DefaultMutableTreeNode(customer.getName());
//                customerNode.insert(customerNode, j);      
//            
//            deliveryManList=deliveryMan.getDeliveryManDirectory().getDeliveryManList();
//            for(int k=0; j<deliveryManList.size();k++){
//                deliveryMan=deliveryManList.get(j);
//                deliveryManNode=new DefaultMutableTreeNode(deliveryMan.getName());
//                deliveryManNode.insert(deliveryManNode, k);
//            }
//        }
//      }
//       
//        
//       
//       
//        model.reload();
//            
//        
 // }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree = new javax.swing.JTree();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblSelectedNode = new javax.swing.JLabel();
        btnManageAllCustomers = new javax.swing.JButton();
        btnManageRestaurants = new javax.swing.JButton();
        btnManageDeliveryMan = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        jTree.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                jTreeValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jTree);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 118, Short.MAX_VALUE))
        );

        jSplitPane.setLeftComponent(jPanel1);

        jLabel1.setText("Selected Node:");

        lblSelectedNode.setText("<View_selected_node>");

        btnManageAllCustomers.setText("Manage All Customers");
        btnManageAllCustomers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageAllCustomersActionPerformed(evt);
            }
        });

        btnManageRestaurants.setText("Manage Restaurants");
        btnManageRestaurants.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageRestaurantsActionPerformed(evt);
            }
        });

        btnManageDeliveryMan.setText("Manage Deliveryman");
        btnManageDeliveryMan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageDeliveryManActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(lblSelectedNode))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnManageDeliveryMan)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnManageRestaurants, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnManageAllCustomers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(240, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblSelectedNode))
                .addGap(54, 54, 54)
                .addComponent(btnManageAllCustomers)
                .addGap(18, 18, 18)
                .addComponent(btnManageRestaurants)
                .addGap(18, 18, 18)
                .addComponent(btnManageDeliveryMan)
                .addContainerGap(175, Short.MAX_VALUE))
        );

        jSplitPane.setRightComponent(jPanel2);

        add(jSplitPane, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageAllCustomersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageAllCustomersActionPerformed
       ManageAllCustomersJPanel manageAllCustomersJPanel=new ManageAllCustomersJPanel(userProcessContainer, ecosystem);
        userProcessContainer.add("ManageAllCustomersJPanel",manageAllCustomersJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageAllCustomersActionPerformed

    private void btnManageRestaurantsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageRestaurantsActionPerformed
        ManageRestaurantsJPanel manageRestaurantsJPanel=new ManageRestaurantsJPanel(userProcessContainer, ecosystem);
        userProcessContainer.add("ManageRestaurantsJPanel",manageRestaurantsJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageRestaurantsActionPerformed

    private void btnManageDeliveryManActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageDeliveryManActionPerformed
        ManageDeliveryManJPanel manageDeliveryManJPanel=new ManageDeliveryManJPanel(userProcessContainer, ecosystem);
        userProcessContainer.add("ManageDeliveryManJPanel",manageDeliveryManJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageDeliveryManActionPerformed

    private void jTreeValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_jTreeValueChanged
        
        DefaultMutableTreeNode selectedNode= (DefaultMutableTreeNode)jTree.getLastSelectedPathComponent();
        if(selectedNode!=null){
            lblSelectedNode.setText(selectedNode.toString());
        }
    }//GEN-LAST:event_jTreeValueChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageAllCustomers;
    private javax.swing.JButton btnManageDeliveryMan;
    private javax.swing.JButton btnManageRestaurants;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane;
    private javax.swing.JTree jTree;
    private javax.swing.JLabel lblSelectedNode;
    // End of variables declaration//GEN-END:variables

    
}
