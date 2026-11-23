class Vehical {
    private String brand;
    private String model;
    private double price;

    public Vehical(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("Vehicle Brand : " + brand);
        System.out.println("Vehicle Model : " + model);
        System.out.println("Vehicle Price : " + price);
    }
}

class Car extends Vehical {
    private int noOfDoors;

    public Car(String brand, String model, double price, int noOfDoors) {
        super(brand, model, price);
        this.noOfDoors = noOfDoors;
    }

    public int getNoOfDoors() {
        return noOfDoors;
    }

    public void setNoOfDoors(int noOfDoors) {
        this.noOfDoors = noOfDoors;
    }

    @Override
    public void displayInfo() {
        System.out.println("--- Car Details ---");
        super.displayInfo();
        System.out.println("Number of Doors : " + noOfDoors);
    }
}

class Bike extends Vehical {
    private boolean hasHelmet;

    public Bike(String brand, String model, double price, boolean hasHelmet) {
        super(brand, model, price);
        this.hasHelmet = hasHelmet;
    }

    public boolean isHasHelmet() {
        return hasHelmet;
    }

    public void setHasHelmet(boolean hasHelmet) {
        this.hasHelmet = hasHelmet;
    }

    @Override
    public void displayInfo() {
        System.out.println("--- Bike Details ---");
        super.displayInfo();
        System.out.println("Helmet Included : " + hasHelmet);
    }
}

public class VehcalManagement {
    public static void main(String[] args) {
        Car car = new Car("TaTa", "Siyara", 13000.00, 4);
        car.displayInfo();

        System.out.println();

        Bike bike = new Bike("Royal Enfield", "Classic 350", 220000.0, true);
        bike.displayInfo();
    }
}