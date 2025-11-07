package LabSheet10;
import java.io.*;

public class code04 {
    public static void main(String[] args) {
        File src = new File("source.bin");
        File dest = new File("copy.bin");
        try (FileInputStream fis = new FileInputStream(src);
             FileOutputStream fos = new FileOutputStream(dest)) {
            byte[] buffer = new byte[4096];
            int n;
            while ((n = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, n);
            }
            System.out.println("File copied.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
