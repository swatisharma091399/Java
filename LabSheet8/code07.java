package LabSheet8;
import java.util.*;

public class code07 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("Java", "Python", "C++", "Ruby"));
        System.out.println("Before shuffle: " + list);
        Collections.shuffle(list);
        System.out.println("After shuffle: " + list);
    }
}
