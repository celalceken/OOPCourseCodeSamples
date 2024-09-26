package cc.oop.lecture5.srp.before;

public class Product {
    private String productName;
    private double price;

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    // Violates SRP: Handles order processing
    public void processOrder(int quantity) {
        double totalAmount = price * quantity;
        System.out.println(quantity + " units of " + productName + " ordered. Total: $" + totalAmount);
        // Code to process payment and update stock
    }
}
