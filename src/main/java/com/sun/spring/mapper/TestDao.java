package com.sun.spring.mapper;

import com.sun.spring.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * @author sunlei
 * @date 2018-12-06 16:16
 */
@Mapper
public interface TestDao {

    @Select("select * from user;")
    public List<User> find();

    @Insert("insert into user(username,password) "+
            "values(#{user.username},#{user.password})")
    public int insert(@Param("user")User user);

}