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

    // Getters
    public int getmobileId() {
        return mobileId;
    }

    public String getbrand() {
        return brand;
    }

    public String getmodel() {
        return model;
    }

    public double getprice() {
        return price;
    }

    // Setters
    public void setmobileId(int mobileId) {
        this.mobileId = mobileId;
    }

    public void setbrand(String brand) {
        this.brand = brand;
    }

    public void setmodel(String model) {
        this.model = model;
    }

    public void setprice(double price) {
        this.price = price;
    }

    // Mobile Information
    public void moblieInfo() {
        System.out.println("Mobile ID : " + mobileId);
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Price : " + price);
    }
}

public class MobileManagementSystem {

    public static void main(String[] args) {

        Mobile obj = new Mobile(
                101,
                "I Phone",
                "18 Pro",
                350000.00);

        System.out.println("--- Mobile Information ---");
        obj.moblieInfo();

        System.out.println();

        // Change values using SETTER
        obj.setmobileId(102);
        obj.setbrand("Samsung");
        obj.setmodel("Galaxy S25");
        obj.setprice(120000.00);

        System.out.println("--- Updated Details ---");

        // Get updated values using GETTER
        System.out.println("Mobile ID : " + obj.getmobileId());
        System.out.println("Brand : " + obj.getbrand());
        System.out.println("Model : " + obj.getmodel());
        System.out.println("Price : " + obj.getprice());
    }
}