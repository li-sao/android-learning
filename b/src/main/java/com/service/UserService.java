package com.service;

import com.mapper.UserMapper;
import com.pojo.User;
import com.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class UserService {
    public static void main(String[] args) {
        UserService userService = new UserService();
        User u = new User("焕焕","1234","杨焕民","2004405227","男",21,"13263773985","电信学院","计科本202");
        User ur = new User();
        ur.setPassword("1234");
        ur.setUsername("凯子");
//        System.out.println(userService.register(ur));
        System.out.println(userService.personInformation(u));
    }

    //1.使用工具类获取SqlSessionFactory
    SqlSessionFactory factory = SqlSessionFactoryUtils.getSqlSessionFactory();
    /**
     * 登录方法
     * @param username
     * @param password
     * @return
     */
    public User login(String username, String password){
        //2. 获取SqlSession
        SqlSession sqlSession = factory.openSession();
        //3. 获取UserMapper
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        //4. 调用方法
        User user = mapper.select(username, password);
        //释放资源
        sqlSession.close();

        return  user;
    }

    /**
     * 注册方法
     * @param user
     * @return true表示注册成功
     */
    public boolean register(User user){
        SqlSession sqlSession = factory.openSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

//        查找是否有相同的用户名
        User u = mapper.selectByUsername(user.getUsername());

        if(u==null){
            mapper.add(user);
            sqlSession.commit();
        }
        sqlSession.close();
        return u == null;
    }

    /**
     * 根据用户名，判断用户是否存在，如果存在则添加用户信息
     * @param user
     * @return
     */
    public boolean personInformation(User user){
        SqlSession sqlSession = factory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User u = mapper.selectByUsername(user.getUsername());
        //判断是否用户存在
        if(u!=null){
            mapper.addInformation(user);
            sqlSession.commit();
        }

        return u!=null;
    }

    public User userInformation(String userName){
        SqlSession sqlSession = factory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User u = mapper.selectByUsername(userName);

        sqlSession.close();

        return u;

    }



}
