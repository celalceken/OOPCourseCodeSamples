package cc.oop.lecture3.polymorphism;

public class ShapeRenderer {

    // Polymorphism allows client code (ShapeRenderer) to handle different shapes without modification.
    // The static keyword makes a method a class-level method, which can be called without instantiating an object
    // Static Fields (member variables): Shared among all instances of the class. There is only one copy of the static field.
    // Static Methods: Can be called on the class itself, not requiring an instance. They can only access other static members directly.
    public static void render1(Shape shape) {
        System.out.println(shape);
        //System.out.println("Area = " + shape.calculateArea());
    }

    // Without polymorphism, each new shape would require changes to the client code (printShape2()).
    public static void render2(Shape shape) {
        if (shape instanceof Circle) {
            Circle circle = (Circle) shape;
            System.out.println(circle);
            System.out.println("Area (without polymorphism) = " + circle.calculateArea());
        } else if (shape instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) shape;
            System.out.println(rectangle);
            System.out.println("Area (without polymorphism) = " + rectangle.calculateArea());
        }//...
    }

}
