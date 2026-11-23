class MyThread extends Thread {
    public void run() {
        if (Thread.currentThread().isDaemon()) {
            System.out.println("Deamon Thread is Valid");
        } else {
            System.out.println("User Thread is running  ");
        }
    }
}

public class DaemonThreadEx {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1.setDaemon(true);
        t1.start();

        t2.start();

    }

}
