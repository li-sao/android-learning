package com.web.Servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.Date;

@WebServlet(name = "SubmitContest", value = "/SubmitContest")
public class SubmitContest extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        request.setCharacterEncoding("UTF-8");
//        String contestName = request.getParameter("contestName");
//        String contestType = request.getParameter("contestType");
//        String contestDetail = request.getParameter("contestDetail");
//        String time1 = request.getParameter("startTime");
//        String time2 = request.getParameter("endTime");
//        String contact = request.getParameter("contact");
//        String time3 = request.getParameter("contestTime");
//        String contestVenue = request.getParameter("contestVenue");
//        String sponsor = request.getParameter("sponsor");
//        String contestant = request.getParameter("contestant");
//
//        Date startTime = Date.valueOf(time1);
//        Date endTime = Date.valueOf(time2);
//        Date contactTime = Date.valueOf(time3);
//


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }
}
