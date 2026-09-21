class Employee {
    String name;
    double salary;

    void work() {
        System.out.println(name + " is Working");
    }

    void display() {
        System.out.println("Name : " + name);
        System.out.println("Salary : " + salary);
    }
}

class Developer extends Employee {

    void code() {
        System.out.println(name + " is Writing Code");
    }
}

class Manager extends Employee {

    void manageTeam() {
        System.out.println(name + " is Managing The Team");
    }
}

public class EmployeeManagementSystem {

    public static void main(String[] args) {

        // Developer object
        Developer dev = new Developer();

        dev.name = "Yogesh";
        dev.salary = 20050.00;

        dev.display(); // Parent method
        dev.work(); // Parent method
        dev.code(); // Developer method

        System.out.println();

        // Manager object
        Manager manager = new Manager();

        manager.name = "Rahul";
        manager.salary = 23000.00;

        manager.display(); // Parent method
        manager.work(); // Parent method
        manager.manageTeam(); // Manager method
    }
}