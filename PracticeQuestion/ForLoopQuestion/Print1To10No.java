public class Print1To10No {
    public static void main(String[] args) {

        System.out.println("First 10 numbers:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("Reverse 10 to 1:");
        // FIXED: Changed i++ to i-- to go backwards
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        for (int e = 0; e <= 100; e++) {
            if (e % 2 == 0) {
                System.out.println("Even Number : " + e);
            } else {
                System.out.println("Odd Number : " + e);
            }
        }

        
    }
}