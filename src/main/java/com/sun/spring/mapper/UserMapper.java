package com.sun.spring.mapper;

import com.sun.spring.entity.User;

/**
 * @author sunlei
 * @date 2018-12-06 18:33
 */

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);


    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}
