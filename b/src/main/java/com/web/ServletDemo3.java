package com.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.BufferedReader;
import java.io.IOException;

@WebServlet(name = "ServletDemo3", value = "/ServletDemo3")
public class ServletDemo3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String method = request.getMethod();
        String params = "1";
        if("GET".equals(method)){
            params = request.getQueryString();
        }else if ("POST".equals(method)){
            BufferedReader reader = request.getReader();
            params = reader.readLine();
        }
        System.out.println(params);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }
}
