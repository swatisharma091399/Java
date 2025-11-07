package LabSheet8;
import java.util.*;

public class code03 {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>(Arrays.asList(10, 20, 30, 40, 50));
        System.out.println("TreeSet in normal order: " + set);
        System.out.print("Descending order: ");
        Iterator<Integer> itr = set.descendingIterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
    }
}
