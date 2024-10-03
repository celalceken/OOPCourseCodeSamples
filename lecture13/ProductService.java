package cc.oop.lecture13;

import java.util.List;

public class ProductService {

    IProductRepository productRepository;

    public ProductService(IProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product search(int productNumber) {
        System.out.println("Searching for the product...");
        return productRepository.search(productNumber);
    }

    public List<Product> getAllProducts() {
        System.out.println("Fetching all products...");
        return productRepository.getAllProducts();
    }

    public void save(Product product) {
        System.out.println("Saving the product..." + product);
        productRepository.save(product);
    }

    public void delete(int productNumber) {
        System.out.println("Deleting the product...");
        productRepository.delete(productNumber);
    }
}
