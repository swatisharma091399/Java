package LabSheet10;
import java.io.*;

public class code02 {
    public static void main(String[] args) {
        try (OutputStreamWriter osw = new OutputStreamWriter(System.out)) {
            osw.write("Hello using OutputStreamWriter\n");
            osw.flush(); // important to push to console
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

