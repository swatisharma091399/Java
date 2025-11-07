package LabSheet4;

class StaticInstance {
    static int staticvar = 0; // shared
    int instancevar;           // unique

    public StaticInstance(int value) {
        instancevar = value;
        staticvar++;
    }

    public void display() {
        System.out.println("Instance variable: " + instancevar + ", Static variable: " + staticvar);
    }
}

public class code09 {
    public static void main(String[] args) {
        StaticInstance s1 = new StaticInstance(10);
        StaticInstance s2 = new StaticInstance(20);
        s1.display();
        s2.display();
    }
}
