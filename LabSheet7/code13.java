package LabSheet7;
import java.util.*;

public class code13 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("A", "C", "E"));
        ListIterator<String> it = list.listIterator();

        while (it.hasNext()) {
            String s = it.next();
            if (s.equals("A")) it.add("B");
        }

        System.out.println("Updated List: " + list);
    }
}
