/*
* In this implementation, both the Square and Rectangle classes implement the IShape interface.
* Each class has its own way of calculating area, and the AreaCalculator can work with any object that
* implements the IShape interface. This adheres to the Liskov Substitution Principle (LSP), as you can
* substitute any IShape implementation without altering the expected behavior of the area calculations.

By using an interface, we allow for a flexible design where adding new shapes (e.g., triangles) would
simply require implementing the IShape interface without breaking the existing code, thereby maintaining
adherence to the LSP.

 * This implementation adheres to the Liskov Substitution Principle (LSP)
 * as both the Square and Rectangle classes implement the IShape interface.
 * The AreaCalculator can work with any IShape object without altering the expected behavior.
 * This design allows for flexibility when adding new shapes without breaking existing code.
 */
package cc.oop.lecture5.lsp.after;


public class Square implements IShape {
    private double side; // Length of a side of the square

    public double getSide() {
        return side; // Returns the length of the side
    }

    public void setSide(double side) {
        this.side = side; // Sets the length of the side
    }

    public double calculateArea() {
        return Math.pow(side, 2); // Calculates the area of the square
    }

    public void testAreaCalculator() {
        this.setSide(5); // Sets the side length for testing
        try {
            assert this.calculateArea() == 25 : "Area calculator test failed"; // Tests if area calculation is correct
            System.out.println("Square area test successful");
        } catch (AssertionError e) {
            System.out.println("Test failed: " + e.getMessage()); // Prints error message if the test fails
        }
    }
}

