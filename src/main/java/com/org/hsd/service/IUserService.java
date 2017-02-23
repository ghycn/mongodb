package com.org.hsd.service;

import com.org.hsd.model.User;

import java.util.List;

/**
 * Created by Administrator on 2017/2/23.
 */
public interface IUserService {
    List<User> queryUserAll();

    int insertUser();
}
