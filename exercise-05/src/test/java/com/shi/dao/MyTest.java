package com.shi.dao;

import com.shi.pojo.Course;
import com.shi.pojo.Student;
import com.shi.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MyTest {
    @Test
    public void getCourse(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        CourseMapper mapper = sqlSession.getMapper(CourseMapper.class);
        Course course = mapper.getCourse(1);

        System.out.println(course);
        sqlSession.close();
    }
    @Test
    public void getStudent(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        Student student = mapper.getStudent(194804195);
        System.out.println(student);
        sqlSession.close();
    }
}
