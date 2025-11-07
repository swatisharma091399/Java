package LabSheet7;
import java.util.*;

public class code20 {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>(Arrays.asList(30, 10, 50, 20));
        TreeSet<Integer> treeSet = new TreeSet<>(Arrays.asList(30, 10, 50, 20));

        System.out.println("HashSet (Unordered): " + hashSet);
        System.out.println("TreeSet (Sorted): " + treeSet);
    }
}
