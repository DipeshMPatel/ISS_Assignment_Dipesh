package com.iss.userauth.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.iss.userauth.dao.DBConnection;
import com.iss.userauth.model.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    private Connection databaseConnection;

    @Override
    public void init() {					// ← Tomcat calls this automatically ONCE
        databaseConnection = DBConnection.getConnection();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        User user = new User();

        user.setName(request.getParameter("name"));
        user.setEmail(request.getParameter("email"));
        user.setPassword(request.getParameter("password"));

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {

            if (databaseConnection == null) {
                out.println("<h3>Database connection not available.</h3>");
                return;
            }

            String checkSql = "SELECT * FROM users WHERE email = ?";

            PreparedStatement checkStatement = databaseConnection.prepareStatement(checkSql);
            checkStatement.setString(1, user.getEmail());

            ResultSet resultSet = checkStatement.executeQuery();

            if (resultSet.next()) {

                request.setAttribute("error", "User already exists. Please login.");

                request.getRequestDispatcher("index.jsp")
                       .forward(request, response);

                return;
            }

            String insertSql = "INSERT INTO users(name, email, password) VALUES (?, ?, ?)";

            PreparedStatement preparedStatement = databaseConnection.prepareStatement(insertSql);

            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getEmail());
            preparedStatement.setString(3, user.getPassword());

            int rowsInserted = preparedStatement.executeUpdate();

            if (rowsInserted > 0) {

                response.sendRedirect("index.jsp");

            } else {

                out.println("<h3>Registration failed.</h3>");

            }

            resultSet.close();
            checkStatement.close();
            preparedStatement.close();

        } catch (SQLException e) {
            e.printStackTrace();
            out.println("<h3>Something went wrong.</h3>");
        }

    }

    @Override
    public void destroy() {						// ← Tomcat calls this automatically ONCE

        try {
            if (databaseConnection != null) {
                databaseConnection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
}

