package com.chenyangwen.mibackground.service.impl;

import com.chenyangwen.mibackground.common.utils.MD5Util;
import com.chenyangwen.mibackground.dao.UsersDao;
import com.chenyangwen.mibackground.entity.Users;
import com.chenyangwen.mibackground.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class UsersImpl implements UsersService {
    @Autowired
    UsersDao usersDao;

    public List<Users> usersLimit(String uName, String nickname, Integer userLevel, Date userTime, String userSex, String userAge, String userPhone, String userAddress, String userEmail, int pageNo, int pageSize) {
        pageNo=(pageNo-1)*pageSize;
        return usersDao.usersLimit(uName,nickname,userLevel,userTime,userSex,userAge,userPhone,userAddress,userEmail,pageNo,pageSize);
    }

    public int receptionLogin(String uName, String userPhone, String passWord) {
        return usersDao.receptionLogin(uName,userPhone,MD5Util.md5(passWord));
    }

    public int registerVerify(String userPhone, String passWord) {
        return usersDao.registerVerify(userPhone, MD5Util.md5(passWord));
    }

    public int register(String uName, String passWord) {
        return usersDao.register(uName, MD5Util.md5(passWord));
    }

    public List<Users> selectUserInfo(String uName) {
        return usersDao.selectUserInfo(uName);
    }
}
