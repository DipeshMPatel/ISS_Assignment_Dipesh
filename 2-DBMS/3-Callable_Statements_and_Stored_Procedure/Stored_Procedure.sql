-- A Stored Procedure is a group of SQL statements stored in the database under a name. It can accept parameters and be executed repeatedly.
-- To define a stored procedure in MySQL, use the DELIMITER command to temporarily change the delimiter for defining the procedure block.

DELIMITER $$
CREATE PROCEDURE high_salaries()
BEGIN
	SELECT *
	FROM employee_salary
	WHERE salary >= 60000;
END $$
DELIMITER ;


DELIMITER $$
CREATE PROCEDURE find_employee(employee_id_param INT)
BEGIN
	SELECT *
	FROM employee_salary
	WHERE employee_id = employee_id_param;
END $$
DELIMITER ;





