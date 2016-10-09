<%-- 
    Document   : Login
    Created on : 9 oct. 2016, 13:11:08
    Author     : tonidias
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
         <h1>Please Login</h1>
        
        <form method="post" action="login">
            <fieldset>
                <legend>Login</legend>

                <label for="username">Username<span class="requis">*</span></label>
                <input type="text" id="username" name="username" value="" size="20" maxlength="60" />
                <br />

                <label for="password">Password<span class="requis">*</span></label>
                <input type="password" id="password" name="password" value="" size="20" maxlength="20" />
                <br />

                <input type="submit" value="Login" class="sansLabel" />
                <br />
            </fieldset>
        </form>
         
    </body>
</html>
