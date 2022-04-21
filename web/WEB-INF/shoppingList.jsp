<%-- 
    Document   : shoppingList
    Created on : Apr 20, 2022, 12:50:54 AM
    Author     : 761450
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Shopping List Page</title>
        
        
    </head>
    <body>
        <h1>Shopping List</h1>
            <p><c:out value="${usersName}" default="Hello," /></p>
            <a href="<c:url value="/" />">Logout</a>
            
        
        
        <h1>List</h1>
        
        
            Add Item: <input type="text" name="item">
            <input type="submit" name="addItem" value="Add">
        
    
        
        
    </body>
</html>
