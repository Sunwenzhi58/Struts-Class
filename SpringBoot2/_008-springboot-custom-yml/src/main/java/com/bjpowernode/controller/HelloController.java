package com.bjpowernode.controller;

import com.bjpowernode.vo.SchoolInfo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class HelloController {

    @Value("${server.port}")
    private Integer port;

    @Value("${server.servlet.context-path}")
    private String contextPath;

    @Value("${school.name}")
    private String name;

    @Value("${site}")
    public String site;

    @Resource
    private SchoolInfo info;

    @RequestMapping("/data")
    @ResponseBody
    public String queryData(){
        return name+","+site+","+"项目访问的地址="+contextPath+",使用的端口"+port;
    }

    @RequestMapping("/info")
    @ResponseBody
    public String queryInfo(){
        return "schoolInfo对象=="+info.toString();
    }
}
