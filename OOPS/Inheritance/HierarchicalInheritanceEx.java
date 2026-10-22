class Account{
    String acountholdername;
    double balance;
    void deposite(double amount ){
        balance += amount; // balance = balance + amount
        System.out.println("Deposited: " + amount + " New Balance "+ balance );
    }
}
// Deriverd Class1
class SavingAcount extends Account{
            double interestRate;
            void applyInterest(){
                double interest = balance * interestRate / 100;
                balance += interest; // balance = balance + interest
                System.out.println("Interest Applied: " + interest + " New Balance "+ balance );
            }
        }
// Deriverd Class2
class CurrentAccount extends Account{
            double overdraftLimit;
            void withdraw(double amount){
                if(balance + overdraftLimit >= amount){
                    balance -= amount;
                    System.out.println("Withdrawn: " + amount + " New Balance: " + balance);
                } else {
                    System.out.println("Withdrawal denied. Overdraft limit exceeded.");
                }
            }
        }





    public class HierarchicalInheritanceEx{

    public static void main(String[] args){
        
        SavingAcount   sa = new SavingAcount();
        sa.acountholdername = "John Doe";
        sa.balance = 1000.0;
        sa.interestRate = 5.0;
        System.out.println("Account Holder: " + sa.acountholdername);
        System.out.println("Initial Balance: " + sa.balance);

        sa.deposite(500.0); // Depositing money
        sa.applyInterest(); // Applying interest

        CurrentAccount ca = new CurrentAccount();
        ca.acountholdername = "Jane Smith";
        ca.balance = 1000.0;
        ca.overdraftLimit = 500.0;
        System.out.println("\nAccount Holder: " + ca.acountholdername);
        System.out.println("Initial Balance: " + ca.balance);

        ca.deposite(500.0); // Depositing money
        ca.withdraw(500.0); // Withdrawing money within overdraft limit
        ca.withdraw(200.0); // Attempting to withdraw beyond overdraft limit

    }
}