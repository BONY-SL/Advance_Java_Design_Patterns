package BehaviralDesignPatterns.StratagyDesignPattern;

public class CreditCartPayment implements PaymentStratagy{
    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using credit card number: " + creditcardnumber);
    }

    private String creditcardnumber;

    public CreditCartPayment(String creditcardnumber) {
        this.creditcardnumber = creditcardnumber;
    }
}
