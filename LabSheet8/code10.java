package LabSheet8;
import java.util.*;

public class code10 {
    public static void main(String[] args) {
        List<String> list = Collections.synchronizedList(new ArrayList<>());
        list.add("A");
        list.add("B");
        list.add("C");

        synchronized (list) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                System.out.println(it.next());
            }
        }
    }
}
