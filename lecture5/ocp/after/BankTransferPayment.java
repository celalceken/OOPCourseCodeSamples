package cc.oop.lecture5.ocp.after;

public class BankTransferPayment implements IPayment {
    public void processPayment(double amount) {
        // Logic for processing bank transfer payment
        System.out.println("Processing bank transfer payment of " + amount);
    }
}
