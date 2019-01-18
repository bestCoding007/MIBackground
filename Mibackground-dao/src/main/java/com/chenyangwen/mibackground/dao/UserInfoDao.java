package com.chenyangwen.mibackground.dao;

import com.chenyangwen.mibackground.entity.UserInfo;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface UserInfoDao {
    /*分页*/
    List<UserInfo> commentLimit(@Param("userInfoId") Integer userInfoId,
                                    @Param("userId") Integer userId,
                                    @Param("uName") String uName,
                                    @Param("userComment") String userComment,
                                    @Param("userNewComment") String userNewComment,
                                    @Param("userTime") String userTime,
                                    @Param("merchant") String merchant,
                                    @Param("pageNo") int pageNo,
                                    @Param("pageSize")int pageSize);

    /*多删除*/
    int deleteByIds(@Param("ids") List<String> ids);
}
