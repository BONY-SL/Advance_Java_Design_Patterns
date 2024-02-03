package StructuralDesignPatterns.AdapterDesignPattern.Example02;

public class SquarePegAdapter extends RoundPeg{
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        double squareArea = peg.getSquare();
        double roundRadius = Math.sqrt(squareArea / Math.PI);
        return roundRadius;
    }

}
