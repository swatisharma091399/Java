package LabSheet8;
import java.util.*;

public class code09 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("apple", "banana", "apple", "orange", "apple"));
        System.out.println("List: " + list);
        System.out.println("Frequency of 'apple': " + Collections.frequency(list, "apple"));
    }
}
