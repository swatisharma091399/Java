package LabSheet7;
import java.util.*;

public class code04 {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        fruits.add(1, "Mango"); // insert at index 1
        System.out.println("Updated List: " + fruits);
    }
}
