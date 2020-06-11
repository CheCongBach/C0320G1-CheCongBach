<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 10/06/2020
  Time: 21:40 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Login</title>
  </head>
  <body>
  <h1>Đăng nhập dùm cái</h1>
  <form:form method="post" action="login" modelAttribute="login">
    <fieldset>
      <legend><h2>Chỗ đăng nhập nè</h2></legend>
      <table>
        <tr>
          <td><h3><form:label path="account">Account: </form:label></h3></td>
          <td><form:input path="account" /></td>
        </tr>
        <tr>
          <td><h3><form:label path="password">Password: </form:label></h3></td>
          <td><form:input path="password" /></td>
        </tr>
        <tr>
          <td></td>
          <td><form:button>Login</form:button></td>
        </tr>
      </table>
    </fieldset>
  </form:form>
  </body>
</html>
