package com.service;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;

import com.mapper.ContestMapper;
import com.pojo.Contest;
import com.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class ContestService{
    public static void main(String[] args) {
//        Date date1 = Date.valueOf("2022-10-1");
//        Date date2 =Date.valueOf("2022-10-1");
//        Date date3 = Date.valueOf("2002-10-2");
//        ContestService contestService = new ContestService();
//
//        Contest contest = new Contest("互联网+","科技类","contestDetail",
//                date1,date2,"13237750313",date3,
//                "北大","100","北部湾大学","学生");
//        System.out.println(contest);
//        SqlSessionFactory factory = SqlSessionFactoryUtils.getSqlSessionFactory();
//
//        SqlSession sqlSession = factory.openSession();
//
//        ContestMapper mapper = sqlSession.getMapper(ContestMapper.class);
//
//        System.out.println(mapper.selectByContestName("互联网+"));

//        sqlSession.commit();
//        sqlSession.close();

//        System.out.println(contestService.addContest(contest));

        ContestService service = new ContestService();
        System.out.println(service.selectByContestName("互联网+"));


    }

    SqlSessionFactory factory = SqlSessionFactoryUtils.getSqlSessionFactory();

    /**
     * 添加比赛信息
     * @param contest
     * @return true表示添加成功
     */
    public boolean addContest(Contest contest){

        SqlSession sqlSession = factory.openSession();

        ContestMapper mapper = sqlSession.getMapper(ContestMapper.class);

        Contest c = mapper.selectByNameTime(contest.getContestName(),contest.getContestTime());

        if(c==null){
            mapper.add(contest);
            sqlSession.commit();
        }
        sqlSession.close();
        return c ==null;
    }

    /**
     * 显示比赛信息
     * @param contestName
     * @return
     */
    public  Contest selectByContestName(String contestName){
        SqlSession sqlSession = factory.openSession();

        ContestMapper mapper = sqlSession.getMapper(ContestMapper.class);

        Contest c = mapper.selectByContestName(contestName);

        return c;

    }

    public List<Contest> selectAll(){
        SqlSession sqlSession = factory.openSession();

        ContestMapper mapper = sqlSession.getMapper(ContestMapper.class);

       List<Contest> c = mapper.selectAll();

       return c;
    }

}
