///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package Business.DeliveryMan;
//import Business.Organization.Organization;
//import Business.Role.DeliverManRole;
//import Business.Role.Role;
//import java.util.ArrayList;
//
///**
// *
// * @author seemin
// */
//public class DeliveryMan extends Organization {
//    String name;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//    public DeliveryMan() {
//        super(Organization.Type.DeliveryMan.getValue());
//    }
//
//    @Override
//    public ArrayList<Role> getSupportedRole() {
//       ArrayList<Role> roles = new ArrayList();
//        roles.add(new DeliverManRole());
//        return roles;  
//    }
//    
//}
//
//   
//
//
//
