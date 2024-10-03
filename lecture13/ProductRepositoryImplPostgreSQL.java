package cc.oop.lecture13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProductRepositoryImplPostgreSQL implements IProductRepository {

    private Connection connect() {

        Connection conn = null;

        try {
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ecommerce",
                    "postgres", "LecturePassword");
            if (conn != null)
                System.out.println("Connected to the database!");
            else
                System.out.println("Connection attempt failed!");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

    public Product search(int productNumber) {

        Product product = null;

        String sql = "SELECT * FROM product WHERE id = " + productNumber;

        Connection conn = this.connect();
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            // ***** End connection *****
            conn.close();

            int productNo;
            String name;
            int unitPrice;
            int stockAmount;

            while (rs.next()) {
                productNo = rs.getInt("id");
                name = rs.getString("name");
                unitPrice = rs.getInt("unitprice");
                stockAmount = rs.getInt("stockamount");

                product = new Product(productNo, name, unitPrice, stockAmount);
            }

            rs.close();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return product;
    }

    public List<Product> getAllProducts() {

        List<Product> products = new ArrayList<>();
        String sql = "SELECT * FROM product";

        Connection conn = this.connect();

        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            // ***** End connection *****
            conn.close();

            int productNo;
            String name;
            int unitPrice;
            int stockAmount;

            while (rs.next()) {
                productNo = rs.getInt("id");
                name = rs.getString("name");
                unitPrice = rs.getInt("unitprice");
                stockAmount = rs.getInt("stockamount");

                products.add(new Product(productNo, name, unitPrice, stockAmount));
            }

            rs.close();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return products;
    }

    public void save(Product product) {
        // String sql = "INSERT INTO \"Product\" (\"productNo\",\"name\",\"unitPrice\",\"stockAmount\") VALUES(" + product.getProductNo() + ",\'" + product.getName() + "\'," + product.getUnitPrice() + "," + product.getStockAmount() + ")";
        String sql = "INSERT INTO product (id,name,unitprice,stockamount) VALUES(\'" + product.getId() + "\',\'" + product.getName() + "\'," + product.getUnitPrice() + "," + product.getStockAmount() + ")";

        Connection conn = this.connect();

        try {
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            // ***** End connection *****
            conn.close();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void delete(int productNumber) {

        String sql = "DELETE FROM product WHERE id = " + productNumber;

        Connection conn = this.connect();
        try {
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            // ***** End connection *****
            conn.close();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
