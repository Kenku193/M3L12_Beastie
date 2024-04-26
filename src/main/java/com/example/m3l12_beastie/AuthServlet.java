package com.example.m3l12_beastie;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

@WebServlet(name = "AuthServlet", value = "/AuthServlet")
public class AuthServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String lgn = request.getParameter("login");
        String pwd = request.getParameter("password");

        Map<String, String[]> parameterMap = request.getParameterMap();

        response.setContentType("text/html; charset=utf-8");

        PrintWriter out = response.getWriter(); // СОЗДАЛ ОБЪЕКТ PrintWriter
        out.println("<html><body>");
        out.println("<h1>АУТЕНТИФИКАЦИЯ</h1>");
        out.println("<br><br>");
        out.println("<h3>" + lgn + "</h3>");
        out.println("<br>");
        out.println("<h3>" + pwd + "</h3>");
        out.println("</body></html>");
    }

}
