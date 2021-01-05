package com.chai.dao;

import com.chai.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    User queryUserById(@Param("id") int id);
}
