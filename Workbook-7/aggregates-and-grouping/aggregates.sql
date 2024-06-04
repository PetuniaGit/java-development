 USE northwind;
SELECT COUNT(*) 
FROM Suppliers;

SELECT SUM(Salary) 
FROM Employees;

 SELECT MIN(UnitPrice) 
 FROM Products;
 
 SELECT AVG(UnitPrice) 
 FROM Products;
 
 SELECT MAX(UnitPrice)
 FROM Products;
 
 SELECT supplierid, COUNT(*) AS items
 FROM products 
 GROUP BY supplierid;

  SELECT CategoryID, AVG(UnitPrice) 
 FROM Products 
 GROUP BY CategoryID;
 
 SELECT SupplierID, COUNT(SupplierID) AS Total
 FROM Products 
 GROUP BY supplierID 
 HAVING COUNT(*) >= 5;
 
SELECT ProductID, ProductName, SUM(UnitPrice * UnitsInStock) AS Total
 FROM Products
 ORDER BY Total DESC, ProductName;