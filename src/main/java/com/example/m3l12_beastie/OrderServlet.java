package com.example.m3l12_beastie;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "OrderServlet", value = "/OrderServlet")
public class OrderServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("text/html; charset=utf-8");

        PrintWriter out = response.getWriter(); // СОЗДАЛ ОБЪЕКТ PrintWriter
        out.println("<html><body>");
        out.println("<h1>ЗАКАЗ</h1>");
        out.println("</body></html>");
    }

}
