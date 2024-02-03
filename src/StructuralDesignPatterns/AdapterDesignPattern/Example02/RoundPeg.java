package StructuralDesignPatterns.AdapterDesignPattern.Example02;

public class RoundPeg {
    private double radius;

    public RoundPeg() {}

    public RoundPeg(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        //System.out.println(radius);
        return radius;
    }

}
