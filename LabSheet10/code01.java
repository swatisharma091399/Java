package LabSheet10;
import java.io.*;

public class code01 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Enter a line: ");
            String line = br.readLine();
            System.out.println("You typed: " + line);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

