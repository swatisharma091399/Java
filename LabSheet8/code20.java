package LabSheet8;
import java.util.*;

public class code20 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40));
        System.out.println("Before clear: " + list);
        list.clear();
        System.out.println("After clear: " + list);
        System.out.println("Is empty? " + list.isEmpty());
    }
}
