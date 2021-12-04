package com.shi.address.service;

import com.shi.address.dao.PeopleMapper;
import com.shi.address.pojo.Page;
import com.shi.address.pojo.People;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface PeopleService {
    //查询通讯录里全部联系人
    List<People> getAllPeople(int uid);
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
    Page<People> getSomePeople(int pageno, int uid, People people, int size);
    //按条件查询获得的人数
    List<People> getsomePeopleNumber(People people);
    //查询当前页
    Page<People> getCurrentPage(int pageno, int uid);

}
