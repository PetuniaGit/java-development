-- Create database
CREATE DATABASE IF NOT EXISTS AccountingLedger;

-- Use the created database
USE AccountingLedger;

-- Create transactions table
CREATE TABLE IF NOT EXISTS transactions (
    id INT AUTO_INCREMENT PRIMARY KEY,
    datetime TIMESTAMP NOT NULL,
    description VARCHAR(255) NOT NULL,
    vendor VARCHAR(255) NOT NULL,
    amount DOUBLE NOT NULL
);

-- Example data insertion
INSERT INTO transactions (datetime, description, vendor, amount) VALUES
('2024-04-29 14:54:24', 'invoice 1001 paid', 'amazon', 1500.0),
('2024-04-29 15:05:01', 'invoice 1001 paid', 'joe', 1500.0),
('2024-04-29 15:45:59', 'hvjtj', 'hchgd', 544768.0),
('2024-04-30 09:11:44', 'i phone', 'apple', 1000.0),
('2023-04-30 09:11:44', 'i phone', 'apple', 1000.0),
('2024-03-30 09:11:44', 'i phone', 'apple', 1000.0);

-- Query to retrieve all transactions
SELECT * FROM transactions ORDER BY datetime DESC;

-- Query to retrieve all deposits
SELECT * FROM transactions WHERE amount > 0 ORDER BY datetime DESC;

-- Query to retrieve all payments
SELECT * FROM transactions WHERE amount < 0 ORDER BY datetime DESC;

-- Query to retrieve transactions of the current month
SELECT * FROM transactions WHERE MONTH(datetime) = MONTH(CURDATE()) AND YEAR(datetime) = YEAR(CURDATE()) ORDER BY datetime DESC;

-- Query to retrieve transactions of the previous month
SELECT * FROM transactions WHERE MONTH(datetime) = MONTH(CURDATE()) - 1 AND YEAR(datetime) = YEAR(CURDATE()) ORDER BY datetime DESC;

-- Query to retrieve transactions of the current year
SELECT * FROM transactions WHERE YEAR(datetime) = YEAR(CURDATE()) ORDER BY datetime DESC;

-- Query to retrieve transactions of the previous year
SELECT * FROM transactions WHERE YEAR(datetime) = YEAR(CURDATE()) - 1 ORDER BY datetime DESC;

-- Query to search transactions by vendor
SELECT * FROM transactions WHERE vendor = 'amazon' ORDER BY datetime DESC;
