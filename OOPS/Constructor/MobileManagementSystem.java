class Mobile {

    private int mobileId;
    private String brand;
    private String model;
    private double price;

    // Constructor
    public Mobile(int mobileId, String brand, String model, double price) {
        this.mobileId = mobileId;
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Getter for Mobile ID
    public int getMobileId() {
        return mobileId;
    }

    // Getter for Brand
    public String getBrand() {
        return brand;
    }

    // Getter for Model
    public String getModel() {
        return model;
    }

    // Getter for Price
    public double getPrice() {
        return price;
    }

    // Setter for Brand
    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Setter for Model
    public void setModel(String model) {
        this.model = model;
    }

    // Setter for Price
    public void setPrice(double price) {
        this.price = price;
    }

    // Display Mobile Information
    public void displayInfo() {
        System.out.println("Mobile ID : " + mobileId);
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Price : " + price);
    }
}

public class MobileManagementSystem {

    public static void main(String[] args) {

        // Object creation using Constructor
        Mobile mobile = new Mobile(
                101,
                "Samsung",
                "Galaxy S24",
                75000);

        System.out.println("----- Mobile Details -----");

        mobile.displayInfo();

        System.out.println();

        // Updating values using Setters
        mobile.setBrand("Apple");
        mobile.setModel("iPhone 16");
        mobile.setPrice(80000);

        System.out.println("----- Updated Details -----");

        // Getting values using Getters
        System.out.println("Mobile ID : " + mobile.getMobileId());
        System.out.println("Brand : " + mobile.getBrand());
        System.out.println("Model : " + mobile.getModel());
        System.out.println("Price : " + mobile.getPrice());
    }
}