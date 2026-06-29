# HTTP Methods and Status Codes

## What is HTTP?

**HTTP (HyperText Transfer Protocol)** is the communication protocol used between a client (browser) and a web server. Whenever a user requests a web page, submits a form, or clicks a link, the browser sends an **HTTP request** to the server, which processes it and returns an **HTTP response**.

```text
Browser
    │
HTTP Request
    │
    ▼
Web Server (Tomcat)
    │
HTTP Response
    │
    ▼
Browser
```

---

# HTTP Request Methods

HTTP defines several request methods that specify the action a client wants the server to perform.

---

## 1. GET

**Purpose**

Retrieves data from the server without modifying any existing data.

### Characteristics

* Used for reading information.
* Parameters are appended to the URL.
* Can be bookmarked.
* Generally faster than POST.
* Not suitable for sensitive information.

### Example

```http
GET /HelloWorldWebApplication/hello HTTP/1.1
```

or

```text
http://localhost:8080/HelloWorldWebApplication/hello
```

### Servlet Method

```java
protected void doGet(HttpServletRequest request,
                     HttpServletResponse response)
```

### Common Uses

* Viewing a webpage
* Searching
* Reading product information
* Loading a profile page

---

## 2. POST

**Purpose**

Sends data from the client to the server for processing.

### Characteristics

* Data is sent inside the request body.
* Not visible in the URL.
* Suitable for sensitive or large amounts of data.
* Commonly used with HTML forms.

### Example

```html
<form method="post" action="login">
```

When the Login button is clicked, the browser sends:

```text
Email
Password
```

to

```text
/login
```

which executes

```java
doPost()
```

### Servlet Method

```java
protected void doPost(HttpServletRequest request,
                      HttpServletResponse response)
```

### Common Uses

* Login
* Registration
* Uploading files
* Saving data into a database

---

## 3. PUT

**Purpose**

Updates an existing resource or creates it if it does not already exist.

### Characteristics

* Replaces the complete resource.
* Frequently used in REST APIs.

### Example Use Case

Updating an entire user profile.

```text
PUT /users/15
```

---

## 4. DELETE

**Purpose**

Removes an existing resource from the server.

### Characteristics

* Deletes data permanently.
* Mostly used in RESTful web services.

### Example Use Case

Deleting a user account.

```text
DELETE /users/15
```

---

## 5. PATCH

**Purpose**

Updates only specific fields of an existing resource.

### Characteristics

* Partial update.
* More efficient than PUT when only a few fields change.

### Example Use Case

Updating only the user's mobile number.

```text
PATCH /users/15
```

---

## 6. HEAD

**Purpose**

Requests only the response headers without the actual response body.

### Characteristics

* Similar to GET.
* No HTML or data is returned.
* Useful for checking file metadata.

### Example Use Case

Checking whether a file exists before downloading it.

---

## 7. OPTIONS

**Purpose**

Returns the HTTP methods supported by the requested resource.

### Characteristics

* Commonly used during CORS pre-flight requests.
* Helps clients determine allowed operations.

### Example Use Case

Browser checking whether PUT requests are allowed.

---

# GET vs POST

| Feature              | GET                    | POST                 |
| -------------------- | ---------------------- | -------------------- |
| Purpose              | Retrieve data          | Submit data          |
| Data Location        | URL                    | Request Body         |
| Visible in URL       | Yes                    | No                   |
| Browser Bookmark     | Yes                    | No                   |
| Data Size            | Limited                | Large                |
| Used in Our Projects | HelloWorld Application | Login & Registration |

---

# HTTP Status Codes

Every HTTP response returned by the server includes a **status code** indicating the result of the request.

---

## Status Code Categories

| Code Range | Category      | Meaning                              |
| ---------- | ------------- | ------------------------------------ |
| 1xx        | Informational | Request received and being processed |
| 2xx        | Success       | Request completed successfully       |
| 3xx        | Redirection   | Additional action is required        |
| 4xx        | Client Error  | Problem with the client's request    |
| 5xx        | Server Error  | Problem occurred on the server       |

---

# Common HTTP Status Codes

| Code | Meaning                    | Description                                   |
| ---- | -------------------------- | --------------------------------------------- |
| 200  | OK                         | Request processed successfully                |
| 201  | Created                    | New resource created successfully             |
| 204  | No Content                 | Request successful but nothing to return      |
| 301  | Moved Permanently          | Resource has a permanent new location         |
| 302  | Found (Temporary Redirect) | Browser should temporarily access another URL |
| 400  | Bad Request                | Invalid request syntax                        |
| 401  | Unauthorized               | Authentication required                       |
| 403  | Forbidden                  | Access denied                                 |
| 404  | Not Found                  | Requested resource does not exist             |
| 500  | Internal Server Error      | Unexpected server-side error                  |
| 503  | Service Unavailable        | Server temporarily unavailable                |

---

# Status Codes in Our Applications

### HelloWorld Application

```text
GET /hello
```

Successful request

```text
200 OK
```

---

### User Authentication Application

Successful Login

```java
response.sendRedirect("welcome.jsp");
```

Tomcat first returns

```text
302 Found
```

The browser then automatically requests

```text
welcome.jsp
```

---

Wrong URL

```text
http://localhost:8080/UserAuthWebApplication/abc
```

Response

```text
404 Not Found
```

---

Database or Server Failure

If an unexpected exception occurs inside the servlet, Tomcat typically returns

```text
500 Internal Server Error
```

---

# Request and Response Flow

```text
Browser

↓

HTTP Request
(GET / POST)

↓

Apache Tomcat

↓

Servlet

↓

Business Logic

↓

HTTP Response
(Status Code + Data)

↓

Browser
```

---

# Summary

* HTTP is the protocol used for communication between a browser and a web server.
* GET is used to retrieve information, while POST is used to submit data.
* PUT, PATCH, and DELETE are commonly used in RESTful web services.
* Every server response contains an HTTP status code indicating the result of the request.
* Understanding HTTP methods and status codes is essential for developing, testing, and debugging Java web applications.


