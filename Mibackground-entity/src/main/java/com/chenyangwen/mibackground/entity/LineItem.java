package com.chenyangwen.mibackground.entity;

import java.math.BigDecimal;

//七、（购物车）订单项目信息
public class LineItem {
    //订单项目编号 主键
    private String lineId;
    //用户编号 外键
    private int userId;
    //商品编号 外键
    private int productId;
    //商品名称
    private String productName;
    //订单编号 外键
    private int orderId;
    //商品单价
    private BigDecimal newPrice;
    //商品数量
    private int productNumber;
    //商品总价
    private BigDecimal productCount;
    //订单来源店铺编号 外键
    private int shopId;
    //订单来源卖家编号 外键
    private int orderOtherId;
    //订单项数目
    private int quantity;
    //订单总价
    private BigDecimal unitPrice;
    //商品图片
    private String productPhoto;

    public String getLineId() {
        return lineId;
    }

    public void setLineId(String lineId) {
        this.lineId = lineId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public BigDecimal getNewPrice() {
        return newPrice;
    }

    public void setNewPrice(BigDecimal newPrice) {
        this.newPrice = newPrice;
    }

    public int getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(int productNumber) {
        this.productNumber = productNumber;
    }

    public BigDecimal getProductCount() {
        return productCount;
    }

    public void setProductCount(BigDecimal productCount) {
        this.productCount = productCount;
    }

    public int getShopId() {
        return shopId;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }

    public int getOrderOtherId() {
        return orderOtherId;
    }

    public void setOrderOtherId(int orderOtherId) {
        this.orderOtherId = orderOtherId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getProductPhoto() {
        return productPhoto;
    }

    public void setProductPhoto(String productPhoto) {
        this.productPhoto = productPhoto;
    }

    public LineItem() {
    }

    public LineItem(String lineId, int userId, int productId, String productName, int orderId, BigDecimal newPrice, int productNumber, BigDecimal productCount, int shopId, int orderOtherId, int quantity, BigDecimal unitPrice, String productPhoto) {
        this.lineId = lineId;
        this.userId = userId;
        this.productId = productId;
        this.productName = productName;
        this.orderId = orderId;
        this.newPrice = newPrice;
        this.productNumber = productNumber;
        this.productCount = productCount;
        this.shopId = shopId;
        this.orderOtherId = orderOtherId;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.productPhoto = productPhoto;
    }

    @Override
    public String toString() {
        return "LineItem{" +
                "lineId='" + lineId + '\'' +
                ", userId=" + userId +
                ", productId=" + productId +
                ", productName='" + productName + '\'' +
                ", orderId=" + orderId +
                ", newPrice=" + newPrice +
                ", productNumber=" + productNumber +
                ", productCount=" + productCount +
                ", shopId=" + shopId +
                ", orderOtherId=" + orderOtherId +
                ", quantity=" + quantity +
                ", unitPrice=" + unitPrice +
                ", productPhoto='" + productPhoto + '\'' +
                '}';
    }
}
