-- x20170386 Ryan Arthur
-- Project CA Part 3 - Question 4
-- "Create a view  that shows the total number  of items  a customer  buys from  the business in October 2020 along with
-- the total prices (use group by)"

use onlineretail;

SELECT 
    *
FROM
    orders
INNER JOIN
    orderdetails USING (orderID)
	LIMIT 5;

 -- DROP VIEW customerOrders;
 
CREATE VIEW customerOrders
AS 
SELECT 
	orderdate AS 'Order Date',
   customerID AS 'CustomerID',
   SUM(quantityordered) AS 'Total Number that Customer Bought in Time Period',
   SUM(price) AS 'Total Value in Euro' 
FROM
    orders
INNER JOIN
    orderdetails USING (orderID)
WHERE orderdate >= '2020/10/01' AND orderdate <= '2020/10/31'
GROUP BY quantityordered, price;
-- ORDER BY orderdate ASC, customerID ASC, quantityordered DESC;
	
SELECT * FROM customerOrders;
