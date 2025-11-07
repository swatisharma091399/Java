package LabSheet4;

class Library {
    class Member {
        String name;
        Member(String name) { this.name = name; }
        void display() { System.out.println("Member Name: " + name); }
    }
}

public class code11 {
    public static void main(String[] args) {
        Library lib = new Library();
        Library.Member m = lib.new Member("Aman");
        m.display();
    }
}

