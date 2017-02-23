package com.org.hsd.controller;

import com.org.hsd.model.User;
import com.org.hsd.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Administrator on 2017/2/23.
 */
@Controller
public class IndexController {

    @Autowired
    IUserService userService;

    @RequestMapping(value = "/")
    public String index(){
        System.out.println(55);
        return "index";
    }

    @ResponseBody
    @RequestMapping(value = "/queryUser.do")
    public String queryUser (){
        List<User> list = userService.queryUserAll();
        System.out.println(list.size());
        return "";
    }

    @ResponseBody
    @RequestMapping(value = "/insertUser.do")
    public String insertUser(){
         int  result = userService.insertUser();
         return result+"";
    }

}
