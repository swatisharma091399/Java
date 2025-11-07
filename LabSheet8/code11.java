package LabSheet8;
import java.util.*;

public class code11 {
    public static void main(String[] args) {
        ArrayList<String> src = new ArrayList<>(Arrays.asList("A", "B", "C"));
        ArrayList<String> dest = new ArrayList<>(Arrays.asList("X", "Y", "Z"));
        Collections.copy(dest, src);
        System.out.println("After copy, destination: " + dest);
    }
}
