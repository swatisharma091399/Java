package LabSheet10;
import java.io.*;

class Logger {
    private final File file;
    Logger(File file) { this.file = file; }

    public synchronized void log(String message) {
        try (FileWriter fw = new FileWriter(file, true);
             BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write(Thread.currentThread().getName() + ": " + message);
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

public class code12 {
    public static void main(String[] args) {
        Logger logger = new Logger(new File("shared.log"));
        Runnable r = () -> {
            for (int i = 0; i < 5; i++) logger.log("entry " + i);
        };
        Thread t1 = new Thread(r, "T1");
        Thread t2 = new Thread(r, "T2");
        t1.start(); t2.start();
    }
}

