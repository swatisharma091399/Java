package LabSheet10;
import java.io.*;

public class code17<T extends Serializable> {
    public void save(T obj, File f) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f))) {
            oos.writeObject(obj);
        }
    }
    public T load(File f) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f))) {
            @SuppressWarnings("unchecked")
            T obj = (T) ois.readObject();
            return obj;
        }
    }

    // demo main
    public static void main(String[] args) throws Exception {
        Person p = new Person("Ankush", 25);
        File f = new File("person2.ser");
        code17<Person> storage = new code17<>();
        storage.save(p, f);
        Person loaded = storage.load(f);
        System.out.println("Loaded: " + loaded);
    }

    // reuse Person from code16 (must be defined or imported)
    static class Person implements Serializable {
        private static final long serialVersionUID = 1L;
        String name; int age;
        Person(String name, int age){ this.name = name; this.age = age; }
        public String toString(){ return name + " (" + age + ")"; }
    }
}

