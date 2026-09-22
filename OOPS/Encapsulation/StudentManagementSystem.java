class Student {

    private int rollNo;
    private String name;
    private double marks;

    // Constructor
    public Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    // Display Student Information
    public void studentInfo() {
        System.out.println("Roll No : " + rollNo);
        System.out.println("Name : " + name);
        System.out.println("Marks : " + marks);
    }

    // Getter
    public int getrollNo() {
        return rollNo;
    }

    // Getter
    public String getname() {
        return name;
    }

    // Getter
    public double getmarks() {
        return marks;
    }

    // Setter
    public void setmarks(double marks) {

        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid Marks");
        }
    }

    // Setter
    public void setname(String name) {
        this.name = name;
    }
}

public class StudentManagementSystem {

    public static void main(String[] args) {

        Student student = new Student(1, "Vijay", 99);

        System.out.println("--- Student Details ---");
        student.studentInfo();

        System.out.println();

        System.out.println("--- Updated Details ---");

        student.setname("Gaurav");
        student.setmarks(85);

        student.studentInfo();

        System.out.println();

        System.out.println("--- Final Details ---");

        student.setmarks(88);

        System.out.println("Name : " + student.getname());
        System.out.println("Marks : " + student.getmarks());
    }
}