/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vinay
 */
public abstract class Vehicle implements Comparable<Vehicle> {

    protected String License;
    protected String Brand;
    protected DateTime EntryTime;
    protected DateTime ExitTime;

    public Vehicle(String License, DateTime EntryTime, String Brand, DateTime ExitTime) {
        this.EntryTime = EntryTime;
        this.License = License;
        this.Brand = Brand;
        this.ExitTime = ExitTime;
    }

    public void setLicense(String License) {
        this.License = License;
    }

    public String getLicense() {
        return License;
    }

    public void setEntryTime(DateTime EntryTime) {
        this.EntryTime = EntryTime;
    }

    public DateTime getEntryTime() {
        return EntryTime;
    }
    
    public void setExitTime(DateTime ExitTime) {
        this.ExitTime = ExitTime;
    }

    public DateTime getExitTime() {
        return ExitTime;
    }

    public abstract String Brand();

    public abstract String getVehicle();

    public int compareTo(Vehicle A) {
        int returnValue = 0;
        if (this.getEntryTime().year > A.getEntryTime().year) {
            returnValue = -1;
        } else if (this.getEntryTime().year < A.getEntryTime().year) {
            returnValue = 1;
        } else if (this.getEntryTime().month > A.getEntryTime().month) {
            returnValue = -1;
        } else if (this.getEntryTime().month < A.getEntryTime().month) {
            returnValue = 1;
        } else if (this.getEntryTime().day > A.getEntryTime().day) {
            returnValue = -1;
        } else if (this.getEntryTime().day < A.getEntryTime().day) {
            returnValue = 1;
        } else if (this.getEntryTime().Min > A.getEntryTime().Min) {
            returnValue = -1;
        } else if (this.getEntryTime().Min < A.getEntryTime().Min) {
            returnValue = 1;
        } else if (this.getEntryTime().Hours > A.getEntryTime().Hours) {
            returnValue = -1;
        } else if (this.getEntryTime().Hours < A.getEntryTime().Hours) {
            returnValue = 1;
        }
        return returnValue;
    }
}
