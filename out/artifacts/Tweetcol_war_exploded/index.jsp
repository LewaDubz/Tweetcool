<%--
  Created by IntelliJ IDEA.
  User: byteforce
  Date: 2017.04.10.
  Time: 20:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="TweetCoolServlet" method="post">
    <p>Name</p><input type="text" name="usrname">
    <p>Comment</p><input type="text" rows="4" cols="50" name="comment">
    <input type="submit" value="küld">
  </form>
  <p> ${text}</p>
  </body>
</html>
