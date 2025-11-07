package LabSheet7;
import java.util.*;

public class code16 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Java");
        set.add("Python");
        set.add("Java"); // duplicate

        System.out.println("HashSet elements: " + set);
    }
}
