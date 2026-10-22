class c {
    void add(int a, int b) {
        System.out.println("Addtion of a And b : " + (a + b));
    }

    void subtraction(int a, int b) {
        System.out.println("Subtraction : " + (a - b));
    }

    void Multiplaction(int a, int b) {
        System.out.println("Multiplaction : " + (a * b));
    }

    void Division(int a, int b) {
        System.out.println("Division : " + (a / b));
    }
}

public class Calculator {
    public static void main(String[] args) {
        c obj = new c();
        obj.add(10, 20);
        obj.subtraction(10, 20);
        obj.Multiplaction(10, 20);
        obj.Division(10, 20);

    }

}
