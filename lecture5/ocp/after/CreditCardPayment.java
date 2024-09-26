package cc.oop.lecture5.ocp.after;

public class CreditCardPayment implements IPayment {
    public void processPayment(double amount) {
        // Logic for processing credit card payment
        System.out.println("Processing credit card payment of " + amount);
    }
}

