package com.bjpowernode.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class CustomFilterController {

    @RequestMapping("/user/account")
    @ResponseBody
    public String userAccount(){
        return "/user/account";
    }

    @RequestMapping("/query")
    @ResponseBody
    public String queryAccount(){
        return "/query";
    }
}
