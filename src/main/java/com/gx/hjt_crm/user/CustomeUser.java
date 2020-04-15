package com.gx.hjt_crm.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomeUser {
    private Integer customeId;
    private  String customeName;
    private  String sex;
    private  String address;
    private  String telephone;
    private Date createTime;
    private  Date updateTime;
    private  char isDel;
}
