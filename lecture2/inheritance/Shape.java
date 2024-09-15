package cc.oop.lecture2.inheritance;

class Shape {
    protected int x;
    protected int y;         // Coordinates common to all shapes
    protected String color;     // Color property common to all shapes

    // Constructor for initializing common properties
    public Shape(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public String toString() {
        return "Shape at (" + x + "," + y + ") with color " + color;
    }
}