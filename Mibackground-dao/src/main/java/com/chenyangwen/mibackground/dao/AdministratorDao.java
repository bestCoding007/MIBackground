package com.chenyangwen.mibackground.dao;

import com.chenyangwen.mibackground.entity.Administrator;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AdministratorDao {
    //查询所有管理员
    List<Administrator> getAllAdministrators(Administrator administrator);

    //添加管理员
    int addAdministrator(Administrator administrator);

    //修改昵称、密码
    int editAdministrator(Administrator administrator);

    //查询用户名密码是否相同
    int loginSelect(@Param("administratorUsername")String administratorUsername, @Param("administratorPassword")String administratorPassword);

    //初始化密码
    int initPassword(Administrator administrator);
}
