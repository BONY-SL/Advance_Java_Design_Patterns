package BehaviralDesignPatterns.StratagyDesignPattern;

public class BitcoinPayment implements PaymentStratagy{
    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Bitcoin address: " + bitcoinAddress);
    }

    private final String bitcoinAddress;

    public BitcoinPayment(String bitcoinAddress) {
        this.bitcoinAddress = bitcoinAddress;
    }
}
