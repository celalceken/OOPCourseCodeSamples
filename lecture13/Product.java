package cc.oop.lecture13;

public class Product {
    private int id;
    private String name;
    private double unitPrice;
    private int stockAmount;

    public Product(String name) {
        this.name = name;
    }

    public Product(int id, String name, double unitPrice, int stockAmount) {
        this.id = id;
        this.name = name;
        this.unitPrice = unitPrice;
        this.stockAmount = stockAmount;
    }

    public Product(String name, double unitPrice, int stockAmount) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.stockAmount = stockAmount;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productID=" + id +
                ", name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", stockAmount=" + stockAmount +
                '}';
    }
}
