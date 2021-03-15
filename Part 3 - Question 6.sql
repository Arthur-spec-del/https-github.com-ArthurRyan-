-- x20170386 Ryan Arthur
-- Project CA Part 3 - Question 6
-- "Create a report of the annual sales (2020) of the business  showing  the total number of products sold and the
-- total prices sold every month (use A group by with roll-up"

use onlineretail;

SELECT 
    *
FROM
    orders
        INNER JOIN
    orderdetails USING (orderID)
GROUP BY orderdate
ORDER BY orderdate
LIMIT 5;
	
    
-- DROP VIEW salestotalunitseurobymonth;
CREATE VIEW salestotalunitseurobymonth
AS 
SELECT 
   orderdate AS 'Order Date',
   SUM(quantityordered) AS 'Total Quantity',
   SUM(price) AS 'Total Sales in Euro'
FROM
    orders
INNER JOIN
    orderdetails USING (orderID)
    GROUP BY MONTH (orderdate)
    ORDER BY orderdate ASC;

SELECT * FROM salestotalunitseurobymonth;

