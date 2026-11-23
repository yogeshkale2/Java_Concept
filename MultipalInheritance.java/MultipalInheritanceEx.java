interface AccountOperation {
    void deposite(double amount);

}

interface LoanOperation {
    void applyLoan(double amount);
}

class SmartAccount implements AccountOperation, LoanOperation {
    Double balance;
    String accountHolderName;

    // public SmartAccount(double balance , String accountHolderName){
    // this.balance = balance;
    // this.accountHolderName = accountHolderName;

    // }
    @Override
    public void deposite(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited :" + amount + "New Balance : " + balance);
        } else {
            System.out.println("Deposite amount must be positive.");
        }
    }

    @Override
    public void applyLoan(double amount) {
        if (amount > 0) {
            System.out.println("Loan applied :" + amount + ", new Balance :" + balance);
        } else {
            System.out.println("Loan amount must be positive .");
        }
    }
}

public class MultipalInheritanceEx {
    public static void main(String[] args) {
        SmartAccount obj = new SmartAccount();
        obj.accountHolderName = "Gaurav Patil";
        obj.balance = 1000.0;

        obj.deposite(1000);
        obj.applyLoan(500000);

    }
}
