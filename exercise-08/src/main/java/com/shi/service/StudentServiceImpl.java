package com.shi.service;

import com.shi.dao.StudentMapper;
import com.shi.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    public Student getStudentByName(String name) {
        return studentMapper.getStudentByName(name);
    }
}
