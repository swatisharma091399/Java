package LabSheet4;

class Utility {
    public static int add(int a, int b) { return a + b; }
    public static int subtract(int a, int b) { return a - b; }
    public static int multiply(int a, int b) { return a * b; }
}

public class code07 {
    public static void main(String[] args) {
        System.out.println("Add: " + Utility.add(5, 3));
        System.out.println("Multiply: " + Utility.multiply(4, 6));
    }
}
