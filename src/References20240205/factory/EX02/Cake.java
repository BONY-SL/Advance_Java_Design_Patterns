package References20240205.factory.EX02;

public abstract class Cake {
    private String name;
    private String type;
    private int price;

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    abstract public void recipe();
    abstract public void myFan();



    public void aboutCake(){

        System.out.println("I am "+name+" Cake");
        System.out.print("My Fans : ");
        myFan();
        System.out.println("You can get a "+name+" Cake at "+price);

    }
}
