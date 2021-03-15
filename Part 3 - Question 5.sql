-- x20170386 Ryan Arthur
-- Project CA Part 3 - Question 5
-- "Create a trigger  that adjusts the stock lefvel every time  a prodcut  is sold.  "

-- DROP TRIGGER after_sold_update ;

use onlineretail;

DELIMITER $$
CREATE TRIGGER after_sold_update 
    AFTER UPDATE ON payments
	FOR EACH ROW        
    INSERT INTO products
    SET action = 'update',
	products.stockquantity = (products.stockquantity - 1),
    products.cost = (products.cost + 1);
$$
DELIMITER ;

UPDATE payments
SET paymentdate = '2020/12/02'
WHERE customerID = '446';

/*
SELECT * FROM products;
SELECT * FROM payments;
DESCRIBE payments;
DESCRIBE products;*/



	 