package LabSheet5;

// 15. Create two interfaces A and B with default methods of the same name. Implement a class that resolves the conflict. 
interface A1{
    default void show(){
        System.out.println("Interface A1 default method");
    }
}
interface B1{
    default void show(){
        System.out.println("Interface B1 default method");
    }
}
public class code15 implements A1, B1 {
    public void show() {
        A1.super.show();
        B1.super.show();
    }

    public static void main(String[] args) {
        code15 obj = new code15();
        obj.show();
    }
}
