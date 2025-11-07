package LabSheet10;
import java.io.*;

public class code09 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            System.out.println("Type lines (type exit to stop):");
            while ((line = br.readLine()) != null) {
                if ("exit".equalsIgnoreCase(line.trim())) break;
                System.out.println("You: " + line);
            }
            System.out.println("Stopped.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
