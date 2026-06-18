-- Views
CREATE VIEW high_salary_employees AS
SELECT employee_id, first_name, last_name, salary
FROM employee_salary
WHERE salary > 50000;

SELECT * 
FROM high_salary_employees;

DROP VIEW high_salary_employees;


-- Indexes
CREATE INDEX idx_first_name
ON employee_demographics(first_name);

CREATE INDEX idx_dept_id
ON employee_salary(dept_id);

DROP INDEX idx_first_name ON employee_demographics;



