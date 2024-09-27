# Exception Handling in Java: Why It Is Crucial

**Exception handling** is a mechanism in programming that allows the graceful handling of runtime errors, ensuring the application doesn't crash or behave unpredictably when encountering an error. Proper exception handling is crucial because it helps maintain application stability, ensure data integrity, and deliver a seamless user experience.
By implementing proper exception handling mechanisms, developers can ensure the application remains stable, secure, and user-friendly. Failure to do so can lead to catastrophic errors such as application crashes, data corruption, and security vulnerabilities.

---

## Why Exception Handling is Crucial

1. **Prevents Application Crashes**:
    - Unhandled exceptions can cause the application to crash. In an e-commerce platform for instance, this could disrupt user transactions, leading to a poor user experience and loss of sales.

   **Example**:
   ```java
   public class ProductService {
       public Product getProductById(int productId) {
           if (productId <= 0) {
               throw new IllegalArgumentException("Product ID must be positive");
           }
           // code to fetch product from database
           return new Product();
       }
   }

   public class OrderService {
       public void createOrder(int productId) {
           try {
               Product product = new ProductService().getProductById(productId);
               // Process order
           } catch (IllegalArgumentException e) {
               System.out.println("Invalid product ID: " + e.getMessage());
           }
       }
   }
    ```

    - Here, an IllegalArgumentException is thrown if an invalid product ID is passed. Proper handling ensures the error is caught and logged without crashing the application.

2. **Maintains Data Integrity:**:
- Without proper exception handling, errors can cause data corruption. For example, failing to handle an exception during an order process might lead to incorrect order records or inventory discrepancies.
```java
   public class ProductService {
       public Product getProductById(int productId) {
           if (productId <= 0) {
               throw new IllegalArgumentException("Product ID must be positive");
           }
           // code to fetch product from database
           return new Product();
       }
   }

   public class OrderService {
       public void createOrder(int productId) {
           try {
               Product product = new ProductService().getProductById(productId);
               // Process order
           } catch (IllegalArgumentException e) {
               System.out.println("Invalid product ID: " + e.getMessage());
           }
       }
   }
```

- By handling the PaymentException, the system ensures that no incorrect data is stored in case the payment fails.

3. **Enhances Security:**:
- Unhandled exceptions may expose sensitive internal system details to end-users, like stack traces. Properly handling exceptions avoids exposing vulnerabilities.

    ```java
    try {
        // process user request
        } catch (Exception e) {
        System.out.println("An error occurred, please try again.");
    }
    ```

- Instead of exposing technical details, this handles exceptions gracefully, avoiding the display of stack traces or internal information.

4. **Improves User Experience:**:
- Users expect a seamless experience. If exceptions are not handled, the platform may provide incomplete or confusing information, leading to frustrated users.
```java
   try {
        // Place order
        } catch (OrderProcessingException e) {
        System.out.println("There was an issue processing your order. Please try again.");
}
```

- Proper error messaging ensures that users receive feedback about the error in a user-friendly way.

## Catastrophic Errors Due to Improper Exception Handling
Improper exception handling can lead to catastrophic errors in critical systems such as e-commerce platforms. Here’s why:

### Application Crashes:

Without catching exceptions, the application may crash, halting operations and losing customer transactions.

### Data Corruption:

If exceptions aren't handled, critical transactions may be incomplete, leaving the system with corrupted or inconsistent data (e.g., payments processed without corresponding orders).

### Security Vulnerabilities:

Exposed exceptions can provide attackers with insights into the internal workings of the system, making it more vulnerable to attacks.

### Loss of User Trust:

Frequent crashes or incomplete transactions will cause customers to lose trust in the platform, leading to a significant impact on the brand's reputation and revenue.


## Custom Exceptions

In Java, you can create your own exceptions by extending the `Exception` class (checked exception) or `RuntimeException` class (unchecked exception). Custom exceptions allow you to define specific errors that are meaningful to your application.

### Why Use Custom Exceptions?
1. **Provide clear and meaningful error messages**.
2. **Differentiate between error types** within your application.
3. **Improve code readability** by using exception names that are easy to understand.

### Example: Custom Exception in an E-Commerce Application

In an e-commerce platform, let's say you want to raise an exception when a product goes out of stock. Instead of using a generic exception, you can create a custom one:

```java
// Custom exception for out of stock products
public class ProductOutOfStockException extends Exception {
    public ProductOutOfStockException(String message) {
        super(message);
    }
}

// Service class that throws the custom exception
public class ProductService {

    public void purchaseProduct(int stock) throws ProductOutOfStockException {
        if (stock <= 0) {
            // In this case, a specific exception ProductOutOfStockException is thrown when stock is unavailable, improving clarity for developers and users.
            throw new ProductOutOfStockException("The product is out of stock!");
        }
        // Logic to process the purchase
        System.out.println("Product purchased successfully.");
    }
}

public class ECommerceApp {
    public static void main(String[] args) {
        ProductService productService = new ProductService();
        try {
            productService.purchaseProduct(0); // This will throw ProductOutOfStockException
        } catch (ProductOutOfStockException e) {
            System.out.println(e.getMessage()); // Prints: The product is out of stock!
        }
    }
}

```

## The finally Block
The finally block in Java is used to execute important code such as releasing resources, regardless of whether an exception is thrown. It is always executed, even if an exception occurs or if a return statement is used in the try or catch block.

### Example: Using finally in an E-Commerce Application
In an e-commerce platform, you may need to ensure that a database connection is always closed, even if an error occurs during a transaction:

~~~java
public class PaymentService {
    public void processPayment() {
        Connection connection = null;
        try {
            connection = Database.getConnection(); // Simulating DB connection
            // Simulate some operations that may throw an exception
            if (true) { // Simulating an exception
                throw new RuntimeException("Payment processing failed!");
            }
            System.out.println("Payment processed successfully.");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage()); // Prints: Payment processing failed!
        } finally {
            // The finally block ensures the database connection is always closed, preventing resource leaks, regardless of whether the payment processing succeeds or fails.
            if (connection != null) {
                System.out.println("Closing database connection.");
                // Close the connection
            }
        }
    }
}

~~~

## Exercise 1: try and catch
Apply all the modifications into lecture3/relationships/MainClass.java

Add error handling to the customer input process. For example, handle cases where the user leaves any field empty (e.g., name or phone number) or enters invalid data for the phone number.

### Steps:
Modify the customer input section to wrap in a try block.
Throw an exception if any input field is left empty or if an invalid phone number format is entered.
Catch the exception and display an appropriate error message.

## Exercise 2: Custom Exception
Create a custom exception for invalid customer data (e.g., invalid username or password). This exception should be thrown if the username is too short or the password doesn’t meet specific criteria (e.g., length or complexity).

### Steps:
Define a custom exception class InvalidCustomerDataException.
Throw the custom exception when the username or password is invalid.
Catch the custom exception and display a relevant message to the user.

## Exercise 3: finally Block
Ensure that the Scanner resource is properly closed after reading user input by using a finally block.

### Steps:
Add a finally block to close the Scanner object, even if an exception occurs during input handling.
Ensure that the Scanner object is closed to prevent resource leaks.
