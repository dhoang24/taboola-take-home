-- Please design two new tables to store information about:
--     a. products
--     b. product price history
-- The product tables should include the name and category of the product.
-- The product price history table should refer to the product table and should
-- include the price information of products and the start date and/or end date for
-- the product. The current price of a product will have no end date.
-- Please list the table creation scripts for these two tables and a sample query to
-- join two tables together.

CREATE TABLE Products (
    product_name VARCHAR(225) NOT NULL,
    CATEGORY VARCHAR(225) NOT NULL,
    PRIMARY KEY (product_name)
);

CREATE TABLE History (
    product_name VARCHAR(225),
    price FLOAT NOT NULL,
    start_date DATE NOT NULL,
    end_date DATE,
    FOREIGN KEY (product_name) REFERENCES Products(product_name)
);

SELECT *
FROM Products
INNER JOIN History
ON Products.product_name = History.product_name