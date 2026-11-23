class Car {
    String Brand;
    String color;
    int Speed;

    public void drive() {
        System.out.println(Brand + " is driving at " + Speed + " (hrs Per KM)");
    }
}

public class CarDemo {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.Brand = "Toyota";
        car1.color = "White";
        car1.Speed = 150;

        Car car2 = new Car();
        car2.Brand = "Tata";
        car2.color = "Black";
        car2.Speed = 200;

        // System.out.println(car1);
        car1.drive();
        car2.drive();

    }
}