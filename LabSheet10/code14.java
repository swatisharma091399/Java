package LabSheet10;
import java.io.*;
import java.util.*;

public class code14 {
    public static <T> void writeListToFile(List<T> list, File out) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(out))) {
            for (T item : list) bw.write(item.toString() + System.lineSeparator());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Lavina", "Ankush", "Gesu");
        writeListToFile(names, new File("names.txt"));
        System.out.println("Wrote names.txt");
    }
}
