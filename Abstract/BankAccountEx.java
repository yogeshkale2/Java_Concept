abstract class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;

    public BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;

    }

    public abstract void deposite(double amount);

    public abstract void withdraw(double amount);

    public void bankBalance() {
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Balance : " + balance);
    }
}

class SavingAccount extends BankAccount {
    SavingAccount(String accountHolder, String accountNumber, double balance) {
        super(accountHolder, accountNumber, balance);
    }

    @Override
    public void deposite(double amount) {
        System.out.println("Deposited : " + amount);
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Withdraw : " + amount);
    }

}

public class BankAccountEx {
    public static void main(String[] args) {
        SavingAccount obj = new SavingAccount("Yogesh Patil", "1234", 70000.00);
        obj.bankBalance();
        obj.deposite(5000);
        obj.withdraw(2000);

    }
}