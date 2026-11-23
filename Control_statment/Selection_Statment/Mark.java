public class Mark {
    public static void main(String[] args) {

        int mark = 60;

        if (mark >= 90) {
            System.out.println("A Grade");
        } else if (mark >= 70 && mark < 90) {
            System.out.println("B Grade");
        } else if (mark >= 35 && mark < 70) {
            System.out.println("C Grade");
        } else {
            System.out.println("Fail");
        }
    }
}