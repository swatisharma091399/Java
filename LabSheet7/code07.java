package LabSheet7;
import java.util.*;

public class code07 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Iterator<Integer> it = list.iterator();

        while (it.hasNext()) {
            int val = it.next();
            if (val % 2 == 0)
                it.remove();
        }
        System.out.println("After removing even numbers: " + list);
    }
}
