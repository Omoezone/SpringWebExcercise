INSERT INTO category (description) VALUES ('Oral');
INSERT INTO category (description) VALUES ('Anal');
INSERT INTO category (description) VALUES ('Nasal');
INSERT INTO category (description) VALUES ('Intravenous');

INSERT INTO product (product_name, product_desc, product_price)
    VALUES ('Heroin','Nice high',100.00);
INSERT INTO product (product_name, product_desc, product_price)
    VALUES ('Crack-Cocaine','Less nice',200.00);
INSERT INTO product (product_name, product_desc, product_price)
    VALUES ('LSD','Very Niiice',250.00);

UPDATE product SET category_id = 4 WHERE product_id = 1;
UPDATE product SET category_id = 4 WHERE product_id = 2;
UPDATE product SET category_id = 1 WHERE product_id = 3;

INSERT INTO note (desc, product_product_id)
    VALUES ('Remember your lighter', 1);
INSERT INTO note (desc, product_product_id)
    VALUES ('First one is free', 1);
INSERT INTO note (desc, product_product_id)
VALUES ('This was made to fuck with poor people', 2);

-- SELECT product_id AS ID,  product_name AS name, product_desc AS description, product_price AS price, n.desc AS notes, c.description AS category FROM PRODUCT p LEFT JOIN NOTE n ON p.product_id = n.product_product_id INNER JOIN CATEGORY c ON p.category_id =  c.id;