-- x20170386 Ryan Arthur
-- Project CA Part 3 - Question 7
-- "Display the growth in sales/services (as a percentage) for your business, form te 1st motnh of openning until now"

use onlineretail;

USE onlineretail;
-- DROP FUNCTION percentsalesgrowth;

delimiter $$
CREATE FUNCTION percentsalesgrowth()
RETURNS DOUBLE
DETERMINISTIC
BEGIN
	DECLARE firstmonthsales INT;
	DECLARE lastmonthsales INT;
	DECLARE percentchange DOUBLE;
    SELECT SUM(orderdetails.price) INTO firstmonthsales
		FROM orderdetails, orders
		WHERE orderdate >= '2020/01/01' AND orderdate <= '2020/01/31';
    SELECT SUM(orderdetails.price) INTO lastmonthsales
		FROM orderdetails, orders
		WHERE orderdate >= '2020/01/01' AND orderdate <= '2020/12/31';
    SET percentchange = round (((lastmonthsales / firstmonthsales)  - 1) * 100);
    RETURN percentchange;
 END $$
    
delimiter ;

SELECT percentsalesgrowth();