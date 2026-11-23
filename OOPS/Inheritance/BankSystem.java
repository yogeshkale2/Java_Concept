
class BankAccount {

    String accountNumber;
    String accountHolder;
    double balance;

    // Parent class constructor
    BankAccount(String accountNumber, String accountHolder, double balance) {

        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Deposit money
    public void deposit(double amount) {

        balance = balance + amount;

        System.out.println("Amount Deposited : " + amount);
        System.out.println("New Balance      : " + balance);
    }

    // Display account information
    public void accountInfo() {

        System.out.println("----- ACCOUNT DETAILS -----");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Balance        : " + balance);
    }
}

// Child class
class SavingsAccount extends BankAccount {

    double interestRate;

    // Child class constructor
    SavingsAccount(String accountNumber, String accountHolder,
            double balance, double interestRate) {

        // Calling parent class constructor
        super(accountNumber, accountHolder, balance);

        this.interestRate = interestRate;
    }

    // Calculate interest
    void calculateInterest() {

        double interest = balance * interestRate / 100;

        balance = balance + interest;

        System.out.println("Interest         : " + interest);
        System.out.println("Final Balance     : " + balance);
    }
}

// Main class
public class BankSystem {

    public static void main(String[] args) {

        // Creating child class object
        SavingsAccount obj = new SavingsAccount("112", "Gaurav Patil", 60000.00, 5);

        // Calling parent class method
        obj.accountInfo();

        System.out.println();

        // Calling parent class method
        obj.deposit(5000);

        System.out.println();

        // Calling child class method
        obj.calculateInterest();
    }
}
