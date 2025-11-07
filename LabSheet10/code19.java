package LabSheet10;
public class code19 {
    public static void main(String[] args) throws InterruptedException {
        ThreadGroup group = new ThreadGroup("Workers");
        Runnable r = () -> {
            try { Thread.sleep(200); } catch (InterruptedException e) {}
        };
        Thread t1 = new Thread(group, r, "T1");
        Thread t2 = new Thread(group, r, "T2");
        t1.start(); t2.start();

        Thread.sleep(50);
        Thread[] threads = new Thread[group.activeCount()];
        int n = group.enumerate(threads);
        for (int i = 0; i < n; i++) {
            System.out.println("Thread: " + threads[i].getName() + ", Alive: " + threads[i].isAlive());
        }
    }
}
