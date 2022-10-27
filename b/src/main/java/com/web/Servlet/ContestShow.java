package com.web.Servlet;

import com.alibaba.fastjson.JSON;
import com.pojo.Contest;
import com.service.ContestService;
import com.service.UserService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ContestShow", value = "/ContestShow")
public class ContestShow extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ContestService service = new ContestService();
        request.setCharacterEncoding("UTF-8");

        String contestName = request.getParameter("contestName");

        Contest contest = service.selectByContestName(contestName);
        System.out.println(contest);

        String jsonString = JSON.toJSONString(contest);
        System.out.println(jsonString);

//        响应数据
        response.setContentType("text/json;charset=utf-8");

        response.getWriter().write(jsonString);






    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
