<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Register</title>

    <script src="js/validation.js"></script>

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
            width: 350px;
            background: #ffffff;
            padding: 25px;
            border-radius: 10px;
            box-shadow: 0 4px 12px rgba(0, 0, 0, 0.12);
        }

        h2 {
            text-align: center;
            color: #2c3e50;
            margin-bottom: 20px;
        }

        input {
            width: 100%;
            padding: 10px;
            margin: 8px 0;
            border: 1px solid #cbd5e1;
            border-radius: 5px;
            box-sizing: border-box;
        }

        input[type="submit"] {
            background: #0f766e;
            color: white;
            border: none;
            cursor: pointer;
            transition: background 0.3s;
        }

        input[type="submit"]:hover {
            background: #115e59;
        }

        .error {
            color: #dc2626;
            text-align: center;
            margin-bottom: 10px;
        }

        p {
            text-align: center;
            margin-top: 15px;
        }

        a {
            color: #2563eb;
            text-decoration: none;
        }

        a:hover {
            text-decoration: underline;
        }
    </style>
</head>

<body>

    <div class="box">

        <h2>Register</h2>

        <%
            String error = (String) request.getAttribute("error");
            if (error != null) {
        %>

            <div class="error"><%= error %></div>

        <%
            }
        %>

        <form method="post" action="register" onsubmit="return validateRegisterForm()">

            <input type="text" name="name" placeholder="Full Name" required>

            <input type="email" name="email" placeholder="Email Address" required>

            <input type="password" name="password" placeholder="Password" required>

            <input type="submit" value="Register">

        </form>

        <p>
            Already Registered?
            <a href="index.jsp">Login Here</a>
        </p>

    </div>

</body>
</html>