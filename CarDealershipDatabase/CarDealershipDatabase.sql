-- Drop the database if it exists
DROP DATABASE IF EXISTS CarDealership;

-- Create the database
CREATE DATABASE CarDealership;

-- Use the newly created database
USE CarDealership;

-- Create the dealerships table
CREATE TABLE dealerships (
    dealership_id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    address VARCHAR(50) NOT NULL,
    phone VARCHAR(12) NOT NULL
);

-- Create the vehicles table
CREATE TABLE vehicles (
    VIN VARCHAR(17) PRIMARY KEY,
    make VARCHAR(50) NOT NULL,
    model VARCHAR(50) NOT NULL,
    year INT NOT NULL,
    color VARCHAR(20),
    mileage INT,
    price DECIMAL(10, 2),
    SOLD BOOLEAN DEFAULT FALSE
);

-- Create the inventory table
CREATE TABLE inventory (
    dealership_id INT,
    VIN VARCHAR(17),
    FOREIGN KEY (dealership_id) REFERENCES dealerships(dealership_id),
    FOREIGN KEY (VIN) REFERENCES vehicles(VIN)
);

-- Create the sales_contracts table
CREATE TABLE sales_contracts (
    contract_id INT AUTO_INCREMENT PRIMARY KEY,
    VIN VARCHAR(17),
    customer_name VARCHAR(50) NOT NULL,
    customer_address VARCHAR(50) NOT NULL,
    sale_date DATE NOT NULL,
    sale_price DECIMAL(10, 2) NOT NULL,
    FOREIGN KEY (VIN) REFERENCES vehicles(VIN)
);

-- Create the lease_contracts table (optional)
CREATE TABLE lease_contracts (
    contract_id INT AUTO_INCREMENT PRIMARY KEY,
    VIN VARCHAR(17),
    customer_name VARCHAR(50) NOT NULL,
    customer_address VARCHAR(50) NOT NULL,
    lease_start_date DATE NOT NULL,
    lease_end_date DATE NOT NULL,
    monthly_payment DECIMAL(10, 2) NOT NULL,
    FOREIGN KEY (VIN) REFERENCES vehicles(VIN)
);

-- Insert initial data into the dealerships table
INSERT INTO dealerships (name, address, phone) VALUES 
('Prime Motors', '123 Main St', '123-456-7890'),
('Auto World', '456 Elm St', '987-654-3210'),
('Best Cars', '789 Oak St', '555-123-4567');

-- Insert initial data into the vehicles table
INSERT INTO vehicles (VIN, make, model, year, color, mileage, price, SOLD) VALUES 
('1HGCM82633A123456', 'Honda', 'Civic', 2020, 'Blue', 15000, 20000.00, FALSE),
('1HGCM82633A654321', 'Toyota', 'Corolla', 2019, 'Red', 20000, 18000.00, TRUE),
('1HGCM82633A789012', 'Ford', 'Focus', 2021, 'White', 5000, 22000.00, FALSE);

-- Insert initial data into the inventory table
INSERT INTO inventory (dealership_id, VIN) VALUES 
(1, '1HGCM82633A123456'),
(2, '1HGCM82633A654321'),
(3, '1HGCM82633A789012');

-- Insert initial data into the sales_contracts table
INSERT INTO sales_contracts (VIN, customer_name, customer_address, sale_date, sale_price) 
VALUES ('1HGCM82633A654321', 'John Doe', '101 First St', '2023-01-15', 18000.00);

-- Insert initial data into the lease_contracts table
INSERT INTO lease_contracts (VIN, customer_name, customer_address, lease_start_date, lease_end_date, monthly_payment)
 VALUES ('1HGCM82633A123456', 'Jane Smith', '202 Second St', '2023-02-01', '2025-02-01', 400.00);

-- Select statements to verify data insertion
SELECT * FROM dealerships;
SELECT * FROM vehicles;
SELECT * FROM inventory;
SELECT * FROM sales_contracts;
SELECT * FROM lease_contracts;