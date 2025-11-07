package LabSheet10;
public class code20 {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            try {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Working " + i);
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted and is stopping.");
                return;
            }
        });
        t.start();
        Thread.sleep(1200); // let thread work a bit
        System.out.println("Interrupting worker thread...");
        t.interrupt();
        t.join();
        System.out.println("Worker terminated.");
    }
}
