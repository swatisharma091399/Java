package LabSheet5;

// 5. Write a class with a final method and try to override it in a subclass. Observe and explain the compiler error. 
class Parent{
    final void display(){
        System.out.println("This is final method");
    }
}
class Child extends Parent{
//     void display(){ // Error: Cannot override the final method from Parent
//         System.out.println("Trying to override final method");
//     }
}

public class code05 {
    public static void main(String[] args) {
        Child c = new Child();
        c.display();
    }
}
