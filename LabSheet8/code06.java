package LabSheet8;
import java.util.*;

public class code06 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5, 1, 3, 9, 2));
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Sorted in descending order: " + list);
    }
}
