
class Employee1 {
    String name;
    double salary;
    String department;

    void displayInfo() {
        System.out.println("Name : " + name);
        System.out.println("Salary : " + salary);
        System.out.println("department : " + department);
    }

}

class Employee2 {
    String name;
    double salary;
    String department;

    void displayInfo() {
        System.out.println("Name : " + name);
        System.out.println("Salary : " + salary);
        System.out.println("department : " + department);
    }
}

public class Employee {
    public static void main(String[] args) {
        Employee1 emp1 = new Employee1();
        emp1.name = "Swaraj Patil";
        emp1.salary = 25000.00;
        emp1.department = "HR";

        Employee2 emp2 = new Employee2();
        emp2.name = "Gaurav Patil";
        emp2.salary = 300000.00;
        emp2.department = "Developer";

        emp1.displayInfo();
        emp2.displayInfo();

    }

}
