package com.shi.address.service;

import com.shi.address.dao.UserMapper;
import com.shi.address.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public User getUser(String name) {
        return userMapper.getUser(name);
    }

    public int addUser(Map map) {
        return userMapper.addUser(map);
    }
}
