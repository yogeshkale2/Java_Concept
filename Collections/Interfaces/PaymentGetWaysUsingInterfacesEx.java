import java.util.Scanner;

interface payment {
    public abstract void process(double amount);

    public abstract void generateReceipt();
}

class cardpayment implements payment {
    private String cardnumber;

    // create the constructor it is used
    public cardpayment(String cardnumber) {
        this.cardnumber = cardnumber;
    }

    // call the abstract method
    @Override
    public void process(double amount) {
        System.out.println("Processing card payment: " + amount + "using card number: " + cardnumber);
    }

    @Override
    public void generateReceipt() {
        System.out.println("Generating card receipt");
    }
}

class upipayment implements payment {
    private final String uppid;

    // constructor are be used
    public upipayment(String upid) {
        this.uppid = upid;
    }

    @Override
    public void process(double amount) {
        System.out.println("Processing UPI payment: " + amount + " using UPI ID: " + uppid);

    }

    @Override

    public void generateReceipt() {
        System.out.println("Generating UPI receipt");
    }
}

class netbanking implements payment {
    private final String userid;

    // constructor are be used
    public netbanking(String userid) {
        this.userid = userid;
    }

    @Override
    public void process(double amount) {
        System.out.println("Processing net banking payment: " + amount + " using user ID: " + userid);
    }

    @Override
    public void generateReceipt() {
        System.out.println("Generating net banking receipt");
    }

}

class paymentservice {
    private final payment payment;

    public paymentservice(payment payment) {
        this.payment = payment;
    }

    public void executepayment(double amount) {
        payment.process(amount);
        payment.generateReceipt();
    }
}

public class PaymentGetWaysUsingInterfacesEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter payment method (1.card, 2.upi, 3.netbanking): ");
        int choice = scanner.nextInt();
        payment payment;
        switch (choice) {
            case 1:
                System.out.println("Enter card number: ");
                String cardNumber = scanner.next();
                payment = new cardpayment(cardNumber);
                break;
            case 2:
                System.out.println("Enter UPI ID: ");
                String upiId = scanner.next();
                payment = new upipayment(upiId);
                break;
            case 3:
                System.out.println("Enter user ID: ");
                String userId = scanner.next();
                payment = new netbanking(userId);
                break;
            default:
                System.out.println("Invalid choice");
                scanner.close();
                return;
        }

        paymentservice service = new paymentservice(payment);
        service.executepayment(1000);
    }
}
