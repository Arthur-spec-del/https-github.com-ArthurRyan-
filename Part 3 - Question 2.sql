-- x20170386 Ryan Arthur
-- Project CA Part 3 - Question 2
-- "Show all the products along the supplier detail who supplied the products"
 
 use onlineretail;
 
select * from suppliers;
select * from products;
 
select * from  products left join suppliers on products.productID=suppliers.productID;