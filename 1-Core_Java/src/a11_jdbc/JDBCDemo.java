package a11_jdbc;

import java.sql.*;

/**
 * MySQL JDBC Driver JAR downloaded from:
 * https://dev.mysql.com/downloads/connector/j/ and added to the project's Classpath.
 */ 
 
public class JDBCDemo {

    // Database connection details
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/core_java_db";
    private static final String USER = "root";
    private static final String PASSWORD = "YOUR_PASSWORD";

    public static void main(String[] args) {

        Connection connection = null;

        try {

            // Loads the MySQL JDBC Driver into memory.
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establishes a connection with the MySQL database.
            connection = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
            System.out.println("Database connection established successfully.");

            // Used to execute SQL statements.
            Statement statement = connection.createStatement();

            // Create the table if it does not already exist.
            String createTableSQL =
                    "CREATE TABLE IF NOT EXISTS students ("
                    + "id INT AUTO_INCREMENT PRIMARY KEY,"
                    + "name VARCHAR(100),"
                    + "age INT)";

            statement.executeUpdate(createTableSQL);
            System.out.println("Table checked/created successfully.");

            // Insert one record.
            String insertSQL = "INSERT INTO students(name, age) VALUES('Dipesh', 21)";

            statement.executeUpdate(insertSQL);
            System.out.println("Record inserted successfully.");

            // Retrieve all records from the table.
            String selectSQL = "SELECT * FROM students";

            ResultSet resultSet = statement.executeQuery(selectSQL);  		// ResultSet <======> table of query results.

            System.out.println();
            System.out.println("Student Records:");

            while (resultSet.next()) {							// next() moves the cursor to the next row. Initially, the cursor is before the first row.

                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");

                System.out.println( "ID : " + id + " | " + " Name : " + name + " | " +  " Age : " + age);

            }

            // Close ResultSet and Statement after use.
            resultSet.close();
            statement.close();

        } catch (ClassNotFoundException e) {

            System.out.println("MySQL JDBC Driver could not be found.");
            e.printStackTrace();

        } catch (SQLException e) {

            System.out.println("An error occurred while performing database operations.");
            e.printStackTrace();

        } finally {

            try {

                // Close the database connection.
                if (connection != null && !connection.isClosed()) {

                    connection.close();
                    System.out.println();
                    System.out.println("Database connection closed.");

                }

            } catch (SQLException e) {
                e.printStackTrace();
            }

        }

    }

}