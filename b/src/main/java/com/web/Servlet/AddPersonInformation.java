package com.web.Servlet;

import com.pojo.User;
import com.service.UserService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "AddPersonInformation", value = "/AddPersonInformation")
public class AddPersonInformation extends HttpServlet {
    UserService service = new UserService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String studentId = request.getParameter("studentId");
        String sex = request.getParameter("age");
        int age = request.getIntHeader("age");
        String institute = request.getParameter("institute");
        String cls = request.getParameter("class");
        String contact = request.getParameter("contact");

        User user = new User(null,null,name,studentId,sex,age,contact,institute,cls);

        boolean flag = true;

        flag = service.personInformation(user);

        String contextPath = request.getContextPath();


        if(flag){
            response.sendRedirect(contextPath+"/html/main.html");
        }else {
            response.sendRedirect(contextPath+"html/addperson.html");
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);

    }
}
