package com.chenyangwen.mibackground.service.impl;

import com.chenyangwen.mibackground.dao.UserInfoDao;
import com.chenyangwen.mibackground.entity.UserInfo;
import com.chenyangwen.mibackground.service.UserInfoService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class UserInfoImpl implements UserInfoService {

    @Autowired
    UserInfoDao userInfoDao;
    public List<UserInfo> commentLimit(Integer userInfoId, Integer userId, String uName, String userComment, String userNewComment, String userTime, String merchant, int pageNo, int pageSize) {
        pageNo=(pageNo-1)*pageSize;
        return userInfoDao.commentLimit(userInfoId,userId,uName,userComment,userNewComment,userTime,merchant,pageNo,pageSize);
    }

    public int deleteByIds(List<String> ids) {
        return userInfoDao.deleteByIds(ids);
    }
}
