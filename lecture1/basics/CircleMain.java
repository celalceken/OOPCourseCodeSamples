/**
 * Must be stored as DaireUygulamasi.java
 *
 */

import java.util.Scanner; // klavyeden veri okumak için gerekli Scanner sınıfı (java.util paketi içerisinde tanımlı) dahil ediliyor
import java.text.DecimalFormat; // Sayıların biçimlenmesi için gerekli DecimalFormat Sınıfı uygulamaya dahil ediliyor

public class CircleMain
{
    public static void main(String[] s)
    {

        // Creating an instance of the Circle class (constructor with 3 parameters is called)
        Circle daire1 = new Circle(20, 20, 3);
        System.out.println(daire1.toString()); // Calling daire1.toString() method
        System.out.println(daire1.calculateArea()); // Calling daire1.alanHesapla() method

// Creating an instance (constructor with 3 parameters is called) and printing values to the screen by calling toString method
        System.out.println(new Circle(50, 40, 100));

// Creating an instance (constructor with 2 parameters is called) and printing values to the screen by calling toString method
        System.out.println(new Circle(25, 50));

// Creating an object from the Scanner class for input from keyboard (System.in)
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        int yariCap = input.nextInt();  // Reading an int value from the keyboard

/*        Scanner class member methods

        public byte nextByte()
        public short nextShort()
        public int nextInt()
        public long nextLong()

        public float nextFloat()
        public double nextDouble()

        public String next() // Reads until a space
        public String nextLine() // Reads until a new line is encountered
*/

        Circle daire4 = new Circle(20, 20, yariCap);
        System.out.println(daire4);
        System.out.println(daire4.calculateArea());
// System.out.println(daire4.x); // Error... object member variables should not be accessed directly from outside, appropriate set/get methods should be used

        System.out.println(daire4.getX());

// Ensuring that the area of the circle is printed with 4 decimal places
        DecimalFormat fmt = new DecimalFormat("0.####");
        System.out.println(fmt.format(daire4.calculateArea()));

    }
}
