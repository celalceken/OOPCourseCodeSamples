# Design Principles
These principles focus on managing dependencies between modules during the design process. When dependencies are well-managed:

- The design becomes more stable and is less impacted by changes in the implementation.
- **Cohesion** is increased, while **coupling** is reduced, resulting in a more maintainable system.
- Future modifications and updates are easier to implement.
- Code reusability and modularity are enhanced, making the system more flexible.
- Adding new features becomes simpler and more efficient.
- The overall understandability of the system improves, making it easier to work with.
- Complexity is reduced as unnecessary dependencies are eliminated.
- Writing unit tests becomes more straightforward, improving test coverage and quality.


- Design principles and patterns often result in the use of many modules, which can sometimes reduce efficiency.
- As a result, these principles may be selectively disregarded based on the specific needs of the application.

- For example:
  - If the dependent module is unlikely to change, applying the **Dependency Inversion Principle (DIP)** may not be necessary.
  - If the software is not expected to evolve or expand, following the **Open/Closed Principle (OCP)** or implementing the strategy pattern may not be required.

## SOLID 

| Abbreviation | Meaning                             | Short Description                                                                 |
|--------------|-------------------------------------|-----------------------------------------------------------------------------------|
| S            | **Single Responsibility Principle** | A class should have only one reason to change, meaning it should only have one job.|
| O            | **Open/Closed Principle**           | Software entities should be open for extension, but closed for modification.       |
| L            | **Liskov Substitution Principle**   | Objects of a superclass should be replaceable with objects of a subclass without affecting correctness. |
| I            | **Interface Segregation Principle** | Clients should not be forced to depend on interfaces they do not use.              |
| D            | **Dependency Inversion Principle**  | High-level modules should not depend on low-level modules. Both should depend on abstractions. |

### 

  
  
---
### Single Responsibility

The Single Responsibility Principle (SRP) states that a class should have only one reason to change,
meaning it should only have one responsibility or task. Each class should focus on a single part of
the functionality of a program, ensuring separation of concerns.
---

### Open/Closed Principle

The Open/Closed Principle (OCP) suggests that a class should be open for extension but closed for modification. This means that you should be able to add new functionality without changing existing code, typically achieved through abstraction and polymorphism.

---

### Liskov Substitution Principle

The Liskov Substitution Principle (LSP) states that objects of a superclass should be replaceable with objects of a subclass without altering the correctness of the program. In other words, derived classes must fully implement the base class's contract without altering expected behavior.

---

### Interface Segregation Principle

The Interface Segregation Principle (ISP) advises that a class should not be forced to implement interfaces it doesn't use. Instead, multiple smaller, specific interfaces are better than a single, large interface, keeping the system flexible and modular.

---

### Dependency Inversion Principle

The Dependency Inversion Principle (DIP) asserts that high-level modules should not depend on low-level modules. Both should depend on abstractions. It also suggests that abstractions should not depend on details, but details should depend on abstractions. This principle helps decouple code and promotes easier maintenance and testing.





