/* class Task1 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }

}

class Task2 extends Thread {
    public void run() {
        for (int i = 6; i <= 10; i++) {
            System.out.println(i);
        }
    }

}

public class MultithreadingEx {
    public static void main(String[] args) {
        Task1 t1 = new Task1();
        Task2 t2 = new Task2();

        t1.start();
        t2.start();
    }

}
*/
// Scheduler Example 
class Task1 extends Thread {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName());
        }

    }
}

public class MultithreadingEx {
    public static void main(String[] args) {
        Task1 obj = new Task1();
        Thread t1 = new Thread(obj, " - Task1");
        Thread t2 = new Thread(obj, " - Task2");
        t1.start();
        t1.start();
        t1.start();

    }
}
