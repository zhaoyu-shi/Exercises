package com.shi.dao;

import com.shi.pojo.Direction;
import com.shi.pojo.Student;
import com.shi.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MyTest {
    public static void main(String[] args) {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        DirectionMapper mapper = sqlSession.getMapper(DirectionMapper.class);
        Direction getdirection = mapper.getdirection();
        System.out.println(getdirection);
        sqlSession.close();
    }

    @Test
    public void getStudent(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        DirectionMapper mapper = sqlSession.getMapper(DirectionMapper.class);
        Direction direction = mapper.getDirection(1);
        System.out.println(direction);
        sqlSession.close();
    }

}
