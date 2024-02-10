package References20240205.factory.EX02;

public class Pineapple extends Cake{

    public Pineapple(){
        setName("Pineapple");
        setType("Egg");
        setPrice(750);
    }
    @Override
    public void recipe() {
        System.out.println("---Pineapple Recipe---");
        System.out.println("Take some fresh Pineapple");
        System.out.println("Wash them and Grind for 5 minutes");
        System.out.println("Put some groundnuts and bake for 45 minutes");

    }

    @Override
    public void myFan() {
        System.out.println("Pineapple lovers love me");

    }

}
