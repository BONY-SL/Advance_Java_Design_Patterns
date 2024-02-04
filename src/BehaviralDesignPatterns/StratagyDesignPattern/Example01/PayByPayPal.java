package BehaviralDesignPatterns.StratagyDesignPattern.Example01;

public class PayByPayPal implements PayentStratagy{

    private String email;
    private String password;

    public PayByPayPal(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public void collectionPaymentDetails() {

        System.out.println("Collecting PayPal account details...");
        System.out.println(email);
        System.out.println(password);
    }


    @Override
    public boolean pay(int paymentAmount) {
        System.out.println("Paying " + paymentAmount + " via PayPal.");

        return true;
    }
}
