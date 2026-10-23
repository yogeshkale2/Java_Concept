class Bank {

    private int accountNumber;
    private String accountHolder;
    private double balance;

    // Constructor
    public Bank(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Bank Information
    public void bankInfo() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Balance : " + balance);
    }

    // Getter
    public int getAccountNumber() {
        return accountNumber;
    }

    // Setter
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Getter
    public String getAccountHolder() {
        return accountHolder;
    }

    // Setter
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    // Getter
    public double getBalance() {
        return balance;
    }

    // Setter
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Deposit
    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposit Amount : " + amount);
        System.out.println("New Balance : " + balance);
    }

    // Withdraw
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdraw Amount : " + amount);
            System.out.println("New Balance : " + balance);
        } else {
            System.out.println("Insufficient Balance...");
        }
    }
}

public class BankAccountSystem {

    public static void main(String[] args) {

        Bank obj = new Bank(101, "Yogesh Patil", 580000.00);

        obj.bankInfo();

        System.out.println();

        // Change Account Holder
        obj.setAccountHolder("Gaurav Patil");
        System.out.println("Updated Account Holder : "
                + obj.getAccountHolder());

        // Change Account Number
        obj.setAccountNumber(102);
        System.out.println("Updated Account Number : "
                + obj.getAccountNumber());

        System.out.println();

        // Deposit
        obj.deposit(5000);

        System.out.println();

        // Withdraw
        obj.withdraw(2000);

        System.out.println();

        System.out.println("Final Balance : " + obj.getBalance());
    }
}