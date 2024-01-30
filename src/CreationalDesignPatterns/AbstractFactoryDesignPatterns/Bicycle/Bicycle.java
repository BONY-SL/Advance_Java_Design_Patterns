package CreationalDesignPatterns.AbstractFactoryDesignPatterns.Bicycle;

public abstract class Bicycle {

    protected static String location=null;
    protected static String model=null;

    public String getLocation() {
        return location;
    }

    public String getModel() {
        return model;
    }

    public abstract void setModel(String model);
    public abstract void setLocation(String location);

    abstract void construct();

    public static void display(){
        System.out.print("You have Selected "+model+" Model Bicycle");
        System.out.println(" Located in "+location);
    }
}
