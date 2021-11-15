package com.shi.dao;

import com.shi.pojo.Direction;
import com.shi.pojo.Student;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class DirectionMapperImpl implements DirectionMapper {
    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    public Direction getDirection(int id) {
        DirectionMapper mapper = sqlSession.getMapper(DirectionMapper.class);
        return mapper.getDirection(id);
    }
}
