package CreationalDesignPatterns.AbstractFactoryDesignPatterns;

public class MiniCar extends Car{
    @Override
    void construct() {
        System.out.println("Mini Car Created");
    }


    MiniCar(Location location)
    {
        super(CarType.MINI,location );
        construct();
    }
}
