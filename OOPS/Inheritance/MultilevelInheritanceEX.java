// Base Class 
class Account{
        String acountholdername;
        double balance;
        void deposite(double amount ){
            balance += amount; // balance = balance + amount
            System.out.println("Deposited: " + amount + " New Balance "+ balance );
        }
}

// Deriverd Class 
class SavingAcount extends Account{
            double interestRate;
            void applyInterest(){
                double interest = balance * interestRate / 100;
                balance += interest; // balance = balance + interest
                System.out.println("Interest Applied: " + interest + " New Balance "+ balance );
            }
}

class PremiumSavingAccount extends SavingAcount{
            double premiuminterestRate;
            void premiuminterestRate(){
                double interest = balance * premiuminterestRate / 100;
                balance += interest; // balance = balance + interest
                System.out.println("Interest Applied: " + interest + " New Balance "+ balance );
            }
}

public class MultilevelInheritanceEX{
    public static void main(String[] args){
  
        PremiumSavingAccount   sa = new PremiumSavingAccount();
        sa.acountholdername = "John Doe";
        sa.balance = 1000.0;
        sa.interestRate = 5.0;
        sa.premiuminterestRate = 2.0;
        System.out.println("Account Holder: " + sa.acountholdername);
        System.out.println("Initial Balance: " + sa.balance);

        sa.deposite(500.0); // Depositing money
        sa.applyInterest(); // Applying interest   
        sa.premiuminterestRate();   
    }
}