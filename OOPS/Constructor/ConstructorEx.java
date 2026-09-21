 class Employee {
        String name;
        double salary;

        Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
           System.out.println("Constructor Executed");
        }
        Employee(Employee emp){
            this.name = emp.name;
            this.salary=emp.salary;
            System.out.println("Copy Constructor Executed");
        }

        void display() {
            System.out.println(name + " " + salary);
        }
}
public class ConstructorEx {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Rocky", 50000.0);
        emp1.display();

        Employee emp2 = new Employee(emp1);
        emp2.name = "Tommy";
        emp2.salary = 60000.0;
        emp2.display();
    }
}
