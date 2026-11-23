class Employee {

    private int employeeId;
    private String name;
    private String department;
    private double salary;

    // Constructor
    public Employee(int employeeId, String name, String department, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // Display Information
    public void EmpInfo() {
        System.out.println("Employee ID : " + employeeId);
        System.out.println("Employee Name : " + name);
        System.out.println("Department : " + department);
        System.out.println("Salary : " + salary);
    }

    // Getter
    public int getEmployeeId() {
        return employeeId;
    }

    // Setter
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    // Getter
    public String getDepartment() {
        return department;
    }

    // Setter
    public void setDepartment(String department) {
        this.department = department;
    }

    // Getter
    public double getSalary() {
        return salary;
    }

    // Setter
    public void setSalary(double salary) {
        this.salary = salary;
    }
}

public class EmployeeManagementSystem {

    public static void main(String[] args) {

        Employee obj = new Employee(
                1,
                "Vijay Khetre",
                "IT",
                70000.00);

        obj.EmpInfo();

        System.out.println();

        System.out.println("---- Updated Details ----");

        // Set / Change values
        obj.setEmployeeId(2);
        obj.setName("Tushar Kende");
        obj.setDepartment("Software");
        obj.setSalary(65000.00);

        // Get / Read values
        System.out.println("Employee ID : " + obj.getEmployeeId());
        System.out.println("Name : " + obj.getName());
        System.out.println("Department : " + obj.getDepartment());
        System.out.println("Salary : " + obj.getSalary());
    }
}