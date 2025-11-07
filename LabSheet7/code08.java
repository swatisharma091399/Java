package LabSheet7;
import java.util.*;

public class code08 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("A", "B", "C", "D"));
        ListIterator<String> it = list.listIterator(list.size());

        System.out.print("Reversed: ");
        while (it.hasPrevious()) {
            System.out.print(it.previous() + " ");
        }
    }
}
