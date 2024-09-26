package cc.oop.lecture5.lsp.after;

public class Rectangle implements IShape {
    private double height; // Height of the rectangle
    private double width;  // Width of the rectangle

    public double getHeight() {
        return height; // Returns the height of the rectangle
    }

    public void setHeight(double height) {
        this.height = height; // Sets the height of the rectangle
    }

    public double getWidth() {
        return width; // Returns the width of the rectangle
    }

    public void setWidth(double width) {
        this.width = width; // Sets the width of the rectangle
    }

    public double calculateArea() {
        return width * height; // Calculates the area of the rectangle
    }

    public void testAreaCalculator() {
        this.setHeight(7); // Sets the height for testing
        this.setWidth(5);  // Sets the width for testing
        try {
            assert calculateArea() == 35 : "Area calculator test failed"; // Tests if area calculation is correct
            System.out.println("Rectangle area test successful");
        } catch (AssertionError e) {
            System.out.println("Test failed: " + e.getMessage()); // Prints error message if the test fails
        }
    }
}
