package LabSheet10;
import java.io.*;

public class code03 {
    public static void main(String[] args) {
        File file = new File("sample.txt"); // create sample.txt in same folder or provide full path
        try (FileInputStream fis = new FileInputStream(file)) {
            int b;
            while ((b = fis.read()) != -1) {
                System.out.print((char) b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
