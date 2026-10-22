class CoffeeOrder {
    String CustomerName;
    String size;
    String type;

    public CoffeeOrder(String CustomerName, String size, String type) {
        this.CustomerName = CustomerName;
        this.size = size;
        this.type = type;

    }

    void printReceipt() {
        System.out.println("Your Order " + this.CustomerName + " a " + this.size + this.type);
    }

}

public class CoffeeShope {
    public static void main(String[] args) {
        CoffeeOrder obj = new CoffeeOrder("Alice", "Latte", "Large");

        obj.printReceipt();

        CoffeeOrder obj2 = new CoffeeOrder("Bob", "Espresso", "Small");
        obj2.printReceipt();

    }

}
