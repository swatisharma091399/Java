package LabSheet10;
import java.io.*;

class FileReaderTask implements Runnable {
    private final File file;
    FileReaderTask(File file) { this.file = file; }
    public void run() {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line; System.out.println("----- Contents of " + file.getName() + " -----");
            while ((line = br.readLine()) != null) System.out.println(line);
        } catch (IOException e) {
            System.out.println("Error reading " + file.getName() + ": " + e.getMessage());
        }
    }
}

public class code11 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new FileReaderTask(new File("f1.txt")));
        Thread t2 = new Thread(new FileReaderTask(new File("f2.txt")));
        t1.start(); t2.start();
    }
}
