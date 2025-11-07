package LabSheet8;
import java.util.*;

public class code13 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        int index = Collections.binarySearch(list, 30);
        System.out.println("ArrayList: " + list);
        System.out.println("Element 30 found at index: " + index);
    }
}

