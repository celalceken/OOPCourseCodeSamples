package cc.oop.lecture13;

import java.util.List;

public interface IProductRepository {
    Product search(int productNumber);

    List<Product> getAllProducts();

    void save(Product product);

    void delete(int productNumber);
}
