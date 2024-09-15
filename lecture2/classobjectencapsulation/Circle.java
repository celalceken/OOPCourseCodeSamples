
/**
 * Must be stored as Circle.java
 *
 */

package cc.oop.lecture2.classobjectencapsulation;

public class Circle
{
    // Member variables should not be accessed directly from outside. They are made private for this reason.
    // Access to member variables is provided through the relevant set and get methods.
    private int x; // instance variable
    private int y; // instance variable
    private int radius; // instance variable

    // Constructors are special member methods that are called when an object is instantiated.
    public Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    // Constructor method is overloaded (function overloading).
    // Method signatures (method name + parameter list) must be different in the same class
    public Circle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // set the x in the object
    public void setX(int x) {
        this.x = x;
    }

    // retrieve the x from the object
    public int getX() {
        return x;
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