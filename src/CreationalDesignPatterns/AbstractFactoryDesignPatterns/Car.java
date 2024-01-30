package CreationalDesignPatterns.AbstractFactoryDesignPatterns;

public abstract class Car {
    Location location=null;
    CarType model=null;

    abstract void construct();

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setModel(CarType model) {
        this.model = model;
    }

    public Location getLocation() {
        return location;
    }

    public CarType getModel() {
        return model;
    }

    @Override
    public String toString() {

        return "CarModel - "+model + " located in "+location;
    }

    Car(CarType model, Location location)
    {
        this.model = model;
        this.location = location;
    }
}
