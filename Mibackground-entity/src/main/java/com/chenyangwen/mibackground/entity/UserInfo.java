package com.chenyangwen.mibackground.entity;

import java.util.Date;

//二、用户评论信息
public class UserInfo {
    //用户评论编号 主键
    private int userInfoId;
    //用户编号 外键
    private int userId;
    //评论者姓名
    private String uName;
    //评价
    private String userComment;
    //最新评价
    private String userNewComment;
    //商家回复
    private String merchant;
    //评论时间
    private String userTime;

    public int getUserInfoId() {
        return userInfoId;
    }

    public void setUserInfoId(int userInfoId) {
        this.userInfoId = userInfoId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getUserComment() {
        return userComment;
    }

    public void setUserComment(String userComment) {
        this.userComment = userComment;
    }

    public String getUserNewComment() {
        return userNewComment;
    }

    public void setUserNewComment(String userNewComment) {
        this.userNewComment = userNewComment;
    }

    public String getMerchant() {
        return merchant;
    }

    public void setMerchant(String merchant) {
        this.merchant = merchant;
    }

    public String getUserTime() {
        return userTime;
    }

    public void setUserTime(String userTime) {
        this.userTime = userTime;
    }

    public UserInfo() {
    }

    public UserInfo(int userInfoId, int userId, String uName, String userComment, String userNewComment, String merchant, String userTime) {
        this.userInfoId = userInfoId;
        this.userId = userId;
        this.uName = uName;
        this.userComment = userComment;
        this.userNewComment = userNewComment;
        this.merchant = merchant;
        this.userTime = userTime;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "userInfoId=" + userInfoId +
                ", userId=" + userId +
                ", uName='" + uName + '\'' +
                ", userComment='" + userComment + '\'' +
                ", userNewComment='" + userNewComment + '\'' +
                ", merchant='" + merchant + '\'' +
                ", userTime=" + userTime +
                '}';
    }
}
