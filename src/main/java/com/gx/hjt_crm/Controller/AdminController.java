package com.gx.hjt_crm.Controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gx.hjt_crm.mapper.AdminMapper;
import com.gx.hjt_crm.user.AdminUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class AdminController {

    @Autowired
    private AdminMapper adminMapper;
//管理员全查询
    @RequestMapping("/adminlist")
    public List<AdminUser> list(){
        return adminMapper.selectList(null);
    }
    //管理员登陆系统
    @RequestMapping("/adminbyid")
    public String selectbyid(AdminUser adminUser){
        QueryWrapper<AdminUser> queryWrapper=new QueryWrapper<>();
        queryWrapper.lambda().eq(AdminUser::getAdminName,adminUser.getAdminName());
        queryWrapper.lambda().eq(AdminUser::getPassword,adminUser.getPassword());
        AdminUser admin= adminMapper.selectOne(queryWrapper);
        if(admin!=null){
            return "登录成功";
        }else{
            return "登录失败";
        }
    }

}
