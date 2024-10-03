package cc.oop.lecture13;

import java.util.List;
import java.util.Scanner;

public class MainClass {
    // ***** Drivers to be used for database operations related to the product *****
    // IProductRepository productRepository = new ProductRepositoryMySQL();
    // IProductRepository productRepository = new ProductRepositoryMongoDB();
    // IProductRepository productRepository = new ProductRepositoryCassandra();
    private static IProductRepository productRepository = new ProductRepositoryImplPostgreSQL();
    private static ProductService productService = new ProductService(productRepository);

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        // Temporary variables
        String response = null;
        Product product = null;
        int productID;
        String productName;
        double unitPrice = 0;
        int stockAmount = 0;

        ///*
        System.out.println("********************* Search **************************");

        System.out.println("Enter the number of the product you're looking for:");
        productID = input.nextInt();
        input.nextLine();
        product = productService.search(productID);
        if (product != null)
            System.out.println("The product you're looking for: " + product);
        else
            System.out.println("The product you're looking for was not found.");

        System.out.println("****************** Retrieve all products ********************");

        List<Product> productList;

        productList = productService.getAllProducts();
        System.out.println(productList);

        System.out.println("Enter the name of the product you want to add to the cart:");
        String productToBeAddedName = input.nextLine();

        // Searches the list for the product by name and returns the product object
        product = productList.stream()
                .filter(productElement -> productToBeAddedName.equalsIgnoreCase(productElement.getName()))
                .findAny()
                .orElse(null);
        if (product != null)
            System.out.println("The product you want to add: " + product);

        System.out.println("****************** Save ********************");

        System.out.println("Enter the product number");
        productID = input.nextInt();
        input.nextLine();
        System.out.println("Enter the product name:");
        productName = input.nextLine();

        System.out.println("Enter the unit price and stock amount:");
        unitPrice = input.nextDouble();
        stockAmount = input.nextInt();
        input.nextLine();
        // product = new Product(productNo, productName, unitPrice, stockAmount);
        product = new Product(productID, productName, unitPrice, stockAmount); // The productNo value is assigned in the database via a counter (serial, auto increment)

        productService.save(product);

        //*/

        System.out.println("****************** Delete **************************");

        productList = productService.getAllProducts();
        System.out.println(productList);

        System.out.println("Enter the number of the product you want to delete:");
        productID = input.nextInt();
        input.nextLine();
        productService.delete(productID);
    }
}