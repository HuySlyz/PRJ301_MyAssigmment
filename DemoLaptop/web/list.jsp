<%-- 
    Document   : list.jsp
    Created on : Oct 7, 2023, 9:57:59 AM
    Author     : Huy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.until.ArrayList"%>
<%@page import="java.until.List"%>
<%@page import="model.laptop"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <table border ="1">
    <thead>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Price</th>
            <th>color</th>
        <tr>
    <thread>
        <tbody> 
            <%
                ArrayList<laptop> list = (ArrayList<laptop>)request.getAttribute("list");
                for(laptop l : list){
                
                %>
                <tr>
                    <td><%=l.getid()%></td>
                    <td><%=l.getname()%></td>
                    <td><%=l.getprice()%></td>
                    <td><%=l.getcolor()%></td>
                <tr> 
                    
                    <% }
%>
        </tbody>
    </thread>
        </table>
        
    </body>
</html>
