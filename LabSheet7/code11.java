package LabSheet7;
import java.util.*;

public class code11 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("C");

        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
