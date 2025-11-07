package LabSheet8;
import java.util.*;

class Student {
    int id;
    String name;
    Student(int id, String name) { this.id = id; this.name = name; }
    public String toString() { return id + " - " + name; }
}

public class code16 {
    public static void main(String[] args) {
        LinkedList<Student> students = new LinkedList<>();
        students.add(new Student(1, "Lavina"));
        students.add(new Student(2, "Ankush"));
        students.add(new Student(3, "Gesu"));

        ListIterator<Student> itr = students.listIterator();
        while (itr.hasNext()) System.out.println(itr.next());
    }
}

