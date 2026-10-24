class Account {
    private String accountHolder;
    private String accountnumber;
    private double balance;

    // Constructor
    public Account(String accountHolder, String accountnumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountnumber = accountnumber;
        this.balance = balance;
    }

    // Getter and Setter methods (पहले वाले)
    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public String getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(String accountnumber) {
        this.accountnumber = accountnumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " successfully deposited. Current Balance: " + balance);
        } else {
            System.out.println("Deposit amount must be greater than 0.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println(amount + " successfully withdrawn. Remaining Balance: " + balance);
            } else {
                System.out.println("Insufficient balance! Withdrawal failed.");
            }
        } else {
            System.out.println("Withdrawal amount must be greater than 0.");
        }
    }

    public void displayBalance() {
        System.out.println("-------------------------");
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountnumber);
        System.out.println("Total Balance: " + balance);
        System.out.println("-------------------------");
    }
}

public class Bank {
    public static void main(String[] args) {

    }

}
