/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vinay
 */
public class MotorBike extends Vehicle {
    protected int BikeCC;
    
  
    
    public MotorBike(String License, DateTime EntryTime, String Brand, int BikeCC, DateTime ExitTime){
                super(License, EntryTime, Brand, ExitTime);
        this.BikeCC = BikeCC;
        
    }
    
    public void setBikeCC(int BikeCC){
        this.BikeCC = BikeCC;
    }
    
    public int getBikeCC(){
        return BikeCC;
    }
    
    public void setBrand(String Brand){
        this.Brand = Brand;
    }
    
    public String Brand(){
        return Brand;
    } 
    
    public String getVehicle(){
        return "MotorBike";
    }
    
    public String toString(){
        return "License: "+License+"| Brand: "+Brand+"| BikeCC: "+BikeCC+"| EntryTime: "+EntryTime;
    }
}
