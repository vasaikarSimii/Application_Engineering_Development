/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author Seemin
 */
public class CarFleetCatalog {
    
    private ArrayList<Car> carList;

   
    public ArrayList<Car> getCar() {
        return carList;
    }

    public void setCar(ArrayList<Car> carList) {
        this.carList = carList;
    }
    
    public CarFleetCatalog() {
        this.carList = new ArrayList<>();
        
        //Car(String modelNumber, String serialNumber, String manufacturerName, int dateofManufacturing, int minNumOfSeats, int maxNumOfSeats, String city, boolean maintenanceCertificateExpirtDate, boolean availabile) {
    
        Car car1 = new Car("Y7","ABC123","Ferrari",  2019, 1, 2,  "Boston", true,false);
        Car car2 = new Car("X1","DEF345","BMW", 2019, 1, 4,   "New York", true,true);
        Car car3 = new Car("T1","GHI678", "Toyota", 2018, 1, 4, "Boston", true, true);
        Car car4 = new Car("G1","JKL910", "GM", 2018, 1, 4,  "New York", true, false);
        Car car5 = new Car("T2","MNO111","Toyota", 2017, 1, 4,  "Chicago", true,true );
        Car car6 = new Car("G2","PQR213", "GM", 2017, 1, 4,  "Chicago", false,true);
        Car car7 = new Car("X2","STU141", "Ferrari", 2016, 1, 2,  "Seattle", true,false);
        Car car8 = new Car("","VWX516", "BMW", 2016, 1, 4,   "Seattle", false,true);
        Car car9 = new Car("T3","YZA171", "Toyota", 2019, 1, 4, "Austin", true,true);
        Car car10 = new Car("G3","BCD819", "GM", 2019, 1, 4,   "Austin", true,true);

        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);
        carList.add(car6);
        carList.add(car7);
        carList.add(car8);
        carList.add(car9);
        carList.add(car10);
    }
    
    
    public Car addCar(){
        Car car = new Car();
        carList.add(car);
        return car;
     
    }
    
    public void deleteCar(Car car){
        carList.remove(car);
    }
    
    public Car searchCar(String carNumber){
        for (Car car : carList){
           if(car.getSerialNumber().equals(carNumber)){
            return car;
            }
        }
        return null;
       
    } 
    
    
}
