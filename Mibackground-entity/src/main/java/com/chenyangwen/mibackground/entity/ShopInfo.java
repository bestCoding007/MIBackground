package com.chenyangwen.mibackground.entity;
//五、店面信息表
public class ShopInfo {
    //店面编号 主键
    private int shopId;
    //店面名字
    private String shopName;
    //用户编号 外键
    private int userId;
    //评论者姓名
    private String uName;
    //用户评价
    private String userComment;
    //商家回复
    private String merchant;
    //店面地址
    private String shopAddress;

    public int getShopId() {
        return shopId;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
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

    public String getMerchant() {
        return merchant;
    }

    public void setMerchant(String merchant) {
        this.merchant = merchant;
    }

    public String getShopAddress() {
        return shopAddress;
    }

    public void setShopAddress(String shopAddress) {
        this.shopAddress = shopAddress;
    }

    public ShopInfo() {
    }

    public ShopInfo(int shopId, String shopName, int userId, String uName, String userComment, String merchant, String shopAddress) {
        this.shopId = shopId;
        this.shopName = shopName;
        this.userId = userId;
        this.uName = uName;
        this.userComment = userComment;
        this.merchant = merchant;
        this.shopAddress = shopAddress;
    }

    @Override
    public String toString() {
        return "ShopInfo{" +
                "shopId=" + shopId +
                ", shopName='" + shopName + '\'' +
                ", userId=" + userId +
                ", uName='" + uName + '\'' +
                ", userComment='" + userComment + '\'' +
                ", merchant='" + merchant + '\'' +
                ", shopAddress='" + shopAddress + '\'' +
                '}';
    }
}
