package com.org.hsd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/2/23.
 */
@Controller
public class IndexController {

    @RequestMapping(value = "/index.do")
    public String index(){
        System.out.println(55);
        return "index";
    }

}
