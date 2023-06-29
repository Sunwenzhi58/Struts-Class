package com.bjpowernode.service.impl;

import com.bjpowernode.service.UserService;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Override
    public void sauHello(String name) {
        System.out.println("执行了业务方法的sayhello："+name);
    }
}
