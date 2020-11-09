/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;



import Business.Employee.EmployeeDirectory;
import Business.Organization.OrganizationDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author seemin
 */
public abstract class Organization {

    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter=0;
    
//    public RestaurantDirectory getRestaurantDirectory() {
//        return restaurantDirectory;
//    }
//
//    public void setRestaurantDirectory(RestaurantDirectory restaurantDirectory) {
//        this.restaurantDirectory = restaurantDirectory;
//    }
//
//    public DeliveryManDirectory getDeliveryManDirectory() {
//        return deliveryManDirectory;
//    }
//
//    public void setDeliveryManDirectory(DeliveryManDirectory deliveryManDirectory) {
//        this.deliveryManDirectory = deliveryManDirectory;
//    }
//
//    public CustomerDirectory getCustomerDirectory() {
//        return customerDirectory;
//    }
//
//    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
//        this.customerDirectory = customerDirectory;
//    }
//
//    public DeliveryMan getDeliveryMan() {
//        return deliveryMan;
//    }
//
//    public void setDeliveryMan(DeliveryMan deliveryMan) {
//        this.deliveryMan = deliveryMan;
//    }
//    private DeliveryMan deliveryMan;
    
    public enum Type{
        RestaurantAdmin("RestaurantAdmin"),
        Customer("Customer"),
        DeliveryMan("Delivery"),
        SysAdmin("Sysadmin");
        
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        ++counter;
    }
    public Organization(){
        
    }
    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
