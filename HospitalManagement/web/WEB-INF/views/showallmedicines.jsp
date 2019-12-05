<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 11/14/2019
  Time: 12:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1" cellpadding="2"cellspacing="2">
    <thead>
    <tr>
        <th>Code</th>
        <th>Medicine Name</th>
        <th>Rate Per Unit</th>
    </tr>
    </thead>


<c:if test="${callFrom.equals('multiEntity')}">

        <tbody>
        <c:forEach items="${show}" var="listMed">
            <tr>
                <td><c:out value="${listMed.code}"/></td>
                <td><c:out value="${listMed.medicineName}"/></td>
                <td><c:out value="${listMed.ratePerUnit}"/></td>
            </tr>
        </c:forEach>
        </tbody>
</c:if>
    <c:if test="${callFrom.equals('singleEntity')}">
        <tbody>
            <tr>
                <td><c:out value="${show.code}"/></td>
                <td><c:out value="${show.medicineName}"/></td>
                <td><c:out value="${show.ratePerUnit}"/></td>
            </tr>
        </tbody>
    </c:if>
    </table>

</body>
</html>
