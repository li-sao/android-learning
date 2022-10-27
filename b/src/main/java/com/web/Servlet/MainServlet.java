package com.web.Servlet;

import com.alibaba.fastjson.JSON;
import com.pojo.User;
import com.service.UserService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "MainServlet", value = "/MainServlet")
public class MainServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserService userService = new UserService();
        request.setCharacterEncoding("UTF-8");

        HttpSession session = request.getSession();
        Object username = session.getAttribute("user");

        User u = userService.userInformation((String) username);

//        User u = userService.userInformation("焕焕");


        //将集合转换为JSON数据，序列化
        String jsonString = JSON.toJSONString(u);
        System.out.println(jsonString);

        //响应数据 text/json
        response.setContentType("text/json;charset=utf-8");

        response.getWriter().write(jsonString);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        this.doGet(request,response);
    }
}
