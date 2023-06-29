package com.bjpowernode;

import com.bjpowernode.service.HelloService;
import com.bjpowernode.service.impl.HelloServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Resource
    private HelloService helloService;

    public static void main(String[] args) {
        System.out.println("准备创建容器对象");
        //创建容器对象
        SpringApplication.run(Application.class, args);
        System.out.println("容器对象创建之后");
    }

    @Override
    public void run(String... args) throws Exception {
        String str = helloService.name("lisi");
        System.out.println("调用容器中的对象"+str);

        System.out.println("容器对象创建好后，执行的方法");
    }
}
