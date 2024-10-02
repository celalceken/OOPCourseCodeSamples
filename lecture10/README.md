# Collections and Functional Programming (Lambda Expressions)

## Collections
The Java Collections Framework provides a set of interfaces and classes to handle different types of data structures like Lists, Sets, and Maps. These collections store objects and provide functionality for common data operations like searching, inserting, and deleting data.

* Lists: Ordered collections (e.g., ArrayList, LinkedList, Vector).
* Sets: Unordered collections that do not allow duplicates (e.g., HashSet, TreeSet).
* Maps: Key-value pairs where keys are unique (e.g., HashMap, TreeMap).


### Lists- ArrayList (Dynamic Array)
    The size of the array is determined at runtime and can be resized during execution.
    Unlike static arrays, dynamic arrays can grow (%50) or shrink as needed.
    Dynamically resizes.
    Allows duplicates.
    Maintains insertion order.

Lists-Vector (Dynamic Array)
// The size of the array is determined at runtime and can be resized during execution.
// Can grow (%100) or shrink as needed.
// Allows duplicates.
// Maintains insertion order.
// thread-safe

Lists-LinkedList
// Doubly linked list implementation of the List interface. It allows fast insertion and removal at both ends.
// Faster insertions and deletions than ArrayList.
// Can be used as a stack or queue.


Sets-HashSet
// Hash Table
// Unordered collection that does not allow duplicate elements.
// It is useful when you need to store unique items.
// Unordered


Sets-TreeSet
// Hash Table + Doubly Linked List
// Ordered set that maintains ascending order based on the natural ordering of the elements or a custom comparator.
// It is useful when you want sorted and unique elements.

Maps-HashMap
// HashMap stores key-value pairs and allows fast access to elements using keys.
// This is especially useful for mapping relationships like customer IDs to customer objects or ISBNs to books.


Maps-TreeMap
   // TreeMap stores key-value pairs and maintains the keys in sorted order.
   // This is useful when we need to maintain the order of keys, such as sorting ISBN numbers.
   // Form a TreeMap to store ISBNs as keys and Book objects as values.


## Functional Programming (Lambda Expressions)

* Programs are composed of the combination of pure functions.
  * The same output is produced for the same input (no side effects). 
  * No shared/global variables exist. 
  * The state of objects passed as parameters cannot be modified.
* No iterative structures (loops) are present.
* Since state changes are not allowed, parallel programs can be written (used in stream processing).
* Lambda expressions are a powerful feature  that enhances code clarity.
