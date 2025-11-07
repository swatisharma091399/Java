package LabSheet8;
import java.util.*;

public class code17 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>(Arrays.asList("A", "B", "C"));
        ArrayList<String> list = new ArrayList<>(set);
        System.out.println("HashSet: " + set);
        System.out.println("Converted ArrayList: " + list);
    }
}
