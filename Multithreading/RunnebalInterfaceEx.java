class Task1 implements Runnable {
    public void run() {
        System.out.println("Thread using Runnable ");
    }
}

public class RunebalInterfaceEx {
    public static void main(String[] args) {
        Task1 task = new Task1();
        Thread t1 = new Thread(task, "FCT - task");
        t1.start();
        System.out.println(t1.getName());
    }

}
