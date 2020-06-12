<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 12/06/2020
  Time: 10:40 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sandwich</title>
</head>
<body>
   <form method="get" action="/sandwich2">
       <fieldset>
           <legend>Check Condiment Sandwich</legend>
           <input type="checkbox" name="condiment" value="Lettuce">
           <label>Lettuce</label>
           <input type="checkbox" name="condiment" value="Tomato">
           <label>Tomato</label>
           <input type="checkbox" name="condiment" value="Mustard">
           <label>Mustard</label>
           <input type="checkbox" name="condiment" value="Sprouts">
           <label>Sprouts</label>
           <input type="submit" value="Check">
       </fieldset>
   </form>
</body>
</html>
