interface Myinterface {
    public void sayHello();
}

public class LambdaExpressionEx {
    public static void main(String[] args) {
        // Without Lambda Function
        // Myinterface obj1 = new Myinterface() {
        // public void sayHello() {
        // System.out.println("Hello Without lambda function ");
        // }
        // };
        // obj1.sayHello();

        // using Lambda Expression
        Myinterface obj2 = () -> {
            System.out.println("Hello With Lambada Expression...");
        };
        obj2.sayHello();
    }
}