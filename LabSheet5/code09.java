package LabSheet5;

// 9. Write a superclass reference pointing to a subclass object and call an overridden method. 
class SuperClass{
    void display(){
        System.out.println("SuperClass method");
    }
}
class SubClasss extends SuperClass{
    void display(){
        System.out.println("SubClass method");
    }
}
public class code09 {
    public static void main(String[] args) {
        SuperClass sc = new SubClasss();
        sc.display();
    }
}