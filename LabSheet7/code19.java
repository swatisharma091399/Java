package LabSheet7;
import java.util.*;

public class code19 {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>(Arrays.asList(5, 15, 25, 35, 45));

        System.out.println("First element: " + set.first());
        System.out.println("Last element: " + set.last());
    }
}
