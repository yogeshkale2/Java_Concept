record Bike(String brand, int speed) {
}

public class RecordDemo {
    public static void main(String[] args) {
        Bike bike = new Bike("Totota", 250);
        System.out.println(bike);
        System.out.println("Brand : " + bike.brand());
        System.out.println("Speed : " + bike.speed());
    }

}
