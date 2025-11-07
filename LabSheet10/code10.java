package LabSheet10;
import java.io.*;

public class code10 {
    public static void main(String[] args) {
        File out = new File("user_data.txt");
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new FileWriter(out))) {
            String line;
            System.out.println("Enter lines (type STOP to finish):");
            while ((line = br.readLine()) != null) {
                if ("STOP".equals(line)) break;
                bw.write(line);
                bw.newLine();
            }
            System.out.println("Saved to user_data.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

