package com.shi.dao;

import com.shi.pojo.Student;
import com.shi.service.StudentService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {
    @Test
    public void demo(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentMapper studentMapper = (StudentMapper) context.getBean("studentMapper");

        System.out.println(studentMapper.getStudentByName("小李"));
    }
}
