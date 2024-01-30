package CreationalDesignPatterns.AbstractFactoryDesignPatterns.Bicycle;

import CreationalDesignPatterns.AbstractFactoryDesignPatterns.*;

import java.util.Scanner;

public class BicycleFactory {

    private BicycleFactory(){

    }
    public static Bicycle buildBicycle(String type) throws Exception{

        Bicycle bicycle;

        Scanner intput=new Scanner(System.in);
        System.out.print("Enter Bicycle Location:");

        String location=intput.nextLine();

        if(location.equalsIgnoreCase("USA")){
            bicycle=USA_B_Factory.buildBicycle(type);

        } else if (location.equalsIgnoreCase("India")) {
            bicycle=India_B_Factory.buildBicycle(type);
        } else if (location.equalsIgnoreCase("Japan")) {
            bicycle=Japan_B_Factory.buildBicycle(type);
        }else {
            bicycle=null;
        }
        assert bicycle != null;

        bicycle.setLocation(location);
        bicycle.setModel(type);
        return bicycle;

    }
}
