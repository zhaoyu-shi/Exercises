package com.shi.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Projects {
    private String id;
    private String name;
    private String principal;
    private Date createStartTime;
    private Date createEndTime;
}
