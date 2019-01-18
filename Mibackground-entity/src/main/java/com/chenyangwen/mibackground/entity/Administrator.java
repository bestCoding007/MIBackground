package com.chenyangwen.mibackground.entity;

//后台 九、管理员
public class Administrator {
    //编号 主键
    private int administratorId;
    //姓名
    private String administratorName;
    //用户名
    private String administratorUsername;
    //密码
    private String administratorPassword;
    //确认密码
    private String administratorNewPassword;
    //用户头像
    private String administratorPhoto;

    public int getAdministratorId() {
        return administratorId;
    }

    public void setAdministratorId(int administratorId) {
        this.administratorId = administratorId;
    }

    public String getAdministratorName() {
        return administratorName;
    }

    public void setAdministratorName(String administratorName) {
        this.administratorName = administratorName;
    }

    public String getAdministratorUsername() {
        return administratorUsername;
    }

    public void setAdministratorUsername(String administratorUsername) {
        this.administratorUsername = administratorUsername;
    }

    public String getAdministratorPassword() {
        return administratorPassword;
    }

    public void setAdministratorPassword(String administratorPassword) {
        this.administratorPassword = administratorPassword;
    }

    public String getAdministratorNewPassword() {
        return administratorNewPassword;
    }

    public void setAdministratorNewPassword(String administratorNewPassword) {
        this.administratorNewPassword = administratorNewPassword;
    }

    public String getAdministratorPhoto() {
        return administratorPhoto;
    }

    public void setAdministratorPhoto(String administratorPhoto) {
        this.administratorPhoto = administratorPhoto;
    }

    public Administrator() {
    }

    public Administrator( String administratorUsername, String administratorPassword, String administratorNewPassword,String administratorName) {
        this.administratorUsername = administratorUsername;
        this.administratorPassword = administratorPassword;
        this.administratorNewPassword = administratorNewPassword;
        this.administratorName = administratorName;
    }

    public Administrator(int administratorId, String administratorName, String administratorUsername, String administratorPassword, String administratorNewPassword, String administratorPhoto) {
        this.administratorId = administratorId;
        this.administratorName = administratorName;
        this.administratorUsername = administratorUsername;
        this.administratorPassword = administratorPassword;
        this.administratorNewPassword = administratorNewPassword;
        this.administratorPhoto = administratorPhoto;
    }

    @Override
    public String toString() {
        return "Administrator{" +
                "administratorId=" + administratorId +
                ", administratorName='" + administratorName + '\'' +
                ", administratorUsername='" + administratorUsername + '\'' +
                ", administratorPassword='" + administratorPassword + '\'' +
                ", administratorNewPassword='" + administratorNewPassword + '\'' +
                ", administratorPhoto='" + administratorPhoto + '\'' +
                '}';
    }
}
