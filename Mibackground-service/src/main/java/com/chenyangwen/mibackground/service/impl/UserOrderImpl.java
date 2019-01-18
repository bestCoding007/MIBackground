package com.chenyangwen.mibackground.service.impl;

import com.chenyangwen.mibackground.dao.UserOrderDao;
import com.chenyangwen.mibackground.entity.UserOrder;
import com.chenyangwen.mibackground.service.UserOrderService;
import com.chenyangwen.mibackground.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserOrderImpl implements UserOrderService {
    @Autowired
    UserOrderDao userOrderDao;

    public int addToOrder(UserOrder userOrder) {
        return userOrderDao.addToOrder(userOrder);
    }

    public List<UserOrder> getOrder() {
        return userOrderDao.getOrder();
    }

    public int deleteByIds(List<Integer> ids) {
        return userOrderDao.deleteByIds(ids);
    }

    public List<UserOrder> orderLimit( String orderTime, String orderReAddress, String orderPayment, int pageNo, int pageSize) {
        return userOrderDao.orderLimit( orderTime, orderReAddress, orderPayment, pageNo, pageSize);
    }


    public int deleteOrderId(Integer orderId) {
        return userOrderDao.deleteOrderId(orderId);
    }
}
