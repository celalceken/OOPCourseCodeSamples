# Set up Database
    Set up the 'ecommerce' database in PostgreSQL using the following SQL code, which defines a product table and inserts related product data.
~~~sql
CREATE DATABASE ecommerce;

CREATE TABLE public.product (
                                  id integer NOT NULL,
                                  name character varying(30) NOT NULL,
                                  unitprice integer NOT NULL,
                                  stockamount integer NOT NULL
);

INSERT INTO public.product VALUES (1, 'HDD', 300, 10);
INSERT INTO public.product VALUES (2, 'RAM', 800, 4);
INSERT INTO public.product VALUES (3, 'CPU', 1000, 10);
INSERT INTO public.product VALUES (4, 'SSD', 1100, 10);
~~~


## Exercise 1: Supplier Table and Repository Pattern

As part of this exercise, form a new table named "supplier" in the existing ecommerce database. 
This table will store information about product suppliers.

### Task:
    Implement Java code that follows the repository pattern to perform CRUD operations on the supplier table.
