package com.chai.dao;

import com.chai.pojo.User;
import com.chai.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.log4j.Logger;

public class UserDaoTest {
    static  Logger logger=Logger.getLogger(UserDaoTest.class);
    @Test
    public void testLog4f(){
        logger.info("info进入log4j");
        logger.debug("debug进入log4j");
        logger.error("error进入log4j");

    }


    @Test
    public  void test(){
        //方式一
          SqlSession sqlSession = MybatisUtils.getSqlSession();
//        UserDao mapper = sqlSession.getMapper(UserDao.class);
//        List<User> userList = mapper.getUserList();
            //方式二
            List<User> userList = sqlSession.selectList("com.chai.dao.UserDao.getUserList");

        for (User user : userList){
            System.out.println(user);
        }

    }

    @Test
    public  void getUsers(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        List<User> users = mapper.getUsers();
        for (User user : users) {
            System.out.println(user);
        }

        sqlSession.close();


    }

    @Test
    public  void insertUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);

        int i = mapper.insertUser(new User(9, "d", "566766555"));
        System.out.println(i);

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public  void updateUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        int i = mapper.updateUser(new User(6, "小红", "88888"));
        System.out.println(i);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void deleteUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        int i = mapper.deleteUser(6);
        System.out.println(i);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void  addUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("id",9);
        map.put("ped",89898);
        mapper.addUser(map);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void  getUserid(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("id",3);
        User userid = mapper.getUserid(map);
        System.out.println(userid);
        sqlSession.commit();
        sqlSession.close();

    }

    @Test
    public  void getUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        List<User> list = mapper.getUser("%李%");
        for (User user : list) {
            System.out.println(user);
        }
        sqlSession.close();
    }
}
