class Pri implements Runnable {

    public void run() {
        System.out.println("Thread using Runnable: "
                + Thread.currentThread().getName());
    }
}

public class priorityThreadEx {

    public static void main(String[] args) {

        Pri obj = new Pri();

        Thread t1 = new Thread(obj, "FCT - task1");
        Thread t2 = new Thread(obj, "FCT - task2");
        Thread t3 = new Thread(obj, "FCT - task3");

        // Set thread priority
        t1.setPriority(Thread.MIN_PRIORITY); // 1
        t2.setPriority(Thread.MIN_PRIORITY); // 1
        t3.setPriority(Thread.NORM_PRIORITY); // 5

        // Start threads
        t1.start();
        t2.start();
        t3.start();
    }
}