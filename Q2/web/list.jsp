<%-- 
    Document   : list.jsp
    Created on : Oct 28, 2023, 11:32:47 AM
    Author     : Huy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="list" method="post">
            <input type="radio" name="role" value="can"> Candidate
            <input type="radio" name="role" value="mem"> Member
            <input type="submit" value="Search">
        </form>
        <%
            if (request.getAttribute("lst_objs") != null){
            
            %>
        
            <table border="1">
                <thead>
                    <th>ID</th>
                    <th>Name</th><!-- comment -->
                    <th>Gender</th><!-- comment -->
                    <th>Dob</th><!-- comment -->
                    <th>GroupName</th>
                    <th>Action</th>
                </thead>
                <tbody>
                    <c:forEach items="${lst_objs}" var="o">
                        <tr>
                            <td>${o.id}</td>
                            <td>${o.name}</td>
                            <td>${o.gender? "Male": "Female"}</td>
                            <td>${o.dob}</td>
                            <td>${o.groupname}</td>
                            <td><a href="detail?id=${o.id}&role=${role}">Detail</a></td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
            <%
                }
%>
        

    </body>
</html>