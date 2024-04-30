package com.example.m3l12_beastie;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "GoodsServlet", value = "/GoodsServlet")
public class GoodsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        // ПЕРЕАДРЕСАЦИЯ

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/CatalogServlet");
        requestDispatcher.forward(request, response);


        // РЕДИРЕКТ / ПЕРЕНАПРАВЛЕНИЕ
//        response.sendRedirect("/CatalogServlet");
//
//        response.setContentType("text/html; charset=utf-8");
//
//        PrintWriter out = response.getWriter(); // СОЗДАЛ ОБЪЕКТ PrintWriter
//        out.println("<html><body>");
//        out.println("<h1>Goods Servlet</h1>");
//        out.println("</body></html>");



    }

}
