package com.shi.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Direction {
    private String id;
    private String name;
    private String introductions;
    //一个专业 多个学生
    private List<Student> students;
}
