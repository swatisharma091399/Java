package LabSheet4;

class StaticExample {
    private static int count = 0;

    public static void increment() { count++; }

    public static int getCount() { return count; }
}

public class code04 {
    public static void main(String[] args) {
        StaticExample.increment();
        StaticExample.increment();
        System.out.println("Count: " + StaticExample.getCount());
    }
}
