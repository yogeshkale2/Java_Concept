public class Largest_three_number {
    public static void main(String[] args) {

        int a = 90;
        int b = 20;
        int c = 00;

        if (a > b && a > c) {
            System.out.println("A is greatest");
        } else if (b > a && b > c) {
            System.out.println("B is greatest");
        } else {
            System.out.println("C is greatest");
        }
    }
}