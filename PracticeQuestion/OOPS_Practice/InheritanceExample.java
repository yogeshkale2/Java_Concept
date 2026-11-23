class Cal {
    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;

    }
}

class Advcal extends Cal {
    public int multi(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        return a * b;
    }
}

class VeryAdvCal extends Advcal {
    public double power(int a, int b) {
        return Math.pow(a, b);

    }
}

public class InheritanceExample {
    public static void main(String[] args) {

        VeryAdvCal cal = new VeryAdvCal();
        int r1 = cal.add(10, 2);
        int r2 = cal.sub(10, 10);
        int r3 = cal.multi(10, 10);
        int r4 = cal.div(15, 2);
        double r5 = cal.power(r3, r4);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);

    }
}
