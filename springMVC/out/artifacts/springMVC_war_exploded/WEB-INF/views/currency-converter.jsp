<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 10/06/2020
  Time: 10:26 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Currency Converter</title>
</head>
<body>
<form method="post" action="/converter">
    <h1>App Of Money</h1>
    <h2><label>Rate: </label></h2>
    <input type="number" name="rate" placeholder="RATE" value="22000">
    <h2><label>USD: </label></h2>
    <input type="number" name="usd" placeholder="USD" value="0"><br/><br/>
    <input type="submit" id="submit" value="Enter the value">
</form>
</body>
</html>
