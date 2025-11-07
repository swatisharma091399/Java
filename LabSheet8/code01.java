package LabSheet8;
import java.util.*;

public class code01 {
    public static void main(String[] args) {
        // Create a SortedSet using TreeSet
        SortedSet<String> fruits = new TreeSet<>();

        // Add elements to the set
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Pineapple");

        // Display the original SortedSet
        System.out.println("Original SortedSet: " + fruits);

        // headSet() - elements strictly less than "Mango"
        System.out.println("headSet(\"Mango\"): " + fruits.headSet("Mango"));

        // tailSet() - elements greater than or equal to "Mango"
        System.out.println("tailSet(\"Mango\"): " + fruits.tailSet("Mango"));

        // subSet() - elements from "Banana" (inclusive) to "Pineapple" (exclusive)
        System.out.println("subSet(\"Banana\", \"Pineapple\"): " + fruits.subSet("Banana", "Pineapple"));
    }
}
