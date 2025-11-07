package LabSheet7;
import java.util.*;

public class code12 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("One", "Two", "Three"));
        ListIterator<String> it = list.listIterator();

        System.out.println("Forward traversal:");
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("Backward traversal:");
        while (it.hasPrevious()) {
            System.out.println(it.previous());
        }
    }
}
