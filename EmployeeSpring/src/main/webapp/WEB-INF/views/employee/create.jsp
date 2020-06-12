<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 11/06/2020
  Time: 14:35 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create a new Employee</title>
</head>
<body>
   <h2>Nhập thông tin nhân viên dùm cái</h2>
   <h2 style="color: red">${message}</h2>
   <form:form method="POST" action="addEmployee" modelAttribute="employee">
       <table>
           <tr>
               <td><form:label path="id"><h3 style="color: deeppink">Employee ID: </h3></form:label></td>
               <td><form:input path="id"/></td>
           </tr>
           <tr>
               <td><form:label path="name"><h3 style="color: deeppink">Employee Name: </h3></form:label></td>
               <td><form:input path="name"/></td>
           </tr>
           <tr>
               <td><form:label path="email"><h3 style="color: deeppink">Employee Email:</h3></form:label></td>
               <td><form:input path="email"/></td>
           </tr>
           <tr>
               <td><form:label path="address"><h3 style="color: deeppink">Employee Address:</h3></form:label></td>
               <td><form:input path="address"/></td>
           </tr>
           <tr>
               <td><form:label path="contactNumber"><h3 style="color: deeppink">Contact's Number :</h3></form:label></td>
               <td><form:input path="contactNumber"/></td>
           </tr>
           <tr>
               <td><input type="submit" value="Submit"/></td>
           </tr>
       </table>
   </form:form>
</body>
</html>
