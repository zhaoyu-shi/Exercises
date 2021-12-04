package com.shi.address.service;

import com.shi.address.dao.PeopleMapper;
import com.shi.address.pojo.Page;
import com.shi.address.pojo.People;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PeopleServiceImpl implements PeopleService {
    @Autowired
    private PeopleMapper peopleMapper;

    public List<People> getAllPeople(int uid) { return peopleMapper.getAllPeople(uid); }

    public int deletePeople(int id) { return peopleMapper.deletePeople(id); }

    public int addPeople(People people) {
        return peopleMapper.addPeople(people);
    }

    public List getSort(int uid) {
        return peopleMapper.getSort(uid);
    }

    public Page<People> getSomePeople(int pageno, int uid, People people, int size) {
        //��Ϊ���ݿ����ǲ�����page���ʵ��ģ����Բ���ֱ�ӷ��ط���
        Page<People> page = new Page();
        //��ʼ����ǰҳ�� һ��Ϊ1
        page.setPageno(pageno);

        //һҳ������Ϣ
        int pageSize = 3;
        page.setPageSize(pageSize);

        //һҳ�е�һ����Ϣ���±�
        int pageStartIndex;
        pageStartIndex = (pageno - 1)*pageSize;
        page.setPageStartIndex(pageStartIndex);

        //��ʼ����ǰҳ������������
        Map<Object,Object> map = new HashMap();
        map.put("pageStartIndex",page.getPageStartIndex());
        map.put("pagePageSize",page.getPageSize());
        map.put("people",people);
        List<People> datas = peopleMapper.getSomePeople(map);
        page.setDatas(datas);

        //��ʼ���ܼ�¼��
        int totalRows = size;
        System.out.println(totalRows);
        page.setTotalRows(totalRows);

        //��ʼ��totalPages
        int totalPages ;
        if(totalRows % pageSize==0){
            totalPages = totalRows / pageSize;
        }else {
            totalPages = totalRows / pageSize + 1;
        }
        page.setTotalPages(totalPages);

        return page;
    }

    public List<People> getsomePeopleNumber(People people) {
        HashMap map = new HashMap();
        map.put("people",people);
        return peopleMapper.getsomePeopleNumber(map);
    }

    public int revisePeople(People people) {
        return peopleMapper.revisePeople(people);
    }

    public People getPeopleById(int id) {
        return peopleMapper.getPeopleById(id);
    }

    public Page<People> getCurrentPage(int pageno, int uid) {
        //��Ϊ���ݿ����ǲ�����page���ʵ��ģ����Բ���ֱ�ӷ��ط���
        Page<People> page = new Page();
        //��ʼ����ǰҳ��
        page.setPageno(pageno);
        //��ʼ���ܼ�¼��
        int totalRows = peopleMapper.getAllCount(uid);
        page.setTotalRows(totalRows);
        //��ʼ��totalPages
        int totalPages ;
        int pageSize = 3;
        int pageStartIndex;
        pageStartIndex = (pageno - 1)*pageSize;
        page.setPageStartIndex(pageStartIndex);
        page.setPageSize(pageSize);
        if(totalRows % pageSize==0){
            totalPages = totalRows / pageSize;
        }else {
            totalPages = totalRows / pageSize + 1;
        }
        page.setTotalPages(totalPages);
        //��ʼ����ǰҳ������������
        HashMap map = new HashMap();
        map.put("pageStartIndex",page.getPageStartIndex());
        map.put("pagePageSize",page.getPageSize());
        List<People> datas = peopleMapper.getCurrentPagePeople(map);
        page.setDatas(datas);

        return page;
    }

    public int getAllCount(int uid) {
        return 0;
    }

}
