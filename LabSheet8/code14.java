package LabSheet8;
import java.util.*;

public class code14 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C"));
        List<String> immutable = Collections.unmodifiableList(list);
        System.out.println("Immutable List: " + immutable);
        // immutable.add("D"); // would throw UnsupportedOperationException
    }
}
