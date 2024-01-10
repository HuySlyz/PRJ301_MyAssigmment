<%-- 
    Document   : detail.jsp
    Created on : Oct 28, 2023, 11:32:12 AM
    Author     : Huy
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        <table border="1">
            <thead>
                <th>ID</th>
                <th>Name</th><!-- comment -->
                <th>Gender</th><!-- comment -->
                <th>Dob</th><!-- comment -->
                <th>GroupName</th>
                <th>UserCreate</th>
            </thead>
            <tbody>
                <tr>
                    <td>${obj.id}</td>
                    <td>${obj.name}</td>
                    <td>${obj.gender? "Male": "Female"}</td>
                    <td>${obj.dob}</td>
                    <td>${obj.groupname}</td>
                    <td>${obj.usercreate}</td>
                </tr>
            </tbody>
           </table>
    </body>
    
    
</html>