package LabSheet5;

// 3. Demonstrate how member access modifiers (private, protected, public) affect inheritance using two classes in the same package. 
class A{
    private int privateVar = 1;
    protected int protectedVar = 2;
    public int publicVar = 3;

    void display(){
        System.out.println("Private Var: " + privateVar);
        System.out.println("Protected Var: " + protectedVar);
        System.out.println("Public Var: " + publicVar);
    }
}
class B extends A{
    void show(){
        // System.out.println("Private Var: " + privateVar); // Error: privateVar is not accessible
        System.out.println("Protected Var: " + protectedVar); // Accessible
        System.out.println("Public Var: " + publicVar); // Accessible
    }
}

public class code03 {
    public static void main(String[] args) {
        A a = new A();
        a.display();
        B b = new B();
        b.show();
    }
}