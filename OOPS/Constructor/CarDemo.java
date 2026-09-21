class Car {
    String brand;
    String color;
    int speed;

    // Constructor
    public Car(String brand, String color, int speed) {
        System.out.println("Constructor Called...");
        this.brand = brand;
        this.color = color;
        this.speed = speed;

    }

    public void drive() {
        System.out.println(brand + " is driving at " + speed + " km/hr");
    }

    public int getspeed() {
        return speed;
    }

    public void setspeed(int speed) {
        this.speed = speed;

    }
}

public class CarDemo {
    public static void main(String[] args) {

        Car car1 = new Car("Toyota", "Black", 200);
        car1.drive();

        System.out.println("\n");

        Car car2 = new Car("TATA", "White", 350);
        car2.drive();

        Car car3 = new Car("Honda", "Red", 100);
        car3.drive();

        System.out.println("Honda Speed : " + car3.getspeed());

        System.out.println("\n");
        System.out.println(car2.getspeed());
        car2.setspeed(700);
        System.out.println(car2.getspeed());

    }
}
