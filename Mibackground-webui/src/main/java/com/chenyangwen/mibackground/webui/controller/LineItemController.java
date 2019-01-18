package com.chenyangwen.mibackground.webui.controller;

import com.chenyangwen.mibackground.common.utils.R;
import com.chenyangwen.mibackground.common.utils.StringRandom;
import com.chenyangwen.mibackground.entity.LineItem;
import com.chenyangwen.mibackground.service.LineItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.math.BigDecimal;
import java.util.List;

@Controller
@RequestMapping("/lineItem")
public class LineItemController {

    @Autowired
    LineItemService lineItemService;

    //添加商品到购物车中
    @ResponseBody
    @RequestMapping("/addToCart")
    public R addToCart(Integer productId,Integer userId,Integer orderId,BigDecimal newPrice,Integer productNumber,BigDecimal productCount,Integer shopId,Integer quantity, BigDecimal unitPrice, String productName,String productPhoto) {
        LineItem lineItem = new LineItem();

        /*随机生成ID*/
        StringRandom ran = new StringRandom();
        String lineId=ran.getStringRandom(10);
        lineItem.setLineId(lineId);
        lineItem.setUserId(userId);
        lineItem.setProductId(productId);
        lineItem.setOrderId(orderId);
        lineItem.setNewPrice(newPrice);
        lineItem.setProductNumber(productNumber);
        lineItem.setProductCount(productCount);
        lineItem.setShopId(shopId);
        lineItem.setQuantity(quantity);
        lineItem.setUnitPrice(unitPrice);
        lineItem.setProductName(productName);
        lineItem.setProductPhoto(productPhoto);
        return R.ok(lineItemService.addToCart(lineItem));
    }

    /*查询商品总数量*/
    @ResponseBody
    @RequestMapping("/getLineItem")
    public R getLineItem(){
        return R.ok(lineItemService.getLineItem());
    }

    /*购物车失去焦点时修改数量*/
    @ResponseBody
    @RequestMapping("/editNumber")
    public int editNumber(String lineId,Integer productNumber,BigDecimal productCount){
        return lineItemService.editNumber(lineId,productNumber,productCount);
    }

    /*商品多删除*/
    @ResponseBody
    @RequestMapping("/deleteByIds")
    public R deleteByIds(@RequestBody List<String> ids){
        return R.ok(lineItemService.deleteByIds(ids));
    }

    @ResponseBody
    @RequestMapping("/getLineItemId")
    public R getLineItemId(String lineId){
        return R.ok(lineItemService.getLineItemId(lineId));
    }

    /*单条订单删除*/
    @ResponseBody
    @RequestMapping("/deleteLineId")
    public int deleteLineId(String lineId){
        return lineItemService.deleteLineId(lineId);
    }
}
