package com.example.m3l12_beastie;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CatalogServlet", value = "/CatalogServlet")
public class CatalogServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String method = request.getMethod();
        System.out.println("МЕТОД ЗАПРОСА: " + method);

        response.setContentType("text/html; charset=utf-8");

        PrintWriter out = response.getWriter(); // СОЗДАЛ ОБЪЕКТ PrintWriter
        out.println("<html><body>");
        out.println("<h1>КАТАЛОГ</h1>");
        out.println("</body></html>");
    }



}
