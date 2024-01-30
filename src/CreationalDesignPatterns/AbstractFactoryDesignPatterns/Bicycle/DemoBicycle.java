package CreationalDesignPatterns.AbstractFactoryDesignPatterns.Bicycle;

import java.util.Scanner;

public class DemoBicycle {

    public static void main(String[] args) {

        Scanner intput=new Scanner(System.in);
        System.out.print("Enter Bicycle Model:");

        String type=intput.nextLine();

        try {
            Bicycle by=BicycleFactory.buildBicycle(type);
            Bicycle.display();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
