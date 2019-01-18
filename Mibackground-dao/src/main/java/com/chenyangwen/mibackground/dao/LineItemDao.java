package com.chenyangwen.mibackground.dao;

import com.chenyangwen.mibackground.entity.LineItem;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;

public interface LineItemDao {
    /*添加*/
    int addToCart(LineItem lineItem);

    /*查询购物车商品*/
    List<LineItem> getLineItem();

    /*购物车文本框*/
    int editNumber(@Param("lineId")String lineId ,@Param("productNumber")Integer productNumber,@Param("productCount") BigDecimal productCount);

    /*多删除*/
    int deleteByIds(@Param("ids") List<String> ids);

    //根据购物车编号获得其他参数
    LineItem getLineItemId(@Param("lineId") String lineId);

    //删除单条购物车数据
    int deleteLineId(@Param("lineId") String lineId);
}
