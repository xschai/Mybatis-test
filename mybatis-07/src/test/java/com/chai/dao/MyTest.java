package com.chai.dao;

import com.chai.pojo.User;
import com.chai.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class MyTest {
    static Logger logger = Logger.getLogger(MyTest.class);

    @Test
    public  void  queryBlogForeach(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        SqlSession sqlSession1 = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.queryUserById(1);
        System.out.println(user);
        sqlSession.close();


        UserMapper mapper1 = sqlSession1.getMapper(UserMapper.class);
        User user1 = mapper1.queryUserById(1);
        System.out.println(user1);


        System.out.println(user==user1);
        sqlSession1.close();
    }
}

