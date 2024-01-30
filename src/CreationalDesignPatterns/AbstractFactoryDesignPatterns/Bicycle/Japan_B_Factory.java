package CreationalDesignPatterns.AbstractFactoryDesignPatterns.Bicycle;

public class Japan_B_Factory {
    public static Bicycle buildBicycle(String model)
    {
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
