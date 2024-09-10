package cc.oop.lecture1.loops;

public class Loops {

    public static void main(String[] args) {
        // Static array initialization
        int[] numbers = {10, 20, 30, 40, 50};

        // Accessing elements using indices

        // Print the value at index 0
        System.out.println("Value at index 0: " + numbers[0]); // Output: 10

        // Print the value at index 2
        System.out.println("Value at index 2: " + numbers[2]); // Output: 30

        // Change the fourth element (index 3) to a new value, e.g., 60
        numbers[3] = 60;

        // Print the new value at index 3
        System.out.println("Updated value at index 3: " + numbers[3]); // Output: 60

        numbers[3] = 40;


        // Traversing using a for loop
        System.out.println("Traversing using for loop:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Traversing using a while loop
        // Anything you can do with a for loop can also be done with a while loop, and vice versa.
        // The loop structures are interchangeable
        System.out.println("\nTraversing using while loop:");
        int j = 0;
        while (j < numbers.length) {
            System.out.println(numbers[j]);
            j++;
        }

        // Traversing using a do-while loop
        System.out.println("\nTraversing using do-while loop:");
        int k = 0;
        do {
            System.out.println(numbers[k]);
            k++;
        } while (k < numbers.length);

        // Traversing using a for-each loop
        System.out.println("\nTraversing using for-each loop:");
        for (int num : numbers) {
            System.out.println(num);
        }

    }


}
