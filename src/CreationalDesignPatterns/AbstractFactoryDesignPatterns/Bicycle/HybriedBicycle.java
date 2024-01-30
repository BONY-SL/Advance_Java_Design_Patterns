package CreationalDesignPatterns.AbstractFactoryDesignPatterns.Bicycle;

public class HybriedBicycle extends Bicycle{

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
        System.out.println("HybriedBicycle is Created");
    }
}
