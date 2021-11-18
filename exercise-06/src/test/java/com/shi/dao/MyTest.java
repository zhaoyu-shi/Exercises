package com.shi.dao;

import com.shi.pojo.Direction;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    @Test
    public void getStudent1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        DirectionMapper directionMapper = (DirectionMapper) context.getBean("directionMapper");
        Direction direction = directionMapper.getDirection(1);
        System.out.println(direction);
    }

}
