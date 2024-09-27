# Structured Query Language (SQL)


### Setting up the Work Environment

- PostgreSQL installation
    + PostgreSQL: [PostgreSQL Download](https://www.postgresql.org/download)
- pgAdmin installation
    + pgAdmin: Distributed with PostgreSQL.
- Valentina Studio: [Valentina Studio Overview](https://www.valentina-db.com/en/valentina-studio-overview)
- Importing/Exporting the NorthWind database
    + [Download database for VS import here](https://github.com/celalceken/DatabaseManagementSystems/blob/master/OrnekVeritabanlari/NorthWind.sql.zip)
    + [Download database for pgAdmin import here](https://github.com/celalceken/DatabaseManagementSystems/blob/master/OrnekVeritabanlari/NorthWind.backup)
- Importing/Exporting the Pagila database: [Pagila Database](http://www.postgresqltutorial.com/postgresql-sample-database)

### Structured Query Language (SQL)

- SQL functions can be divided into two sections:
    1. **Data Definition Language (DDL):** Structural commands for creating, modifying, deleting databases, tables, relationships, etc.
    2. **Data Manipulation Language (DML):** Commands for inserting, deleting, updating, querying data, etc.

---

## Basic SQL Commands (SQL DML Commands; SELECT, JOIN, INSERT, UPDATE, DELETE)

### SELECT

The SELECT command is used to retrieve data from the database.

~~~sql
SET search_path TO schema,public;

SELECT * FROM "customers";

SELECT "CompanyName", "ContactName" FROM "customers";
~~~

### WHERE
The WHERE command is used to list records that meet a specific condition.

~~~sql
SELECT * FROM "customers" WHERE "Country" = 'Argentina';

SELECT * FROM "customers" WHERE "Country" != 'Brazil';

SELECT * FROM "customers" WHERE "Country"='Brazil' AND "Region" = 'SP';

SELECT * FROM "customers" WHERE "Country" = 'Turkey' OR "Country" = 'Japan';

SELECT * FROM "order_details" WHERE "UnitPrice" = 14;

SELECT * FROM "order_details" WHERE "UnitPrice" < 14;

SELECT * FROM "order_details" WHERE "UnitPrice" <= 14;

SELECT * FROM "order_details" WHERE "UnitPrice" >= 14;

SELECT * FROM "order_details" WHERE "UnitPrice" > 14;
~~~
### DISTINCT

The DISTINCT keyword is used to return only distinct (different) values.

How many customers are there from different cities?
~~~sql
SELECT DISTINCT "City" FROM "customers";
~~~
~~~sql
SELECT DISTINCT "OrderID", "Discount" FROM "order_details" ORDER BY "OrderID";
~~~
### ORDER BY
The ORDER BY command is used to sort the result set in either ascending or descending order.

~~~sql
SELECT * FROM "customers" ORDER BY "ContactName" ASC;

SELECT * FROM "customers" ORDER BY "ContactName" DESC;

SELECT * FROM "customers" ORDER BY "ContactName" DESC, "CompanyName";

SELECT * FROM "customers" ORDER BY "Country", "ContactName";
~~~
### LIKE / NOT LIKE
LIKE is used to search for a specified pattern in a column.

~~~sql
SELECT * FROM "customers" WHERE "Country" LIKE 'P%';

SELECT * FROM "customers" WHERE "Country" NOT LIKE 'P%'; # NULL values are excluded

SELECT * FROM "customers" WHERE "Country" LIKE '%e';

SELECT * FROM "customers" WHERE "Country" LIKE '_a%';

SELECT * FROM "customers" WHERE "Country" LIKE '%pa%';

SELECT * FROM "customers" WHERE "Country" LIKE '%pa_';
~~~
### BETWEEN
~~~sql
SELECT * FROM "products" WHERE "UnitPrice" BETWEEN 10 AND 20;

SELECT * FROM "products" WHERE "ProductName" BETWEEN 'C' AND 'M';
~~~

### IN
~~~sql
SELECT * FROM "customers"
  WHERE "public"."customers"."Country" IN ('Turkey', 'Northern Cyprus');
~~~

### NULL and non-NULL content fields
~~~sql
SELECT * FROM "customers" WHERE "Region" IS NOT NULL;

SELECT * FROM "customers" WHERE "Region" IS NULL;
~~~

### AS
The AS keyword is used to give columns or tables a temporary alias.

~~~sql
SELECT "CompanyName" AS "customers" FROM "customers";

SELECT "UnitPrice", "UnitPrice" * 1.18 AS "PriceWithVAT" FROM "products";

SELECT "OrderID" AS "OrderNumber",
       "ShipPostalCode" || ',' || "ShipAddress" AS "ShippingAddress"
FROM "orders"
WHERE "OrderDate" BETWEEN '07/04/1996' AND '07/09/1996';
~~~

### Table Joins
Joining tables combines records from two or more tables in a database.

#### Inner Join
~~~sql
SELECT * FROM "Musicians" INNER JOIN "Cities"
  ON "Musicians"."CityCode" = "Cities"."CityCode";
~~~

### INSERT
The INSERT command is used to add new rows to a table.

~~~sql
INSERT INTO "customers" 
("CustomerID", "CompanyName", "ContactName", "Address", "City", "PostalCode", "Country")
VALUES ('ZZA', 'Zafer', 'Ayşe', 'Serdivan', 'Sakarya', '54400', 'Turkey');
~~~
~~~sql
INSERT INTO "public"."categories" ("CategoryID", "CategoryName", "Description")
VALUES (9, 'Health', 'Health Products'),
       (10, 'Cleaning', 'Cleaning Products');
~~~
### UPDATE
The UPDATE command is used to modify the existing records in a table.

~~~sql
UPDATE "customers" SET "ContactName" = 'Mario Pontes', "City" = 'Rio de Janeiro'
WHERE "CompanyName" = 'Familia Arquibaldo';
~~~
### DELETE
The DELETE command is used to delete existing records from a table.

~~~sql
DELETE FROM "customers"
WHERE "CompanyName" = 'LINO-Delicateses' AND "ContactName" = 'Felipe Izquierdo';
~~~
To delete all records from a table:

~~~sql
DELETE FROM "customers";
~~~
## DBMS Operations with Application Programs
To interact with a database via application programs, you need drivers that enable communication between the programming language and the database.

### PostgreSQL Operations with Java
The PostgreSQL JDBC driver can be downloaded from https://jdbc.postgresql.org.

The drivers provide the following basic functions:

* establishing a connection
* executing queries
* closing the connection

A sample video that can help with the implementation of the Java code below can be viewed at the following link: https://youtu.be/aPEx1RexoCY
~~~java
package edu.sau.dbms;

import java.sql.*;

public class DatabaseOperations {

    public static void main(String[] args) {
        try {
            // Establish connection
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Northwind", "postgres", "LecturePassword");
            if (conn != null) {
                System.out.println("Connected to the database!");
            } else {
                System.out.println("Failed to connect!");
            }

            String sql = "SELECT \"CustomerID\", \"CompanyName\", \"Country\" FROM \"customers\"";

            // Execute query
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            String customerID, companyName, country;

            while (rs.next()) {
                customerID = rs.getString("CustomerID");
                companyName = rs.getString("CompanyName");
                country = rs.getString("Country");

                System.out.println("Customer ID: " + customerID + ", Company Name: " + companyName + ", Country: " + country);
            }

            // Clean up
            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
~~~