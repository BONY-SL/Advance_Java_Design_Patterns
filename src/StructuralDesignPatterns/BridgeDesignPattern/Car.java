package StructuralDesignPatterns.BridgeDesignPattern;

public class Car extends Vehicle{
    @Override
    public void manufacture() {
        System.out.print("Car ");
        workshop1.work();
        workshop2.work();
    }

    public Car(Workshop workshop1, Workshop workshop2) {
        super(workshop1, workshop2);
    }
}
