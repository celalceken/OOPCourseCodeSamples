package cc.oop.lecture10;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] Args) {

        System.out.println("*************Static array*************");

        // 1. Static Arrays
        // Simple to use.
        // Fast access to elements.
        // Fixed size determined at compile-time.
        // They cannot be resized during execution.
        // Lack of built-in functions for operations like sorting and searching.

        int[] numbers = {10, 20, 30, 40, 50};         // Static array initialization
        double[] decimals = new double[8];
        System.out.println(decimals.length);

        Book book1 = new Book("Database Management Systems ", 100.00);
        Book book2 = new Book("OOP ", 125.00);
        Book book3 = new Book("Network Programming", 150.00);
        Book book4 = new Book("Data Structures", 250.00);

        Book[] staticBookArray = new Book[3];
        staticBookArray[0] = book1;
        staticBookArray[1] = book2;
        staticBookArray[2] = new Book("Data Structures", 120.50);

        // Accessing using a for loop
        for (int i = 0; i < staticBookArray.length; i++)
            System.out.println(staticBookArray[i].getName());

        System.out.println("*************ArrayList - Dynamic array *************");

        // 2. Lists- ArrayList (Dynamic Array)
        // The size of the array is determined at runtime and can be resized during execution.
        // Unlike static arrays, dynamic arrays can grow (%50) or shrink as needed.
        // Dynamically resizes.
        // Allows duplicates.
        // Maintains insertion order.
        List<Book> bookArrayList = new ArrayList<>(4);

        bookArrayList.add(book1);
        bookArrayList.add(book2);
        bookArrayList.add(2, book3);
        bookArrayList.add(3, new Book("UML", 160.00));
        bookArrayList.add(book4);

        System.out.println(bookArrayList);

        for (int i = 0; i < bookArrayList.size(); i++)
            System.out.println(bookArrayList.get(i));

        for (Book book : bookArrayList)
            System.out.println(book.getName());

        System.out.println("*************Vector - Dynamic array *************");

        // 3. Lists-Vector (Dynamic Array)
        // The size of the array is determined at runtime and can be resized during execution.
        // Can grow (%100) or shrink as needed.
        // Allows duplicates.
        // Maintains insertion order.
        // thread-safe
        List<Book> booksVector = new ArrayList<>(4);

        booksVector.add(book1);
        booksVector.add(book2);
        booksVector.add(2, book3);
        booksVector.add(3, new Book("UML", 160.00));
        booksVector.add(book4);

        System.out.println(booksVector);

        for (int i = 0; i < booksVector.size(); i++)
            System.out.println(booksVector.get(i));

        for (Book book : booksVector)
            System.out.println(book.getName());


        System.out.println("************* LinkedList *************");

        // 4. Lists-LinkedList
        // Doubly linked list implementation of the List interface. It allows fast insertion and removal at both ends.
        // Faster insertions and deletions than ArrayList.
        // Can be used as a stack or queue.
        List<Book> linkedBooks = new LinkedList<>();
        linkedBooks.add(new Book("UML", 160.00));
        linkedBooks.add(new Book("Data Structures", 250.00));

        System.out.println(linkedBooks);

        for (int i = 0; i < linkedBooks.size(); i++)
            System.out.println(linkedBooks.get(i));

        for (Book book : linkedBooks)
            System.out.println(book.getName());

        System.out.println("************* HashSet  *************");

        // 5. Sets-HashSet
        // Hash Table
        // Unordered collection that does not allow duplicate elements.
        // It is useful when you need to store unique items.
        // Unordered

        Set<String> bookCategories = new HashSet<>();
        bookCategories.add("Programming");
        bookCategories.add("Databases");
        bookCategories.add("Programming");  // Will not be added again, as it’s a duplicate

        for (String bookCategory : bookCategories)
            System.out.println(bookCategory);



        System.out.println("************* TreeSet  *************");

        // 6. Sets-TreeSet
        // Hash Table + Doubly Linked List
        // Ordered set that maintains ascending order based on the natural ordering of the elements or a custom comparator.
        // It is useful when you want sorted and unique elements.
        Set<String> sortedBookNames = new TreeSet<>();
        sortedBookNames.add("OOP Using Java");
        sortedBookNames.add("Data Structures");
        sortedBookNames.add("UML");

        System.out.println(sortedBookNames);  // Sorted alphabetically

        Set<ComparableBook> sortedBooks = new TreeSet<>();

        sortedBooks.add(new ComparableBook("Network Programming", 60.00));
        sortedBooks.add(new ComparableBook("Data Structures", 80.00));
        sortedBooks.add(new ComparableBook("Database Management Systems", 75.00));

        // The books will be sorted by their name (alphabetically)
        sortedBooks.forEach(book -> System.out.println(book.getName()));


        System.out.println("************* HashMap  *************");

        // 7. Maps-HashMap
        // HashMap stores key-value pairs and allows fast access to elements using keys.
        // This is especially useful for mapping relationships like customer IDs to customer objects or ISBNs to books.
        Map<String, Book> bookMap = new HashMap<>();
        bookMap.put("978-0134685991", new Book("Data Structures", 50.00));
        bookMap.put("978-0596009205", new Book("Database Management Systems", 80.00));

        System.out.println(bookMap.get("978-0134685991"));  // Retrieve book using ISBN

        System.out.println(bookMap); // Retrieve all books and print

        // Iterate over the TreeMap and print each book's details in sorted order of the keys (ISBNs)
        for (Map.Entry<String, Book> entry : bookMap.entrySet()) {
            System.out.println("ISBN: " + entry.getKey() + " - Book: " + entry.getValue());
        }


        System.out.println("************* TreeMap  *************");

        // 8. Maps-TreeMap
        // TreeMap stores key-value pairs and maintains the keys in sorted order.
        // This is useful when we need to maintain the order of keys, such as sorting ISBN numbers.
        // Form a TreeMap to store ISBNs as keys and Book objects as values.
        Map<String, Book> bookTreeMap = new TreeMap<>();

        // Adding books to the TreeMap
        bookTreeMap.put("978-0134685991", new Book("Data Structures", 50.00));
        bookTreeMap.put("978-0596009205", new Book("Database Management Systems", 80.00));
        bookTreeMap.put("978-0131103627", new Book("Introduction to Algorithms", 60.00));
        bookTreeMap.put("978-0201633610", new Book("Design Patterns", 70.00));

        // Retrieve a book using its ISBN
        System.out.println(bookTreeMap.get("978-0134685991"));

        // Retrieve and print all books. Keys will be printed in sorted order (natural order of ISBNs).
        System.out.println(bookTreeMap);

        // Iterate over the TreeMap and print each book's details in sorted order of the keys (ISBNs)
        for (Map.Entry<String, Book> entry : bookTreeMap.entrySet()) {
            System.out.println("ISBN: " + entry.getKey() + " - Book: " + entry.getValue());
        }



        /**
         * * Lambda expressions are a powerful feature in Java that enhances code clarity.
         * * Programs are composed of the combination of pure functions.
         *   * The same output is produced for the same input (no side effects).
         *   * No shared/global variables exist.
         *   * The state of objects passed as parameters cannot be modified.
         * * No iterative structures (loops) are present.
         * * Since state changes are not allowed, parallel programs can be written (used in stream processing).
         */
        System.out.println("*************Lambda expressions-forEach *************");

        bookArrayList.forEach(book -> System.out.println(book));

        System.out.println("------- Lambda expression-forEach -------");

        bookArrayList.forEach(book -> System.out.println(book.getName()));

        double sum = 0;
        for (int i = 0; i < bookArrayList.size(); i++) {
            sum += bookArrayList.get(i).getUnitPrice();
        }
        System.out.println("Total unit price=" + sum);

        System.out.println("------- Lambda expression-sum -------");

        sum = bookArrayList
                .stream() //Converts the books collection into a stream of Book objects to perform functional operations.
                .mapToDouble(item -> item.getUnitPrice()) // Transforms each Book object to a double representing the book's unit price.
                .sum(); // Computes the sum of all double values, i.e. total unit prices

        System.out.println("Total unit price=" + sum); // Print the computed value to console.

        sum = bookArrayList
                .stream()
                .parallel() // Many threads, rather than a single one, are used to potentially increase performance.
                .mapToDouble(item -> item.getUnitPrice())
                .sum();

        System.out.println("Total unit price- parallel processing=" + sum);

        System.out.println("------- Lambda expression-filtering -------");

        List<Book> filteredBooks = bookArrayList
                .stream()
                .filter(item -> item.getName().startsWith("D"))
                .collect(Collectors.toList()); //default is ArrayList // .collect(Collectors.toCollection(LinkedList::new)); .collect(Collectors.toCollection(Vector::new));
        System.out.println(filteredBooks);

        System.out.println("------- Lambda expression-sorting -------");
        List<Book> sortedAndFilteredBooks = bookArrayList
                .stream()
                //.filter(item -> item.getAdi().startsWith("N"))
                .sorted(Comparator.comparing(Book::getName))
                //.sorted(Comparator.comparing(Kitap::getAdi).reversed())
                .collect(Collectors.toList());
        System.out.println(sortedAndFilteredBooks);
    }
}
