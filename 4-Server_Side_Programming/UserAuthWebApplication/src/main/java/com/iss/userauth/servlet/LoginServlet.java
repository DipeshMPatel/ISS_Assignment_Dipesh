package com.iss.userauth.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.iss.userauth.dao.DBConnection;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    private Connection databaseConnection;

    @Override
    public void init() {					// ← Tomcat calls this automatically ONCE
        databaseConnection = DBConnection.getConnection();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String userEmail = request.getParameter("email");
        String userPassword = request.getParameter("password");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {

            if (databaseConnection == null) {
                out.println("<h3>Database connection not available.</h3>");
                return;
            }

            String sqlQuery = "SELECT * FROM users WHERE email = ? AND password = ?";

            PreparedStatement preparedStatement = databaseConnection.prepareStatement(sqlQuery);

            preparedStatement.setString(1, userEmail);
            preparedStatement.setString(2, userPassword);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {

                HttpSession session = request.getSession();

                session.setAttribute("user", userEmail);

                response.sendRedirect("welcome.jsp");

            } else {

                request.setAttribute("error", "Invalid email or password.");

                request.getRequestDispatcher("index.jsp")
                       .forward(request, response);

            }

            resultSet.close();
            preparedStatement.close();

        } catch (SQLException e) {
            e.printStackTrace();
            out.println("<h3>Something went wrong.</h3>");
        }

    }

    @Override
    public void destroy() {									// ← Tomcat calls this automatically ONCE
        try {
            if (databaseConnection != null) {
                databaseConnection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}