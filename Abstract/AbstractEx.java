abstract class vehicle{
    int noOfTyers;
    void displaytyres(){
        System.out.println("No Of Tyers :" + noOfTyers);
    }
    abstract void start();
}

class Car extends vehicle{
    void start(){
    noOfTyers = 4;
    System.out.println("Car is start with key ");
    
    }

}
class Bike extends vehicle{
    void start(){
        noOfTyers = 2;
        System.out.println("Bike is start with key");
    }
}


public class AbstractEx {
   

    public static void main(String[] args) {
       vehicle v = new Car();
       v.start();
       v.displaytyres();

       vehicle obj = new Bike();
         obj.start();
         obj.displaytyres();

    }
}