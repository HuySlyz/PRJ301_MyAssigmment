<%-- 
    Document   : giaithua
    Created on : Oct 28, 2023, 11:19:32 AM
    Author     : Huy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="giaithua" method="post">
            Number: <input type="text" name="number" value="${number}"></br></br><!-- comment -->
            <input type="submit" value="Calculate">
        </form>
        </br>
        <%
            if(request.getAttribute("giaithua") != null){
        %>
        <h2>${number}! = ${giaithua}</h2>
        <%
            }
        %>



    </body>
</html>
