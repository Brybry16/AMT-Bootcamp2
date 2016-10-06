<%-- 
    Document   : Fruit
    Created on : 28 sept. 2016, 14:54:35
    Author     : tonidias
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello Fruit!</h1>
        You have accessed this page ${sessionScope.counter} times. <br/>
        ${requestScope.theFruit.name} is ${requestScope.theFruit.color}!
    </body>
</html>
