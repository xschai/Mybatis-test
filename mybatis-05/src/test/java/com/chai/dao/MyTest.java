package com.chai.dao;

import com.chai.pojo.Student;
import com.chai.pojo.Teacher;
import com.chai.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.List;

public class MyTest {
    static Logger logger=Logger.getLogger(MyTest.class);
    public static void main(String[] args) {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        List<Teacher> teachers = mapper.getTeacher();
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }

        sqlSession.close();
    }

    @Test
    public  void  getTeacherStudent(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacherStudent = mapper.getTeacher(1);
        System.out.println(teacherStudent);
        sqlSession.close();
    }

    @Test
    public  void  getTeacherStudent2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacherStudent = mapper.getTeacher2(1);
        System.out.println(teacherStudent);
        sqlSession.close();
    }
}

