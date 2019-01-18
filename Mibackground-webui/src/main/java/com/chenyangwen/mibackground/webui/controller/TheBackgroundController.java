package com.chenyangwen.mibackground.webui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/background")
public class TheBackgroundController {

    /*打开后台页面*/
    @RequestMapping("/theBackground")
    public String getUserIndex(HttpSession session){
        String admin = (String) session.getAttribute("admin");
        if(admin == null){
            return "adminLogin/login";
        }else{
            return "theBackground/admin-table";
        }
    }

    /*打开评论页*/
    @RequestMapping("/comment")
    public String getComment(HttpSession session){
        String admin = (String) session.getAttribute("admin");
        if(admin == null){
            return "adminLogin/login";
        }else{
            return "theBackground/admin-comment-manage";
        }
    }

    /*打开重置密码页*/
    @RequestMapping("/reset")
    public String getReset(HttpSession session){
        String admin = (String) session.getAttribute("admin");
        if(admin == null){
            return "adminLogin/login";
        }else{
            return "theBackground/admin-reset";
        }
    }

    /*打开用户查询页*/
    @RequestMapping("/UsersManage")
    public String getUsersManage(HttpSession session){
        String admin = (String) session.getAttribute("admin");
        if(admin == null){
            return "adminLogin/login";
        }else{
            return "theBackground/admin-user-manage";
        }
    }

    /*退出后台管理系统*/
    @RequestMapping("/safetyOFF")
    public String safetyOFF(HttpSession session){
        session.removeAttribute("admin");//清空session信息
        session.invalidate();//清除 session 中的所有信息
        return "adminLogin/login";
    }

    /*打开添加管理员页面*/
    @RequestMapping("/addUser")
    public String addUser(HttpSession session){
        String admin = (String) session.getAttribute("admin");
        if(admin == null){
            return "adminLogin/login";
        }else{
            return "theBackground/admin-add-user";
        }
    }

    /*打开商品录入页面*/
    @RequestMapping("/goodsEntry")
    public String goodsEntry(HttpSession session){
        String admin = (String) session.getAttribute("admin");
        if(admin == null){
            return "adminLogin/login";
        }else{
            return "theBackground/admin-goods-entry";
        }
    }

    /*打开评论页*/
    @RequestMapping("/order")
    public String getOrder(HttpSession session){
        String admin = (String) session.getAttribute("admin");
        if(admin == null){
            return "adminLogin/login";
        }else{
            return "theBackground/admin-order-manage";
        }
    }
}
