package com.gx.hjt_crm.Controller;

import com.gx.hjt_crm.mapper.AdminMapper;
import com.gx.hjt_crm.mapper.CustomeMapper;
import com.gx.hjt_crm.user.AdminUser;
import com.gx.hjt_crm.user.CustomeUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
public class CustomeController {

    @Autowired
    private CustomeMapper customeMapper;
    //客户表全查询
    @RequestMapping("/customelist")
    public List<CustomeUser> list(){
        return customeMapper.selectList(null);
    }
    //客户表删除
    @RequestMapping("/customedel")
    public String selectbyid(Integer customeId){
       int a=customeMapper.deleteById(customeId);
        if(a>=1){
            return "删除成功";
        }else {
            return "删除失败";
        }
    }
    //客户表修改
    @RequestMapping("/customeupdate")
    public String update(CustomeUser customeUser){
       int a=customeMapper.updateById(customeUser);
        if (a>=1){
            return "修改成功";
        }else {
            return "修改失败";
        }
    }
    //客户表添加
    @RequestMapping("/customeadd")
    public String selectADD(CustomeUser customeUser){
        customeMapper.insert(customeUser);
        return "添加成功成功";
    }
}
