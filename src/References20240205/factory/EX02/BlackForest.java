package References20240205.factory.EX02;

public class BlackForest extends Cake{


    public BlackForest(){

        setName("Black Forest");
        setType("Eggless");
        setPrice(800);
    }


    @Override
    public void recipe() {
        System.out.println("---BlackForest Recipe---");
        System.out.println("Sieve together Maida and Cocoa powder");
        System.out.println("Add Milk and Vanilla essence");
        System.out.println("Top with Whipped Cream and Cherries");
        System.out.println("Chill and Serve");
    }

    @Override
    public void myFan() {
        System.out.println("Both adults and Kids love me");

    }

}
