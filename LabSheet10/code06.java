package LabSheet10;
import java.io.*;

public class code06 {
    public static void main(String[] args) {
        File file = new File("out.txt");
        try (FileWriter fw = new FileWriter(file, true);
             BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write("This is a sample line.\n");
            bw.write("Another line.\n");
            System.out.println("Written to out.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

