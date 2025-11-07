package LabSheet7;

import java.util.*;

public class code02 {
    public static void main(String[] args) {
        Collection<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);

        System.out.println("Collection: " + nums);
        nums.remove(20);
        System.out.println("After removal: " + nums);
        System.out.println("Contains 10? " + nums.contains(10));
        System.out.println("Size: " + nums.size());
    }
}
