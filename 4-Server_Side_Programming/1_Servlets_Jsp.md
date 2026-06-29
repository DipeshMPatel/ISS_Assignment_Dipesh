# Servlets and JSP in Java Web Development

## What is a Servlet?

A **Servlet** is a Java class that runs inside a **Servlet Container** (such as Apache Tomcat) and handles HTTP requests sent by a client. It acts as the controller of a web application by processing user requests, executing business logic, and sending an appropriate response back to the browser.

Servlets are part of the **Jakarta Servlet API** and form the foundation of Java web application development.

### Key Characteristics

* Executes on the server side.
* Processes HTTP requests and responses.
* Can communicate with databases using JDBC.
* Supports HTTP methods such as GET and POST.
* Generates dynamic content like HTML, JSON, or XML.
* Can manage user sessions and cookies.

---

## Servlet Architecture

```
Browser
    │
    ▼
HTTP Request
    │
    ▼
Apache Tomcat
    │
    ▼
Servlet
    │
    ▼
Business Logic / Database
    │
    ▼
HTTP Response
    │
    ▼
Browser
```

---

## Basic Servlet Example

```java
package com.iss.hello;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<body>");
        out.println("<h1>Hello World!</h1>");
        out.println("</body>");
        out.println("</html>");
    }
}
```

### Explanation

* `HttpServlet` provides support for HTTP requests.
* `doGet()` executes whenever the browser sends a GET request.
* `HttpServletRequest` contains data sent by the client.
* `HttpServletResponse` is used to send data back to the browser.
* `PrintWriter` writes HTML directly into the response.

---

## Servlet Lifecycle

Every servlet follows a fixed lifecycle managed by the servlet container.

```
Tomcat Starts
      │
      ▼
init()
      │
      ▼
doGet() / doPost()
      │
      ▼
doGet() / doPost()
      │
      ▼
...
      │
      ▼
destroy()
```

### init()

* Called **once** when the servlet is created.
* Used to initialize resources such as database connections.

### doGet()

* Handles HTTP GET requests.
* Used when the client requests information from the server.

### doPost()

* Handles HTTP POST requests.
* Commonly used for login, registration, and form submission.

### destroy()

* Called **once** before the servlet is removed.
* Used to release resources such as database connections.

---

## What is JSP?

**Java Server Pages (JSP)** is a server-side technology used to create dynamic web pages.

A JSP file mainly contains **HTML**, but it can also contain Java code using JSP tags.

When a JSP page is requested for the first time, Tomcat automatically converts it into a servlet and executes it.

### Typical Uses

* Login pages
* Registration forms
* Welcome pages
* Displaying user data
* Showing error messages

---

## Basic JSP Example

```jsp
<%@ page language="java"
         contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>

<head>
    <title>Hello JSP</title>
</head>

<body>

    <h2>Welcome to JSP</h2>

    <form action="hello" method="get">

        <input type="text"
               name="username"
               placeholder="Enter Name">

        <input type="submit"
               value="Submit">

    </form>

</body>

</html>
```

---

## How JSP and Servlets Work Together

```
User Opens JSP
        │
        ▼
User Enters Data
        │
        ▼
Form Submitted
        │
        ▼
Servlet Executes
        │
        ▼
Business Logic
        │
        ▼
Response Returned
        │
        ▼
JSP Displays Result
```

---

## Servlet Mapping

A servlet must be mapped to a URL so Tomcat knows which servlet should execute.

There are two approaches.

---

### 1. Annotation-Based Mapping

```java
@WebServlet("/hello")
```

Whenever the browser requests

```
http://localhost:8080/HelloWorldWebApplication/hello
```

Tomcat executes `HelloServlet`.

#### Advantages

* Simple and clean.
* No configuration required in `web.xml`.
* Recommended for modern projects.

---

### 2. Mapping Using web.xml

```xml
<servlet>

    <servlet-name>HelloServlet</servlet-name>

    <servlet-class>
        com.iss.hello.HelloServlet
    </servlet-class>

</servlet>

<servlet-mapping>

    <servlet-name>HelloServlet</servlet-name>

    <url-pattern>/hello</url-pattern>

</servlet-mapping>
```

#### Explanation

* `<servlet>` defines the servlet class.
* `<servlet-mapping>` associates a URL with that servlet.
* `<url-pattern>` specifies the URL that triggers the servlet.

> **Note:** Use either `@WebServlet` or `web.xml` mapping for a servlet, not both.

---

## Servlets vs JSP

| Servlet                       | JSP                                |
| ----------------------------- | ---------------------------------- |
| Java class                    | JSP page                           |
| Handles business logic        | Handles presentation (UI)          |
| Processes requests            | Displays responses                 |
| Compiled Java code            | Converted into a servlet by Tomcat |
| Uses `doGet()` and `doPost()` | Uses HTML with optional JSP tags   |

---

## Summary

* Servlets process client requests and execute business logic.
* JSP is responsible for displaying dynamic web pages.
* Tomcat acts as the servlet container and manages the servlet lifecycle.
* Servlets and JSP together follow the **Model-View-Controller (MVC)** design pattern.
* Servlet mapping can be performed using either `@WebServlet` annotations or the traditional `web.xml` configuration.
