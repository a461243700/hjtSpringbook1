package com.gx.hjt_crm.user;

        import lombok.AllArgsConstructor;
        import lombok.Data;
        import lombok.NoArgsConstructor;

        import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrdersUser {
    private Integer ordersId;
    private  Date ordersTime;
    private  Integer customerId;
    private  double prices;
    private Date createTime;
    private  Date updateTime;
    private  char isDel;
}
