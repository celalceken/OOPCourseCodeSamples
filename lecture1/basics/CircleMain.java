/**
 * Must be stored as CircleMain.java
 *
 */
package cc.oop.lecture1.basics;

import java.util.Scanner; // Importing the Scanner class needed for reading input from the keyboard (defined in the java.util package)
import java.text.DecimalFormat; // Importing the DecimalFormat class needed for formatting numbers

public class CircleMain
{
    public static void main(String[] s)
    {
        // Instantiating the Circle class (constructor with 3 parameters is called)
        Circle circle1 = new Circle(20, 20, 3);
        System.out.println(circle1.toString()); // Calling daire1.toString() method
        System.out.println(circle1.calculateArea()); // Calling daire1.calculateArea() method

        // Instantiating an object (constructor with 3 parameters is called) and printing values to the screen by calling toString method
        System.out.println(new Circle(50, 40, 100));

        // Instantiating an object (constructor with 2 parameters is called) and printing values to the screen by calling toString method
        System.out.println(new Circle(25, 50));


        //Variables

        //  defining and initializing a variable
        short temp = 5;
        System.out.println(new Circle(40, 50, temp));

        //Variable types:
        // int, long, short, byte, double, float, char, boolean ... Refer to the README

        // Instantiating an object from the Scanner class for input from keyboard (System.in)
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        int radius = input.nextInt();  // Reading an int value from the keyboard

        /*  Scanner class member methods

        public byte nextByte()
        public short nextShort()
        public int nextInt()
        public long nextLong()

        public float nextFloat()
        public double nextDouble()

        public String next() // Reads until a space
        public String nextLine() // Reads until a new line is encountered
        */

        Circle circle4 = new Circle(20, 20, radius);
        System.out.println(circle4);
        System.out.println(circle4.calculateArea());

        //System.out.println(circle4.x);
        // Error... object member variables should not be accessed directly from outside,
        // appropriate set/get methods should be used
        System.out.println(circle4.getX());

        // Ensuring that the area of the circle is printed with 4 decimal places
        DecimalFormat fmt = new DecimalFormat("0.####");
        System.out.println(fmt.format(circle4.calculateArea()));

    }
}
