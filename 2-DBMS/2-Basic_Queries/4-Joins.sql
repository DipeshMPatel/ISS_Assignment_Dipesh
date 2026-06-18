
-- INNER JOIN 
SELECT *
FROM employee_demographics dem
INNER JOIN employee_salary sal										-- Also Note, JOIN =======> INNER JOIN by default 
	ON dem.employee_id = sal.employee_id;
  
  
-- LEFT JOIN 
SELECT *
FROM employee_demographics dem
LEFT JOIN employee_salary sal
	ON dem.employee_id = sal.employee_id;
    
    
-- RIGHT JOIN    
SELECT *
FROM employee_demographics dem
RIGHT JOIN employee_salary sal
	ON dem.employee_id = sal.employee_id;
 
 
 -- Full Outer Join
 -- MySQL does not support FULL JOIN directly. Use UNION of LEFT JOIN and RIGHT JOIN.
SELECT *
FROM employee_demographics dem
LEFT JOIN employee_salary sal
	ON dem.employee_id = sal.employee_id
UNION 
SELECT *
FROM employee_demographics dem
RIGHT JOIN employee_salary sal
	ON dem.employee_id = sal.employee_id;
    
 
-- SELF JOIN
SELECT *
FROM employee_salary emp1
JOIN employee_salary emp2
	ON emp1.employee_id + 1 = emp2.employee_id;
    

-- Joining multiple tables (More than 2)
SELECT *
FROM employee_demographics dem
JOIN employee_salary sal
	ON dem.employee_id = sal.employee_id
JOIN parks_departments dept
	ON sal.dept_id = dept.department_id;
    
    
    
    



    


    
    


    
    

    