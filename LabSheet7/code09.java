package LabSheet7;
import java.util.*;

public class code09 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("Java"); // duplicate
        list.add("C++");

        System.out.println("ArrayList with duplicates: " + list);
    }
}
