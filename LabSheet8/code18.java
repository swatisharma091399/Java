package LabSheet8;
import java.util.*;

class Book implements Comparable<Book> {
    int id; String name;
    Book(int id, String name) { this.id = id; this.name = name; }
    public int compareTo(Book b) { return this.id - b.id; }
    public String toString() { return id + " - " + name; }
}

public class code18 {
    public static void main(String[] args) {
        TreeSet<Book> books = new TreeSet<>();
        books.add(new Book(2, "Java"));
        books.add(new Book(1, "Python"));
        books.add(new Book(3, "C++"));
        System.out.println("Sorted Books: " + books);
    }
}
