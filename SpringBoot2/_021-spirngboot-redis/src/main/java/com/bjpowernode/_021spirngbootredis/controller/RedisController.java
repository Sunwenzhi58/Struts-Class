package com.bjpowernode._021spirngbootredis.controller;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class RedisController {

    /*
    注入Redistemplate泛型<String,String>
     */
    @Resource
    private RedisTemplate redisTemplate;

    //添加数据到redis
    @PostMapping("/redis/addString")
    public String addToRedis(String name,String value){

        //操作Redis中String类型的数据，先获取ValueOperations对象
        ValueOperations valueOperations = redisTemplate.opsForValue();
        //添加数据到redis
        valueOperations.set("myname","lisi");
        return "向redis添加string类型的数据";
    }

    @Resource
    private StringRedisTemplate stringRedisTemplate;

    //从redis获取数据
    @GetMapping("/redis/getk")
    public String getData(String k){
         ValueOperations valueOperations = redisTemplate.opsForValue();
        Object v = valueOperations.get(k);
        return "key是"+k+",他的值是："+v;

    }


    @PostMapping("/redis/{k}/{v}")
    public String addStringKV(@PathVariable String k,
                              @PathVariable String v){
          //使用Redistemplate对象
        stringRedisTemplate.opsForValue().set(k,v);
        return "使用Redistemplate对象";
    }

    @GetMapping("/redis/getstr/{k}")
    public String getStringValue(@PathVariable String k){
        String v = stringRedisTemplate.opsForValue().get(k);
           return "k的value："+v;
    }
}
