package com.chenyangwen.mibackground.webui.controller;

import com.chenyangwen.mibackground.common.utils.MD5Util;
import com.chenyangwen.mibackground.common.utils.R;
import com.chenyangwen.mibackground.entity.Administrator;
import com.chenyangwen.mibackground.service.AdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/administrator")
public class AdministratorController {

    @Autowired
    AdministratorService administratorService;

    /*打开登录页面*/
    @RequestMapping("/login")
    public String login(){
        return "adminLogin/login";
    }

    /*登录查询账号密码是否匹配*/
    @GetMapping(value = "/loginSelect",produces = "application/json;charset=utf-8")
    @ResponseBody
    public String loginSelect(String administratorUsername, String administratorPassword, HttpSession session){
        int count=administratorService.loginSelect(administratorUsername,administratorPassword);
        if(count>0){
            session.setAttribute("admin",administratorUsername);
            return "{\"msg\":\"success\"}";
        }else {
            System.out.println("登录失败！");
        }
        return "{\"msg\":\"fail\"}";
    }

    //修改昵称、密码
    @ResponseBody
    @RequestMapping("/edit")
    public R editAdministrator(String administratorUsername,String administratorPassword,String administratorNewPassword){
        Administrator administrator  = new Administrator();
        administrator.setAdministratorUsername(administratorUsername);
        String md = MD5Util.md5(administratorPassword);
        administrator.setAdministratorPassword(md);
        String md2 = MD5Util.md5(administratorNewPassword);
        administrator.setAdministratorNewPassword(md2);
        return R.ok(administratorService.editAdministrator(administrator));
    }

    /*添加后台管理员*/
    @ResponseBody
    @RequestMapping("/addAdministrator")
    public R addAdministrator(String administratorUsername,String administratorPassword,String administratorNewPassword,String administratorName){
        Administrator administrator  = new Administrator();
        administrator.setAdministratorUsername(administratorUsername);
        String md = MD5Util.md5(administratorPassword);
        administrator.setAdministratorPassword(md);
        String md2 = MD5Util.md5(administratorNewPassword);
        administrator.setAdministratorNewPassword(md2);
        administrator.setAdministratorName(administratorName);
        return R.ok(administratorService.addAdministrator(administrator));
    }

    //初始化密码
    @ResponseBody
    @RequestMapping("/initPassword")
    public R initPassword(HttpSession session,String administratorPassword,String administratorNewPassword){
        String admin = (String) session.getAttribute("admin");
        Administrator administrator  = new Administrator();
        administrator.setAdministratorUsername(admin);
        String md = MD5Util.md5(administratorPassword);
        administrator.setAdministratorPassword(md);
        String md2 = MD5Util.md5(administratorNewPassword);
        administrator.setAdministratorNewPassword(md2);
        return R.ok(administratorService.editAdministrator(administrator));
    }
}
