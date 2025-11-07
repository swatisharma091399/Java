package LabSheet8;
import java.util.*;

public class code02 {
    public static void main(String[] args) {
        // Create a NavigableSet using TreeSet
        NavigableSet<Integer> numbers = new TreeSet<>();

        // Add some numbers
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("NavigableSet: " + numbers);

        int givenNumber = 35;
        System.out.println("\nGiven number: " + givenNumber);

        // closest matches
        System.out.println("lower(" + givenNumber + "): " + numbers.lower(givenNumber));   // just smaller
        System.out.println("floor(" + givenNumber + "): " + numbers.floor(givenNumber));   // smaller or equal
        System.out.println("ceiling(" + givenNumber + "): " + numbers.ceiling(givenNumber)); // greater or equal
        System.out.println("higher(" + givenNumber + "): " + numbers.higher(givenNumber)); // just greater
    }
}
