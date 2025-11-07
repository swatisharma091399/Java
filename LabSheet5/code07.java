package LabSheet5;

// 7. Create a class declared as final and try to inherit from it. Explain the result. 
final class FinalClass{
    void show(){
        System.out.println("This is a final class");
    }
}
// class SubClass extends FinalClass{ // Error: cannot inherit from final FinalClass
//     void display(){
//         System.out.println("Trying to inherit from final class");
//     }
// }

public class code07 {
    public static void main(String[] args) {
        FinalClass fc = new FinalClass();
        fc.show();
    }
}