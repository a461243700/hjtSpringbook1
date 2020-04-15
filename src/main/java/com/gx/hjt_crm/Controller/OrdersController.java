package com.gx.hjt_crm.Controller;

import com.gx.hjt_crm.mapper.OrdersMapper;
import com.gx.hjt_crm.user.AdminUser;
import com.gx.hjt_crm.user.OrdersUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class OrdersController {
    @Autowired
    private OrdersMapper ordersMapper;
    //管理员全查询
    @RequestMapping("/Orderslist")
    public List<OrdersUser> list(){
        return ordersMapper.selectList(null);
    }
}
