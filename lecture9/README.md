# File Input/Output (I/O) and Serialization

## File Input/Output
In Java, File I/O is the process of reading from and writing to files, which allows persistent storage of data. In an e-commerce system, for example, file I/O might be used to store customer data, order details, or product information.

### 1. Reading and Writing Files
   The most basic form of file I/O involves reading data from files and writing data to files. Java provides classes such as FileReader, BufferedReader, FileWriter, and BufferedWriter for these operations.

Example 1: Writing Customer Data to a File (E-commerce System)
In this example, we’ll write the customer details to a file. Each customer's data will be saved as a line in the file.

~~~java
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileIOExample {

    public static void writeCustomerDataToFile(List<Customer> customers, String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (Customer customer : customers) {
                String customerData = customer.getFirstName() + "," +
                                      customer.getLastName() + "," +
                                      customer.getPhoneNumber() + "," +
                                      customer.getHomeAddress().getCity();
                writer.write(customerData);
                writer.newLine();  // move to the next line
            }
            System.out.println("Customer data written to file.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}

~~~

Example 2: Reading Customer Data from a File
This example demonstrates reading customer data from a file and printing it out. This could be used to load customers from a file when the application starts.
~~~java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileIOExample {

    public static void readCustomerDataFromFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] customerData = line.split(",");
                System.out.println("First Name: " + customerData[0]);
                System.out.println("Last Name: " + customerData[1]);
                System.out.println("Phone Number: " + customerData[2]);
                System.out.println("City: " + customerData[3]);
                System.out.println("-----------------------------");
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }
}

~~~

## 2. Serialization and Deserialization of Objects
   In Java, serialization is the process of converting an object into a stream of bytes to be saved in a file or sent over the network. Deserialization is the reverse process, converting the byte stream back into an object.

This is particularly useful in an e-commerce system when you need to save complex objects like Customer, Order, or Product instances to a file for persistent storage and later retrieve them.

Example: Serialization and Deserialization of a Customer Object
Step 1: Make the Customer Class Serializable
To serialize an object, the class must implement the Serializable interface. This interface is a marker interface (it has no methods but signals that the class can be serialized).
~~~java
import java.io.Serializable;

public class Customer implements Serializable {
    private static final long serialVersionUID = 1L;  // Optional, to ensure version compatibility
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private Address homeAddress;

    // Constructors, getters, setters...

    public Customer(String firstName, String lastName, Address homeAddress, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.homeAddress = homeAddress;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " - " + homeAddress.getCity() + " - " + phoneNumber;
    }
}

~~~

Step 2: Serialization (Saving a Customer Object to a File)
In this step, we serialize the customer object to a file. This allows storing the object for later retrieval.

~~~java
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationExample {

    public static void serializeCustomer(Customer customer, String fileName) {
        try (FileOutputStream fileOut = new FileOutputStream(fileName);
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {

            out.writeObject(customer);
            System.out.println("Serialized data is saved in " + fileName);

        } catch (IOException i) {
            System.out.println("Error serializing object: " + i.getMessage());
        }
    }
}

~~~
Step 3: Deserialization (Reading a Customer Object from a File)
In this step, we deserialize the customer object that was previously serialized to a file.

~~~java
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationExample {

    public static Customer deserializeCustomer(String fileName) {
        Customer customer = null;
        try (FileInputStream fileIn = new FileInputStream(fileName);
             ObjectInputStream in = new ObjectInputStream(fileIn)) {

            customer = (Customer) in.readObject();
            System.out.println("Deserialized Customer: " + customer);

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error deserializing object: " + e.getMessage());
        }
        return customer;
    }
}
~~~

### Main 
~~~java
public class MainClass {

    public static void main(String[] args) {
        // Create a customer
        Address homeAddress = new Address("123 Main St", "New York");
        Customer customer = new Customer("John", "Doe", homeAddress, "1234567890");

        // Serialize the customer object to a file
        SerializationExample.serializeCustomer(customer, "customer.ser");

        // Deserialize the customer object from the file
        Customer deserializedCustomer = DeserializationExample.deserializeCustomer("customer.ser");

        System.out.println("Customer Info after Deserialization: " + deserializedCustomer);
    }
}

~~~

### Why Serialization and Deserialization are Important 
Persistent Storage: Serialized objects can be saved to files, allowing you to persistently store customer details, orders, products, etc.
Data Transfer: Serialization can be used to transfer objects over the network, enabling e-commerce systems to exchange data between different services (e.g., microservices or APIs).


## Exercise 1: Write and Read Customer Data to/from a File
Objective: Practice basic file I/O operations by writing customer data to a file and reading it back.

### Task:

Create a Customer class with properties: firstName, lastName, phoneNumber, and city.
In your main class, prompt the user to enter customer details and write them to a text file named customers.txt.
Write a method to read the customer data from the file and print it to the console.
### Steps:

Use BufferedWriter to write customer details to the file.
Use BufferedReader to read the customer details back.

## Exercise 2: Serialize and Deserialize a Product Object
Objective: Learn to serialize and deserialize Java objects by saving and loading a Product object to/from a file.

### Task:

Create a Product class with fields: productId, productName, and price. Ensure that the class implements the Serializable interface.
Create a method to serialize a Product object to a file named product.ser.
Create another method to deserialize the Product object from the file.
In your main method, serialize a Product object and then deserialize it, printing the product details to the console.
### Steps:

Use ObjectOutputStream to serialize the Product object.
Use ObjectInputStream to deserialize the object.

## Exercise 3: Serialize and Deserialize a List of Orders
Objective: Work with more complex data structures by serializing and deserializing a list of objects.

### Task:

Create an Order class with fields: orderId, customerName, totalAmount, and orderDate. Implement Serializable.
In your main class, create a List<Order> to store multiple orders.
Write a method to serialize the list of orders to a file named orders.ser.
Write a method to deserialize the list from the file and print all orders to the console.
## Steps:

Use ObjectOutputStream to serialize the List<Order>.
Use ObjectInputStream to deserialize the list and iterate over it to print each order.
