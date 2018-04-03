/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vinay
 */
public class DateTime {

    protected int day;
    protected int month;
    protected int year;
    protected int Hours;
    protected int Min;

    public DateTime(int day, int month, int year, int Hours, int Min) {
        if ((year > 1939) && (year < 2101) && (month > 0) && (month < 13) && (day > 0) && (day < 32)) {
            this.day = day;
            this.month = month;
            this.year = year;
            this.Hours = Hours;
            this.Min = Min;
        } else {
            System.out.println("Error");
        }
    }

    public void setday(int day) {
        if ((day >= 0) && (day < 32)) {
            this.day = day;
        } else {
            System.out.println("ERROR");
        }

    }

    public void setmonth(int month) {
        if ((month >= 0) && (month < 13)) {
            this.month = month;
        } else {
            System.out.println("ERROR");
        }

    }

    public void setyear(int year) {
        if ((year >= 1939) && (year < 2101)) {
            this.year = year;
        } else {
            System.out.println("ERROR");
        }
    }

    public int getday() {
        return day;
    }

    public int getmonth() {
        return month;
    }

    public int getyear() {
        return year;
    }

    public void setHour(int Hour) {
        if ((Hour >= 0) && (Hour < 24)) {
            this.Hours = Hour;
        } else {
            System.out.println("Error");
        }
    }

    public void setMin(int Min) {
        if ((Min >= 0) && (Min < 60)) {
            this.Min = Min;
        } else {
            System.out.println("Error");
        }
    }

    public int getHour() {
        return this.Hours;
    }

    public int getMin() {
        return this.Min;
    }

    public String getDate() {
        String dateStr = ("Date: " + day + "/" + month + "/" + year + "*****Time: " + Hours + ":" + Min);
        return dateStr;
    }

    @Override
    public String toString() {
        String dateStr = ("Date: " + day + "/" + month + "/" + year + "*****Time: " + Hours + ":" + Min);
        return dateStr;
    }

  
   

   

}
