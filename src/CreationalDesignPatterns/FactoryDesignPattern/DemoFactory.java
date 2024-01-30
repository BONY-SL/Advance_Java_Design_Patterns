package CreationalDesignPatterns.FactoryDesignPattern;

public class DemoFactory {
    public static void main(String[] args) {

        SelectNetworkFactory  select=new SelectNetworkFactory();
        try {
            CellularPlan selectPlan=select.getPlan("SLT");
            selectPlan.setRate();
            selectPlan.processBill(5);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    //hello
}
