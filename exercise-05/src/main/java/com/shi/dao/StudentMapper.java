package com.shi.dao;

import com.shi.pojo.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentMapper {

    //查找指定学生
    Student getStudent(@Param("sid") int id);

}
