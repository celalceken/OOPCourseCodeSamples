package cc.oop.lecture3.polymorphism;

import cc.oop.ders2.kalitim.Daire;
import cc.oop.ders2.kalitim.Dikdortgen;
import cc.oop.ders2.kalitim.Sekil;

public class MainClass {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[] {
                new Circle(0, 0, "Yellow", 5.0),
                new Rectangle(1, 1, "Blue", 4.0, 6.0),
                new EquilateralTriangle(2, 2, "Green", 3.0)
        };

        // Display each shape
        for (Shape shape : shapes) {
            printShape(shape);
            //System.out.println(shape);
            //System.out.println("Area: " + shape.calculateArea());
        }
    }

    // Polymorphism allows client code (printShape()) to handle different shapes without modification.
    public static void printShape(Shape shape) {
        System.out.println(shape);
        //System.out.println("Area = " + shape.calculateArea());
    }

    // Without polymorphism, each new shape would require changes to the client code (printShape2()).
    public static void printShape2(Shape shape) {
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
