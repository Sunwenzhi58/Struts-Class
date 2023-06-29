package com.bjpowernode.demo.service.impl;

import com.bjpowernode.demo.dao.StudentDao;
import com.bjpowernode.model.Student;
import com.bjpowernode.service.StudentService;

import javax.annotation.Resource;

public class StudentImpl implements StudentService {

    @Resource
    private StudentDao studentDao;

    @Override
    public int addStudent(Student student) {
         int result = 0;
        //查询手机号，是否唯一
        if (student.getNumber()!=null){
            Student stu = studentDao.selectByPhone(student.getNumber());
            if(stu !=null){
               result=2;
            }else {
                //添加处理
                result = studentDao.insertStudent(student);
            }

        }
        return 0;
    }

    @Override
    public Student queryStudent(Integer id) {
        return null;
    }
}
