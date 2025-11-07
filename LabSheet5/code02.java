package LabSheet5;

//2. Write a class Person and a subclass Student. Add constructors to both and use super to call the superclass constructor. 
class Person{
    Person(){
        System.out.println("Person class constructor");
    }
}
class Student extends Person{
    Student(){
        super();
        System.out.println("Student class Constructor");
    }
}

public class code02 {
    public static void main(String[] args) {
        Student st = new Student();
    }
}