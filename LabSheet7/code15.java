package LabSheet7;
import java.util.*;

public class code15 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c"));
        ListIterator<String> it = list.listIterator();

        while (it.hasNext()) {
            String val = it.next();
            it.set(val.toUpperCase());
        }

        System.out.println("Modified List: " + list);
    }
}
