# Java Variables

## Primitive Types

| **Variable Type**    | **Description**                                     | **Example**              | **Range**                |
|----------------------|-----------------------------------------------------|--------------------------|--------------------------|
| **Integer Types**    | Stores whole numbers.                              |                          |                          |
| - `int`              | 32-bit signed integer.                             | `int age = 30;`          | -2,147,483,648 to 2,147,483,647 |
| - `byte`             | 8-bit signed integer.                              | `byte b = 127;`          | -128 to 127              |
| - `short`            | 16-bit signed integer.                             | `short s = 1000;`        | -32,768 to 32,767        |
| - `long`             | 64-bit signed integer.                             | `long l = 100000L;`      | -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 |
| **Floating-Point Types** | Stores numbers with decimal points.             | `float`, `double`        |                          |
| - `float`            | Single-precision 32-bit floating point.            | `float f = 3.14f;`       | Approx. ±3.40282347E+38 (7 decimal digits) |
| - `double`           | Double-precision 64-bit floating point.            | `double d = 3.14159;`    | Approx. ±1.79769313486231570E+308 (15 decimal digits) |
| **Character Type**   | Stores single characters.                          | `char`                   |                          |
| - `char`             | 16-bit Unicode character.                          | `char c = 'A';`          | 0 to 65,535              |
| **Boolean Type**     | Stores true or false values.                       | `boolean`                |                          |
| - `boolean`          | Represents true or false.                          | `boolean isValid = true;`| `true` or `false`        |

## Reference Types

| **Variable Type**    | **Description**                                     | **Example**              | **Range**                |
|----------------------|-----------------------------------------------------|--------------------------|--------------------------|
| **String**           | Represents a sequence of characters.               | `String`                 | Variable length          |
| - `String`           | A sequence of characters.                          | `String name = "John";`  | Length can vary          |
| **Arrays**           | Stores multiple values of the same type.           | `int[]`, `String[]`      | Variable length          |
| - `int[]`            | Array of integers.                                 | `int[] numbers = {1, 2, 3};` | Length is defined at initialization |
| - `String[]`         | Array of strings.                                  | `String[] names = {"John", "Jane"};` | Length is defined at initialization |
| **Custom Objects**   | Instances of user-defined classes.                  |                          |                          |
| - `Car`              | A class representing a car.                        | `Car myCar = new Car();` | Depends on class design   |

### Summary:
- **Primitive Types**: Directly store values and are simple with defined boundaries.
- **Reference Types**: Store references to objects and arrays, allowing for more complex data structures and operations with variable lengths.


# Encapsulation
* Refers to the inclusion of data and the methods that use this data within a single structure (class).
* It allows for the details within the object to be hidden from other objects.
* Data and the methods using this data come together to form a class. Since direct access to the data is not desired, 
its access level is set to "private". Objects can interact with each other through "public" methods. Thus:

    * Complex problems are broken down into smaller parts. Each part can be developed independently.
    * Changes made to an object do not affect other objects.
    * Reusability of modules in other projects or different parts of the same project increases.
    * Testing the application becomes easier.
## Exercises
    The example application requires the circle object to also include label (String) information. Update the constructor, set, get, and toString methods as necessary.
    Form a circle object within the main method and ensure that all methods are used.
