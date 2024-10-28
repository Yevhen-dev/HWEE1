<%@ page import="academy.prog.User" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: chuha
  Date: 10/25/2024
  Time: 8:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Users response</title>
    <link rel="stylesheet" type="text/css" href="./usersStyle.css" />
</head>
<body>

<% ArrayList<User> users = ( ArrayList<User> ) session.getAttribute("users"); %>

<ul class="users__list" >
    <% for( User user: users) {%>
        <li class="users__list-user" >
            <div class="name"> Name: <span>  <%= user.getName() %> </span> </div>
            <div class="lastname"> Lastname: <span><%= user.getLastname() %></span> </div>
            <div class="age"> Age: <span><%= user.getAge() %></span> </div>
            <div class="fruits"> Favourite fruit: <span> <%= user.getFruit() %> </span> </div>
            <div class="animal"> Animal: <span> <%= user.getAnimal() %> </span> </div>
        </li>
    <%}%>
</ul>






  <a href="/index.jsp">Home page</a>

</body>
</html>
