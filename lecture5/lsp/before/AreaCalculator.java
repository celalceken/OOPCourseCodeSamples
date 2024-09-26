/*
* The Square class inherits from the Rectangle class. However, this implementation violates
* the Liskov Substitution Principle (LSP) because a Square is not a true subtype of Rectangle.
* In a rectangle, height and width can vary independently, whereas in a square, both dimensions
* must be equal. By setting one dimension, the other is altered unintentionally,
* which can lead to unexpected behaviors when the Square is used in place of a Rectangle.
*/
package cc.oop.lecture5.lsp.before;

public class AreaCalculator {

    public double calculateArea(Rectangle rectangle) {
        return rectangle.calculateArea(); // Calculates the area for any rectangle
    }

    void testAreaCalculator(Rectangle rectangle) {
        rectangle.setHeight(7);
        rectangle.setWidth(5); // Sets the height and width for area calculation
        try {
            assert rectangle.calculateArea() == 35 : "Area calculator test failed"; // Tests if area calculation is correct
            System.out.println("Rectangle area test successful");
        } catch (AssertionError e) {
            System.out.println("Error: " + e.getMessage()); // Prints error message if the test fails
        }
    }
}
