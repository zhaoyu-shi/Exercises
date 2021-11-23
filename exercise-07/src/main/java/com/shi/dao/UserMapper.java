package com.shi.dao;

import com.shi.pojo.User;

public interface UserMapper {
    //根据姓名查找用户
    User getUser(String user);
}
