package com.shi.dao;


import com.shi.pojo.Staff;
import com.shi.utils.IDutils;
import com.shi.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

public class MyTest {

    //增加
    @Test
    public void addStaff(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StaffMapper mapper = sqlSession.getMapper(StaffMapper.class);
        HashMap map = new HashMap();
        map.put("id", IDutils.getId());
        map.put("name","zhaoyushi");
        map.put("age",20);
        map.put("slogan","饭来！");
        mapper.addStaff(map);
        sqlSession.close();
    }

    //删除
    @Test
    public void deleteStaff(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StaffMapper mapper = sqlSession.getMapper(StaffMapper.class);
        HashMap map = new HashMap();

        map.put("name","zhaoyushi");
        mapper.deleteStaff(map);
        sqlSession.close();
    }

    //修改
    @Test
    public void upDateStaff(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StaffMapper mapper = sqlSession.getMapper(StaffMapper.class);
        HashMap map = new HashMap();

        map.put("name","石头");
        map.put("age",30);
        map.put("slogan","干饭！！");
        map.put("id","f2facfdf06df47e5a8d2231e16d26fed");
        mapper.upDateStaff(map);
        sqlSession.close();
    }

    //遍历
    @Test
    public void getStaff(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StaffMapper mapper = sqlSession.getMapper(StaffMapper.class);
        List<Staff> staffList = mapper.getStaff();
        for (Staff staff : staffList) {
            System.out.println(staff);
        }
        sqlSession.close();
    }

    //姓名查找
    @Test
    public void getUserByName(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StaffMapper mapper = sqlSession.getMapper(StaffMapper.class);
        HashMap map = new HashMap();
        map.put("name","石头");
        List<Staff> staffList = mapper.getUserByName(map);
        for (Staff staff : staffList) {
            System.out.println(staff);
        }
        sqlSession.close();
    }
}
