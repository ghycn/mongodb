package com.org.hsd.service.impl;

import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.org.hsd.model.Student;
import com.org.hsd.model.User;
import com.org.hsd.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;
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

    public User queryUser() { 
        DBCollection collection = mongoTemplate.getCollection("student");
        Criteria  criteria= Criteria.where("name").is("jack");
        Query query = Query.query(criteria);
        List<Student> list = mongoTemplate.find(query,Student.class);


        return   mongoTemplate.findById("586b4e620659e85742ab5d9b",User.class);

    }

}
