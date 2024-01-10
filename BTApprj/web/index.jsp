<%-- 
    Document   : index.jsp
    Created on : Sep 23, 2023, 10:12:59 AM
    Author     : Huy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import = "model.Student" %>
<%@page import = "java.util.List" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form method="POST">
            <style>
table, th, td {
  border: 1px solid black;
  border-collapse: collapse;
}
th, td {
  padding: 15px;
}
</style>
            <table border="1" width="100" style="width:100%"  >
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Name</th>
                        <th>DoB</th>
                        <th>Gender</th>
                    </tr>
                </thead>
                <tbody>
                    <%
                        List<Student> listst = (List<Student>)request.getAttribute("data");
                        for(int i =0;i<listst.size();i++){
                        %>
                    <tr>
                        <td><%=listst.get(i).getId()%></td>
                        <td><%=listst.get(i).getName()%></td>
                        <td><%=listst.get(i).getDoB()%></td>
                        <td><%=listst.get(i).getGender()%></td>
                    </tr>
                    <%  }%>
                </tbody>
            </table>

        </form>
    </body>
</html>
