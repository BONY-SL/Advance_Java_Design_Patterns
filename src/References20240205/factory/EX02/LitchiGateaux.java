package References20240205.factory.EX02;

public class LitchiGateaux extends Cake{


   public LitchiGateaux(){
        setName("Litchi Gateaux");
        setType("Eggless");
        setPrice(750);
    }

    @Override
    public void recipe() {
        System.out.println("---LitchiGateaux Recipe---");
        System.out.println("Take some fresh Litchies");
        System.out.println("Wash them and Grind for 5 minutes");
        System.out.println("Put some groundnuts and bake for 45 minutes");
    }

    @Override
    public void myFan() {
        System.out.println("Litchi lovers love me");
    }

}
