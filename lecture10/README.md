# Collections and Functional Programming (Lambda Expressions)

## Collections
The Java Collections Framework provides a set of interfaces and classes to handle different types of data structures like 
Lists, Sets, and Maps. These collections store objects and provide functionality for common data operations 
like searching, inserting, and deleting data.

* Lists: Ordered collections (e.g., ArrayList, LinkedList, Vector).
* Sets: Unordered collections that do not allow duplicates (e.g., HashSet, TreeSet).
* Maps: Key-value pairs where keys are unique (e.g., HashMap, TreeMap).


### Lists- ArrayList (Dynamic Array)
    The size of the array is determined at runtime and can be resized during execution.
    Unlike static arrays, dynamic arrays can grow (%50) or shrink as needed.
    Dynamically resizes.
    Allows duplicates.
    Maintains insertion order.
    ArrayList does not automatically shrink when elements are removed. However, you can manually reduce its size using the trimToSize() method. This reduces the capacity of the ArrayList to the current size of the list, releasing any extra memory.

### Lists-Vector (Dynamic Array)
    The size of the array is determined at runtime and can be resized during execution.
    Can grow (%100) or shrink as needed.
    Allows duplicates.
    Maintains insertion order.
    Thread-safe.
    ArrayList does not automatically shrink when elements are removed. However, like ArrayList, you can manually reduce its size by using trimToSize().

### Lists-LinkedList
    Doubly linked list implementation of the List interface. It allows fast insertion and removal at both ends.
    Faster insertions and deletions than ArrayList.
    Can be used as a stack or queue.


### Sets-HashSet
    Hash Table.
    Unordered collection that does not allow duplicate elements.
    It is useful when you need to store unique items.
    Unordered.


### Sets-TreeSet
    Hash Table + Doubly Linked List.
    Ordered set that maintains ascending order based on the natural ordering of the elements or a custom comparator.
    It is useful when you want sorted and unique elements.

### Maps-HashMap
    HashMap stores key-value pairs and allows fast access to elements using keys.
    This is especially useful for mapping relationships like customer IDs to customer objects or ISBNs to books.


### Maps-TreeMap
    TreeMap stores key-value pairs and maintains the keys in sorted order.
    This is useful when we need to maintain the order of keys, such as sorting ISBN numbers.
    Form a TreeMap to store ISBNs as keys and Book objects as values.


## Functional Programming (Lambda Expressions)

* Programs are composed of the combination of pure functions.
  * The same output is produced for the same input (no side effects). 
  * No shared/global variables exist. 
  * The state of objects passed as parameters cannot be modified.
* No iterative structures (loops) are present.
* Since state changes are not allowed, parallel programs can be written (used in stream processing).
* Lambda expressions are a powerful feature  that enhances code clarity.


## Exercise 1: Working with List and Functional Programming (Lambda Expressions)

### Task:
    Create a List<Book> to store books.
    Add at least 5 Book objects to the list.
    Write a lambda expression that:
        Prints the titles of all books.
        Calculates and prints the sum of all book prices.
        Filters and prints books with a price greater than 150.

### Hints:
    Use forEach() to print each book's title.
    Use stream(), mapToDouble(), and sum() to calculate the total price.
    Use stream(), filter(), and collect() to filter and display books with a price over 150.

## Exercise 2: Sorting Set<Book> using Comparator and Lambda Expressions

### Task:
    Create a Set<Book> to store books. Ensure that duplicate books (based on title) are not allowed.
    Add at least 5 Book objects to the set.
    Sort the books in two different ways using lambda expressions:
        Sort the books by title in ascending order.
        Sort the books by price in descending order.
    Print the sorted books.

## Exercise 3: Using Map and Lambda Expressions to Group Books by Price

### Task:
    Form a Map<String, List<Book>> where:
        The key is a price range ("Low", "Medium", "High").
        The value is a list of books that fall into that price range.
    Add at least 5 Book objects with different prices to the map.
    Write a lambda expression that groups the books into the following categories:
        "Low": Price <= 100
        "Medium": Price between 101 and 200
        "High": Price > 200
    Print each price category and the corresponding list of books.

### Hints:
    Use stream().filter() to filter books into their price ranges.
    Store the books in a Map<String, List<Book>> based on their price range.
    Print the map using forEach() and lambda expressions.