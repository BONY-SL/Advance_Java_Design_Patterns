package StructuralDesignPatterns.AdapterDesignPattern.Example02;

import java.util.Scanner;

public class DemoAdapter {
    private static Scanner input;

    public static void main(String[] args) {

        double holer=0;
        double pegr=0;
        double length=0;

        input=new Scanner(System.in);
        System.out.print("Enter radius of hole: ");
        holer=input.nextDouble();

        RoundHole hole = new RoundHole(holer);


        input=new Scanner(System.in);
        System.out.print("Enter radius of Peg: ");
        pegr=input.nextDouble();

        RoundPeg rpeg = new RoundPeg(pegr);

        if (hole.fits(rpeg)) {
            System.out.println("Round peg "+pegr+" fits round hole "+holer);
        }else {
            System.out.println("Round peg "+pegr+" not fits round hole "+holer);
        }

        input=new Scanner(System.in);
        System.out.print("Enter length of Square: ");
        length=input.nextDouble();

        SquarePeg SqPeg = new SquarePeg(length);


        SquarePegAdapter SqPegAdapter = new SquarePegAdapter(SqPeg);


        if (hole.fits(SqPegAdapter)) {
            System.out.println("Square Peg "+length+" fits round hole "+holer);
        }else {
            System.out.println("Square Peg "+length+" not fits round hole "+holer);
        }

    }
}
