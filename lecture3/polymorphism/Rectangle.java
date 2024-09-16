package cc.oop.lecture3.polymorphism;

// Derived class 'Rectangle' extends 'Shape'
public class Rectangle extends Shape {
    private double width, height;   // Rectangle has width and height

    // Constructor initializing inherited properties plus 'width' and 'height'
    public Rectangle(int x, int y, String color, double width, double height) {
        super(x, y, color);         // Call the base class constructor
        this.width = width;
        this.height = height;
    }

    // Method to calculate the area of the rectangle
    public double calculateArea() {
        return width * height;
    }

    // Override toString method to include rectangle-specific information
    @Override
    public String toString() {
        return super.toString() + ", Rectangle with width " + width + " and height " + height;
    }
}
