///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package Business.Customer;
//
//import java.util.ArrayList;
//import Business.Organization.Organization.Type;
//import Business.Role.CustomerRole;
//import Business.Organization.Organization;
//
///**
// *
// * @author seemin
// */
//public class CustomerDirectory {
//        
//    private ArrayList<Customer> customerList;
//    
//
//    public void setCustomerList(ArrayList<Customer> customerList) {
//        this.customerList = customerList;
//    }
//
//    public CustomerDirectory() {
//        customerList = new ArrayList<Customer>();
//    }
//
//    public ArrayList<Customer> getCustomerList() {
//        return customerList;
//    }
//    
//    
//    public Organization createCustomer(Organization.Type type){
//        Customer customer = null;
//        if (type.getValue().equals(Type.Customer.getValue())){
//            customer = new Customer();
//            customerList.add(customer);
//        }
//        return customer;
//    }
//}
//        
//        
//
