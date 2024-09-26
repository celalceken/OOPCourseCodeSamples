package cc.oop.lecture5.ocp.before;

// If we want to add support for new payment methods, we would have to modify
// the PaymentProcessor class, violating OCP.
public class PaymentProcessor {
    public void processCreditCardPayment(double amount) {
        // Logic for processing credit card payment
        System.out.println("Processing credit card payment of " + amount);
    }
}