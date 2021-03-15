-- x20170386 Ryan Arthur
-- Project CA Part 3 - Question 3
-- "Create a stored procedure thast takes the start and end dates of the sales and display all the sales transactions betweeen the start and the end dates"

use onlineretail;

SELECT *
FROM
    payments
ORDER BY paymentdate
LIMIT 50;

USE onlineretail;

DROP procedure uspGetSales;

DELIMITER $$
CREATE PROCEDURE uspGetSales (in startdate date, in enddate date)
BEGIN
	SELECT 
		paymentdate AS 'Date',
        customerID AS 'CustomerID',
        productID AS 'ProductID',
        productname AS 'Product Name',
        amount AS 'Sales Value', 
        paymentsreferenceID AS 'Payment Reference',
        cardnumber AS 'Card#'
	FROM
		payments,
        products
	WHERE paymentdate >= startdate AND paymentdate <= enddate
    ORDER BY paymentdate;
	END$$
DELIMITER ;

CALL uspGetSales('2020/06/01', '2020/06/30');

