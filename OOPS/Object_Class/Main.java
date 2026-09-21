class student {
    String name;
    int age;
    double marks;

    void displayInfo() {
        System.out.println("Name " + name);
        System.out.println("age " + age);
        System.out.println("Marks " + marks);
    }
}

public class Main {
    public static void main(String[] args) {
        student obj = new student();
        obj.name = "Yogesh";
        obj.age = 21;
        obj.marks = 80;

        obj.displayInfo();
    }

}