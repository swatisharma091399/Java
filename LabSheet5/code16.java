package LabSheet5;


// 16. Create an interface that extends another interface and add additional methods. Implement the derived interface. 
interface BaseInterface{
    void baseMethod();
}
interface DerivedInterface extends BaseInterface{
    void derivedMethod();
}
class InterfaceDerivedImpl implements DerivedInterface{
    public void baseMethod(){
        System.out.println("Base method implementation");
    }
    public void derivedMethod(){
        System.out.println("Derived method implementation");
    }
}

public class code16 {
    public static void main(String[] args) {
        DerivedInterface obj = new InterfaceDerivedImpl();
        obj.baseMethod();
        obj.derivedMethod();
    }
}

