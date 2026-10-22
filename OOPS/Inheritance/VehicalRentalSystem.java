
class Vehicle {
    String brand;
    double rentPerDay;

    void displayVehicle() {
        System.out.println("Brand        : " + brand);
        System.out.println("Rent Per Day : Rs. " + rentPerDay);
    }
}

class Car extends Vehicle {
    int numberOfSeats;

    void calculateRent(int days) {
        double totalRent = rentPerDay * days;

        System.out.println("----- Car Details -----");
        displayVehicle();
        System.out.println("Number of Seats : " + numberOfSeats);
        System.out.println("Rental Days     : " + days);
        System.out.println("Total Rent      : Rs. " + totalRent);
    }
}

class Bike extends Vehicle {
    String bikeType;

    void calculateRent(int days) {
        double totalRent = rentPerDay * days;

        System.out.println("----- Bike Details -----");
        displayVehicle();
        System.out.println("Bike Type    : " + bikeType);
        System.out.println("Rental Days  : " + days);
        System.out.println("Total Rent   : Rs. " + totalRent);
    }
}

public class VehicalRentalSystem {
    public static void main(String[] args) {

        Car c = new Car();

        c.brand = "Toyota";
        c.rentPerDay = 2500;
        c.numberOfSeats = 5;

        c.calculateRent(3);

        System.out.println("------------------------------------");

        Bike b = new Bike();

        b.brand = "Honda";
        b.rentPerDay = 800;
        b.bikeType = "Sports";

        b.calculateRent(2);

        System.out.println("====================================");
        System.out.println("        RENTAL COMPLETED");
        System.out.println("====================================");
    }
}
