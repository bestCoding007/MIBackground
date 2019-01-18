package com.chenyangwen.mibackground.webui.controller.reception;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/reception")
public class ReceptionController {
    /*打开前台登录页面*/
    @RequestMapping("/login")
    public String ReceptionLogin(){
        return "MIReception/login";
    }

    /*打开前台短信注册页面*/
    @RequestMapping("/registerVerify")
    public String ReceptionRegisterVerify(){
        return "MIReception/registerVerify";
    }

    /*打开前台注册页面*/
    @RequestMapping("/register")
    public String ReceptionRegister(){
        return "MIReception/register";
    }

    /*打开主页*/
    @RequestMapping("/MIIndex")
    public String MIIndex(){return  "MIReception/index";}

    /*打开商品详情页*/
    @RequestMapping("/productDescription")
    public String productDescription(){return "MIReception/product_Description";}

    /*打开addToCart页*/
    @RequestMapping("/addToCart")
    public String addToCart(){return "MIReception/addToCart";}

    /*打开productCart页*/
    @RequestMapping("/productCart")
    public String productCart(){return "MIReception/productCart";}

    /*打开confirmAnOrder页*/
    @RequestMapping("/confirmAnOrder")
    public String confirmAnOrder(){return "MIReception/confirmAnOrder";}

    /*打开buySuccess页*/
    @RequestMapping("/buySuccess")
    public String buySuccess(){return "MIReception/buySuccess";}

    /*打开orderManagement页*/
    @RequestMapping("/orderManagement")
    public String orderManagement(){return "MIReception/orderManagement";}

    //打开手机列表的页面
    @RequestMapping("/allPhoneList")
    public String allPhoneList(){
        return "MIReception/allPhoneList";
    }
}
