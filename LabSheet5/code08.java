package LabSheet5;


// 8. Write a class hierarchy demonstrating method overriding with polymorphic method calls. 
class ParentClass{
    void show(){
        System.out.println("Parent class method");
    }
}
class ChildClass extends ParentClass{
    void show(){
        System.out.println("Child class method");
    }
}

public class code08 {
    public static void main(String[] args) {
        ParentClass pc = new ChildClass();
        pc.show(); // calls ChildClass method
    }
}
