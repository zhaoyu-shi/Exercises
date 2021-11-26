package com.shi.address.dao;

import com.shi.address.pojo.People;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface PeopleMapper {

    //查询通讯录里全部联系人
    List<People> getAllPeople(@Param("uid") int uid);
    //通讯组
    /*@Select("select sort from ao.people;")*/
    List getSort(@Param("uid") int uid);
    //添加联系人
    int addPeople(Map map);

}
