<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 11/06/2020
  Time: 22:08 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
  <form method="get" action="/calculator2">
      <fieldset>
          <legend><h2 style="color: green">Simple Calculator</h2></legend>
          <h3 style="color: greenyellow">Parameter One</h3>
          <input type="number" name="number1" placeholder="enter a number">
          <h3 style="color: olive">Parameter Two</h3>
          <input type="number" name="number2" placeholder="enter a number"><br/><br/>
          <button type="submit" name="button" value="Addition">Addition(+)</button>
          <button type="submit" name="button" value="Subtraction">Subtraction</button>
          <button type="submit" name="button" value="Multiplication">Multiplication(*)</button>
          <button type="submit" name="button" value="Division">Division(/)</button>
          <h3 style="color: darkslategray">Result: ${result}</h3>
      </fieldset>
  </form>
</body>
</html>
