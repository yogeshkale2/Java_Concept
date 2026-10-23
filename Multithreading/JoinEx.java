class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Child Thraed : " + i);
            try {
                Thread.sleep(5000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

public class JoinEx {
    public static void main(String[] args) throws InterruptedException {
        MyThread obj1 = new MyThread();

        obj1.start();
        obj1.join();

        MyThread obj2 = new MyThread();
        obj2.start();
        obj2.join();

        for (int i = 6; i <= 10; i++) {
            System.out.println("Main Thread : " + i);
        }

    }

}
