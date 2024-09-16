# Variables in Java

## Primitive Types

* As a best practice, we should select the smallest type that has a sufficient range to represent the values we expect.
* For the exam score, we can choose byte since its range (0 to 127) covers 0-100. 
* For the world population, we can choose long since the value exceeds 8 billion.

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


# Operators in Java

| **Operator**        | **Type**             | **Syntax/Usage**           | **Description**                                        | **Example**                    |
|---------------------|----------------------|----------------------------|--------------------------------------------------------|--------------------------------|
| **`+`** (plus)      | Arithmetic            | `a + b`                    | Adds two values                                         | `3 + 2 // returns 5`           |
| **`-`** (minus)     | Arithmetic            | `a - b`                    | Subtracts second operand from the first                 | `5 - 2 // returns 3`           |
| **`*`** (multiply)  | Arithmetic            | `a * b`                    | Multiplies two values                                   | `4 * 3 // returns 12`          |
| **`/`** (divide)    | Arithmetic            | `a / b`                    | Divides the first operand by the second                 | `10 / 2 // returns 5`          |
| **`%`** (modulus)   | Arithmetic            | `a % b`                    | Modulus (remainder of division)                         | `10 % 3 // returns 1`          |
| **`++`** (increment)| Increment             | `++a` or `a++`             | Increments value by 1 (pre/post increment)              | `int a = 1; ++a; // a = 2`     |
| **`--`** (decrement)| Decrement             | `--a` or `a--`             | Decreases value by 1 (pre/post decrement)               | `int a = 2; --a; // a = 1`     |
| **`==`** (equal)    | Comparison            | `a == b`                   | Checks if two values are equal                          | `5 == 5 // returns true`       |
| **`!=`** (not equal)| Comparison            | `a != b`                   | Checks if two values are not equal                      | `5 != 3 // returns true`       |
| **`>`** (greater)   | Comparison            | `a > b`                    | Checks if first operand is greater than the second      | `5 > 3 // returns true`        |
| **`<`** (less)      | Comparison            | `a < b`                    | Checks if first operand is less than the second         | `3 < 5 // returns true`        |
| **`>=`** (greater or equal)| Comparison     | `a >= b`                   | Checks if first operand is greater than or equal to the second | `5 >= 5 // returns true` |
| **`<=`** (less or equal)| Comparison        | `a <= b`                   | Checks if first operand is less than or equal to the second | `3 <= 5 // returns true` |
| **`&&`** (logical AND)| Logical (AND)       | `a && b`                   | Logical AND, returns true if both operands are true     | `true && false // returns false` |
| **`||`** (logical OR)| Logical (OR)         | `a || b`                   | Logical OR, returns true if at least one operand is true | `true || false // returns true` |
| **`!`** (logical NOT)| Logical (NOT)        | `!a`                       | Logical NOT, inverts the boolean value                  | `!true // returns false`       |
| **`=`** (assignment)| Assignment            | `a = b`                    | Assigns value of right operand to left operand          | `int a = 5 // a = 5`           |
| **`+=`** (plus equal)| Assignment            | `a += b`                   | Adds right operand to left operand and assigns the result | `a += 2 // a = a + 2`         |
| **`-=`** (minus equal)| Assignment           | `a -= b`                   | Subtracts right operand from left operand and assigns the result | `a -= 2 // a = a - 2`         |
| **`*=`** (multiply equal)| Assignment        | `a *= b`                   | Multiplies and assigns the result                       | `a *= 3 // a = a * 3`          |
| **`/=`** (divide equal)| Assignment          | `a /= b`                   | Divides and assigns the result                          | `a /= 2 // a = a / 2`          |
| **`%=`** (modulus equal)| Assignment         | `a %= b`                   | Modulus and assigns the result                          | `a %= 3 // a = a % 3`          |


# Operator Precedence in Java (Highest to Lowest)

| **Precedence** | **Operator**             | **Type**                    | **Associativity** | **Example**               |
|----------------|--------------------------|-----------------------------|-------------------|---------------------------|
| **1**          | `++` `--`                 | Post-increment/ Post-decrement | Left to right   | `a++`, `b--`              |
| **2**          | `++` `--`                 | Pre-increment/ Pre-decrement  | Right to left    | `++a`, `--b`              |
| **2**          | `+` `-`                   | Unary plus / Unary minus      | Right to left    | `+a`, `-b`                |
| **2**          | `!`                       | Logical NOT                   | Right to left    | `!a`                      |
| **2**          | `(type)`                  | Type cast                     | Right to left    | `(int)a`                  |
| **3**          | `*` `/` `%`               | Multiplication / Division / Modulus | Left to right | `a * b`, `a / b`, `a % b` |
| **4**          | `+` `-`                   | Addition / Subtraction        | Left to right    | `a + b`, `a - b`          |
| **5**          | `<` `<=` `>` `>=`         | Comparison (less, greater)    | Left to right    | `a > b`, `a <= b`         |
| **6**          | `==` `!=`                 | Equality / Inequality         | Left to right    | `a == b`, `a != b`        |
| **7**          | `&&`                      | Logical AND                   | Left to right    | `a && b`                  |
| **8**          | `||`                      | Logical OR                    | Left to right    | `a || b`                  |
| **9**          | `=` `+=` `-=` `*=` `/=` `%=` | Assignment                | Right to left    | `a = 5`, `a += 2`         |
