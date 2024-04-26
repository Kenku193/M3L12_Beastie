package com.example.m3l12_beastie;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "FormServlet", value = "/FormServlet")
public class FormServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html; charset=utf-8");

        String username = req.getParameter("username");
        String userage = req.getParameter("userage");
        String gender = req.getParameter("gender");
        String country = req.getParameter("country");
        String[] courses = req.getParameterValues("courses");

        PrintWriter out = resp.getWriter(); // СОЗДАЛ ОБЪЕКТ PrintWriter

        try {out.println("<html><body>");
            out.println("<p>Name: " + username + "</p>");
            out.println("<p>Age: " + userage + "</p>");
            out.println("<p>Gender: " + gender + "</p>");
            out.println("<p>Country: " + country + "</p>");
            out.println("<h4>Courses</h4>");
            for(String course: courses)
                out.println("<li>" + course + "</li>");
            out.println("</body></html>");
        }
        finally {
            out.close();
        }

    }
}
