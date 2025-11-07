package LabSheet8;
import java.util.*;

public class code05 {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>(Arrays.asList(10, 20, 30, 40, 50));
        System.out.println("Original Set: " + set);
        System.out.println("pollFirst(): " + set.pollFirst());
        System.out.println("pollLast(): " + set.pollLast());
        System.out.println("Modified Set: " + set);
    }
}
