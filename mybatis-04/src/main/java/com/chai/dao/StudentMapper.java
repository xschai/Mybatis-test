package com.chai.dao;

import com.chai.pojo.Student;

import java.util.List;

public interface StudentMapper {

    //按照查询嵌套处理
    List<Student> getStudent();

    //按照结果嵌套处理
    List<Student> getStudent2();

}
