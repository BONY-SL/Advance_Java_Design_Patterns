package BehaviralDesignPatterns.StratagyDesignPattern;

public class StratagyDemo {
    public static void main(String[] args) {

        Shopping cart = new Shopping();

        // Selecting payment methods dynamically
        cart.setPaymentStratagy(new CreditCartPayment("1234-5678-9012-3456"));
        cart.checkout(100);

        //cart.setPaymentStratagy(new PayPalPayment("john.doe@example.com"));
        //cart.checkout(50);

        //cart.setPaymentStratagy(new BitcoinPayment("1AbCdEfGhIjK1LmNoPqRsTuVwXyZ"));
        //cart.checkout(200);
    }
}
