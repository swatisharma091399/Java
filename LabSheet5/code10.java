package LabSheet5;

// 10. Use super to access a superclass method hidden by an overriding method in the subclass.
class Super{
    void show(){
        System.out.println("Super class method");
    }
}
class Sub extends Super{
    void show(){
        System.out.println("Sub class method");
    }
    void display(){
        super.show(); // Accessing superclass method
    }
}

public class code10 {
    public static void main(String[] args) {
        Sub s = new Sub();
        s.display();
    }
}
