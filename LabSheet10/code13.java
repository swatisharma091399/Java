package LabSheet10;

public class code13 {
    private static final Object A = new Object();
    private static final Object B = new Object();

    // Both threads acquire locks in the SAME order to prevent deadlock
    static class Worker1 implements Runnable {
        public void run() {
            synchronized (A) {
                System.out.println("Worker1 locked A");
                try { Thread.sleep(50); } catch (InterruptedException e) {}
                synchronized (B) {
                    System.out.println("Worker1 locked B");
                }
            }
        }
    }

    static class Worker2 implements Runnable {
        public void run() {
            synchronized (A) {
                System.out.println("Worker2 locked A");
                try { Thread.sleep(50); } catch (InterruptedException e) {}
                synchronized (B) {
                    System.out.println("Worker2 locked B");
                }
            }
        }
    }

    public static void main(String[] args) {
        new Thread(new Worker1()).start();
        new Thread(new Worker2()).start();
    }
}

