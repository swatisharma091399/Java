package LabSheet4;

class Counter {
    private static int objectCount = 0;

    public Counter() { objectCount++; }

    public static int getObjectCount() { return objectCount; }
}

public class code05 {
    public static void main(String[] args) {
        new Counter();
        new Counter();
        System.out.println("Objects created: " + Counter.getObjectCount());
    }
}
