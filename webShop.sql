DROP DATABASE IF EXISTS webShop;
CREATE DATABASE webShop;
USE webShop;

DROP TABLE IF EXISTS products;
CREATE TABLE products(
product_id INT NOT NULL UNIQUE PRIMARY KEY,	
product_name VARCHAR(45) NOT NULL,
product_desc VARCHAR(45) NOT NULL,
product_price DOUBLE NOT NULL
);

INSERT INTO products VALUES
(1,'ProductName1','Description1',100.00),
(2,'ProductName2','Description2',200.00),
(3,'ProductName3','Description3',300.00);

SELECT * FROM products;