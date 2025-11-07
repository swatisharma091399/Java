package LabSheet4;

class Outer {
    static class Inner {
        void display() { System.out.println("Inside static nested class"); }
    }
}

public class code10 {
    public static void main(String[] args) {
        Outer.Inner innerObj = new Outer.Inner();
        innerObj.display();
    }
}
