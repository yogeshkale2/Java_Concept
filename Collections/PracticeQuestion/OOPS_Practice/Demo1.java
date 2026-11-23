import java.util.Scanner;

class Student {
    private String name;
    private int rollNo;
    private double javaMarks;
    private double sqlMarks;
    private double aptitudeMarks;

    // Parameterized constructor
    Student(String name, int rollNo, double javaMarks,
            double sqlMarks, double aptitudeMarks) {
        this.name = name;
        this.rollNo = rollNo;
        this.javaMarks = javaMarks;
        this.sqlMarks = sqlMarks;
        this.aptitudeMarks = aptitudeMarks;
    }

    // Teeno subjects ka total
    double calculateTotal() {
        return javaMarks + sqlMarks + aptitudeMarks;
    }

    // Maximum marks = 300
    double calculatePercentage() {
        return (calculateTotal() / 300.0) * 100;
    }

    // Result aur grade display karo
    void displayResult() {
        double total = calculateTotal();
        double percentage = calculatePercentage();

        String result;
        String grade;

        if (javaMarks < 35 || sqlMarks < 35 || aptitudeMarks < 35) {
            result = "FAIL";
            grade = "NA";
        } else {
            result = "PASS";

            if (percentage >= 80) {
                grade = "A";
            } else if (percentage >= 60) {
                grade = "B";
            } else if (percentage >= 40) {
                grade = "C";
            } else {
                grade = "D";
            }
        }

        System.out.println("\n--- Student Result ---");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Java Marks: " + javaMarks);
        System.out.println("SQL Marks: " + sqlMarks);
        System.out.println("Aptitude Marks: " + aptitudeMarks);
        System.out.println("Total: " + total + " / 300");
        System.out.println("Percentage: " + percentage);
        System.out.println("Result: " + result);
        System.out.println("Grade: " + grade);
    }
}

public class Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter roll number: ");
        int rollNo = sc.nextInt();

        System.out.print("Enter Java marks: ");
        double javaMarks = sc.nextDouble();

        System.out.print("Enter SQL marks: ");
        double sqlMarks = sc.nextDouble();

        System.out.print("Enter Aptitude marks: ");
        double aptitudeMarks = sc.nextDouble();

        // User ki input constructor ko pass karo
        Student student = new Student(
                name, rollNo, javaMarks, sqlMarks, aptitudeMarks);

        student.displayResult();

        sc.close();
    }
}