package com.web.Servlet;

import com.pojo.User;
import com.service.UserService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Register", value = "/Register")
public class Register extends HttpServlet {

    private UserService service = new UserService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //解决post getReader()中文乱码
        request.setCharacterEncoding("UTF-8");
        //获取用户和密码数据
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        User user = new User();
        user.setUsername(username);
        user.setPassword(password);

        //调用service注册
        boolean flag = service.register(user);
        //判断注册成功与否
        if(flag){
            //注册成功，跳转到登陆页面
            request.setAttribute("register_msg","注册成功，请登录");
//            request.getRequestDispatcher("/html/login.html").forward(request,response);
            String contextPath = request.getContextPath();
            response.sendRedirect(contextPath+"/html/login.html");
        }else{
            request.setAttribute("register_msg","用户已存在");
//            request.getRequestDispatcher("/html/regis                                                                                                                                                                        ter.html").forward(request,response);
            String contextPath = request.getContextPath();
            response.sendRedirect(contextPath+"/html/register.html");
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);

    }
}
