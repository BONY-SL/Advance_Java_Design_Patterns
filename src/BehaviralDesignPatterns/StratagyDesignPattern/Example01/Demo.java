package BehaviralDesignPatterns.StratagyDesignPattern.Example01;

public class Demo {
    public static void main(String[] args) {
        System.out.println();

        Order order = new Order();

        PayentStratagy paypal = new PayByPayPal("example@example.com", "password");
        order.setTotalCost(200);
        paypal.collectionPaymentDetails();
        order.processOrder(paypal);

        if(order.isClosed()) {
            System.out.println("Payment is Closed");
        }else {
            order.setClosed();
        }

        System.out.println();
    }
}
