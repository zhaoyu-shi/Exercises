package com.shi.dao;

import com.shi.pojo.Direction;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface DirectionMapper {

    //获取指定专业下的所有学生及专业信息
    Direction getDirection(@Param("did") int id);

}
