/**
 * For IntelliJ: edit configuration -> modify options -> add VM options -> ea
 **/
package cc.oop.lecture5.lsp.after;

public class MainClass {
    public static void main(String[] args) {
        AreaCalculator areaCalculator = new AreaCalculator();
        // IShape object = new Rectangle();
        IShape object = new Square(); // Here, we are using a Square that implements IShape.
        areaCalculator.testAreaCalculator(object); // Testing area calculation with the square
    }
}
