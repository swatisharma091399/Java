package LabSheet5;

// 11. Create an abstract class Shape with an abstract method draw(). Implement two subclasses Circle and Rectangle. 
abstract class Shape{
    abstract void draw();
}
class Circle extends Shape{
    void draw(){
        System.out.println("This is Circle");
    }
}
class Rectangle extends Shape{
    void draw(){
        System.out.println("This is Rectangle");
    }
}

public class code11 {
    public static void main(String[] args) {
        Shape c = new Circle();
        Shape r = new Rectangle();
        c.draw();
        r.draw();
    }
}
