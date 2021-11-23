package com.shi.service;

import com.shi.pojo.Student;

public interface StudentService {
    //通过学生姓名进行查询
    Student getStudentByName(String name);
}
