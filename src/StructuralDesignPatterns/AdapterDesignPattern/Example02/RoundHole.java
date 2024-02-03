package StructuralDesignPatterns.AdapterDesignPattern.Example02;

public class RoundHole {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public boolean fits(RoundPeg peg) {
        boolean result;
        result = (this.getRadius() >= peg.getRadius());
        //System.out.println(peg.getRadius());
        return result;
    }
}
