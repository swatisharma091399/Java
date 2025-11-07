package LabSheet5;

// 19. Create a class that implements multiple interfaces and demonstrate method implementation.

interface A2 {
    default void show() {
        System.out.println("Interface A2 default method");
    }
}

interface B2 {
    default void show() {
        System.out.println("Interface B2 default method");
    }
}

public class code19 implements A2, B2 {
    public void show() {
        A2.super.show();
        B2.super.show();
    }

    public static void main(String[] args) {
        code19 obj = new code19();
        obj.show();
    }
}
