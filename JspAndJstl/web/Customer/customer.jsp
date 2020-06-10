<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 08/06/2020
  Time: 9:22 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
    <title>Idol Jav</title>
    <style>

       table {
        font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
        border-collapse: collapse;
        width: 80%;
      }

      td,th {
        border: 1px solid #ddd;
        color: deeppink;
        padding: 8px;
      }

      tr:nth-child(even){background-color: #f2f2f2;}

      tr:hover {background-color: #ddd;}

      th {
        padding-top: 12px;
        padding-bottom: 12px;
        text-align: left;
        background-color: #4CAF50;
        color: white;
      }
      img {
        transition: transform .2s;
        height: auto;
        width: 150px;
      }
      img:hover{
        transform: scale(2);
      }

    </style>
  </head>
  <body>
  <%-- Using JSTL forEach and out to loop a list and display items in table --%>
  <h1>Danh sach Top10 idol</h1>
  <table id="table1">
    <tbody>
    <tr>
      <th width="50">ID</th>
      <th>Name</th>
      <th width="100" >Age</th>
      <th>Birthday</th>
      <th width="100">Address</th>
      <th width="150">Images</th>
    </tr>
    <c:forEach items="${requestScope.customerList}" var="cus">
      <tr>
        <td>
          <c:out value="${cus.ID}"></c:out>
        </td>
        <td>
          <c:out value="${cus.name}"></c:out>
        </td>
        <td>
          <c:out value="${cus.age}"></c:out>
        </td>
        <td>
          <c:out value="${cus.birthday}"></c:out>
        </td>
        <td>
          <c:out value="${cus.address}"></c:out>
        </td>
        <td>
          <img src="<c:out value="${cus.images}"/>"/>
        </td>
      </tr>
    </c:forEach>
    </tbody>
  </table>
  </body>
</html>
