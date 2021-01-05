package com.chai.dao;
import com.chai.pojo.User;
import com.chai.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.List;

public class UserTest {
    static Logger logger=Logger.getLogger(UserMapper.class);


    //查询所有用户
    @Test
    public void getUsers(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.getUsers();
        for (User user : users) {
            System.out.println(user);
        }
        sqlSession.close();

    }

    //查询指定id的用户
    @Test
    public void getUserById(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User userById = mapper.getUserById(2);
        System.out.println(userById);
        sqlSession.close();
    }

    //添加用户
    @Test
    public  void insertUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int i = mapper.insertUser(new User(12, "网二", "9999999"));
        sqlSession.close();
    }

    //修改用户
    @Test
    public void  updateUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int i = mapper.updateUser(new User(9,"九九","7777777"));
        sqlSession.close();

    }

    //删除用户
    @Test
    public  void deleteUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int i = mapper.deleteUser(9);
        sqlSession.close();

    }
}
