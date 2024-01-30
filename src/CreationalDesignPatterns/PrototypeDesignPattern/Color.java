package CreationalDesignPatterns.PrototypeDesignPattern;

public abstract class Color implements Cloneable{

    protected String colorName;

    abstract void addColor();

    public Object clone(){
        Object clone=null;

        try{
            clone=super.clone();
        }catch (CloneNotSupportedException e){
            System.out.println(e.getMessage());
        }

        return clone;
    }
}
