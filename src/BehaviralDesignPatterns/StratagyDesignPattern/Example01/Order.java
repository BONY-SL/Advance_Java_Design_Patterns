package BehaviralDesignPatterns.StratagyDesignPattern.Example01;

public class Order {

    private PayentStratagy strategy;

    private int cost;
    private boolean isClosed;
    public void processOrder(PayentStratagy strategy){
        this.strategy=strategy;
        if (strategy == null) {
            System.out.println("Please select a payment method.");
            return;
        }

        if (strategy.pay(cost)) {
            System.out.println("Payment successful.");
            System.out.println("Total Cost :"+getTotalCost());
            isClosed = true;
        } else {
            System.out.println("Payment failed. Please try again.");
        }
    }
    public void setTotalCost(int cost){
        this.cost=cost;
    }
    public int getTotalCost(){
        return cost;
    }
    public boolean isClosed(){
        return isClosed;
    }
    public void setClosed(){
        this.isClosed=false;
    }
}
