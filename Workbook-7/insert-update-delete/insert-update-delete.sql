
INSERT INTO suppliers (supplierid, companyname) 
VALUES (30, 'Luminary Innovations Inc');


INSERT INTO products
 (productid, productname, supplierid, unitprice) 
 VALUES (78, 'EcoGlow', 30, 159.99);


SELECT productname, unitprice, companyname
 FROM products 
 INNER JOIN suppliers
 ON products.SupplierID = suppliers.SupplierID
 ORDER BY CompanyName;


UPDATE products
 SET unitprice = (unitprice + (unitprice * 0.15))
 WHERE supplierid = 30;


SELECT productname, unitprice 
FROM products
 WHERE supplierid = 30;


DELETE FROM products 
WHERE productid = 78;


DELETE FROM suppliers
 WHERE supplierid = 30;


SELECT * FROM products;


SELECT * FROM suppliers