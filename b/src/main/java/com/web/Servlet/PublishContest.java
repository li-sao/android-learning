package com.web.Servlet;

import com.pojo.Contest;
import com.service.ContestService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.Date;

@WebServlet(name = "PublishContest", value = "/PublishContest")
public class PublishContest extends HttpServlet {

    ContestService service = new ContestService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
//        post请求参数
        String contestName = request.getParameter("contestName");
        String contestType = request.getParameter("contestType");
        String contestDetail = request.getParameter("contestDetail");
        String date1 = request.getParameter("startTime");
        String date2 = request.getParameter("endTime");
        String contact = request.getParameter("contact");
        String contestVenue = request.getParameter("contestVenue");
        String date3 = request.getParameter("contestTime");
        String award = request.getParameter("award");
        String sponsor = request.getParameter("sponsor");
        String contestant = request.getParameter("contestant");
        Date startTime = Date.valueOf(date1);
        Date endTime = Date.valueOf(date2);
        Date contestTime = Date.valueOf(date3);

        System.out.println(contestName  );
        System.out.println(contestType  );
        System.out.println(contestDetail);
        System.out.println(date1        );
        System.out.println(date2        );
        System.out.println(contact      );
        System.out.println(contestVenue );
        System.out.println(date3        );
        System.out.println(award        );
        System.out.println(sponsor      );
        System.out.println(startTime   );
        System.out.println(endTime   );
        System.out.println(contestTime   );


        Contest contest = new Contest(contestName,contestType,contestDetail,startTime,endTime,contact,contestTime,
                contestVenue,award,sponsor,contestant);

//        查比赛表
        boolean flag = service.addContest(contest);

        if(flag){
            response.sendRedirect("");
            System.out.println("添加成功");
            //获取虚拟路径,转到主页面
//            String contextPath = request.getContextPath();
//            response.sendRedirect(contextPath+"/html/main.html");

        }else {
            response.sendRedirect("添加失败");
            System.out.println("添加失败");
            //获取虚拟路径,转到主页面
//            String contextPath = request.getContextPath();
//            response.sendRedirect(contextPath+"/html/addperson.html");
        }



    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    this.doGet(request,response);
    }
}
