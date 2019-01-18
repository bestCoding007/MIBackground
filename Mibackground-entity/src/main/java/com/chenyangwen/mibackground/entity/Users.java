package com.chenyangwen.mibackground.entity;
//一、用户表
public class Users {
    //用户编号 主键
    private int userId;
    //姓名
    private String uName;
    //密码
    private String passWord;
    //用户级别
    private int userLevel;
    //注册时间
    private String userTime;
    //年龄
    private String userSex;
    //性别
    private String userAge;
    //手机
    private String userPhone;
    //地址
    private String userAddress;
    //邮箱
    private String userEmail;
    //照片
    private String userPhoto;
    //昵称
    private String nickname;

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

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public int getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(int userLevel) {
        this.userLevel = userLevel;
    }

    public String getUserTime() {
        return userTime;
    }

    public void setUserTime(String userTime) {
        this.userTime = userTime;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getUserAge() {
        return userAge;
    }

    public void setUserAge(String userAge) {
        this.userAge = userAge;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPhoto() {
        return userPhoto;
    }

    public void setUserPhoto(String userPhoto) {
        this.userPhoto = userPhoto;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Users() {
    }

    public Users(int userId, String uName, String passWord, int userLevel, String userTime, String userSex, String userAge, String userPhone, String userAddress, String userEmail, String userPhoto, String nickname) {
        this.userId = userId;
        this.uName = uName;
        this.passWord = passWord;
        this.userLevel = userLevel;
        this.userTime = userTime;
        this.userSex = userSex;
        this.userAge = userAge;
        this.userPhone = userPhone;
        this.userAddress = userAddress;
        this.userEmail = userEmail;
        this.userPhoto = userPhoto;
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "Users{" +
                "userId=" + userId +
                ", uName='" + uName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", userLevel=" + userLevel +
                ", userTime='" + userTime + '\'' +
                ", userSex='" + userSex + '\'' +
                ", userAge='" + userAge + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", userAddress='" + userAddress + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userPhoto='" + userPhoto + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}
