package com.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ServletDemo1", value = "/ServletDemo1")
public class ServletDemo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String method = request.getMethod();
        String contextPath = request.getContextPath();
        StringBuffer url = request.getRequestURL();
        String uri  = request.getRequestURI();
        String queryString = request.getQueryString();
        System.out.println(method);
        System.out.println(contextPath);
        System.out.println(url);
        System.out.println(uri);
        System.out.println(queryString);
        /*
        GET
        /b_war_exploded
        http://localhost:8080/b_war_exploded/ServletDemo1
        /b_war_exploded/ServletDemo1
        null
         */

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
