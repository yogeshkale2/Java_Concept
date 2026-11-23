// Abstract class defines the contract for all payments

import java.util.Scanner;

abstract class Payment {

    public abstract void processPayment(double amount);

    public abstract void generateReceipt();
}

// Credit Card Payment Implementation
class CreditCardPayment extends Payment {

    private final String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Credit Card Payment of Rs "
                + amount + " using Card Number: " + cardNumber);
    }

    @Override
    public void generateReceipt() {
        System.out.println("Credit Card Payment Receipt Generated.");
    }
}
// UPI Payment Implementation

class UpiPayment extends Payment {

    private final String upiId;

    public UpiPayment(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing UPI Payment of Rs "
                + amount + " using UPI ID: " + upiId);
    }

    @Override
    public void generateReceipt() {
        System.out.println("UPI Payment Receipt Generated.");
    }
}

// Net Banking Payment Implementation
class NetBankingPayment extends Payment {

    private final String userId;

    public NetBankingPayment(String userId) {
        this.userId = userId;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Net Banking Payment of Rs "
                + amount + " for User ID: " + userId);
    }

    @Override
    public void generateReceipt() {
        System.out.println("Net Banking Payment Receipt Generated.");
    }
}
// Service that uses abstraction

class PaymentService {

    private final Payment payment;

    public PaymentService(Payment payment) {
        this.payment = payment;
    }

    public void executePayment(double amount) {
        payment.processPayment(amount);
        payment.generateReceipt();
    }
}

// Main Program
public class Payment_getway {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select Payment Method: 1. Credit Card  2. UPI  3. Net Banking");
        int choice = scanner.nextInt();
        System.out.print("Enter Amount: ");
        double amount = scanner.nextDouble();
        Payment payment;
        switch (choice) {
            case 1:
                System.out.print("Enter Credit Card Number: ");
                String cardNumber = scanner.next();
                payment = new CreditCardPayment(cardNumber);
                break;
            case 2:
                System.out.print("Enter UPI ID: ");
                String upiId = scanner.next();
                payment = new UpiPayment(upiId);
                break;
            case 3:
                System.out.print("Enter Net Banking User ID: ");
                String userId = scanner.next();
                payment = new NetBankingPayment(userId);
                break;
            default:
                System.out.println("Invalid choice!");
                scanner.close();
                return; // Exit safely
        }
        PaymentService service = new PaymentService(payment);
        service.executePayment(amount);
        scanner.close();
    }
}