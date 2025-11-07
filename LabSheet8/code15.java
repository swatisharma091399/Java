package LabSheet8;
import java.util.*;

public class code15 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 4, 4, 5));
        Set<Integer> unique = new HashSet<>(list);
        System.out.println("Original List: " + list);
        System.out.println("After removing duplicates: " + unique);
    }
}

