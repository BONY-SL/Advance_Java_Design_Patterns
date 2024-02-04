package BehaviralDesignPatterns.StratagyDesignPattern;

public class Shopping {
    private PaymentStratagy paymentStratagy;

    public void setPaymentStratagy(PaymentStratagy paymentStratagy){
        this.paymentStratagy=paymentStratagy;
    }

    public void checkout(int amount){
        paymentStratagy.pay(amount);
    }
}
