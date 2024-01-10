package controller;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import model.*;
import java.util.*;

public class InsertServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String xRollno,xName,sMark; float xMark;
        xRollno = request.getParameter("rollno");
        xName = request.getParameter("name");
        sMark = request.getParameter("mark");
        xMark = Float.parseFloat(sMark);
        StudentDAO t = new StudentDAO();
        Student x = t.getStudent(xRollno);
        if(x!=null) {
          out.print("<h3> The rollno " + xRollno + " already exist");
          request.getRequestDispatcher("insert.html").include(request, response);
        }
        else {
          x = new Student(xRollno,xName,xMark);
          t.insert(x);
          List<Student> u = t.getStudents();
          request.setAttribute("lst", u);
          request.getRequestDispatcher("list.jsp").forward(request, response);
            
        }

    }
}

