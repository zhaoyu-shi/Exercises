package com.shi.address.service;

import com.shi.address.dao.PeopleMapper;
import com.shi.address.dao.UserMapper;
import com.shi.address.pojo.People;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class PeopleServiceImpl implements PeopleService {
    @Autowired
    private PeopleMapper peopleMapper;

    public List<People> getAllPeople(int uid) {
        return peopleMapper.getAllPeople(uid);
    }

    public int addPeople(Map map) {
        return peopleMapper.addPeople(map);
    }

    public List getSort(int uid) {
        return peopleMapper.getSort(uid);
    }
}
