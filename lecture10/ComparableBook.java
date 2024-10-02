package cc.oop.lecture10;

public class ComparableBook extends Book implements Comparable<Book> {

    public ComparableBook(String name, double unitPrice) {
        super(name, unitPrice);
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

    @Override
    public int compareTo(Book otherBook) {
        return this.name.compareTo(otherBook.getName());
    }
}

