package com.shi.dao;

import com.shi.pojo.Course;
import org.apache.ibatis.annotations.Param;

public interface CourseMapper {
    //根据课程id查出该课程信息及选这门课的人
    Course getCourse(@Param("cid") int id);
}
