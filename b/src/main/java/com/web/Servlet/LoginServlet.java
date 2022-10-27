package com.web.Servlet;

import com.pojo.User;
import com.service.UserService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "LoginServlet", value = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    private UserService service = new UserService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        解决post getReader()乱码
        request.setCharacterEncoding("UTF-8");
        //获取用户名和密码
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        //调用service查询
        User user = service.login(username,password);

        //判断
        if(user != null){
//            将登陆成功后的user对象，存储到session
            HttpSession session = request.getSession();
            session.setAttribute("user",username);
            System.out.println(username);
            System.out.println(session);

            Cookie cookie = new Cookie("user",username);
            response.addCookie(cookie);

            //获取虚拟路径,转到主页面
            String contextPath = request.getContextPath();
            response.sendRedirect(contextPath+"/html/main.html");
        }else{
//            request.setAttribute("login_msg","用户名或密码错误");
//            request.getRequestDispatcher("/html/login.html").forward(request,response);

//            响应失败，返回数字0；
            String contextPath = request.getContextPath();
            response.sendRedirect(contextPath+"/html/login.html");
            response.getWriter().write(0);
//            String contextPath = request.getContextPath();
//            response.sendRedirect(contextPath+"/html/login.html");
//            request.getRequestDispatcher("/html/login.html").forward(request,response);

        }


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);

    }
}
