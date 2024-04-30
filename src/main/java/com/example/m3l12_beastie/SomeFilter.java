package com.example.m3l12_beastie;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;
import java.util.Date;

@WebFilter(filterName = "SomeFilter", servletNames = {"CatalogServlet", "FormServlet"})
public class SomeFilter implements Filter {
    public void init(FilterConfig config) throws ServletException {
    }

    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {

        HttpServletRequest req = (HttpServletRequest) request;

        String servletPath = req.getServletPath();

        System.out.println("#INFO " + new Date() + " -- ServletPath: " + servletPath + " URL = " + req.getRequestURL());

        // РАЗРЕШЕНИЕ ПРОДВИГАТЬСЯ request'у ДАЛЬШЕ
        chain.doFilter(request, response);
    }
}
