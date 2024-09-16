package cc.oop.lecture3.polymorphism;

// Derived class 'EquilateralTriangle' extends 'Shape'
public class EquilateralTriangle extends Shape {
    private double sideLength;  // All sides of the equilateral triangle are the same length

    // Constructor initializing inherited properties plus 'sideLength'
    public EquilateralTriangle(int x, int y, String color, double sideLength) {
        super(x, y, color);     // Call the base class constructor
        this.sideLength = sideLength;
    }

    // Method to calculate the area of the equilateral triangle
    public double calculateArea() {
        return (Math.sqrt(3) / 4) * Math.pow(sideLength, 2);
    }

    // Override toString method to include triangle-specific information
    @Override
    public String toString() {
        return super.toString() + ", Equilateral Triangle with side length " + sideLength;
    }
}
