class Product {
    int productId;
    String productName;
    double price;

    Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;

    }

    void productInfo() {
        System.out.println("Product Id : " + productId);
        System.out.println("Product Name : " + productName);
        System.out.println("Price : " + price);
    }

}

class ElectronicProduct extends Product {
    double discount;

    ElectronicProduct(int productId, String productName, double price, double discount) {
        super(productId, productName, price);
        this.discount = discount;

    }

    void applyDiscount() {
        double discountAmount = price * (discount / 100);
        double finalPrice = price - discountAmount;

        System.out.println("Discount : " + discount + "%");
        System.out.println("Discount Amount : " + discountAmount);
        System.out.println("Final Price : " + finalPrice);
    }

}

public class OnlineShoppingSystem {
    public static void main(String[] args) {
        ElectronicProduct obj = new ElectronicProduct(112, "Mobile", 70000.00, 20);
        System.out.println("--- Product Details ---");
        obj.productInfo();
        System.out.println();
        obj.applyDiscount();

    }

}
