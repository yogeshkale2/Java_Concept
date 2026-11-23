class Account {

    private int accountNumber;
    private String accountHolder;
    private double balance;

    // Constructor
    public Account(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Getters
    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    // Setters
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    // Account Information
    public void accountInfo() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Balance : " + balance);
    }

    // Deposit
    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposit Amount : " + amount);
            System.out.println("New Balance : " + balance);
        } else {
            System.out.println("Invalid Deposit Amount");
        }
    }

    // Withdraw
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdraw Amount : " + amount);
            System.out.println("New Balance : " + balance);
        } else {
            System.out.println("Insufficient Balance");
        }
    }
}

public class BankAccountSystem {

    public static void main(String[] args) {

        Account account = new Account(
                123,
                "Aniket",
                50000.00);

        System.out.println("--- Account Details ---");

        account.accountInfo();

        System.out.println();

        // Update account details
        account.setAccountNumber(112);
        account.setAccountHolder("Pritam");

        System.out.println("--- Updated Details ---");

        System.out.println("Account Number : "
                + account.getAccountNumber());

        System.out.println("Account Holder : "
                + account.getAccountHolder());

        System.out.println();

        // Deposit
        account.deposit(5000);

        System.out.println();

        // Withdraw
        account.withdraw(3000);

        System.out.println();

        // Invalid withdrawal
        account.withdraw(100000);

        System.out.println();

        System.out.println("--- Final Balance ---");
        System.out.println("Balance : " + account.getBalance());
    }
}