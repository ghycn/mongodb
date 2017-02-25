package com.org.hsd.service.impl;

import com.org.hsd.mapper.UserMapper;
import com.org.hsd.model.User;
import com.org.hsd.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/2/23.
 */
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;

    public List<User> queryUserAll() {
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("name","Tom");
        List<User> list = userMapper.selectByMap(map);
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
