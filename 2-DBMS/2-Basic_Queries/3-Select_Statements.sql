USE CompanyDB;

SELECT * FROM employee_demographics;
SELECT * FROM employee_salary;
SELECT * FROM parks_departments;

SELECT * FROM CompanyDB.employee_demographics;			-- Good Practice 

SELECT first_name, last_name
FROM employee_demographics;

SELECT gender 
FROM employee_demographics;

SELECT DISTINCT gender
FROM employee_demographics;

SELECT *
FROM employee_salary
WHERE salary >= 50000;

SELECT *
FROM employee_demographics
WHERE age BETWEEN 30 AND 50;					-- age >=30 AND age <=50 

SELECT *
FROM employee_demographics
WHERE employee_id IN (1,3,4) OR age > 40;


SELECT *
FROM employee_demographics
WHERE first_name = 'April' OR (age > 40 AND gender = 'female');


SELECT *
FROM employee_demographics
WHERE gender = 'female';

SELECT *
FROM employee_demographics
WHERE gender != 'female';

SELECT *
FROM employee_demographics
WHERE birth_date > '1985-01-01';				-- default date format in MySQL is (yyyy-mm-dd) 


SELECT *
FROM employee_demographics
WHERE first_name LIKE 'a%';						-- First names starting with 'a'

SELECT *
FROM employee_demographics
WHERE first_name LIKE 'b%n';				 	-- First names starting with 'b' and ending with 'n'

SELECT *
FROM employee_demographics
WHERE first_name LIKE '%a%';					-- First names containing 'a'


SELECT *
FROM employee_demographics
WHERE first_name LIKE 'a__';					-- First names starting with 'a' and having exactly 2 letters after it


SELECT *
FROM employee_demographics
WHERE first_name LIKE 'a__%';					-- First names starting with 'a' and having atleast 2 letters after it


SELECT * 
FROM employee_salary
ORDER BY salary DESC;

SELECT * 
FROM employee_salary
ORDER BY salary DESC
LIMIT 3;								-- Selecting Top 3 people with highest salary 

SELECT * 
FROM employee_salary
ORDER BY salary DESC
LIMIT 2,1 ;								-- 3rd Higghest salary using LIMIT 


SELECT first_name, last_name, CONCAT(first_name,' ', last_name) AS full_name
FROM employee_demographics;





-- Demonstration of SELECT INTO and INSERT INTO SELECT

-- SELECT INTO (MySQL does not support this)

-- SELECT *
-- INTO employee_backup
-- FROM employee_demographics;

-- Creates a new table 'employee_backup' and copies data into it.

-- So we can do something like 
CREATE TABLE salary_over_50k
SELECT *
FROM employee_salary
WHERE salary > 50000;

SELECT * 
FROM salary_over_50k;



-- INSERT INTO SELECT

CREATE TABLE employee_backup (
    employee_id INT,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    age INT,
    gender VARCHAR(10),
    birth_date DATE
);

INSERT INTO employee_backup
SELECT *
FROM employee_demographics;

-- With Condition

-- INSERT INTO employee_backup
-- SELECT *
-- FROM employee_demographics
-- WHERE age > 30;

SELECT * 
FROM employee_backup;










