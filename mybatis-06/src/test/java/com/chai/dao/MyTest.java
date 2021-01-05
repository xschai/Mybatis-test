package com.chai.dao;

import com.chai.pojo.Blog;
import com.chai.utils.IdUtils;
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
    public void addBlogTest() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Blog blog = new Blog();
        blog.setId(IdUtils.getId());
        blog.setTitle("Mybatis");
        blog.setAuthor("狂神说");
        blog.setCreatTime(new Date());
        blog.setViews(9999);
        mapper.addBook(blog);

        blog.setId(IdUtils.getId());
        blog.setTitle("Java");
        mapper.addBook(blog);

        blog.setId(IdUtils.getId());
        blog.setTitle("Spring");
        mapper.addBook(blog);

        blog.setId(IdUtils.getId());
        blog.setTitle("微服务");
        mapper.addBook(blog);

        sqlSession.close();
    }

    @Test
    public  void  BlogIf(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap<String,String> map = new HashMap<String,String>();
        map.put("title","Java");
        map.put("author","狂神说");
        List<Blog> blogs = mapper.queryBlogId(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
        sqlSession.close();
    }

    @Test
    public  void  BlogChoose(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap<String,String> map = new HashMap<String,String>();
        map.put("title","Java");
        map.put("author","狂神说");
        List<Blog> blogs = mapper.queryBlogChoose(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
        sqlSession.close();
    }


    @Test
    public  void  blogUpdate(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap<String,String> map = new HashMap<String,String>();
        map.put("title","Java3");
        map.put("author","狂神说2");
        map.put("id","4e3ea25d260246ef9db35be3c322291f");
       mapper.blogUpdate(map);

        sqlSession.close();
    }

    @Test
    public  void  queryBlogForeach(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap map = new HashMap();
        ArrayList<Integer> ids = new ArrayList<Integer>();
        ids.add(1);
        ids.add(2);
        ids.add(3);
        map.put("ids",ids);
        List<Blog> blogs = mapper.queryBlogForeach(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
        sqlSession.close();
    }
}

