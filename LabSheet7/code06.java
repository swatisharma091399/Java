package LabSheet7;
import java.util.*;

public class code06 {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        long start = System.nanoTime();
        for (int i = 0; i < 1000; i++) arrayList.add(i);
        long end = System.nanoTime();
        System.out.println("ArrayList add time: " + (end - start) + " ns");

        start = System.nanoTime();
        for (int i = 0; i < 1000; i++) linkedList.add(i);
        end = System.nanoTime();
        System.out.println("LinkedList add time: " + (end - start) + " ns");
    }
}

