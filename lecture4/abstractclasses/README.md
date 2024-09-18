# Abstract class
* Cannot be instantiated
* Contain abstract methods: Methods declared without a body. Derived classes must provide implementations for these methods (function overriding).
* May contain concrete methods: Can be directly used by derived classes.
* Used for inheritance: Abstract classes are primarily used as base classes for other classes, providing a common framework.
* Significantly boosts code reuse and makes changes and extensions easier. Supports polymorphism.


## UML Class Diagram

![](https://github.com/celalceken/OOPCourseCodeSamples/blob/main/Files/AbstractClass.png)

## Exercise
    Modify the application to also support the Square shape. The Square class should inherit from the abstract Shape class, 
    include a sideLength attribute, and override the toString() and calculateArea()  methods. 