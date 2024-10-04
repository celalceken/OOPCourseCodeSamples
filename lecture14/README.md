# Introduction to Software Testing

Software testing is an essential phase in software development that ensures the code works as intended. It involves executing a program or a module to identify potential bugs, verify that requirements are met, and ensure the overall quality of the software.

## Types of Testing

There are various types of testing used to verify and validate software systems:

1. **Unit Testing**: Focuses on testing individual components or functions in isolation from the rest of the system.
2. **Integration Testing**: Verifies the interaction between different modules or systems.
3. **System Testing**: Validates the system as a whole against the specified requirements.
4. **Acceptance Testing**: Ensures the software meets the business requirements and is ready for delivery to end users.
5. **Regression Testing**: Ensures that new changes do not break existing functionality.

In this section, we'll focus on **Unit Testing**, which is one of the most fundamental types of testing.

## Unit Testing in Detail

Unit testing involves testing small, individual units of code, typically methods or classes, in isolation from other parts of the system. The primary goal is to verify that each unit behaves as expected.

Consider the following `Product` class in an e-commerce system:

```java
public class Product {
    private int id;
    private String name;
    private double price;
    private int stock;

    public Product(int id, String name, double price, int stock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void reduceStock(int amount) {
        if (amount <= stock) {
            this.stock -= amount;
        } else {
            throw new IllegalArgumentException("Insufficient stock");
        }
    }
}
```

## Benefits of Unit Testing
* Early Bug Detection: Bugs can be caught at an early stage, saving time and effort.
* Code Quality: It promotes better design since developers are focused on writing modular and testable code.
* Documentation: Unit tests act as documentation for how each method is supposed to work.
## JUnit Framework
JUnit is a widely-used framework for unit testing in Java. It allows developers to write test cases for individual units (such as the Product class), execute those tests, and verify whether the actual results match the expected outcomes.

### Sample Unit Test for Product Class
To demonstrate unit testing, we can write some test cases for the Product class using JUnit. Here’s a sample test:
~~~java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {

    @Test
    public void testReduceStock() {
        Product product = new Product(1, "Laptop", 1000.0, 10);
        product.reduceStock(5);
        assertEquals(5, product.getStock());
    }

    @Test
    public void testReduceStockInsufficient() {
        Product product = new Product(1, "Laptop", 1000.0, 5);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            product.reduceStock(6);
        });
        assertEquals("Insufficient stock", exception.getMessage());
    }

    @Test
    public void testSetPrice() {
        Product product = new Product(1, "Laptop", 1000.0, 10);
        product.setPrice(1200.0);
        assertEquals(1200.0, product.getPrice());
    }

    @Test
    public void testIsInStock() {
        Product product = new Product(1, "Laptop", 1000.0, 10);
        assertTrue(product.getStock() > 0);
    }

    @Test
    public void testProductNotNull() {
        Product product = new Product(1, "Laptop", 1000.0, 10);
        assertNotNull(product);
    }

    @Test
    public void testSameProduct() {
        Product product1 = new Product(1, "Laptop", 1000.0, 10);
        Product product2 = product1;
        assertSame(product1, product2);
    }

    @Test
    public void testMultipleAssertions() {
        Product product = new Product(1, "Laptop", 1000.0, 10);
        assertAll("product",
                () -> assertEquals(1, product.getId()),
                () -> assertEquals("Laptop", product.getName()),
                () -> assertEquals(1000.0, product.getPrice()),
                () -> assertEquals(10, product.getStock())
        );
    }
}
~~~

### Key Features of JUnit:
    Annotations: JUnit provides annotations like @Test to mark test methods.
    Assertions: JUnit provides assertion methods like assertEquals and assertThrows to compare expected results with actual outcomes.
    It also includes other assertion methods like:
        assertTrue and assertFalse
            assertTrue(condition): Asserts that the condition is true.
            assertFalse(condition): Asserts that the condition is false.
        assertNull and assertNotNull
            assertNull(object): Asserts that the object is null.
            assertNotNull(object): Asserts that the object is not null.
        assertSame and assertNotSame
            assertSame(expected, actual): Asserts that two variables refer to the same object.
            assertNotSame(expected, actual): Asserts that two variables refer to different objects.
        assertAll
            assertAll(executables...): Allows grouping multiple assertions into a single test, and all assertions will be checked even if some fail.

    Test Isolation: JUnit tests run independently, ensuring that the outcome of one test does not affect others.


### Running the Tests
JUnit tests can be run directly in most modern IDEs (like IntelliJ IDEA or Eclipse) or from the command line using build tools like Maven or Gradle. When the tests pass, it means that the Product class behaves as expected for the scenarios tested. If a test fails, JUnit provides feedback on where the code deviated from the expected behavior.

## Conclusion
Unit testing, especially with a framework like JUnit, is a critical part of ensuring that each component of your software functions correctly. By writing unit tests for individual methods and classes like Product, developers can build more robust and maintainable systems.

## Exercise 1: Define a Customer Class
Define a Customer class with the following attributes:
* customerID (int)
* firstName (String)
* lastName (String)
* email (String)
* phoneNumber (String)

Write the appropriate constructor, getters, setters, and a toString() method to display customer details.

## Exercise 2: Testing the Customer Class
Write unit tests using JUnit for the Customer class to verify the following:

* Test the constructor and ensure all fields are initialized correctly.
* Test the setFirstName method and ensure that it correctly updates the first name of the customer while handling any invalid input, such as empty strings or null values.
* Test the toString() method to ensure it returns a properly formatted string with customer details.