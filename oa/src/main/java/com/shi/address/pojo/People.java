package com.shi.address.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class People {
    private int id;
    private String name;
    private String unit;
    private String department;
    private String address;
    private String email;
    private String sex;
    private String telephone;
    private String iphone;
    private int uid;
    private String sort;
}
