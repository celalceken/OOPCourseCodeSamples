package cc.oop.lecture2.collections;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] Args) {
        // Static array initialization
        //Fixed size determined at compile-time. They cannot be resized during execution.
        int[] numbers = {10, 20, 30, 40, 50};

        double[] decimals = new double[8];
        System.out.println(decimals.length);

        // Dynamic array initialization
        // The size of the array is determined at runtime and can be resized during execution.
        // Unlike static arrays, dynamic arrays can grow or shrink as needed.
        List<Book> books = new ArrayList<>(4);

        Book book1 = new Book("Database Management Systems ", 100.00);
        Book book2 = new Book("OOP ", 125.00);
        Book book3 = new Book("Network Programming", 150.00);
        Book book4 = new Book("Data Structures", 250.00);

        books.add(book1);
        books.add(book2);
        books.add(2, book3);
        books.add(3, new Book("UML", 160.00));
        books.add(book4);

        System.out.println(books);

        for (int i = 0; i < books.size(); i++)
            System.out.println(books.get(i));

        for (Book book : books)
            System.out.println(book.getName());

        /**
         * Lambda expressions are a powerful feature in Java that enhances code clarity.
         */
        System.out.println("*************Lambda expressions-forEach *************");

        books.forEach(book -> System.out.println(book));

        System.out.println("------- Lambda expression-forEach -------");

        books.forEach(book -> System.out.println(book.getName()));

        double sum = 0;
        for (int i = 0; i < books.size(); i++) {
            sum += books.get(i).getUnitPrice();
        }
        System.out.println("Total unit price=" + sum);

        System.out.println("------- Lambda expression-sum -------");

        sum = books
                .stream() //Converts the books collection into a stream of Book objects to perform functional operations.
                .mapToDouble(item -> item.getUnitPrice()) // Transforms each Book object to a double representing the book's unit price.
                .sum(); // Computes the sum of all double values, i.e. total unit prices

        System.out.println("Total unit price=" + sum); // Print the computed value to console.

        sum = books
                .stream()
                .parallel() // Many threads, rather than a single one, are used to potentially increase performance.
                .mapToDouble(item -> item.getUnitPrice())
                .sum();

        System.out.println("Total unit price- parallel processing=" + sum);

        System.out.println("------- Lambda expression-filtering -------");

        List<Book> filteredBooks = books
                .stream()
                .filter(item -> item.getName().startsWith("D"))
                .collect(Collectors.toList()); //default is ArrayList // .collect(Collectors.toCollection(LinkedList::new)); .collect(Collectors.toCollection(Vector::new));
        System.out.println(filteredBooks);

        System.out.println("------- Lambda expression-sorting -------");
        List<Book> sortedAndFilteredBooks = books
                .stream()
                //.filter(item -> item.getAdi().startsWith("N"))
                .sorted(Comparator.comparing(Book::getName))
                //.sorted(Comparator.comparing(Kitap::getAdi).reversed())
                .collect(Collectors.toList());
        System.out.println(sortedAndFilteredBooks);
    }
}
