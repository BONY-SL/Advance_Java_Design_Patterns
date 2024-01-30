package CreationalDesignPatterns.AbstractFactoryDesignPatterns;

public class MicroCar extends Car{
    @Override
    void construct() {
        System.out.println("Micro Car Created");
    }


    MicroCar(Location location)
    {
        super(CarType.MICRO, location);
        construct();
    }
}
