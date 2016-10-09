<%-- 
    Document   : Home
    Created on : 9 oct. 2016, 00:59:12
    Author     : tonidias
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <p>
            You have accessed this page with username : ${sessionScope.ID.username}. <br/>
            Now have fun in this website so design :D!
        </p>
    </body>
</html>
