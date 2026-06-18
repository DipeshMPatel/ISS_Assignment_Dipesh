CREATE DATABASE `CompanyDB`;
USE `CompanyDB`;

CREATE TABLE employee_demographics (
  employee_id INT PRIMARY KEY,
  first_name VARCHAR(50),
  last_name VARCHAR(50),
  age INT,
  gender VARCHAR(10),
  birth_date DATE
);

CREATE TABLE parks_departments (
  department_id INT PRIMARY KEY AUTO_INCREMENT,
  department_name varchar(50) NOT NULL
);

CREATE TABLE employee_salary (
  employee_id INT PRIMARY KEY,
  first_name VARCHAR(50) NOT NULL,
  last_name VARCHAR(50) NOT NULL,
  occupation VARCHAR(50),
  salary INT,
  dept_id INT,
  -- FOREIGN KEY (employee_id) REFERENCES employee_demographics(employee_id),							# Foreign key on employee_id intentionally omitted to demonstrate JOIN operations with unmatched records.
  FOREIGN KEY (dept_id) REFERENCES parks_departments(department_id)
);

DESCRIBE employee_demographics;
DESCRIBE parks_departments;
DESCRIBE employee_salary;
