class Student {
    String name;
}

public class CallByReferenceEx {
    public static void changevalue(Student s) {
        s.name = "Pratik";
        System.out.println("Inside Change value : " + s.name);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Pranav";
        System.out.println("Before Change Value " + s1.name);
        changevalue(s1);
        System.out.println("After Change Value :" + s1.name);

    }

}
