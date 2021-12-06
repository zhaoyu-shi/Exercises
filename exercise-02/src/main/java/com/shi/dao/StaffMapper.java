package com.shi.dao;

import com.shi.pojo.Staff;

import java.util.List;
import java.util.Map;

public interface StaffMapper {

    //增加员工
    int addStaff(Map map);
    //删除员工
    int deleteStaff(Map map);
    //更改信息
    int upDateStaff(Map map);
    //查询员工
    List<Staff> getStaff();
    //根据姓名进行查找
    List<Staff> getUserByName(Map map);
}
