class BankAccount {

    String accountHolder;
    double balance;

    // Deposit money
    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }

    // Withdraw money
    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    // Display balance
    void displayBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}

// Child class 1
class SavingsAccount extends BankAccount {

    void calculateInterest() {
        double interest = balance * 5 / 100;
        System.out.println("Interest: " + interest);
    }
}

// Child class 2
class CurrentAccount extends BankAccount {

    void checkMinimumBalance() {
        if (balance < 1000) {
            System.out.println("Minimum balance is required");
        } else {
            System.out.println("Balance is sufficient");
        }
    }
}

// Main class
public class BankAccountSystem {

    public static void main(String[] args) {

        // Savings Account object
        SavingsAccount s = new SavingsAccount();

        s.accountHolder = "Yogesh";
        s.balance = 10000;

        System.out.println("Savings Account");

        s.deposit(5000);
        s.withdraw(2000);
        s.displayBalance();
        s.calculateInterest();

        System.out.println();

        // Current Account object
        CurrentAccount c = new CurrentAccount();

        c.accountHolder = "Rahul";
        c.balance = 500;

        System.out.println("Current Account");

        c.deposit(1000);
        c.withdraw(200);

        c.displayBalance();
        c.checkMinimumBalance();
    }
}