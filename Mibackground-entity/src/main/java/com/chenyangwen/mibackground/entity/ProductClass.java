package com.chenyangwen.mibackground.entity;

//四、商品类别表
public class ProductClass {
    //类别编号 主键
    private int catId;
    //类别名称
    private int catName;

    public int getCatId() {
        return catId;
    }

    public void setCatId(int catId) {
        this.catId = catId;
    }

    public int getCatName() {
        return catName;
    }

    public void setCatName(int catName) {
        this.catName = catName;
    }

    public ProductClass() {
    }

    public ProductClass(int catId, int catName) {
        this.catId = catId;
        this.catName = catName;
    }

    @Override
    public String toString() {
        return "ProductClass{" +
                "catId=" + catId +
                ", catName=" + catName +
                '}';
    }
}
