package com.chenyangwen.mibackground.entity;

import java.math.BigDecimal;

//三、商品表
public class Product {
    //商品编号 主键
    private int productId;
    //商品类别编号 外键
    private int catId;
    //商品名称
    private String productName;
    //市场价格
    private BigDecimal oldPrice;
    //图片
    private String productPhoto;
    //商品简介
    private String productDesc;
    //库存量
    private int productCount;
    //店面编号 外键
    private int shopId;
    //颜色
    private String productColor;
    //是否新品
    private int isNewProduct;
    //是否热门
    private int isHotProduct;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getCatId() {
        return catId;
    }

    public void setCatId(int catId) {
        this.catId = catId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public BigDecimal getOldPrice() {
        return oldPrice;
    }

    public void setOldPrice(BigDecimal oldPrice) {
        this.oldPrice = oldPrice;
    }

    public String getProductPhoto() {
        return productPhoto;
    }

    public void setProductPhoto(String productPhoto) {
        this.productPhoto = productPhoto;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public int getProductCount() {
        return productCount;
    }

    public void setProductCount(int productCount) {
        this.productCount = productCount;
    }

    public int getShopId() {
        return shopId;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }

    public String getProductColor() {
        return productColor;
    }

    public void setProductColor(String productColor) {
        this.productColor = productColor;
    }

    public int getIsNewProduct() {
        return isNewProduct;
    }

    public void setIsNewProduct(int isNewProduct) {
        this.isNewProduct = isNewProduct;
    }

    public int getIsHotProduct() {
        return isHotProduct;
    }

    public void setIsHotProduct(int isHotProduct) {
        this.isHotProduct = isHotProduct;
    }

    public Product() {
    }

    public Product(int productId, int catId, String productName, BigDecimal oldPrice, String productPhoto, String productDesc, int productCount, int shopId, String productColor, int isNewProduct, int isHotProduct) {
        this.productId = productId;
        this.catId = catId;
        this.productName = productName;
        this.oldPrice = oldPrice;
        this.productPhoto = productPhoto;
        this.productDesc = productDesc;
        this.productCount = productCount;
        this.shopId = shopId;
        this.productColor = productColor;
        this.isNewProduct = isNewProduct;
        this.isHotProduct = isHotProduct;
    }

    public Product( int catId, String productName, BigDecimal oldPrice, String productPhoto, String productDesc, int productCount, int shopId, String productColor, int isNewProduct, int isHotProduct) {
        this.catId = catId;
        this.productName = productName;
        this.oldPrice = oldPrice;
        this.productPhoto = productPhoto;
        this.productDesc = productDesc;
        this.productCount = productCount;
        this.shopId = shopId;
        this.productColor = productColor;
        this.isNewProduct = isNewProduct;
        this.isHotProduct = isHotProduct;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", catId=" + catId +
                ", productName='" + productName + '\'' +
                ", oldPrice=" + oldPrice +
                ", productPhoto='" + productPhoto + '\'' +
                ", productDesc='" + productDesc + '\'' +
                ", productCount=" + productCount +
                ", shopId=" + shopId +
                ", productColor='" + productColor + '\'' +
                ", isNewProduct=" + isNewProduct +
                ", isHotProduct=" + isHotProduct +
                '}';
    }
}
