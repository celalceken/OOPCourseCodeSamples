package cc.oop.lecture14;

import org.testng.annotations.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {

    @Test
    public void testReduceStock() {
        Product product = new Product(1, "Laptop", 1000.0, 10);
        product.reduceStock(5);
        assertEquals(5, product.getStock());
    }

    @Test
    public void testReduceStockInsufficient() {
        Product product = new Product(1, "Laptop", 1000.0, 5);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            product.reduceStock(6);
        });
        assertEquals("Insufficient stock", exception.getMessage());
    }

    @Test
    public void testSetPrice() {
        Product product = new Product(1, "Laptop", 1000.0, 10);
        product.setPrice(1200.0);
        assertEquals(1200.0, product.getPrice());
    }

    @Test
    public void testIsInStock() {
        Product product = new Product(1, "Laptop", 1000.0, 10);
        assertTrue(product.getStock() > 0);
    }

    @Test
    public void testProductNotNull() {
        Product product = new Product(1, "Laptop", 1000.0, 10);
        assertNotNull(product);
    }

    @Test
    public void testSameProduct() {
        Product product1 = new Product(1, "Laptop", 1000.0, 10);
        Product product2 = product1;
        assertSame(product1, product2);
    }

}

