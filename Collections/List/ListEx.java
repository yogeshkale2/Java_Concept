import java.util.ArrayList;
import java.util.List;

class Car {
    String Brand;

    Car(String Brand) {
        this.Brand = Brand;
    }
}

public class ListEx {
    public static void main(String[] args) {
        List<String> users = new ArrayList<>();
        users.add("Yogesh");
        users.add("Vijay");
        users.add("Kumar");
        users.add("Androsun");
        users.add("Yogesh");

        for (String user : users) {
            System.out.println(user);
        }
        System.out.println("element Can Access Indexing :" + users.get(0));
        System.out.println("element Can Access Indexing :" + users.get(1));

        System.out.println("=== List of Object === ");

        Car car = new Car("Fortuner");
        Car car1 = new Car("Mercedes"); // Fixed spelling

        // Fix: Changed <String> to <Car>
        List<Car> carList = new ArrayList<>();

        // Fix: Used exact lowercase variable names 'car' and 'car1'
        carList.add(car);
        carList.add(car1);

        // Fix: Renamed loop variable to 'c' to avoid clashing with class name 'Car'
        for (Car c : carList) {
            // Fix: Print the 'Brand' property of the current object 'c'
            System.out.println(c.Brand);
        }
    } // The main method successfully ends here now
}