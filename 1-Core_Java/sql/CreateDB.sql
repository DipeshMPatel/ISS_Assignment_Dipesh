-- Create database for JDBC demonstration
CREATE DATABASE core_java_db;
USE core_java_db;


-- User Authentication Web Application Setup
-- The same database is reused for the 4-Server_Side_Programming (User Authentication Web Application)
-- Instead of creating a separate database, a new table is added to store user registration and login details.

CREATE TABLE users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE,
    password VARCHAR(100) NOT NULL
);

DESC users;



