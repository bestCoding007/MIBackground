package com.chenyangwen.mibackground.entity;

import java.math.BigDecimal;
import java.util.Date;

//八、用户支付信息
public class userMoneyInfo {
    //用户支付编号 主键
    private int userMoneyId;
    //用户编号（买家） 外键
    private int userId;
    //支付方式 外键
    private String orderPayment;
    //订单总价
    private BigDecimal orderTotalPrice;
    //支付总价
    private BigDecimal payMoney;
    //支付时间
    private Date payTime;
    //订单来源卖家编号 外键
    private int orderOtherId;

    public int getUserMoneyId() {
        return userMoneyId;
    }

    public void setUserMoneyId(int userMoneyId) {
        this.userMoneyId = userMoneyId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getOrderPayment() {
        return orderPayment;
    }

    public void setOrderPayment(String orderPayment) {
        this.orderPayment = orderPayment;
    }

    public BigDecimal getOrderTotalPrice() {
        return orderTotalPrice;
    }

    public void setOrderTotalPrice(BigDecimal orderTotalPrice) {
        this.orderTotalPrice = orderTotalPrice;
    }

    public BigDecimal getPayMoney() {
        return payMoney;
    }

    public void setPayMoney(BigDecimal payMoney) {
        this.payMoney = payMoney;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public int getOrderOtherId() {
        return orderOtherId;
    }

    public void setOrderOtherId(int orderOtherId) {
        this.orderOtherId = orderOtherId;
    }

    public userMoneyInfo() {
    }

    public userMoneyInfo(int userMoneyId, int userId, String orderPayment, BigDecimal orderTotalPrice, BigDecimal payMoney, Date payTime, int orderOtherId) {
        this.userMoneyId = userMoneyId;
        this.userId = userId;
        this.orderPayment = orderPayment;
        this.orderTotalPrice = orderTotalPrice;
        this.payMoney = payMoney;
        this.payTime = payTime;
        this.orderOtherId = orderOtherId;
    }

    @Override
    public String toString() {
        return "userMoneyInfo{" +
                "userMoneyId=" + userMoneyId +
                ", userId=" + userId +
                ", orderPayment='" + orderPayment + '\'' +
                ", orderTotalPrice=" + orderTotalPrice +
                ", payMoney=" + payMoney +
                ", payTime=" + payTime +
                ", orderOtherId=" + orderOtherId +
                '}';
    }
}
