-- Constraints
CREATE TABLE student (
    student_id INT,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    age INT CHECK(age >= 18),
    email VARCHAR(100) UNIQUE,
    city VARCHAR(50),
    activity_status VARCHAR(15) DEFAULT 'Active'
);

CREATE TABLE course_enrollment (
    enrollment_id INT AUTO_INCREMENT PRIMARY KEY,
    student_id INT,
    course_name VARCHAR(100) NOT NULL,
    fees DECIMAL(10,2) CHECK(fees >= 0)
);

DESCRIBE student;
DESCRIBE course_enrollment;


DESCRIBE employee_demographics;

-- ALTER
-- Add (ADD) column
ALTER TABLE employee_demographics
ADD COLUMN phone_number VARCHAR(10);

DESCRIBE employee_demographics;

-- Update (MODIFY) column
ALTER TABLE employee_demographics
MODIFY COLUMN phone_number VARCHAR(15);

DESCRIBE employee_demographics;

-- Delete (DROP) column
ALTER TABLE employee_demographics
DROP COLUMN phone_number;

DESCRIBE employee_demographics;


-- Adding constraints using ALTER
ALTER TABLE student
ADD PRIMARY KEY (student_id);

DESCRIBE student;

ALTER TABLE course_enrollment
ADD CONSTRAINT fk_student
FOREIGN KEY (student_id)
REFERENCES student(student_id);

DESCRIBE course_enrollment;

ALTER TABLE course_enrollment
DROP FOREIGN KEY fk_student;

DESCRIBE course_enrollment;

-- DROP
DROP TABLE student;
DROP TABLE course_enrollment;


