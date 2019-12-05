<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 11/2/2019
  Time: 11:35 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<html>
<head>
    <title>Title</title>
    <c:set var="age" value="10" scope="request" />
    <c:set var="name" value="John Doe" scope="request" />

    <p>Age: ${requestScope.age}</p>
    <c:remove var="name" />
    <p>Name: <c:out value="${name}" /> </p>

    <c:forEach var="i" begin="1" end="10" step="2">
        <span>${i}&nbsp;&nbsp; </span>
    </c:forEach>

    <c:set var="sentence" value="This is a simple sentence" />
        <c:forTokens items="${sentence}" delims=" " var="word">
            <span>${word}<br></span>
        </c:forTokens>

    <br><br>

    <c:if test="${customers.size()!=0}">
        <table border="1" cellpadding="5" cellspacing="5">
            <thead>
            <tr>
                <th>Id</th>
                <th>Name</th>
                <th>Email</th>
                <th>Contact</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${customers}" var="customer">
                <tr>
                    <td>${customer.customerId}</td>
                    <td>${customer.customerName}</td>
                    <td>${customer.customerEmail}</td>
                    <td>${customer.customerContact}</td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </c:if>

    <c:set var="operation" value="4" />

    <c:choose>
        <c:when test="${operation eq 1}">
        <p>${10+2}</p>
        </c:when>
        <c:when test="${operation eq 2}">
            <p>${10-2}</p>
        </c:when>
        <c:when test="${operation eq 3}">
            <p>${10*2}</p>
        </c:when>
        <c:when test="${operation eq 4}">
            <p>${10/2}</p>
        </c:when>
        <c:otherwise>
            <p>Invalid choice</p>
        </c:otherwise>
    </c:choose>

    <br><br>
    <a href="<c:redirect url='http://www.google.co.in/'/>">Google</a>

</head>

</html>
