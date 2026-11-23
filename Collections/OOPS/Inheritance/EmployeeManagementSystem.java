class Employee {
    String name;
    double salary;

    void displayInfo() {
        System.out.println("Employee name : " + name);
        System.out.println("Employee salary : " + salary);
    }
}

class Manager extends Employee {
    String department;

    void displayManager() {
        System.out.println("Department : " + department);
    }
}

class developer extends Employee {
    String ProgrammingLanguage;

    void displayDeveloper() {
        System.out.println("Programming Language : " + ProgrammingLanguage);
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Manager obj = new Manager();
        System.out.println("\t  || Manager Details || ");

        obj.name = "Yogesh";
        obj.salary = 50000.00;
        obj.department = "HR";
        obj.displayInfo();
        obj.displayManager();

        developer dev = new developer();
        System.out.println("\t ||Developer Details ||");

        dev.name = "Vijay";
        dev.salary = 800000.00;
        dev.ProgrammingLanguage = "Java";

        dev.displayInfo();
        dev.displayDeveloper();

    }

}
