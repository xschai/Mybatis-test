package com.chai.dao;

import com.chai.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TeacherMapper {

    List<Teacher> getTeacher();

    //获取指定老师下的所有学生及老师信息
    Teacher getTeacher(@Param("id") int id);


    Teacher getTeacher2(@Param("id") int id);

}
