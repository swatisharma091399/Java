package LabSheet5;

// 13. Demonstrate how to use interface references to call implemented methods. 
interface Movable2 {
    void moveUp();
    void moveDown();
}

class Robot2 implements Movable2 {
    public void moveUp() {
        System.out.println("Robot moves up");
    }
    public void moveDown() {
        System.out.println("Robot moves down");
    }
}

public class code13 {
    public static void main(String[] args) {
        Movable2 m = new Robot2();
        m.moveUp();
        m.moveDown();
    }
}
