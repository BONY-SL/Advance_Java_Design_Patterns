package CreationalDesignPatterns.PrototypeDesignPattern;

public class Demo {
    public static void main (String[] args)
    {
        ColorStore.getColor("blue").addColor();
        ColorStore.getColor("blue").addColor();
    }
}
