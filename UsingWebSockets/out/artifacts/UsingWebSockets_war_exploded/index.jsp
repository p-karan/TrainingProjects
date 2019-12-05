<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 11/19/2019
  Time: 11:09 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Socket Client</title>
  </head>
  <body>
  <label for="textMessage">Start Chat</label>
  <input type="text" name="message" id="textMessage"/>
  <button id="submit">Submit</button>
  <textArea id="resp" rows="10" cols="60"></textArea>
  <button id="end">Disconnect</button>
  </body>
<script src="scripts/script.js"></script>
</html>
