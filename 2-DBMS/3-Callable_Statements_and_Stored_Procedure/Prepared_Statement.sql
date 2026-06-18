-- Prepared Statements are used to execute parameterized SQL statements safely and efficiently. 
-- The SQL statement is prepared once and can be executed multiple times with different values.
-- The three commands used are:
				-- PREPARE    - Defines the SQL statement
				-- EXECUTE    - Executes the prepared statement
				-- DEALLOCATE PREPARE - Removes the statement from memory


SET @s = 'SELECT SQRT(POW(?, 2) + POW(?, 2)) AS Hypotenuse';
SET @a = 5;
SET @b = 12;

PREPARE stmt FROM @s;
EXECUTE stmt USING @a, @b;

DEALLOCATE PREPARE stmt;


-- HERE
-- ? = placeholder
-- USING fills them left to right in the exact sequence
-- 1st ? → @a (5)
-- 2nd ? → @b (12)

-- ==================================================

SET @sql =
'SELECT employee_id, first_name, last_name, salary
 FROM employee_salary
 WHERE dept_id = ?';
 SET @dept = 1;

PREPARE stmt FROM @sql;
EXECUTE stmt USING @dept;

DEALLOCATE PREPARE stmt;

-- ==================================================

SET @table = 'employee_demographics';
SET @s = CONCAT('SELECT * FROM ', @table, ' WHERE age > ?');
SET @age = 40;
PREPARE stmt FROM @s;
EXECUTE stmt USING @age;
DEALLOCATE PREPARE stmt;

-- In the above example we have used the parameter '@table' directly inside the '@s' 
-- Hence we don't need to write 
-- EXECUTE stmt USING @table ;
-- Also, we need to define/SET '@table' before '@s' as we are using '@table' in '@s'.
-- We can define/SET '@age' after '@s' as we are not directly using it inside '@s'
-- So, we need to write 
-- EXECUTE stmt USING @age; 
-- Note, the (blank) spaces are important in '@s' inside CONCAT() before and after quotes('')



-- FOR BETTER READABILITY:
-- 1. Set all variables first    ← @table, @age
-- 2. Build the query string     ← @s
-- 3. Prepare                    ← PREPARE
-- 4. Execute                    ← EXECUTE
-- 5. Cleanup                    ← DEALLOCATE

SET @table = 'employee_demographics';
SET @age = 40;
SET @s = CONCAT('SELECT * FROM ', @table, ' WHERE age > ?');
PREPARE stmt FROM @s;
EXECUTE stmt USING @age;
DEALLOCATE PREPARE stmt;



