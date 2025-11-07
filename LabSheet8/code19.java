package LabSheet8;
import java.util.*;

public class code19 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("A", "B", "C"));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("D", "E", "F"));
        list1.addAll(list2);
        System.out.println("Merged List: " + list1);
    }
}
