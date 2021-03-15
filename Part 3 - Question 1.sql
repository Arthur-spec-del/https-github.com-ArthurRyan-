-- x20170386 Ryan Arthur
-- Project CA Part 3 - Question 1
-- "Show all the details of the products that have a price  grater than 100""

use onlineretail;

Select *  from products
having  salesprice > 100;