<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 11/06/2020
  Time: 9:55 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Email Validate</title>
</head>
<body>
    <h1 style="color: yellowgreen">Email Validate</h1>
    <h3 style="color: red">${message}</h3>
<form method="post" action="/validate">
    <fieldset>
        <legend><h2 style="color: olivedrab">Chỗ đăng nhập nè</h2></legend>
        <input type="text" name="email" placeholder="Nhập email vào đây cái"><br/><br/>
        <input type="submit" value="Nhập xong thì nhấn vào đây ok">
    </fieldset>
</form>
</body>
</html>
