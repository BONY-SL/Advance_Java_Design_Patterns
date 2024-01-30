package CreationalDesignPatterns.AbstractFactoryDesignPatterns;

public class LuxuryCar extends Car{
    @Override
    void construct() {
        System.out.println("Luxury Car Created");
    }

    LuxuryCar(Location location)
    {
        super(CarType.LUXURY, location);
        construct();
    }
}
