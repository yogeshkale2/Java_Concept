public class CallByValueEx {

    public static void changevalue(int a) {
        a = 10;
        System.out.println("Inside Changevalue : " + a);
    }

    public static void main(String[] args) {
        int a = 5;
        System.out.println("Before Change value :" + a);
        changevalue(a);
        System.out.println("After change value : " + a);

    }
}