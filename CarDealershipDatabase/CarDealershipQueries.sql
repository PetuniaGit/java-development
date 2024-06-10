SELECT * FROM dealerships;


SELECT v.*
FROM vehicles v
JOIN inventory i ON v.VIN = i.VIN
WHERE i.dealership_id = "1HGCM82633A789012"


SELECT * FROM vehicles WHERE VIN = '1HGCM82633A123456';


SELECT d.*
FROM dealerships d
JOIN inventory i ON d.dealership_id = i.dealership_id
WHERE i.VIN = '1HGCM82633A123456';


SELECT DISTINCT d.*
FROM dealerships d
JOIN inventory i ON d.dealership_id = i.dealership_id
JOIN vehicles v ON i.VIN = v.VIN
WHERE v.color = 'Red' AND v.make = 'Toyota' AND v.model = 'Corolla';


SELECT sc.*
FROM sales_contracts sc
JOIN inventory i ON sc.VIN = i.VIN
WHERE i.dealership_id = '1HGCM82633A654321' AND sc.sale_date BETWEEN '2022-02-15' AND '2024-02-15';