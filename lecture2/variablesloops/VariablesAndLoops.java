package cc.oop.lecture2.variablesloops;

public class VariablesAndLoops {

    public static void main(String[] args) {

        // Defining a variable.
        // You must define variables before using them as java is a statically typed language
        // When defining a variable, you first need to specify its type.
        // Operating system allocates memory for x in RAM and stores the value 5.
        // How much memory is allocated for an int variable in Java ?
        int x = 5; // local variable


        // Operator Precedence
        // x + 2 is calculated first since + has higher precedence than =,
        // and the result is assigned to the newly declared integer variable y.
        int y = x + 2;
        System.out.println("**********y:"+y+"**********");


        // Static array initialization
        // You can use arrays to store a collection of elements in Java
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



        // Loops execute a block of code repeatedly until a specified condition is met
        // a single execution of a repeated block is iteration
        //initialize -> int i = 0 initializes the control variable.
        //condition check -> i < 10 is the condition for the loop to continue.
        //update -> i++ updates the control variable each time the loop iterates.

        for (int i = 0; i < 10; i++) {
            // Repeated code block
            System.out.println("Number of iteration is:"+i);
        }


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
