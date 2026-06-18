SELECT dept_id, COUNT(*) AS total_employees
FROM employee_salary
GROUP BY dept_id;



SELECT dept_id, AVG(salary) AS avg_salary 
FROM employee_salary
GROUP BY dept_id
HAVING avg_salary >= 50000;


SELECT dept_id, SUM(salary) AS total_salary 
FROM employee_salary
GROUP BY dept_id
HAVING total_salary >= 50000;

SELECT dept_id, MIN(salary) AS lowest_salary 
FROM employee_salary
GROUP BY dept_id
HAVING lowest_salary >= 50000;

SELECT dept_id, MAX(salary) AS highest_salary 
FROM employee_salary
GROUP BY dept_id
HAVING highest_salary >= 50000;







