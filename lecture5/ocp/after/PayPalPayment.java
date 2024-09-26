package cc.oop.lecture5.ocp.after;

public class PayPalPayment implements IPayment {
    public void processPayment(double amount) {
        // Logic for processing PayPal payment
        System.out.println("Processing PayPal payment of " + amount);
    }
}
