
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author vinay
 */
public class WestminsterCarParkManager implements CarParkManager {

    private ArrayList<Vehicle> VehicleType; // DEFINING THE ARRAY
    private int type;
    Scanner s = new Scanner(System.in);
    private double VehicleCount = 0;
    private double CarCount = 0;
    private double VanCount = 0;
    private double BikeCount = 0;
    private int SpaceCount = 20;

    public WestminsterCarParkManager(int listLength) {
        this.type = listLength;
        VehicleType = new ArrayList<>();
    }

    public void AddVehicle(Vehicle Vehicle) { //Adds vehicles into the array

        if (VehicleType.size() < type) {
            VehicleType.add(Vehicle);
            type++;
        } else {
            System.out.println("No Space Left");
        }

    }

    public void List() { // Printing the list of Parked Vehicles
        for (int i = 0; i < VehicleType.size(); i++) {
            if (VehicleType.get(i).getVehicle().equals("Car")) {
                System.out.println("|Car| " + VehicleType.get(i).toString());
            }
            if (VehicleType.get(i).getVehicle().equals("Van")) {
                System.out.println("|Van| " + VehicleType.get(i).toString());
            }
            if (VehicleType.get(i).getVehicle().equals("MotorBike")) {
                System.out.println("|MotorBike| " + VehicleType.get(i).toString());
            }
        }
    }

    /**
     *
     * @return
     */
    @Override
    public boolean RunMenu() {

        boolean exit = false;
        String choose = "";
        System.out.println("Welcome to Westminster Car Park");

        System.out.println("Enter A for Adding a new Vehicle");
        System.out.println("Enter R if your Departing");
        System.out.println("Enter D to find vehicles parked on a Specific Date");
        System.out.println("Enter L List Of the car paking");
        System.out.println("Enter C to Chronological Order");
        System.out.println("Enter S for the Parking Stats");
        System.out.println("Enter F to Find the fees of the vehicles");
        System.out.println("Enter P to Run the Probability");
        System.out.println("Enter E to Exit");
        System.out.println(" ");
        System.out.println("Spaces Left: " + SpaceCount);
        choose = s.nextLine();

        switch (choose) {
            case "A": //Adding Vehicles to the array
                VehicleCount++;
                System.out.println("Please Enter the type Of vehicle");
                System.out.println("Press 1 If Have a Car");
                System.out.println("Press 2 If Have a Van");
                System.out.println("Press 3 If Have a MotorBike");
                System.out.println("Press 0 to exit");

                int choose2 = s.nextInt();
                s.nextLine();
                if (SpaceCount <= 0) { //if the care park is full, it exits out of the add function
                    choose2 = 0;
                    System.out.println("No Spaces Left");
                }
                switch (choose2) {
                    case 1: {
                        int Doorcar = 0;
                        int Day = 0;
                        int Month = 0;
                        int Year = 0;
                        int Hours = 24;
                        int Min = 61;
                        int ExitDay = 0;
                        int ExitMonth = 0;
                        int ExitYear = 0;
                        int ExitHours = 24;
                        int ExitMin = 61;
                        CarCount++;
                        SpaceCount--;
                        System.out.println("Enter The LicenseNumber: ");
                        String LicenseCar = s.nextLine();

                        System.out.println("Enter The Color: ");
                        String colorCar = s.nextLine();

                        while (!((Doorcar > 0) && (Doorcar < 10))) {

                            try {
                                System.out.println("Enter The Number of Doors: ");
                                Doorcar = Integer.parseInt(s.nextLine());
                            } catch (NumberFormatException ex) {
                                System.out.println("Invalid Input");
                                System.out.println("");
                            }
                        }

                        System.out.println("Enter The Brand of the car: ");
                        String BrandCar = s.nextLine();

                        //ENTRY DATE
                        while (!(Day > 0) && (Day < 32)) {
                            try {
                                System.out.println("Enter the ENTRY Day");
                                Day = Integer.parseInt(s.nextLine());
                            } catch (NumberFormatException ex) {
                                System.out.println("Invalid Input");
                                System.out.println("");
                            }
                        }

                        while (!((Month > 0) && (Month < 13))) {
                            try {
                                System.out.println("Enter the Month");
                                Month = Integer.parseInt(s.nextLine());
                            } catch (NumberFormatException ex) {
                                System.out.println("Invalid Input");
                                System.out.println("");
                            }
                        }
                        while (!((Year > 2010) && (Year < 2018))) {
                            try {
                                System.out.println("Enter the Year");
                                Year = Integer.parseInt(s.nextLine());
                            } catch (NumberFormatException ex) {
                                System.out.println("Invalid Input");
                                System.out.println("");

                            }
                        }
                        System.out.println("Enter the Time");
                        while (!((Hours >= 0) && (Hours < 24))) {
                            try {
                                System.out.println("Hours: ");
                                Hours = Integer.parseInt(s.nextLine());
                            } catch (NumberFormatException ex) {
                                System.out.println("Invalid Input");
                                System.out.println("");

                            }
                        }
                        while (!((Min >= 0) && (Min < 60))) {
                            try {
                                System.out.println("Minutes: ");
                                Min = s.nextInt();
                            } catch (NumberFormatException ex) {
                                System.out.println("Invalid Input");
                                System.out.println("");

                            }
                        }

                        //EXIT DATE                       
                        while (!(ExitDay > 0) && (ExitDay < 32)) {
                            try {
                                System.out.println("Enter the EXIT Day");
                                ExitDay = Integer.parseInt(s.nextLine());
                            } catch (NumberFormatException ex) {
                                System.out.println("Invalid Input");
                                System.out.println("");
                            }
                        }

                        while (!((ExitMonth > 0) && (ExitMonth < 13))) {
                            try {
                                System.out.println("Enter the EXIT Month");
                                ExitMonth = Integer.parseInt(s.nextLine());
                            } catch (NumberFormatException ex) {
                                System.out.println("Invalid Input");
                                System.out.println("");
                            }
                        }
                        while (!((ExitYear > 2010) && (ExitYear < 2018))) {
                            try {
                                System.out.println("Enter the EXIT Year");
                                ExitYear = Integer.parseInt(s.nextLine());
                            } catch (NumberFormatException ex) {
                                System.out.println("Invalid Input");
                                System.out.println("");

                            }
                        }
                        System.out.println("Enter the EXIT Time");
                        while (!((ExitHours >= 0) && (ExitHours < 24))) {
                            try {
                                System.out.println("Hours: ");
                                ExitHours = Integer.parseInt(s.nextLine());
                            } catch (NumberFormatException ex) {
                                System.out.println("Invalid Input");
                                System.out.println("");

                            }
                        }
                        while (!((ExitMin >= 0) && (ExitMin < 60))) {
                            try {
                                System.out.println("Minutes: ");
                                ExitMin = s.nextInt();
                            } catch (NumberFormatException ex) {
                                System.out.println("Invalid Input");
                                System.out.println("");

                            }
                        }
                        DateTime CarTime = new DateTime(Day, Month, Year, Hours, Min);
                        DateTime ExitCarTime = new DateTime(ExitDay, ExitMonth, ExitYear, ExitHours, ExitMin);
                        Car A = new Car(LicenseCar, CarTime, colorCar, Doorcar, BrandCar, ExitCarTime);

                        this.AddVehicle(A);
                        s.nextLine();
                        break;
                    }

                    case 2: {
                        int Day = 0;
                        int Month = 0;
                        int Year = 0;
                        int Hours = 24;
                        int Min = 62;
                        int ExitDay = 0;
                        int ExitMonth = 0;
                        int ExitYear = 0;
                        int ExitHours = 24;
                        int ExitMin = 61;
                        double Volume = 3001;
                        VanCount++;
                        SpaceCount--;
                        SpaceCount--;
                        System.out.println("Enter The LicenseNumber: ");
                        String LicenseVan = s.nextLine();

                        System.out.println("Enter the Brand: ");
                        String BrandVan = s.nextLine();

                        while (!((Volume >= 0) && (Volume < 3000))) {
                            try {
                                System.out.println("Enter the Volume of cargo: ");
                                Volume = Integer.parseInt(s.nextLine());
                            } catch (NumberFormatException ex) {
                                System.out.println("Invalid Input");
                                System.out.println("");
                            }
                        }
                        //ENTRY TIME
                        while (!(Day > 0) && (Day < 32)) {
                            try {
                                System.out.println("Enter the Day");
                                Day = Integer.parseInt(s.nextLine());
                            } catch (NumberFormatException ex) {
                                System.out.println("Invalid Input");
                                System.out.println("");
                            }
                        }

                        while (!((Month > 0) && (Month < 13))) {
                            try {
                                System.out.println("Enter the Month");
                                Month = Integer.parseInt(s.nextLine());
                            } catch (NumberFormatException ex) {
                                System.out.println("Invalid Input");
                                System.out.println("");
                            }
                        }
                        while (!((Year > 2010) && (Year < 2018))) {
                            try {
                                System.out.println("Enter the Year");
                                Year = Integer.parseInt(s.nextLine());
                            } catch (NumberFormatException ex) {
                                System.out.println("Invalid Input");
                                System.out.println("");

                            }
                        }
                        System.out.println("Enter the Time");
                        while (!((Hours >= 0) && (Hours < 24))) {
                            try {
                                System.out.println("Hours: ");
                                Hours = Integer.parseInt(s.nextLine());
                            } catch (NumberFormatException ex) {
                                System.out.println("Invalid Input");
                                System.out.println("");

                            }
                        }
                        while (!((Min >= 0) && (Min < 60))) {
                            try {
                                System.out.println("Minutes: ");
                                Min = s.nextInt();
                            } catch (NumberFormatException ex) {
                                System.out.println("Invalid Input");
                                System.out.println("");

                            }
                        }
                        //EXIT DATE                        //////////////////////////////////////////////////////
                        while (!(ExitDay > 0) && (ExitDay < 32)) {
                            try {
                                System.out.println("Enter the EXIT Day");
                                ExitDay = Integer.parseInt(s.nextLine());
                            } catch (NumberFormatException ex) {
                                System.out.println("Invalid Input");
                                System.out.println("");
                            }
                        }

                        while (!((ExitMonth > 0) && (ExitMonth < 13))) {
                            try {
                                System.out.println("Enter the EXIT Month");
                                ExitMonth = Integer.parseInt(s.nextLine());
                            } catch (NumberFormatException ex) {
                                System.out.println("Invalid Input");
                                System.out.println("");
                            }
                        }
                        while (!((ExitYear > 2010) && (ExitYear < 2018))) {
                            try {
                                System.out.println("Enter the EXIT Year");
                                ExitYear = Integer.parseInt(s.nextLine());
                            } catch (NumberFormatException ex) {
                                System.out.println("Invalid Input");
                                System.out.println("");

                            }
                        }
                        System.out.println("Enter the EXIT Time");
                        while (!((ExitHours >= 0) && (ExitHours < 24))) {
                            try {
                                System.out.println("Hours: ");
                                ExitHours = Integer.parseInt(s.nextLine());
                            } catch (NumberFormatException ex) {
                                System.out.println("Invalid Input");
                                System.out.println("");

                            }
                        }
                        while (!((ExitMin >= 0) && (ExitMin < 60))) {
                            try {
                                System.out.println("Minutes: ");
                                ExitMin = s.nextInt();
                            } catch (NumberFormatException ex) {
                                System.out.println("Invalid Input");
                                System.out.println("");

                            }
                        }
                        DateTime VanTime = new DateTime(Day, Month, Year, Hours, Min);
                        DateTime ExitVanTime = new DateTime(ExitDay, ExitMonth, ExitYear, ExitHours, ExitMin);
                        Van B = new Van(LicenseVan, VanTime, BrandVan, Volume, ExitVanTime);
                        this.AddVehicle(B);
                        this.AddVehicle(B);
                        break;
                    }
                    case 3: {
                        int Day = 0;
                        int Month = 0;
                        int Year = 0;
                        int Hours = 24;
                        int Min = 61;
                        int ExitDay = 0;
                        int ExitMonth = 0;
                        int ExitYear = 0;
                        int ExitHours = 24;
                        int ExitMin = 61;
                        double Volume = 3001;
                        BikeCount++;
                        SpaceCount--;
                        System.out.println("Enter The LicenseNumber: ");
                        String Licensebike = s.nextLine();
                        System.out.println("Enter the Engine CC: ");
                        int EngineCC = s.nextInt();
                        System.out.println("Enter The Brand of the Bike: ");
                        String BrandBike = s.nextLine();
                        s.nextLine();
                        while (!(Day > 0) && (Day < 32)) {
                            try {
                                System.out.println("Enter the Day");
                                Day = Integer.parseInt(s.nextLine());
                            } catch (NumberFormatException ex) {
                                System.out.println("Invalid Input");
                            }
                        }

                        while (!((Month > 0) && (Month < 13))) {
                            try {
                                System.out.println("Enter the Month");
                                Month = Integer.parseInt(s.nextLine());
                            } catch (NumberFormatException ex) {
                                System.out.println("Invalid Input");
                            }
                        }
                        while (!((Year > 2010) && (Year < 2018))) {
                            try {
                                System.out.println("Enter the Year");
                                Year = Integer.parseInt(s.nextLine());
                            } catch (NumberFormatException ex) {
                                System.out.println("Invalid Input");

                            }
                        }
                        System.out.println("Enter the Time");
                        while (!((Hours >= 0) && (Hours < 24))) {
                            try {
                                System.out.println("Hours: ");
                                Hours = Integer.parseInt(s.nextLine());
                            } catch (NumberFormatException ex) {
                                System.out.println("Invalid Input");

                            }
                        }
                        while (!((Min >= 0) && (Min < 60))) {
                            try {
                                System.out.println("Minutes: ");
                                Min = s.nextInt();
                            } catch (NumberFormatException ex) {
                                System.out.println("Invalid Input");

                            }
                        }
                        //EXIT DATE                        //////////////////////////////////////////////////////
                        while (!(ExitDay > 0) && (ExitDay < 32)) {
                            try {
                                System.out.println("Enter the EXIT Day");
                                ExitDay = Integer.parseInt(s.nextLine());
                            } catch (NumberFormatException ex) {
                                System.out.println("Invalid Input");
                                System.out.println("");
                            }
                        }

                        while (!((ExitMonth > 0) && (ExitMonth < 13))) {
                            try {
                                System.out.println("Enter the EXIT Month");
                                ExitMonth = Integer.parseInt(s.nextLine());
                            } catch (NumberFormatException ex) {
                                System.out.println("Invalid Input");
                                System.out.println("");
                            }
                        }
                        while (!((ExitYear > 2010) && (ExitYear < 2018))) {
                            try {
                                System.out.println("Enter the EXIT Year");
                                ExitYear = Integer.parseInt(s.nextLine());
                            } catch (NumberFormatException ex) {
                                System.out.println("Invalid Input");
                                System.out.println("");

                            }
                        }
                        System.out.println("Enter the EXIT Time");
                        while (!((ExitHours >= 0) && (ExitHours < 24))) {
                            try {
                                System.out.println("Hours: ");
                                ExitHours = Integer.parseInt(s.nextLine());
                            } catch (NumberFormatException ex) {
                                System.out.println("Invalid Input");
                                System.out.println("");

                            }
                        }
                        while (!((ExitMin >= 0) && (ExitMin < 60))) {
                            try {
                                System.out.println("Minutes: ");
                                ExitMin = s.nextInt();
                            } catch (NumberFormatException ex) {
                                System.out.println("Invalid Input");
                                System.out.println("");

                            }
                        }
                        DateTime BikeTime = new DateTime(Day, Month, Year, Hours, Min);
                        DateTime ExitBikeTime = new DateTime(ExitDay, ExitMonth, ExitYear, ExitHours, ExitMin);
                        MotorBike C = new MotorBike(Licensebike, BikeTime, BrandBike, EngineCC, ExitBikeTime);
                        this.AddVehicle(C);

                        break;
                    }
                    case 0:
                        System.out.println("Thank you");
                        break;
                }
                break;

            case "R":// Used to remove a parked vehicle
                System.out.println("Enter ther LicenceID of your vehicle");
                System.out.println("If you want to Exit Enter 'Exit' ");
                VehicleCount--;
                String Delete = s.nextLine();
                for (int i = 0; i < VehicleType.size(); i++) {
                    if (Delete.equals(VehicleType.get(i).getLicense())) { // gets the license number
                        System.out.println(VehicleType.get(i).getLicense() + "Has left the car Park");
                        switch (VehicleType.get(i).getVehicle()) {
                            case "Van":
                                VehicleType.remove(i); //van has two remove function because it takes up to array slots
                                VehicleType.remove(i);
                                VanCount--;    //removes the van count from the percentage calculator
                                SpaceCount = SpaceCount + 2; //increases the space remaining
                                break;
                            case "Car":
                                VehicleType.remove(i);
                                CarCount--; //removes the car count from the percentage calculator
                                SpaceCount++; //increases the space remaining
                                break;
                            case "MotorBike":
                                VehicleType.remove(i);
                                BikeCount--; //removes the bike count from the percentage calculator
                                SpaceCount++; //increases the space remaining
                                break;
                            default:
                                System.out.println("The Vehicle Doent Exist");
                                break;
                        }
                    }

                }
                break;

            case "L": // Prints out the list of vehicles in the parking
                this.List();
                break;

            case "C":
                // sorting in choronogical order
                Collections.sort(VehicleType);
                int j = -1; // Counter for the last vehicle in the array
                for (int i = 0; i < VehicleType.size(); i++) {

                    System.out.println("Licence: " + VehicleType.get(i).License + "| EntryTime And DAte: " + VehicleType.get(i).getEntryTime());
                    j++;
                }
                System.out.println("");
                System.out.println("The Vehicle that stayed the Shortest: "); //Longest Stay of a vehicle
                System.out.println("Licence: " + VehicleType.get(0).License + "| EntryTime And DAte: " + VehicleType.get(0).getEntryTime());
                System.out.println("");
                System.out.println("The Vehicle that stayed the longest: ");//Shortest Stay of a vehicle
                System.out.println("Licence: " + VehicleType.get(j).License + "| EntryTime And DAte: " + VehicleType.get(j).getEntryTime());
                System.out.println("");
                break;

            case "S":
                // gets the percentage of vehciles 
                double CarPer = (CarCount / VehicleCount) * 100; // percentage of the car in the parking
                double VanPer = (VanCount / VehicleCount) * 100; // percentage of the Van in the parking
                double BikePer = (BikeCount / VehicleCount) * 100; // percentage of the Bike in the parking
                System.out.println("The Percentage of cars: " + CarPer);
                System.out.println("The Percentage of Vans: " + VanPer);
                System.out.println("The Percentage of Bikes: " + BikePer);
                break;

            case "D": // finds if any vehicle is parked on the date entered
                int Day = 0;
                int Month = 0;
                int Year = 0;
                int count = 0;
                System.out.println("Enter The Date :");
                while (!(Day > 0) && (Day < 32)) {
                    try {
                        System.out.println("Enter the Day");
                        Day = Integer.parseInt(s.nextLine());
                    } catch (NumberFormatException ex) {
                        System.out.println("Invalid Input");
                        System.out.println("");
                    }
                }

                while (!((Month > 0) && (Month < 13))) {
                    try {
                        System.out.println("Enter the Month");
                        Month = Integer.parseInt(s.nextLine());
                    } catch (NumberFormatException ex) {
                        System.out.println("Invalid Input");
                        System.out.println("");
                    }
                }
                while (!((Year > 2010) && (Year < 2018))) {
                    try {
                        System.out.println("Enter the Year");
                        Year = Integer.parseInt(s.nextLine());
                    } catch (NumberFormatException ex) {
                        System.out.println("Invalid Input");
                        System.out.println("");

                    }
                }
                for (int i = 0; i < VehicleType.size(); i++) {
                    if (VehicleType.get(i).getEntryTime().day == Day) {
                        if (VehicleType.get(i).getEntryTime().month == Month) {
                            if (VehicleType.get(i).getEntryTime().year == Year) {
                                System.out.println(VehicleType.get(i).toString());
                                count++;
                            }
                        }
                    }
                }

                if (count == 0) {
                    System.out.println("No Car entered that day");
                    System.out.println("");

                }

                break;
            case "F":
                for (int i = 0; i < VehicleType.size(); i++) {
                    Day = 0;
                    Month = 0;
                    Year = 0;
                    int Hours = 0;
                    int Min = 0;

                    int ExitDay = 0;
                    int ExitMonth = 0;
                    int ExitYear = 0;
                    int ExitHours = 0;
                    int ExitMin = 0;

                    int DiffDay = 0;
                    int DiffMonth = 0;
                    int DiffYear = 0;
                    int DiffHours = 0;
                    double DiffMins = 0;
                    double TotalHours = 0;
                    Day = VehicleType.get(i).EntryTime.day;
                    ExitDay = VehicleType.get(i).ExitTime.day;
                    Month = VehicleType.get(i).EntryTime.month;
                    ExitMonth = VehicleType.get(i).ExitTime.month;
                    Year = VehicleType.get(i).EntryTime.year;
                    ExitYear = VehicleType.get(i).ExitTime.year;
                    Hours = VehicleType.get(i).EntryTime.Hours;
                    ExitHours = VehicleType.get(i).ExitTime.Hours;
                    Min = VehicleType.get(i).EntryTime.Min;
                    ExitMin = VehicleType.get(i).ExitTime.Min;

                    DiffYear = (ExitYear - Year) * 8760;//difference between the year and is converted to hours
                    DiffMonth = (ExitMonth - Month) * 720;//difference between the months and is converted to hours
                    DiffDay = (ExitDay - Day) * 24;//difference between the days and is converted to hours
                    DiffHours = (ExitHours - Hours);//difference between the hours 
                    DiffMins = (ExitMin - Min) * 0.0166667;//difference between the mins and is converted to hours

                    TotalHours = DiffYear + DiffMonth + DiffDay + DiffHours + DiffMins;

                    double Fees = 0;
                    if (TotalHours <= 3) {
                        Fees = 3 * TotalHours;
                    }
                    if (TotalHours > 24) {
                        Fees = 9 + (TotalHours - 3);
                    }
                    System.out.println("The Fees For the Licence Number : " + VehicleType.get(i).License + " is " + Fees);
                }
                break;

            case "E":
                exit = true;
                break;

            case "P"://using Poission Probability Theory
                double e = 2.71828; //Value of e
                double l = 27; // number of cars entering per hour
                double x = 10; // number of cars parked per hour
                double A = 1;
                double B = 1;
                double C = 1;
                double Result = 0;
                for (int i = 1; i <= 10; i++) {
                    A = A * l;
                    // System.out.println(A);
                }
                for (int i = 1; i <= 27; i++) {
                    B = B * e;
                    //System.out.println(B);
                }
                B = 1 / B; //because in possion theory the times is minus 
                for (int i = 1; i <= x; i++) {
                    C = C * i;
                    // System.out.println(C);

                }

                Result = (A * B / C);
                System.out.println("The Probability that 10 cars are gonna be parked in one hour is: ");
                DecimalFormat numberFormat = new DecimalFormat("#0.0000000");
                System.out.println(numberFormat.format(Result));
                System.out.println();
                break;
        }

        return exit;

    }

    public static void main(String[] args) {
        // TODO code application logic here
        CarParkManager sys = new WestminsterCarParkManager(20);
        boolean exit = false;

        while (!exit) {
            exit = sys.RunMenu();
        }
    }

}
