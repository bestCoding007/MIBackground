package com.chenyangwen.mibackground.service;

import com.chenyangwen.mibackground.entity.Users;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface UsersService {
    /*用户管理分页*/
    List<Users> usersLimit(@Param("uName") String uName,
                           @Param("nickname") String nickname,
                           @Param("userLevel") Integer userLevel,
                           @Param("userTime") Date userTime,
                           @Param("userSex") String userSex,
                           @Param("userAge") String userAge,
                           @Param("userPhone") String userPhone,
                           @Param("userAddress") String userAddress,
                           @Param("userEmail") String userEmail,
                           @Param("pageNo") int pageNo,
                           @Param("pageSize") int pageSize);

    //查询用户名密码是否相同
    int receptionLogin(@Param("uName")String uName,@Param("userPhone")String userPhone, @Param("passWord")String passWord);

    //短信验证注册
    int registerVerify(@Param("userPhone")String userPhone, @Param("passWord")String passWord);

    //用户名注册
    int register(@Param("uName")String uName, @Param("passWord")String passWord);

    //查询confirmAnOrder页面的用户信息
    List<Users> selectUserInfo(String uName);
}
