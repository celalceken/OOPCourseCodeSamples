package cc.oop.lecture4.abstractclasses;

public class ShapeRenderer {

    // Polymorphism allows client code (ShapeRenderer) to handle different shapes without modification.
    public static void render1(Shape shape) {
        System.out.println(shape);
        System.out.println("Area = " + shape.calculateArea());
    }
}
