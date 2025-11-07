package LabSheet5;

// 17. Write an interface with constants (variables) and show that they are implicitly public static final. 
interface ConstantInterface{
    int constantvar=20; // implicitly public static final
    void show();
}

class ConstantInterfaceImpl implements ConstantInterface{
    public void show(){
        System.out.println("Constant variable: " + constantvar);
    }
}
public class code17 {
    public static void main(String[] args) {
        ConstantInterfaceImpl obj = new ConstantInterfaceImpl();
        obj.show();
    }
}
