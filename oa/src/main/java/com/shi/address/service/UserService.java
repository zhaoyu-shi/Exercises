package com.shi.address.service;

import com.shi.address.dao.UserMapper;
import com.shi.address.pojo.People;
import com.shi.address.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserService extends UserMapper {

    //登录
    User getUser(String name);
    //注册
    int addUser(Map map);

}
