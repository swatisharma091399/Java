package LabSheet4;

class Parent {
    protected String name = "Parent";
}

class Child extends Parent {
    public void printName() {
        System.out.println("Name: " + name);
    }
}

public class code03 {
    public static void main(String[] args) {
        Child c = new Child();
        c.printName();
    }
}
