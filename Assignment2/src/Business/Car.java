/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.Date;

/**
 *
 * @author Seemin
 */
public class Car {
    private String manufacturerName;
    private int dateofManufacturing;
    private String modelNumber;
    private String city;
    private boolean CheckAvailability;
    private int minNumOfSeats;
    private int maxNumOfSeats;
    private String serialNumber;
    private boolean maintenanceCertificateExpirtDate;
    private String lastUpdated;

    
    
    public Car(){
        
    }
    
    Car(String modelNumber, String serialNumber, String manufacturerName, int dateofManufacturing, int minNumOfSeats, int maxNumOfSeats, String city, boolean maintenanceCertificateExpirtDate, boolean availabile) {
        this.CheckAvailability=availabile;
        this.modelNumber=modelNumber;
        this.serialNumber=serialNumber;
        this.manufacturerName=manufacturerName;
        this.city=city;
        this.maintenanceCertificateExpirtDate=maintenanceCertificateExpirtDate;
        this.dateofManufacturing=dateofManufacturing;
        this.maxNumOfSeats=maxNumOfSeats;
        this.minNumOfSeats=minNumOfSeats;
        
     
    }
    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public int getDateofManufacturing() {
        return dateofManufacturing;
    }

    public void setDateofManufacturing(int dateofManufacturing) {
        this.dateofManufacturing = dateofManufacturing;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean isCheckAvailability() {
        return CheckAvailability;
    }

    public void setCheckAvailability(boolean CheckAvailability) {
        this.CheckAvailability = CheckAvailability;
    }

    public int getMinNumOfSeats() {
        return minNumOfSeats;
    }

    public void setMinNumOfSeats(int minNumOfSeats) {
        this.minNumOfSeats = minNumOfSeats;
    }

    public int getMaxNumOfSeats() {
        return maxNumOfSeats;
    }

    public void setMaxNumOfSeats(int maxNumOfSeats) {
        this.maxNumOfSeats = maxNumOfSeats;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public boolean isMaintenanceCertificateExpirtDate() {
        return maintenanceCertificateExpirtDate;
    }

    public void setMaintenanceCertificateExpirtDate(boolean maintenanceCertificateExpirtDate) {
        this.maintenanceCertificateExpirtDate = maintenanceCertificateExpirtDate;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
    @Override
    public String toString(){
        return serialNumber;
    }
    
}
