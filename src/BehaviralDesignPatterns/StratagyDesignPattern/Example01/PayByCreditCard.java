package BehaviralDesignPatterns.StratagyDesignPattern.Example01;

public class PayByCreditCard implements PayentStratagy{
    private String creditCardNumber;
    private String expirationDate;
    private String cvv;

    public PayByCreditCard(String creditCardNumber, String expirationDate, String cvv) {
        this.creditCardNumber = creditCardNumber;
        this.expirationDate = expirationDate;
        this.cvv = cvv;
    }

    @Override
    public boolean pay(int paymentAmount) {
        System.out.println("Paying " + paymentAmount + " via Credit Card.");
        return true;
    }

    @Override
    public void collectionPaymentDetails() {
        System.out.println("Collecting credit card details...");
    }
}
