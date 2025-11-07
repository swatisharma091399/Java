package LabSheet4;

class StaticClass {
    static int staticvar;
    static {
        staticvar = 10;
        System.out.println("Static block executed. Static variable initialized to " + staticvar);
    }
}

public class code06 {
    public static void main(String[] args) {
        // Just loading the class triggers the static block
        new StaticClass();
    }
}

