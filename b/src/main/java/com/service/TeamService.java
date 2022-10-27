package com.service;

import com.mapper.TeamMapper;
import com.pojo.Team;
import com.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class TeamService {
    public static void main(String[] args) {

        TeamService service = new TeamService();

        Team team = new Team("创新创业大赛","队长","杨焕民","2004405227","男",20,"电信学院","计科本202","寻行逐队","13263773985");

        System.out.println(service.addTeam(team));
//        System.out.println(service.contestAllTeam("网页设计大赛"));
//        System.out.println(service.personAllTeam("12333"));
        System.out.println(service.personAllTeam("2004405227"));


    }


    //1.使用工具类获取SqlSessionFactory
    SqlSessionFactory factory = SqlSessionFactoryUtils.getSqlSessionFactory();

    /**
     * 根据比赛名称，获取所有该比赛的队伍
     * @param contestName
     * @return 该比赛的队伍
     */
    public List<Team> contestAllTeam(String contestName){
        //2. 获取SqlSession
        SqlSession sqlSession = factory.openSession();
        //3. 获取UserMapper
        TeamMapper mapper = sqlSession.getMapper(TeamMapper.class);
        //4. 调用方法
        List<Team> teams = mapper.select(contestName);

        //释放资源
        sqlSession.close();
        return teams ;
    }

    /**
     * 根据学号ID，获取所有该ID的队伍
     * @param studentId
     * @return
     */
    public List<Team> personAllTeam(String studentId){
        SqlSession sqlSession = factory.openSession();

        TeamMapper mapper = sqlSession.getMapper(TeamMapper.class);

        List<Team> teams = mapper.selectByID(studentId);

        sqlSession.close();

        return teams;
    }


    /**
     * 添加队伍成员
     * @param team
     * @return
     */
    public Boolean addTeam(Team team){
        SqlSession sqlSession = factory.openSession();

        TeamMapper mapper = sqlSession.getMapper(TeamMapper.class);

        Boolean flag = mapper.add(team);

        sqlSession.commit();
        sqlSession.close();

        return flag;
    }
}
