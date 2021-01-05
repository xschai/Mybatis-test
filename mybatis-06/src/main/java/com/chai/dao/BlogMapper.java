package com.chai.dao;

import com.chai.pojo.Blog;

import java.util.List;
import java.util.Map;

public interface BlogMapper {

    int addBook(Blog blog);

    List<Blog> queryBlogId(Map map);

    List<Blog> queryBlogChoose(Map map);

    int blogUpdate(Map map);

    List<Blog> queryBlogForeach(Map map);
}
