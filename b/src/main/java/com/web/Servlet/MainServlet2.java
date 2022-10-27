package com.web.Servlet;

import com.alibaba.fastjson.JSON;
import com.pojo.Contest;
import com.service.ContestService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "MainServlet2", value = "/MainServlet2")
public class MainServlet2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ContestService service = new ContestService();
        request.setCharacterEncoding("UTF-8");

        List<Contest> contests = service.selectAll();

        String jsonString = JSON.toJSONString(contests);

        System.out.println(contests);

        response.setContentType("text/json;charset=utf-8");
        response.getWriter().write(jsonString);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);

    }
}
