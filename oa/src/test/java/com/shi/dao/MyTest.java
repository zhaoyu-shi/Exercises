package com.shi.dao;

import com.shi.address.dao.PeopleMapper;
import com.shi.address.dao.UserMapper;
import com.shi.address.pojo.People;
import com.shi.address.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = (UserMapper) context.getBean("userMapper");
        User user = userMapper.getUser("zhaoyushi");
        PeopleMapper peopleMapper = (PeopleMapper) context.getBean("peopleMapper");
        List<People> allPeople = peopleMapper.getAllPeople(1);
        System.out.println(allPeople);
        //System.out.println(user);
    }

}
