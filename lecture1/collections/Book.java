package cc.oop.lecture1.collections;

public class Book {
    private String name;
    private double unitPrice;

    public Book(String name, double unitPrice) {
        this.name = name;
        this.unitPrice = unitPrice;
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

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                '}';
    }
}

