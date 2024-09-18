package cc.oop.lecture4.abstractclasses;

public class MainClass {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[] {
                new Circle(0, 0, "Yellow", 5.0),
                new Rectangle(1, 1, "Blue", 4.0, 6.0)
        };

        // Draw each shape
        for (Shape shape : shapes) {
            ShapeRenderer.render1(shape);
        }
    }
}
