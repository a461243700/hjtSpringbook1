package com.gx.hjt_crm.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdminUser {
    private Integer adminId;
    private  String adminName;
    private  String password;
    private  String phone;
    private Date createTime;
    private  Date updateTime;
    private  char isDel;
}
