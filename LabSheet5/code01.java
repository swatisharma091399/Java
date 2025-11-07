package LabSheet5;
// 1. Create a base class Animal with a method makeSound(). Derive a class Dog that overrides makeSound(). Test polymorphism. 
class Animal{
    void makeSound(){
        System.out.println("Animal class");
    }
}
class Dog extends Animal{
    void makeSound(){
        System.out.println("Dog makes sound");
    }
}

// Main class to run Question 1
public class code01 {
    public static void main(String[] args) {
        Animal obj = new Dog(); // polymorphism
        obj.makeSound();
    }
}