package com.shi.dao;

import com.shi.pojo.Projects;

import java.util.List;
import java.util.Map;

public interface ProjectsMapper {
    //增加项目
    int addProjects(Map map);
    //删除项目
    int deleteProjects(Map map);
    //更改信息
    int upDateProjects(Map map);
    //查询项目
    List<Projects> getProjects();
    //根据时间进行查找
    List<Projects> getProjectsByTime(Map map);
}
