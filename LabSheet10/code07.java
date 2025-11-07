package LabSheet10;
import java.io.*;

public class code07 {
    public static void main(String[] args) {
        File in = new File("textfile.txt");
        File out = new File("out_copy.txt");
        try (BufferedReader br = new BufferedReader(new FileReader(in));
             BufferedWriter bw = new BufferedWriter(new FileWriter(out))) {
            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }
            System.out.println("Copied using try-with-resources.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
