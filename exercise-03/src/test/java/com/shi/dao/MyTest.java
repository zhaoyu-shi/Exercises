package com.shi.dao;

import com.shi.pojo.Projects;
import com.shi.utils.IDutils;
import com.shi.utils.MybatisUtils;
import javafx.scene.chart.PieChart;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class MyTest {

    @Test
    public void addProjects(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        ProjectsMapper mapper = sqlSession.getMapper(ProjectsMapper.class);

        HashMap map = new HashMap();
        map.put("id", IDutils.getId());
        map.put("name","Obj4");

        map.put("createStartTime",new Date());
        map.put("principal","yushi");

        mapper.addProjects(map);
    }

    @Test
    public void deleteProjects(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        ProjectsMapper mapper = sqlSession.getMapper(ProjectsMapper.class);

        HashMap map = new HashMap();
        map.put("id","123");

        mapper.deleteProjects(map);
    }

    @Test
    public void upDateProjects(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        ProjectsMapper mapper = sqlSession.getMapper(ProjectsMapper.class);

        HashMap map = new HashMap();
        map.put("name","shishishi");
        map.put("createEndTime",new Date());

        map.put("id","9ab874930e7642efa030e275c97952fd");
        mapper.upDateProjects(map);
    }

    @Test
    public void getProjects(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        ProjectsMapper mapper = sqlSession.getMapper(ProjectsMapper.class);
        List<Projects> projects = mapper.getProjects();
        for (Projects project : projects) {
            System.out.println(project);
        }
    }

    @Test
    public void getProjectsByTime(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        ProjectsMapper mapper = sqlSession.getMapper(ProjectsMapper.class);
        HashMap<String, Date> map = new HashMap<String, Date>();

        String StartTime = "2021-10-21 22:00:25";
        String EndTime = "2021-10-21 23:00:25";
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date ST = null;
        Date ET = null;
        try {
            ST = dateFormat.parse(StartTime);
            ET = dateFormat.parse(EndTime);
        } catch (Exception e) {
            e.printStackTrace();
        }

        map.put("StartTime",ST);
        //map.put("EndTime",ET);
        List<Projects> projectsByTime = mapper.getProjectsByTime(map);
        for (Projects projects : projectsByTime) {
            System.out.println(projects);
        }

    }

}
