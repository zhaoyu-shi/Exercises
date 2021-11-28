package com.shi.address.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
//��ҳ��limit startIndex�� pageSize
public class Page<T> {
    private int pageno;//��ǰҳ��
    private int pageStartIndex;//��ǰҳ����ʼ����
    private int pageSize;//ҳ���С
    private int totalRows;//�ܼ�¼��
    private int totalPages;//��ҳ��
    private List<T> datas;//��ǰҳ�������ľ���ҳ

    // //���ι�����
    // //ֻ��Ҫ��������
    // public Page(int pageno, int pageSize) {
    //     this(); //������֮��ͬdatas = new ArrayList<People>();
    //     if (pageno <= 0){
    //         pageno = 1;
    //     }
    //     if(pageSize <= 0){
    //         pageSize = 3;
    //     }
    //     this.pageno = pageno;
    //     this.pageSize = pageSize;
    // }
    //
    // //�����޲ι����������� ���ó�ʼֵ
    // public Page(){
    //     this.pageSize = 3;
    //     this.pageStartIndex = 1;
    //     datas = new ArrayList<T>();
    // }
    //
    // public int getPageno() {
    //     return pageno;
    // }
    //
    // public void setPageno(int pageno) {
    //     this.pageno = pageno;
    // }
    //
    // public int getPageStartIndex() {
    //     return pageStartIndex;
    // }
    //
    // public void setPageStartIndex(int pageStartIndex) {
    //     this.pageStartIndex = pageStartIndex;
    // }
    //
    // public int getPageSize() {
    //     return pageSize;
    // }
    //
    // public void setPageSize(int pageSize) {
    //     this.pageSize = pageSize;
    // }
    //
    // public int getTotalRows() {
    //     return totalRows;
    // }
    //
    // public void setTotalRows(int totalRows) {
    //     this.totalRows = totalRows;
    // }
    //
    // public int getTotalPages() {
    //     return totalPages;
    // }
    //
    // public void setTotalPages(int totalPages) {
    //     this.totalPages = totalPages;
    // }
    //
    // public List<T> getDatas() {
    //     return datas;
    // }
    //
    // public void setDatas(List<T> datas) {
    //     this.datas = datas;
    // }
    //
    // @Override
    // public String toString() {
    //     return "Page{" +
    //             "pageno=" + pageno +
    //             ", pageStartIndex=" + pageStartIndex +
    //             ", pageSize=" + pageSize +
    //             ", totalRows=" + totalRows +
    //             ", totalPages=" + totalPages +
    //             ", datas=" + datas +
    //             '}';
    // }
}
