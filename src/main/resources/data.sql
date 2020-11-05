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

INSERT INTO company (id, name)
    VALUES (1, 'Bandidos');
INSERT INTO company (id,name)
    VALUES (2, 'Hells Angels');
INSERT INTO company (id, name)
    VALUES (3, 'KEA');

UPDATE company SET product_id = 4 WHERE id = 1;
UPDATE company SET product_id = 2 WHERE id = 2;
UPDATE company SET product_id = 1 WHERE id = 3;

