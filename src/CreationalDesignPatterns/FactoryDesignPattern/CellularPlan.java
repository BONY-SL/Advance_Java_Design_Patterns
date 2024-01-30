package CreationalDesignPatterns.FactoryDesignPattern;

public abstract class CellularPlan {
    protected double rate;

    public double getRate(){
        return rate;
    }
    abstract public void setRate();

    public  void processBill(int minutes){

        System.out.println("Bill Amount: "+getRate()*minutes);

    }
}
