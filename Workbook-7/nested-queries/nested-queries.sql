
SELECT productname
 FROM products 
 WHERE UnitPrice = (SELECT MAX(UnitPrice)
                         FROM products);


SELECT orderid, shipname, shipaddress 
FROM orders
 WHERE shipvia = (SELECT shipperid 
                     FROM shippers
                     WHERE companyname LIKE "Federal Shipping");


SELECT DISTINCT orderid 
FROM `order details`
 WHERE productid = (SELECT productid
                    FROM products 
                    WHERE productname LIKE "Sasquatch Ale");


SELECT firstname, lastname 
FROM employees
 WHERE employeeid = (SELECT employeeid 
                       FROM orders 
                       WHERE orderid = 10266);


SELECT contactname 
FROM customers 
WHERE customerid LIKE (SELECT customerid  
						FROM orders 
                        WHERE orderid = 10266);