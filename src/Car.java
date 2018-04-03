/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vinay
 */
public class Car extends Vehicle {
    
    protected String Color;
    protected int Door;
    
   
    
    public Car(String License, DateTime EntryTime, String Brand, int Door, String Color, DateTime ExitTime){
        super(License, EntryTime, Brand, ExitTime);
        this.Color = Color;
        this.Door = Door;
        
    }
    
    public void setColor(String Color){
        this.Color = Color;
    }
    
    public String getColor(){
        return Color;
    }
    
    public void setDoor(int Door){
        this.Door = Door;
    }
    
    public int getDoor(){
        return Door;
    }
    
    public void setBrand(String Brand){
        this.Brand = Brand;
    }
    
    public String Brand(){
        return Brand;
    }
    
    public String getVehicle(){
        return "Car";
    }
    
    public String toString(){
        return "License: "+License+"| Brand: "+Brand+"| Door: "+Door+"| Color: "+Color +"| EntryTime: "+EntryTime+"| Exit Time: "+ExitTime;
    }
    
}
