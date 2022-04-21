

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register Page</title>
    </head>
    <body>
        <h1>Shopping List</h1>
        
        <form method="post" action="shoppinglist">
            Username: <input type="text" name="username">
            <input type="submit" name="register" value="Register name">
            <p><c:out value="${nullMessage}" default="" /></p>  
        </form>
        
        
        
    </body>
</html>
