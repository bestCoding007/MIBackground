package com.chenyangwen.mibackground.service;

import com.chenyangwen.mibackground.entity.UserOrder;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserOrderService {
    /*添加*/
    int addToOrder(UserOrder userOrder);

    /*查询订单商品*/
    List<UserOrder> getOrder();

    /*多删除*/
    int deleteByIds(@Param("ids") List<Integer> ids);

    /*订单分页*/
    List<UserOrder> orderLimit(@Param("orderTime") String orderTime,
                               @Param("orderReAddress") String orderReAddress,
                               @Param("orderPayment") String orderPayment,
                               @Param("pageNo") int pageNo,
                               @Param("pageSize") int pageSize
    );

    //删除单条订单
    int deleteOrderId(@Param("orderId") Integer orderId);
}
