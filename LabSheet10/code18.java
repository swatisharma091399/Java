package LabSheet10;
import java.io.*;
import java.util.*;

public class code18 {
    // Simulation only — each thread writes its chunk to a separate file
    static class ChunkDownloader implements Runnable {
        private final int id;
        ChunkDownloader(int id) { this.id = id; }
        public void run() {
            File f = new File("chunk_" + id + ".part");
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(f))) {
                bw.write("Data-of-chunk-" + id);
                System.out.println("Downloaded chunk " + id);
                Thread.sleep(100);
            } catch (Exception e) { e.printStackTrace(); }
        }
    }

    public static void main(String[] args) {
        int chunks = 4;
        List<Thread> list = new ArrayList<>();
        for (int i = 1; i <= chunks; i++) {
            Thread t = new Thread(new ChunkDownloader(i));
            t.start();
            list.add(t);
        }
        // wait for all threads
        for (Thread t : list) {
            try { t.join(); } catch (InterruptedException e) { }
        }
        System.out.println("All chunks downloaded (simulated).");
    }
}
