package LabSheet10;
import java.io.*;
import java.util.*;

class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    String name; int age;
    Person(String name, int age) { this.name = name; this.age = age; }
    public String toString() { return name + " (" + age + ")"; }
}

public class code16 {
    public static void main(String[] args) {
        Person p = new Person("Lavina", 22);
        File f = new File("person.ser");

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f))) {
            oos.writeObject(p);
            System.out.println("Serialized: " + p);
        } catch (IOException e) { e.printStackTrace(); }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f))) {
            Person p2 = (Person) ois.readObject();
            System.out.println("Deserialized: " + p2);
        } catch (IOException | ClassNotFoundException e) { e.printStackTrace(); }
    }
}
