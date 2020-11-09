///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package Business.DeliveryMan;
//import Business.Role.DeliverManRole;
//import Business.Organization.Organization.Type;
//import java.util.ArrayList;
//import Business.Organization.Organization;
//
///**
// *
// * @author seemin
// */
//public class DeliveryManDirectory {
//    private ArrayList<DeliveryMan> deliveryManList;
//
//    public void setDeliveryManList(ArrayList<DeliveryMan> deliveryManList) {
//        this.deliveryManList = deliveryManList;
//    }
//
//    public DeliveryManDirectory() {
//        deliveryManList = new ArrayList<DeliveryMan>();
//    }
//
//    public ArrayList<DeliveryMan> getDeliveryManList() {
//        return deliveryManList;
//    }
//    
//    public Organization createDeliveryMan(Organization.Type type){
//        DeliveryMan deliveryMan = null;
//        if (type.getValue().equals(Organization.Type.DeliveryMan.getValue())){
//            deliveryMan = new DeliveryMan();
//            deliveryManList.add(deliveryMan);
//        }
//        return deliveryMan;
//    }
//}
