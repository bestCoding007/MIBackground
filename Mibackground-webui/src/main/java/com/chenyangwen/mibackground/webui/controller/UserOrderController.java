package com.chenyangwen.mibackground.webui.controller;

import com.chenyangwen.mibackground.common.utils.R;
import com.chenyangwen.mibackground.common.utils.StringRandom;
import com.chenyangwen.mibackground.entity.UserOrder;
import com.chenyangwen.mibackground.service.UserOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.math.BigDecimal;
import java.util.List;

@Controller
@RequestMapping("/userOrder")
public class UserOrderController {
    @Autowired
    UserOrderService userOrderService;

    //添加商品到购物车中
    @ResponseBody
    @RequestMapping("/addToOrder")
    public R addToOrder(Integer orderId,String orderName,BigDecimal orderPrice,String orderTime,Integer orderNumber,String orderPayment,String orderPhoto,String orderReName,String orderPhone,String orderReAddress) {
        UserOrder userOrder = new UserOrder();
        userOrder.setOrderId(orderId);
        userOrder.setOrderName(orderName);
        userOrder.setOrderPrice(orderPrice);
        userOrder.setOrderTime(orderTime);
        userOrder.setOrderNumber(orderNumber);
        userOrder.setOrderPayment(orderPayment);
        userOrder.setOrderPhoto(orderPhoto);
        userOrder.setOrderReName(orderReName);
        userOrder.setOrderPhone(orderPhone);
        userOrder.setOrderReAddress(orderReAddress);
        return R.ok(userOrderService.addToOrder(userOrder));
    }

    /*查询订单商品总数量*/
    @ResponseBody
    @RequestMapping("/getOrder")
    public R getOrder(){
        return R.ok(userOrderService.getOrder());
    }

    /*订单多删除*/
    @ResponseBody
    @RequestMapping("/deleteByIds")
    public R deleteByIds(@RequestBody List<Integer> ids){
        return R.ok(userOrderService.deleteByIds(ids));
    }

    //商品分页查询
    @ResponseBody
    @RequestMapping("/orderLimit")
    public R orderLimit(@RequestParam(defaultValue ="1") int pageNo,
                               @RequestParam(defaultValue ="10") int pageSize,String orderTime, String orderReAddress, String orderPayment ){
        return  R.ok(userOrderService.orderLimit( orderTime, orderReAddress, orderPayment, pageNo, pageSize));
    }

    /*单条订单删除*/
    @ResponseBody
    @RequestMapping("/deleteOrderId")
    public int deleteOrderId(Integer orderId){
        return userOrderService.deleteOrderId(orderId);
    }
}
