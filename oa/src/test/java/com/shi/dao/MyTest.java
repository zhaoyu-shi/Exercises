package com.shi.dao;

import com.shi.address.dao.PeopleMapper;
import com.shi.address.dao.UserMapper;
import com.shi.address.pojo.People;
import com.shi.address.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.List;

public class MyTest {
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        PeopleMapper peopleMapper = (PeopleMapper) context.getBean("peopleMapper");
        People people = new People();
        people.setSort("同事");
        HashMap map = new HashMap();
        map.put("pageStartIndex",0);
        map.put("pagePageSize",3);
        map.put("people",people);
        List somePeople = peopleMapper.getSomePeople(map);
        System.out.println(somePeople);
        //System.out.println(user);
    }

}
