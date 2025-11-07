package LabSheet5;

// 12. Define an interface Movable with methods moveUp(), moveDown(). Implement it in a class Robot. 
interface Movable{
    void moveUp();
    void moveDown();
}
class Robot implements Movable{
    public void moveUp(){
        System.out.println("Robot moves up");
    }
    public void moveDown(){
        System.out.println("Robot moves down");
    }
}

public class code12 {
    public static void main(String[] args) {
        Movable m = new Robot();
        m.moveUp();
        m.moveDown();
    }
}
