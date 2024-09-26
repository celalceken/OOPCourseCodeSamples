package cc.oop.lecture5.srp.after;

// This class is responsible for handling the order processing logic
public class OrderService {

    public void processOrder(Product product, int quantity) {
        double totalAmount = product.getPrice() * quantity;
        System.out.println(quantity + " units of " + product.getProductName() + " ordered. Total: $" + totalAmount);
        // Additional code for payment, shipping, etc.
    }
}
