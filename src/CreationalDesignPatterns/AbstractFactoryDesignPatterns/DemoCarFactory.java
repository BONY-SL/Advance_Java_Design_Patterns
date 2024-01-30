package CreationalDesignPatterns.AbstractFactoryDesignPatterns;

public class DemoCarFactory {
    public static void main(String[] args)
    {
        System.out.println(CarFactory.buildCar(CarType.MICRO));
    }
}
