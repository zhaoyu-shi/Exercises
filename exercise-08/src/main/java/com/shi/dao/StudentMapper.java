package com.shi.dao;

import com.shi.pojo.Student;

public interface StudentMapper {
    //通过学生姓名进行查询
    Student getStudentByName(String name);
}
