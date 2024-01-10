/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author Huy
 */
@WebServlet(urlPatterns = {"/tinhdiem"})
public class TinhDiem extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet TinhDiem</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet TinhDiem at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("index.html").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        double total;
        PrintWriter out = response.getWriter();
        String name = request.getParameter("name");
        double Pt = Double.parseDouble(request.getParameter("pt"));
        double Pe = Double.parseDouble(request.getParameter("pe"));
        double FE = Double.parseDouble(request.getParameter("fe"));
        String bonus = request.getParameter("mark");
        String subject = request.getParameter("subject");
        if (subject.equals("PRJ301")) {
            total = (0.3 * Pt) + (0.3 * Pe) + (0.4 * FE);
        } else if (subject.equals("PRN211")) {
            total = (0.2 * Pt) + (0.4 * Pe) + (0.4 * FE);
        } else {
            total = (0.2 * Pt) + (0.5 * Pe) + (0.3 * FE);
        }
        if (bonus.equals("0")) {
            total += 0.5;
        } else {
            System.out.println(total);
        }
        out.print(total);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
