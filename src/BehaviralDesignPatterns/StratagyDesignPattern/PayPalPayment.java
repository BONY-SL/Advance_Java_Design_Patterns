package BehaviralDesignPatterns.StratagyDesignPattern;

public class PayPalPayment implements PaymentStratagy{
    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using PayPal account: " + email);
    }

    private final String email;

    public PayPalPayment(String email) {
        this.email = email;
    }


}
