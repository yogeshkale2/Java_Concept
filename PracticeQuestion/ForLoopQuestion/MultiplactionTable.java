import java.util.Scanner;

public class MultiplactionTable {
    public static void main(String[] args) {
        // int n = 2;

        // for (int i = 1; i <= 10; i++) {
        // // Print statement must be inside the loop

        // System.out.println(n + " X " + i + " = " + (n * i));
        // // System.out.println(n + " x " + i + " = " + (n * i));
        // }

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");

        // Declare 'n' only once here
        int n = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }

        scanner.close();
    }

}
