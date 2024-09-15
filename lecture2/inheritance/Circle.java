package cc.oop.lecture2.inheritance;

// Derived class 'Circle' extends 'Shape'
class Circle extends Shape {
    private double radius;      // Circle has an additional property: radius

    // Constructor initializing the inherited properties plus 'radius'
    public Circle(int x, int y, String color, double radius) {
        super(x, y, color);     // Call the constructor of the base class
        this.radius = radius;
    }

    // Method to calculate the area of the circle
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    // Override toString method to include circle-specific information
    @Override
    public String toString() {
        return super.toString() + ", Circle with radius " + radius;
    }
}

