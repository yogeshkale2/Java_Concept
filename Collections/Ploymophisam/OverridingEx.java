//base class 
class Employee {
        String empName;
        double baseSalary;

        public double calculatorSalary() {
                return baseSalary;
        }

        public void displaydetails() {
                System.out.println("Employee Name: " + empName);
                System.out.println("Employee Salary: " + calculatorSalary());

        }
}

// derived class
class FullTimeEmployee extends Employee {
        double bonus;

        @Override
        public double calculatorSalary() {
                return baseSalary + bonus;
        }
}

class PartTimeEmployee extends Employee {
        double hourRate;
        int hourWorked;

        @Override
        public double calculatorSalary() {
                return hourRate * hourWorked;
        }
}

class TempEmployee extends Employee {
        double perhour;
        int hourlyrate;

        @Override
        public double calculatorSalary() {
                return perhour * hourlyrate;
        }
}

public class OverridingEx {
        public static void main(String[] args) {

                FullTimeEmployee fte = new FullTimeEmployee();
                fte.empName = "John";
                fte.baseSalary = 50000;
                fte.bonus = 10000;
                fte.displaydetails();

                PartTimeEmployee obj = new PartTimeEmployee();
                obj.baseSalary = 50000;
                obj.empName = "Amit";
                obj.hourRate = 500;
                obj.hourWorked = 6;
                obj.displaydetails();

                PartTimeEmployee Pte = new PartTimeEmployee();
                Pte.empName = "Ravi";
                Pte.baseSalary = 50000;
                Pte.hourRate = 500;
                Pte.hourWorked = 6;
                Pte.displaydetails();

                TempEmployee te = new TempEmployee();
                te.empName = "Ramesh";
                te.baseSalary = 50000;
                te.perhour = 500;
                te.hourlyrate = 6;
                te.displaydetails();
        }
}
