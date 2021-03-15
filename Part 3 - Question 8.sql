-- x20170386 Ryan Arthur
-- Project CA Part 3 - Question 8
-- "Delete  all customers who never buy a product from the business"

USE onlineretail;

SELECT * FROM customer
WHERE orderID = null;

DELETE FROM customer
WHERE orderID = null;


