package LabSheet8;
import java.util.*;

public class code12 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Java", "C++", "Java", "Python"));
        System.out.println("Before: " + list);
        Collections.replaceAll(list, "Java", "Kotlin");
        System.out.println("After: " + list);
    }
}
