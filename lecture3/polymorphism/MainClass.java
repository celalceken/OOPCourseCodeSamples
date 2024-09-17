package cc.oop.lecture3.polymorphism;

public class MainClass {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[] {
                new Circle(0, 0, "Yellow", 5.0),
                new Rectangle(1, 1, "Blue", 4.0, 6.0),
                new EquilateralTriangle(2, 2, "Green", 3.0)
        };

        // Draw each shape
        for (Shape shape : shapes) {
            ShapeRenderer.render1(shape);
        }
    }
}
