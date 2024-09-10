package cc.oop.ders3.collections;

import java.util.*;
import java.util.stream.Collectors;

public class Main {


    public static void main(String[] Args) {

        Book book1 = new Book("Database Management Systems ", 100.00);
        Book book2 = new Book("OOP ", 125.00);
        Book book3 = new Book("Network Programming", 150.00);
        Book book4 = new Book("Data Structures", 250.00);


        List<Book> books = new Vector<Book>();
        books.add(book1);
        books.add(book2);
        books.add(2, book3);
        books.add(3, new Book("UML", 160.00));
        books.add(book4);


        System.out.println(books);

        List<Book> books = new Vector<Book>();
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

        System.out.println("*************Lambda statemens-forEach *************");

        books.forEach(book -> System.out.println(book));

        System.out.println("*************Lambda statemens-forEach *************");

        books.forEach(book -> System.out.println(book.getName()));

        double sum = 0;
        for (int i = 0; i < books.size(); i++) {
            sum += books.get(i).getUnitPrice();
        }
        System.out.println("Total unit price=" + sum);

        System.out.println("*************Lambda statemens-sum *************");

        sum = books
                .stream()
                .mapToDouble(item -> item.getUnitPrice())
                .sum();
        System.out.println("Total unit price=" + sum);

        /** After the book unit prices are converted to a DoubleStream, the values in this stream are summed.
         This operation is performed in parallel using multiple threads.
         It is suitable for processing large amounts of data.**/
        sum = books
                .stream()
                .parallel()
                .mapToDouble(item -> item.getUnitPrice())
                .sum();
        System.out.println("Total unit price- paralel=" + sum);

        System.out.println("*************Lambda statemens-filtering *************");

        List<Book> filteredBooks = books
                .stream()
                .filter(item -> item.getName().startsWith("D"))
                .collect(Collectors.toList());
        System.out.println(filteredBooks);


        System.out.println("*************Lambda statemens-sorting *************");
        List<Book> sortedAndFilteredBooks = books
                .stream()
                //.filter(item -> item.getAdi().startsWith("N"))
                .sorted(Comparator.comparing(Book::getName))
                //.sorted(Comparator.comparing(Kitap::getAdi).reversed())
                .collect(Collectors.toList());
        System.out.println(sortedAndFilteredBooks);

    }

}


    /*List<CompletableFuture<JSONObject>> scrapedProducts = new ArrayList<>();

        loadDrivers.getDrivers().stream().forEach(driver -> {
        try {
            if (driver != null)
                scrapedProducts.add(driver.driverTest());
        } catch (Exception e) {
            log.debug("Problem with drivers.");
        }
    });

        scrapedProducts.stream().forEach(item -> {
        try {
            if (item.get() != null && !item.get().toString().equals("{}")) {
                log.debug("item:{}", item.get().toString(1));
*/

}
