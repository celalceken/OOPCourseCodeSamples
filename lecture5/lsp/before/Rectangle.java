package cc.oop.lecture5.lsp.before;

public class Rectangle {
    private double height; // Height of the rectangle
    private double width;  // Width of the rectangle

    public void setHeight(double height) {
        this.height = height; // Sets the height of the rectangle
    }

    public void setWidth(double width) {
        this.width = width; // Sets the width of the rectangle
    }

    public double calculateArea() {
        return width * height; // Calculates the area of the rectangle
    }
}
