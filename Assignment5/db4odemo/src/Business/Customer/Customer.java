///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package Business.Customer;
//import Business.Role.Role;
//import java.util.ArrayList;
//import Business.Role.CustomerRole;
//import Business.Organization.Organization;        
//
//
///**
// *
// * @author seemin
// */
//public class Customer extends Organization{
//     String phoneNo;
//     String orderComments;
//     String name;
//     
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//    public String getOrderComments() {
//        return orderComments;
//    }
//
//    public void setOrderComments(String orderComments) {
//        this.orderComments = orderComments;
//    }
//     
//    public String getPhoneNo() {
//        return phoneNo;
//    }
//
//    public void setPhoneNo(String phoneNo) {
//        this.phoneNo = phoneNo;
//    }
//     public Customer() {
//        super(Organization.Type.Customer.getValue());
//    }
//
//    @Override
//    public ArrayList<Role> getSupportedRole() {
//      ArrayList<Role> roles = new ArrayList();
//        roles.add(new CustomerRole());
//        return roles;  
//    }
//    
//    
//}
