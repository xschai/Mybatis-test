package com.chai.dao;

import com.chai.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserDao {
    //查询所有用户
    List<User> getUserList(String 李);
    //根据id查询用户
    User getUserById(int id);
    //插入用户
    int insertUser(User user);
    //修改用户
    int updateUser(User user);
    //删除用户
    int deleteUser(int id);
    //Map
    int addUser(Map<String,Object> map);

    //Mapgetid
    User getUserid(Map<String,Object> map);
    //模糊查询
    List<User> getUser(String value);
}
