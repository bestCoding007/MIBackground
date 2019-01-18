package com.chenyangwen.mibackground.entity;

import java.math.BigDecimal;


//六、用户订单表
public class UserOrder {
    //订单编号 主键
    private int orderId;
    //订购人（用户） 外键
    private int userId;
    //订单创建日期
    private String orderTime;
    //订单接收人姓名
    private String orderReName;
    //订单接收地址
    private String orderReAddress;
    //订单邮编
    private String orderEmail;
    //订单人联系方式
    private String orderPhone;
    //订单运送方式
    private String orderAction;
    //订单运费
    private BigDecimal orderMoney;
    //订单总价
    private BigDecimal orderTotalPrice;
    //支付方式
    private String orderPayment;
    //订单状态 未处理0 已处理1 已发货2
    private int statu;

    private String orderName;

    private Integer orderNumber;

    private String orderPhoto;

    private BigDecimal orderPrice;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    public String getOrderReName() {
        return orderReName;
    }

    public void setOrderReName(String orderReName) {
        this.orderReName = orderReName;
    }

    public String getOrderReAddress() {
        return orderReAddress;
    }

    public void setOrderReAddress(String orderReAddress) {
        this.orderReAddress = orderReAddress;
    }

    public String getOrderEmail() {
        return orderEmail;
    }

    public void setOrderEmail(String orderEmail) {
        this.orderEmail = orderEmail;
    }

    public String getOrderPhone() {
        return orderPhone;
    }

    public void setOrderPhone(String orderPhone) {
        this.orderPhone = orderPhone;
    }

    public String getOrderAction() {
        return orderAction;
    }

    public void setOrderAction(String orderAction) {
        this.orderAction = orderAction;
    }

    public BigDecimal getOrderMoney() {
        return orderMoney;
    }

    public void setOrderMoney(BigDecimal orderMoney) {
        this.orderMoney = orderMoney;
    }

    public BigDecimal getOrderTotalPrice() {
        return orderTotalPrice;
    }

    public void setOrderTotalPrice(BigDecimal orderTotalPrice) {
        this.orderTotalPrice = orderTotalPrice;
    }

    public String getOrderPayment() {
        return orderPayment;
    }

    public void setOrderPayment(String orderPayment) {
        this.orderPayment = orderPayment;
    }

    public int getStatu() {
        return statu;
    }

    public void setStatu(int statu) {
        this.statu = statu;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public Integer getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Integer orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getOrderPhoto() {
        return orderPhoto;
    }

    public void setOrderPhoto(String orderPhoto) {
        this.orderPhoto = orderPhoto;
    }

    public BigDecimal getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(BigDecimal orderPrice) {
        this.orderPrice = orderPrice;
    }

    public UserOrder() {
    }

    public UserOrder(int orderId, int userId, String orderTime, String orderReName, String orderReAddress, String orderEmail, String orderPhone, String orderAction, BigDecimal orderMoney, BigDecimal orderTotalPrice, String orderPayment, int statu, String orderName, Integer orderNumber, String orderPhoto, BigDecimal orderPrice) {
        this.orderId = orderId;
        this.userId = userId;
        this.orderTime = orderTime;
        this.orderReName = orderReName;
        this.orderReAddress = orderReAddress;
        this.orderEmail = orderEmail;
        this.orderPhone = orderPhone;
        this.orderAction = orderAction;
        this.orderMoney = orderMoney;
        this.orderTotalPrice = orderTotalPrice;
        this.orderPayment = orderPayment;
        this.statu = statu;
        this.orderName = orderName;
        this.orderNumber = orderNumber;
        this.orderPhoto = orderPhoto;
        this.orderPrice = orderPrice;
    }

    @Override
    public String toString() {
        return "UserOrder{" +
                "orderId=" + orderId +
                ", userId=" + userId +
                ", orderTime=" + orderTime +
                ", orderReName='" + orderReName + '\'' +
                ", orderReAddress='" + orderReAddress + '\'' +
                ", orderEmail='" + orderEmail + '\'' +
                ", orderPhone='" + orderPhone + '\'' +
                ", orderAction='" + orderAction + '\'' +
                ", orderMoney=" + orderMoney +
                ", orderTotalPrice=" + orderTotalPrice +
                ", orderPayment='" + orderPayment + '\'' +
                ", statu=" + statu +
                ", orderName='" + orderName + '\'' +
                ", orderNumber=" + orderNumber +
                ", orderPhoto='" + orderPhoto + '\'' +
                ", orderPrice=" + orderPrice +
                '}';
    }
}
