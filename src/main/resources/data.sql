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