package com.shi.address.service;

import com.shi.address.dao.PeopleMapper;
import com.shi.address.pojo.People;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface PeopleService extends PeopleMapper {
    //查询通讯录里全部联系人
    List<People> getAllPeople(int uid);
    //通讯组
    List getSort(@Param("uid") int uid);
    //添加联系人
    int addPeople(Map map);
    //删除联系人
    int deletePeople(@Param("id") int id);

}
