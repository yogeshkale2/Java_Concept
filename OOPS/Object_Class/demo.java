class Car {
    String Brand;
    String color;
    int speed;

    public void carInfo() {
        System.out.println(Brand + "car is expensive car and " + color + "is 10 outoff 10 rating ");
    }
}

public class demo {
    public static void main(String[] args) {
        Car obj = new Car();
        obj.Brand = "Toyota";
        obj.color = "Black";
        obj.speed = 200;
        obj.carInfo();

        Car obj1 = new Car();
        obj1.Brand = "TaTa";
        obj1.color = "White";
        obj1.speed = 300;
        obj1.carInfo();

    }
}