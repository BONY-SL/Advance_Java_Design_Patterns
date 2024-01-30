package CreationalDesignPatterns.FactoryDesignPattern;

public class SelectNetworkFactory {

    public  CellularPlan getPlan(String planType)throws Exception{

        if(planType == null){
            return null;
        } else if (planType.equalsIgnoreCase("Dialog")) {
            return new DialogNetwoek();
        } else if (planType.equalsIgnoreCase("Mobitel")) {
            return new MobitelNetwork();
        } else if (planType.equalsIgnoreCase("SLT")) {
            return new SLTNetwork();
        } else if (planType.equalsIgnoreCase("Hutch")) {
            return new HutchNetwork();
        }else {
            return null;
        }
    }
}
