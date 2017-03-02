package com.org.hsd.controller;

import com.alibaba.fastjson.JSON;
import com.org.hsd.model.User;
import com.org.hsd.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.logging.Logger;

/**
 * Created by Administrator on 2017/2/23.
 */
@Controller
public class IndexController {
    private static Logger logger = Logger.getLogger(IndexController.class.getName());

    @Autowired
    IUserService userService;

    @RequestMapping(value = "/index.do")
    public String index(){
        System.out.println(55);
        return "index";
    }

    @ResponseBody
    @RequestMapping("/save")
    public String saveUser(){
        User user = new User();
        logger.info("save:"+user);
        userService.saveUser(user);
        return "index";
    }


    @ResponseBody
    @RequestMapping(value = "ajax/test.do")
    public String test(String query){
        return "[{ \"id\": 1, \"name\": \"New York\" }, { \"id\": 2, \"name\": \"Shanghai\"}]";
    }

}
