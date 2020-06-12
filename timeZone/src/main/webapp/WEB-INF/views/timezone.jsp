<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 11/06/2020
  Time: 11:38 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title style="color: chartreuse">The World Clock</title>
    <style type="text/css">
        select{
            width: 200px;
            height: 20px;
        }
    </style>
</head>
<body>
<h2 style="color: olivedrab">Current Local Times Around the World</h2>
<span style="color: darkgrey">Current time in ${city}: <strong>${date}</strong></span>
<form method="get" action="/" id="timeZone1"></form>
<select name="city" onchange="document.getElementById('timeZone1').submit()">
    <option value="Asia/Ho_Chi_Minh">Select a city</option>
    <option value="Asia/Ho_Chi_Minh" selected>Ho Chi Minh</option>
    <option value="Singapore">Singapore</option>
    <option value="Asia/Hong_Kong">Hong Kong</option>
    <option value="Asia/Tokyo">Tokyo</option>
    <option value="Asia/Seoul">Seoul</option>
    <option value="Europe/London">London</option>
    <option value="Europe/Madrid">Madrid</option>
    <option value="America/New_York">New York</option>
    <option value="Australia/Sydney">Sydney</option>
    <option value="Argentina/Buenos_Aires">Buenos Aires</option>
</select>
</body>
</html>
