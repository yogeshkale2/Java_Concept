class Parent {

    String name = "Parent";

    void display() {
        System.out.println("Parent Display Method");
    }
}

class Child extends Parent {

    String name = "Child";

    void printNames() {

        // 1. Parent class variable
        System.out.println("Child Name: " + name);
        System.out.println("Parent Name: " + super.name);

        // 2. Parent class method
        super.display();
    }
}

class Employee {

    String company;

    // Parent constructor
    Employee(String company) {
        this.company = company;
        System.out.println("Employee Constructor Called");
    }

    void getDetails() {
        System.out.println("Company: " + company);
    }
}

class Manager extends Employee {

    String department;

    // Parent class constructor
    Manager(String department, String company) {

        super(company); // calls Employee constructor

        this.department = department;

        System.out.println("Manager Constructor Called");
        System.out.println("Department: " + department);
    }
}

public class SuperKeywordEx {

    public static void main(String[] args) {

        // Case 1 & 2: super variable + method
        Child child = new Child();
        child.printNames();

        System.out.println("----------------");

        // Case 3: super constructor
        Manager manager = new Manager("IT", "TCS");

        manager.getDetails();
    }
}