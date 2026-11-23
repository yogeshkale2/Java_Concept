class Car {
    private String brand;
    private String color;
    private int speed;

    public Car(String brand, String color, int speed) {
        this.brand = brand;
        this.color = color;
        setspeed(speed);
    }

    public void driveCar() {
        System.out.println(brand + " is driving at " + speed);
    }

    public void setspeed(int speed) {
        if (speed < 0) {
            speed = 0;
        }
        this.speed = speed;
    }

}

public class EncapsulationEx {
    public static void main(String[] args) {
        Car car = new Car("Totota", "Black", -350);
        // car.setspeed(-200);
        car.driveCar();

    }
}
