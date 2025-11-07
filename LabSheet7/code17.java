package LabSheet7;
import java.util.*;

public class code17 {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5, 6));

        set1.retainAll(set2);
        System.out.println("Common elements (intersection): " + set1);
    }
}
