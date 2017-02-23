package com.org.hsd.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.org.hsd.model.User;

public interface UserMapper extends BaseMapper<User>{
    int deleteByPrimaryKey(String id);

    Integer insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}