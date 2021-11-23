package com.shi.service;

import com.shi.dao.UserMapper;
import com.shi.pojo.User;

public interface UserService extends UserMapper {
    //根据姓名查找用户
    User getUser(String uname);
}
