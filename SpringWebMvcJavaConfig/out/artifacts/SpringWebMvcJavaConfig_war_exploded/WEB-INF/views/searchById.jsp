<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 11/14/2019
  Time: 2:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<a href="menu">Back to Menu</a>
<h1>Enter Medicine Code</h1>
<form action="srch" method="post">
    <label for="code">Code Number: </label>
    <input type="text" name="code" id="code">
    <input type="submit">
</form>
<h2 style="color: red" id="msg">${errorMessage}</h2>
</body>
<script type="text/javascript" src="resources/scripts/myscript.js"> </script>
</html>
