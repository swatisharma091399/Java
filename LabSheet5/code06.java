package LabSheet5;

// 6. Create a class with a final variable and try to modify it later. Show the error. 
class FinalVar{
    final int finalvar=10;
    void modify(){
        // finalvar=20; // Error: cannot assign a value to final variable finalvar
    }
}

public class code06 {
    public static void main(String[] args) {
        FinalVar f = new FinalVar();
        System.out.println("Final variable: " + f.finalvar);
    }
}