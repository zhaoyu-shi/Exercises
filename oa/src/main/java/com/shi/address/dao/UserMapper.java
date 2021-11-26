package com.shi.address.dao;

import com.shi.address.pojo.People;
import com.shi.address.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    //登录
    User getUser(String name);
    //注册
    int addUser(Map map);

}
