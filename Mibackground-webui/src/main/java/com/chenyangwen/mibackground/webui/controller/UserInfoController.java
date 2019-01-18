package com.chenyangwen.mibackground.webui.controller;

import com.chenyangwen.mibackground.common.utils.R;
import com.chenyangwen.mibackground.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/userInfo")
public class UserInfoController {
    @Autowired
    UserInfoService userInfoService;

    //评论分页查询
    @ResponseBody
    @RequestMapping("/loginSelectLimit")
    public R findProductByPage(@RequestParam(defaultValue ="1") int pageNo,
                               @RequestParam(defaultValue ="1") int pageSize,
                               Integer userInfoId, Integer userId,String uName,
                               String userComment,String userNewComment,
                               String userTime,String merchant){
        return  R.ok(userInfoService.commentLimit(userInfoId,userId,uName,userComment,userNewComment,userTime,merchant,pageNo,pageSize));
    }

    /*多删除*/
    @ResponseBody
    @RequestMapping("/deleteByIds")
    public R deleteByIds(@RequestBody List<String> ids){
        return R.ok(userInfoService.deleteByIds(ids));
    }
}
