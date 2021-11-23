package com.shi.service;

import com.shi.dao.UserMapper;
import com.shi.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public User getUser(String uname) {
        return userMapper.getUser(uname);
    }

}
