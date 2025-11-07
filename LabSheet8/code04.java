package LabSheet8;
import java.util.*;

public class code04 {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>(Arrays.asList(10, 20, 30, 40, 50, 60));
        int limit = 35;
        System.out.println("Original Set: " + numbers);
        numbers.removeIf(n -> n < limit);
        System.out.println("After removing < " + limit + ": " + numbers);
    }
}
