package CreationalDesignPatterns.AbstractFactoryDesignPatterns;

import java.util.Scanner;

public class CarFactory {
    private CarFactory()
    {

    }
    public static Car buildCar(CarType type)
    {
        Car car = null;

        Location location = Location.USA;

        switch(location)
        {
            case USA:
                car = USACarFactory.buildCar(type);
                break;

            case INDIA:
                car = INDIACarFactory.buildCar(type);
                break;

            default:
                car = DefaultCarFactory.buildCar(type);

        }

        return car;

    }
}
