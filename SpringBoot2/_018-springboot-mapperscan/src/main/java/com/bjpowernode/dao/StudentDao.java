package com.bjpowernode.dao;

import com.bjpowernode.model.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/*
mapper注解的作用是：告诉mybatis，这是你的dao接口，创建此接口的代理对象
 */

public interface StudentDao {
    Student selectById(@Param("stuId") Integer id);
}
