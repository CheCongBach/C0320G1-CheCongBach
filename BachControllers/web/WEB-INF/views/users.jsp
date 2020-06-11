<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 10/06/2020
  Time: 23:06 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Users</title>
</head>
<body>
   <h1>Thông tin chi tiết người dùng</h1>
   <h3>Account: <c:out value="${users.account}"></c:out></h3>
   <h3>Name: <c:out value="${users.name}"></c:out></h3>
   <h3>Email: <c:out value="${users.email}"></c:out></h3>
   <h3>Age: <c:out value="${users.age}"></c:out></h3>
</body>
</html>