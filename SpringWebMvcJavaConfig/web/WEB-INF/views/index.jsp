<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Ramesh Hospitals</title>
  </head>
  <body>
  <h2>${majorHeading}</h2>

  <form:form action="login" method="post">
    <label>Enter Username: </label><br>
    <form:input path="userName" type="text" id="text1" /><br>
    <label>Enter Password: </label><br>
    <form:input path="password" type="password" id="text2"/><br>
    <input type="submit" value="Sign In">
    <a href="registerUser">New User?</a>
  </form:form>
  <p style="color: red" id="msg">${messageHolder}</p>
  </body>
</html>
