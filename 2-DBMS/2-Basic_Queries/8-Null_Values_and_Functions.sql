SELECT * 
FROM employee_salary
WHERE dept_id IS NULL;

SELECT * 
FROM employee_salary
WHERE dept_id IS NOT NULL;

-- IFNULL
-- Takes exactly 2 arguments
-- If first is NULL → return second
-- MySQL specific — won't work in all databases 
SELECT first_name, last_name, salary, IFNULL(dept_id, 'Department not Assigned') AS Department_ID					
FROM employee_salary;


-- COALESCE
-- Takes multiple arguments
-- Returns first non-NULL value it finds
-- SQL standard — works in MySQL, PostgreSQL, SQL Server, Oracle everywhere
SELECT employee_id, first_name, last_name, salary, COALESCE(dept_id, employee_id, 'Not Assigned') AS Department_ID					-- The order/sequence of arguments matters 
FROM employee_salary;


