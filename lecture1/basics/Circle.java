
/**
 * Must be stored as Circle.java
 *
 */

package cc.oop.lecture1.basics;

public class Circle
{
    // Member variables should not be accessed directly from outside. They are made private for this reason.
    // Access to member variables is provided through the relevant set and get methods.
    private int x;
    private int y;
    private int radius;

    // Constructors are special member methods that are called when an object is instantiated.
    public Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    // Constructor method is overloaded (function overloading).
    // Method signatures (method name + parameter list) must be different
    public Circle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getRadius() {

        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String toString() {
        return "Position = (" + x + "," + y + ") - Radius = " + radius;
    }

    public double calculateArea(){
        return Math.pow(radius, 2) * Math.PI;
    }

}