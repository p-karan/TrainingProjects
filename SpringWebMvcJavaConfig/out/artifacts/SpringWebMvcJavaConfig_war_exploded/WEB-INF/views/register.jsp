<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 11/15/2019
  Time: 3:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1> Enter User Details for Registration</h1>

<form:form action="registerUser" method="post">
    <pre>
    <label>Username  : </label><form:input path="userName"/>
    <label>Password  : </label><form:input path="password"/>
    <label>First Name: </label><form:input path="firstName"/>
    <label>Last Name : </label><form:input path="lastName"/>
    <label>Email     : </label><form:input path="email"/>
    <label>Address   : </label><form:input path="address"/>
    <label>Phone no  : </label><form:input path="phone"/>

    <input type="submit" value="Register"/>
    </pre>
    </form:form>
</body>
</html>
