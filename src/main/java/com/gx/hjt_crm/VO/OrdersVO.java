package com.gx.hjt_crm.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrdersVO {
    private Integer ordersId;
    private Date ordersTime;
    private  String customeName;
    private  Integer customerId;
    private  double prices;
    private Date createTime;
    private  Date updateTime;
    private  char isDel;
}
