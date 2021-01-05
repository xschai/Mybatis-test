package com.chai.dao;

import com.chai.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;
//注解实现增删改查
public interface UserMapper {
    //查询所有用户
    @Select("select * from user")
    List<User> getUsers();
    //根据id查询用户
    @Select("select * from user where id=#{id}")
    User getUserById(@Param("id") int id);
    //添加用户
    @Insert("insert into user (id,name,pwd)values (#{id},#{name},#{pwd})")
    int insertUser(User user);

    //修改用户
    @Update("update user set name=#{name},pwd=#{pwd} where id=#{id}")
    int updateUser(User user);

    //删除用户
    @Delete("delete  from user where id=#{id}")
    int deleteUser(@Param("id") int id);
}
