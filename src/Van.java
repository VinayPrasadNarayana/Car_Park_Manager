/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vinay
 */
public class Van extends Vehicle {

    protected double CargoVolume;

    public Van(String License, DateTime EntryTime, String Brand, double CargoVolume, DateTime ExitTime) {
        super(License, EntryTime, Brand, ExitTime);
        this.CargoVolume = CargoVolume;
    }

    public void setVolume(double CargoVolume) {
        this.CargoVolume =CargoVolume;
    }
    
    public double getVolume() {
        return CargoVolume;
    }

    public String Brand() {
        return Brand;
    }

    public String getVehicle() {
        return "Van";
    }
     public String toString(){
        return "License: "+License+"| Brand: "+Brand+"| CargoVolume: "+CargoVolume+"| EntryTime: "+EntryTime;
    }
}
