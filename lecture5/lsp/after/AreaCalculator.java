package cc.oop.lecture5.lsp.after;

public class AreaCalculator {
    public double calculateArea(IShape shape) {
        return shape.calculateArea(); // Calculates the area for any shape implementing IShape
    }

    public void testAreaCalculator(IShape shape) {
        shape.testAreaCalculator(); // Tests the area calculation for the provided shape
    }
}
