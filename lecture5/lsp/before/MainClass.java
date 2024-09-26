/**
 * For IntelliJ: edit configuration -> modify options -> add VM options -> ea
 * **/
package cc.oop.lecture5.lsp.before;

public class MainClass {
    public static void main(String[] args) {
        AreaCalculator areaCalculator = new AreaCalculator();
        // Rectangle object = new Rectangle();
        Rectangle object = new Square(); // Here, we are using a Square instead of a Rectangle.
        areaCalculator.testAreaCalculator(object); // Testing area calculation with the square
    }
}
