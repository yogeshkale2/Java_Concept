// Example Of Method Overloading
/* class calulator {
    public void add(int a, String b) {
        System.out.println(a + b);
    }

    public void add(int b) {
        System.out.println(b);
    }

}

public class PloymophisamEx {
    public static void main(String[] args) {

        calulator c = new calulator();
        c.add(10, "Hello");
        c.add(20);

    }
}
*/

// Super keyword Example

class Employee {

    String name = "Yogesh";
}

class Developer extends Employee {

    String name = "Rahul";

    void display() {
        System.out.println("Child Name: " + name);
        System.out.println("Parent Name: " + super.name);
    }
}

public class PloymophisamEx {

    public static void main(String[] args) {

        Developer d = new Developer();

        d.display();
    }
}