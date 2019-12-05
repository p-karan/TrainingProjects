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
<a href="menu">Back to Menu</a>
<h1>Enter Medicine Details</h1>
<form:form action="addMedicine" method="post">
    <pre>
        <label>Medicine Code:</label><form:input path="code"/>
        <label>Medicine Name:</label><form:input path="medicineName"/>
        <label>Medicine Type:</label><form:select path="type" items="${medicineTypes}"/>
        <label>Medicine Cost:</label><form:input path="ratePerUnit"/>

        <input type="submit" value="ADD">

    </pre>

</form:form>
</body>
</html>
