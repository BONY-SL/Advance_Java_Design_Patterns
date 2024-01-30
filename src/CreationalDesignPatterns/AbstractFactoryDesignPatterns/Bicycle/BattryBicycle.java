package CreationalDesignPatterns.AbstractFactoryDesignPatterns.Bicycle;

public class BattryBicycle extends Bicycle{


    @Override
    public void setModel(String model) {
        super.model=model;
    }

    @Override
    public void setLocation(String location) {
        super.location=location;
    }

    @Override
    void construct() {
        System.out.println("BattryBicycle is Created");
    }
}
