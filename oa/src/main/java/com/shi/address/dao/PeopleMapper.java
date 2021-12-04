package com.shi.address.dao;

import com.shi.address.pojo.People;
import com.shi.address.pojo.Page;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface PeopleMapper {

    //查询通讯录里全部联系人
    List<People> getAllPeople(@Param("uid") int uid);
    //通讯组
    List getSort(@Param("uid") int uid);
    //添加联系人
    int addPeople(People people);
    //删除联系人
    int deletePeople(@Param("id") int id);
    //根据id查找个人
    People getPeopleById(@Param("id") int id);
    //修改信息
    int revisePeople(People people);
    //按条件查询
    List<People> getSomePeople(Map<Object,Object> map);
    //按条件查询获得的人数
    List<People> getsomePeopleNumber(Map<Object,Object> map);
    //总人数
    int getAllCount(int uid);
    //当前页内人员信息
    List<People> getCurrentPagePeople(Map map);
}
