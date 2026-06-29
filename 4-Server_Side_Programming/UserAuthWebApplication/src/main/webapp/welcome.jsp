<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Welcome</title>

    <style>
        body {
            margin: 0;
            font-family: Arial, sans-serif;
            background: #eef3f8;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        .box {
            width: 360px;
            background: #ffffff;
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0 4px 12px rgba(0, 0, 0, 0.12);
            text-align: center;
        }

        h2 {
            color: #2c3e50;
            margin-bottom: 15px;
        }

        p {
            color: #475569;
            margin-bottom: 25px;
        }

        .logout-btn {
            display: inline-block;
            padding: 10px 20px;
            background: #dc2626;
            color: white;
            text-decoration: none;
            border-radius: 5px;
            transition: background 0.3s;
        }

        .logout-btn:hover {
            background: #b91c1c;
        }
    </style>

</head>

<body>

    <%
        String user = (session != null) ? (String) session.getAttribute("user") : null;

        if (user == null) {
            response.sendRedirect("index.jsp");
            return;
        }
    %>

    <div class="box">

        <h2>Welcome, <%= user %>!</h2>

        <p>You have successfully logged in.</p>

        <a class="logout-btn" href="logout">Logout</a>

    </div>

</body>
</html>