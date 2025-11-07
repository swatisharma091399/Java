package LabSheet8;
import java.util.*;

public class code08 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>(Arrays.asList(11, 4, 22, 9, 17));
        System.out.println("HashSet: " + set);
        System.out.println("Max: " + Collections.max(set));
        System.out.println("Min: " + Collections.min(set));
    }
}
