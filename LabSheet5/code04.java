package LabSheet5;

// 4. Create a multilevel inheritance hierarchy: Vehicle → Car → ElectricCar. Add unique methods in each class. 
class Vehicle{
    void start(){
        System.out.println("Vehicle started");
    }
}
class Car extends Vehicle{
    void drive(){
        System.out.println("Car is driving");
    }
}
class ElectricCar extends Car{
    void charge(){
        System.out.println("Electric Car is charging");
    }
}

public class code04 {
    public static void main(String[] args) {
        ElectricCar ec = new ElectricCar();
        ec.start();
        ec.drive();
        ec.charge();
    }
}
