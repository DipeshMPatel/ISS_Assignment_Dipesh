-- SQL Injection is a security vulnerability where an attacker manipulates a query to run malicious SQL code by injecting it through user input fields.

-- Vulnerable Query
SELECT *
FROM employee_demographics
WHERE first_name = 'user_input';

-- Suppose attacker enters:
-- ' OR '1'='1
-- Query becomes:

SELECT *
FROM employee_demographics
WHERE first_name = '' OR '1'='1';

 -- The Output of the above query is all the data from the employee_demographics table as the where condition is always true(because of '1'='1').
 
 
 