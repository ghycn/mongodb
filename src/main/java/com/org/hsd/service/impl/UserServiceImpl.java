package com.org.hsd.service.impl;

import com.org.hsd.mapper.UserMapper;
import com.org.hsd.model.User;
import com.org.hsd.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2017/2/23.
 */
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;

    public List<User> queryUserAll() {
        List<User> list = userMapper.selectByMap(null);
        return list;
    }

    public int insertUser() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        User user = new User();
        user.setAge(15);
        user.setId("1");
        user.setName("Tom");
        user.setBirthday(sdf.format(new Date()));
        return userMapper.insert(user);
    }
}
