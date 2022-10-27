package com.web.Servlet;

import com.alibaba.fastjson.JSON;
import com.pojo.Team;
import com.pojo.User;
import com.service.TeamService;
import com.service.UserService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "MainServlet1", value = "/MainServlet1")
public class MainServlet1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        UserService userService = new UserService();
        TeamService teamService = new TeamService();
        request.setCharacterEncoding("UTF-8");

        HttpSession session = request.getSession();
        Object username = session.getAttribute("user");

        User u = userService.userInformation((String) username);
//        User u = userService.userInformation("焕焕");
        System.out.println(u);

//        没有学号，说明个人信息没有完善，不能加入队伍
        if(u.getStudentId()==null){
            response.setContentType("text/json;charset=utf-8");
        }else{
            //根据学号，查询加入的队伍信息
        List<Team> teams = teamService.personAllTeam(u.getStudentId());
            System.out.println(teams);
        String jsonString = JSON.toJSONString(teams);
        System.out.println(teams);
            response.setContentType("text/json;charset=utf-8");
            response.getWriter().write(jsonString);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        this.doGet(request,response);
    }
}
