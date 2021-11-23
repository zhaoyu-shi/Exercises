package com.shi.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private int id;
    private String name;
    private int pid;
    private String grade;
    private int cid;
    private Direction direction;
}
