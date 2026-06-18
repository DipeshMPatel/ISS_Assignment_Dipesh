-- Unions
SELECT first_name, last_name
FROM employee_demographics
UNION																			-- By Default UNION ======> UNION DISTINCT (Removes Duplicates)
SELECT first_name, last_name
FROM employee_salary;


SELECT first_name, last_name
FROM employee_demographics
UNION ALL																		-- UNION ALL shows all values even if they are duplicates 
SELECT first_name, last_name
FROM employee_salary;


-- Subqueries

-- Inside WHERE
SELECT *
FROM employee_demographics
WHERE employee_id IN 
			(SELECT employee_id
				FROM employee_salary
                WHERE dept_id = 1);
       
-- Inside SELECT
SELECT first_name, 
salary, 
(SELECT AVG(salary) 
	FROM employee_salary) as avg_salary
FROM employee_salary;


-- Inside FROM
SELECT *
FROM
(SELECT dept_id, AVG(salary) AS avg_salary
    FROM employee_salary
    GROUP BY dept_id
) AS dept_avg
WHERE avg_salary > 55000;

                



