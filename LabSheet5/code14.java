package LabSheet5;

// 14. Create an interface with static and default methods and show how to call them. 
interface MyInterface{
    static void staticMethod(){
        System.out.println("This is a static method in interface");
    }
    default void defaultMethod(){
        System.out.println("This is a default method in interface");
    }
}
public class code14 implements MyInterface {
    public static void main(String[] args) {
        MyInterface.staticMethod();
        code14 obj = new code14();
        obj.defaultMethod();
    }
}
