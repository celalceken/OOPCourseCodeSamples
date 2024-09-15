# Objects in Java
    "We aim to develop a drawing application. We need to create a Circle with radius, x and y coordinates,
    and color properties. The Circle's area should also be calculated."
    After analyzing this requirement list, we identified Circle as an object, with
    radius, x, y coordinates, and color as its attributes, and the calculate area function as its method.

# Encapsulation
* Refers to the inclusion of data and the methods that use this data within a single structure (class).
* It allows for the details within the object to be hidden from other objects.
* Data and the methods using this data come together to form a class. Since direct access to the data is not desired, 
its access level is set to "private". Objects can interact with each other through "public" methods. Thus:

    * Complex problems are broken down into smaller parts. Each part can be developed independently.
    * Changes made to an object do not affect other objects.
    * Reusability of modules in other projects or different parts of the same project increases.
    * Testing the application becomes easier.

# Exercise
    We want to develop an e-commerce system. We need to manage a Product with attributes such as 
    id, name, unit price, and stock amount. The Product should also support methods to increase 
    stock amount and decrease stock amount.

    Develop a class named Product for an e-commerce system with attributes including id (long), 
    name (String), unitPrice (double), and stockAmount (int). Implement methods within this class to manage 
    the stock, specifically to increaseStockAmount(int amount), which should increase the stockAmount by 
    the specified amount, and decreaseStockAmount(int amount), which should decrease the stockAmount by the 
    specified amount, ensuring that it does not fall below zero.

    Additionally, create a Test class with a main method. In this method, instantiate the Product class, 
    set values for all its attributes, and demonstrate the functionality of the stock management methods 
    by increasing and decreasing the stock amount. Print out the Product object’s details to confirm that the 
    attributes are correctly updated and that the methods operate as expected.



    
