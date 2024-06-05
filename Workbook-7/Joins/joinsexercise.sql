
SELECT productid, productname, unitprice, categoryname
 FROM products 
 INNER JOIN categories 
 ON products.CategoryID = categories.CategoryID
 ORDER BY categoryname, productname;


SELECT productid, productname, unitprice, companyname 
FROM products
 INNER JOIN suppliers 
 ON products.SupplierID = suppliers.SupplierID
 WHERE UnitPrice > 75 
 ORDER BY ProductName;


SELECT productid, productname, unitprice, categoryname, companyname
 FROM products
 INNER JOIN categories
 ON products.CategoryID = categories.CategoryID
 INNER JOIN suppliers 
 ON products.SupplierID = suppliers.SupplierID 
 ORDER BY productname;


SELECT productname, categoryname 
FROM products
 INNER JOIN categories 
 ON products.CategoryID = categories.CategoryID 
 WHERE unitprice = (SELECT MAX(UnitPrice)
                      FROM products 
                      GROUP BY categoryname);


SELECT orderid, shipname, shipaddress, companyname
 FROM orders 
 INNER JOIN shippers
 ON orders.ShipVia = shippers.ShipperID 
 WHERE ShipCountry LIKE "Germany";


SELECT orderid, orderdate, companyname, shipaddress 
FROM orders
 INNER JOIN shippers
 ON orders.ShipVia = shippers.ShipperID
 WHERE orderid IN (SELECT orderid 
                    FROM `order details`
                    WHERE ProductID = (SELECT ProductID 
                                          FROM products 
                                          WHERE productname LIKE "Sasquatch Ale"));