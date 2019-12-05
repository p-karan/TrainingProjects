<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 11/14/2019
  Time: 10:38 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form action="addMedicine" method="post">
    <label>Medicine Code</label>
    <form:input path="code"/><br>
    <label>Medicine Name</label>
    <form:input path="medicineName"/><br>
    <label>Medicine Type</label>
    <form:select path="type" items="${medicineTypes}"/><br>
    <label>Medicine Cost</label>
    <form:input path="ratePerUnit"/><br>

    <input type="submit" value="ADD">



</form:form>
</body>
</html>
