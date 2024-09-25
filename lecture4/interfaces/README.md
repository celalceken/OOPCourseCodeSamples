# Interface

* Interfaces include only abstract methods (methods without a body)
* Interfaces specify what a class can do ("is capable of").
* They define what must be done, not how.

### Through interface:
* Client code can use the dependent code even though it is not implemented yet (enabling parallel development).
* Client code supports new features without a modification (Open/Closed Principle).
* Changes in the dependent code do not affect the client code (loose coupling). 
* Code reuse for the client code is increased.

## UML Class Diagram of Interface Application

![](https://github.com/celalceken/OOPCourseCodeSamples/blob/main/Files/Interface.png)

## Exercise
    Modify the application to also support the MongoDB and Redis database management systems.
    
    Copy the lecture3/relationships package to here. 
    Write a getShortAddress() method in the Address class that returns a shortened version of the address 
    by combining the city with the first 10 characters of the address line. Write an interface for the 
    Address class to decouple it from the Customer class