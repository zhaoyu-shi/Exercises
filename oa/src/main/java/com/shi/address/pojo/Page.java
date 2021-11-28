package com.shi.address.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
//分页：limit startIndex， pageSize
public class Page<T> {
    private int pageno;//当前页码
    private int pageStartIndex;//当前页的起始索引
    private int pageSize;//页面大小
    private int totalRows;//总记录数
    private int totalPages;//总页码
    private List<T> datas;//当前页所包含的具体页

    // //带参构造器
    // //只需要基础数据
    // public Page(int pageno, int pageSize) {
    //     this(); //功能与之相同datas = new ArrayList<People>();
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
    // //利用无参构造器的特性 设置初始值
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
