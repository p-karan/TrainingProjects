<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 11/2/2019
  Time: 10:29 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <p>Name: ${requestScope.name}</p>
    <p>Age: ${requestScope.age}</p>
    <p>Customer Id: ${sessionScope.customer.customerId}</p>
    <p>Customer Name: ${sessionScope.customer.customerName}</p>
    <p>Customer Email: ${sessionScope.customer.customerEmail}</p>
    <p>Customer Contact: ${sessionScope.customer.customerContact}</p>
</body>
</html>
