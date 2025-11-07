package LabSheet5;

// 18. Demonstrate private methods inside interfaces (Java 9+) and show how they can be called within default methods. 
interface PrivateMethodInterface{
    private void privateMethod(){
        System.out.println("Private method in interface");
    }
    default void defaultMethod(){
        privateMethod(); // Calling private method within default method
    }
}

public class code18 implements PrivateMethodInterface {
    public static void main(String[] args) {
        code18 obj = new code18();
        obj.defaultMethod();
    }
}
