package com.iss.userauth.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// Refer to JDBCDemo.java for better understanding (1-Core_Java/src/a11_jdbc/JDBCDemo.java)
// Add the MySQL Connector/J JAR to the project's classpath to enable JDBC connectivity.

public class DBConnection {
 
    private static final String URL = "jdbc:mysql://localhost:3306/core_java_db";
    private static final String USER = "root";
    private static final String PASSWORD = "YOUR_PASSWORD";

    public static Connection getConnection() {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL, USER, PASSWORD);

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}

