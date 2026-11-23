import java.util.Scanner;

public class EvenOdd {

    // Function to check even or odd
    static void checkEvenOdd(int n) {
        if (n % 2 == 0) {
            System.out.println(n + " is Even");
        } else {
            System.out.println(n + " is Odd");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        checkEvenOdd(num);  // Function call
    }
}