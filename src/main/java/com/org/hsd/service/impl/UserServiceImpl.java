package com.org.hsd.service.impl;

import com.org.hsd.model.User;
import com.org.hsd.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.UUID;
import java.util.logging.Logger;


/**
 * Created by Administrator on 2017/2/23.
 */
@Service
public class UserServiceImpl implements IUserService {
    private static Logger logger = Logger.getLogger(UserServiceImpl.class.getName());

    private static String USER_COLLECTION = "user";

    @Autowired
    MongoTemplate mongoTemplate;

    public void saveUser(User user) {
        user.setName("Tom");
        user.setAge(15);
        user.setUid(UUID.randomUUID().toString());
        logger.info("save:"+user);
        mongoTemplate.save(user,USER_COLLECTION);

    }
}
