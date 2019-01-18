package com.chenyangwen.mibackground.webui.controller;

import com.chenyangwen.mibackground.common.utils.QcloudSms;
import com.chenyangwen.mibackground.common.utils.R;
import com.chenyangwen.mibackground.service.UsersService;
import org.apache.tools.ant.taskdefs.condition.Http;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Date;

@Controller
@RequestMapping("/users")
public class UsersController {
    @Autowired
    UsersService usersService;

    @ResponseBody
    @RequestMapping("/usersLimit")
    public R usersLimit(String uName, String nickname, Integer userLevel, Date userTime, String userSex, String userAge, String userPhone, String userAddress, String userEmail, @RequestParam(defaultValue = "1") int pageNo, @RequestParam(defaultValue = "5") int pageSize) {
        return R.ok(usersService.usersLimit(uName, nickname, userLevel, userTime, userSex, userAge, userPhone, userAddress, userEmail, pageNo, pageSize));
    }

    /*登录查询账号密码是否匹配*/
    @GetMapping(value = "/receptionLogin", produces = "application/json;charset=utf-8")
    @ResponseBody
    public String receptionLogin(String uName,String userPhone ,String passWord, HttpSession session) {
        int count = usersService.receptionLogin(uName,userPhone,passWord);
        if (count > 0) {
            session.setAttribute("currentUser", uName);
            return "{\"msg\":\"success\"}";
        } else {
            System.out.println("登录失败！");
        }
        return "{\"msg\":\"fail\"}";
    }

    /*从session取到当前用户名*/
    @ResponseBody
    @RequestMapping("/getUserSession")
    public R getUserSession(HttpSession session) {
        String uName = (String) session.getAttribute("currentUser");
        return R.ok(uName);
    }

    /*退出前台登录*/
    @RequestMapping("/backIndex")
    public String backIndex(HttpSession session) {
        session.removeAttribute("currentUser");//清空session信息
        session.invalidate();//清除 session 中的所有信息
        return "MIReception/login";
    }

    //取到短信码
    @ResponseBody
    @RequestMapping("/getCode")
    public R getCode(String phone, HttpSession session) {
        String code = QcloudSms.getCode();//获取随机验证码
        try {
            //调用接口方法，发送短信到手机 --phone接收短信的手机号码
            if (QcloudSms.sendCode(phone, code) == false) {
                session.setAttribute("codePhone", code);//写入session用于验证
                return R.ok("验证码发送成功！");
            } else {
                session.setAttribute("codePhone", 0);//写入session用于验证
                return R.error("验证码发送失败，请稍后重试！");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return R.error("出错了。");
    }

    //短信验证注册
    @ResponseBody
    @RequestMapping("/registerVerify")
    public R registerVerify(String userPhone, String phoneCode, String passWord, HttpSession session) {
        String code = (String) session.getAttribute("codePhone");
        if (code.equals(0)) {
            return R.error("验证码发送失败！");
        }
        if (code.equals(phoneCode)) {
            int count = usersService.registerVerify(userPhone, passWord);
            if (count > 0) {
                return R.ok("注册成功");
            } else {
                return R.error("注册失败");
            }
        } else {
            return R.error("验证码输入错误");
        }
    }

    //用户名注册
    @ResponseBody
    @RequestMapping("/register")
    public R register(String uName,String passWord) {
            int count = usersService.register(uName, passWord);
            if (count > 0) {
                return R.ok("注册成功");
            } else {
                return R.error("注册失败");
            }
    }

    //查询confirmAnOrder页面的用户信息
    @ResponseBody
    @RequestMapping("/getUserInfo")
    public R getUserInfo(String uName){
        return R.ok(usersService.selectUserInfo(uName));
    }
}
