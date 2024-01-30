package CreationalDesignPatterns.AbstractFactoryDesignPatterns.Bicycle;

import CreationalDesignPatterns.AbstractFactoryDesignPatterns.*;

import java.util.Scanner;

public class USA_B_Factory {

    public static Bicycle buildBicycle(String model) throws Exception{


        if(model.equalsIgnoreCase("Petrol")){
            return new PetrolBicycle();
        } else if (model.equalsIgnoreCase("Hybrid")) {
            return new HybriedBicycle();
        } else if (model.equalsIgnoreCase("Battery")) {
            return new BattryBicycle();
        }else {
            return null;
        }
    }
}
