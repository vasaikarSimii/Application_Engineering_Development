///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package Business.Restaurant;
//
//import Business.Organization.Organization;
//import Business.Role.AdminRole;
//import Business.Role.DeliverManRole;
//import Business.Role.Role;
//import java.util.ArrayList;
//
///**
// *
// * @author seemin
// */
////RestaurantAdmin
//
//public class Restaurant extends Organization{
//    String Menu;
//    String name;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//    public String getMenu() {
//        return Menu;
//    }
//
//    public void setMenu(String Menu) {
//        this.Menu = Menu;
//    }
//    public Restaurant() {
//        super(Organization.Type.RestaurantAdmin.getValue());
//    }
//
//    @Override
//    public ArrayList<Role> getSupportedRole() {
//       ArrayList<Role> roles = new ArrayList();
//        roles.add(new AdminRole());
//        return roles;  
//    }
//}
