///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package Business.Restaurant;
//
//import Business.DeliveryMan.DeliveryMan;
//import Business.Organization.Organization;
//import Business.Role.AdminRole;
//import java.util.ArrayList;
//
///**
// *
// * @author seemin  
// */
//public class RestaurantDirectory {
//   private ArrayList<Restaurant> restaurantList;
//
//    public void setRestaurantList(ArrayList<Restaurant> restaurantList) {
//        this.restaurantList = restaurantList;
//    }
//
//    public RestaurantDirectory() {
//        restaurantList = new ArrayList<Restaurant>();
//    }
//
//    public ArrayList<Restaurant> getRestaurantList() {
//        return restaurantList;
//    }
//    
//    public Organization createRestaurant(Organization.Type type){
//        Restaurant restaurant = null;
//        if (type.getValue().equals(Organization.Type.RestaurantAdmin.getValue())){
//            restaurant = new Restaurant();
//            restaurantList.add(restaurant);
//        }
//        return restaurant;
//    } 
//}
