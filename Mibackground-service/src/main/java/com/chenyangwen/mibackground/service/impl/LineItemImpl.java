package com.chenyangwen.mibackground.service.impl;

import com.chenyangwen.mibackground.dao.LineItemDao;
import com.chenyangwen.mibackground.entity.LineItem;
import com.chenyangwen.mibackground.service.LineItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class LineItemImpl implements LineItemService {

    @Autowired
    LineItemDao lineItemDao;

    public int addToCart(LineItem lineItem) {
        return lineItemDao.addToCart(lineItem);
    }

    public List<LineItem> getLineItem() {
        return lineItemDao.getLineItem();
    }

    public int editNumber(String lineId, Integer productNumber, BigDecimal productCount) {
        return lineItemDao.editNumber(lineId,productNumber,productCount);
    }

    public int deleteByIds(List<String> ids) {
        return lineItemDao.deleteByIds(ids);
    }

    public LineItem getLineItemId(String lineId) {
        return lineItemDao.getLineItemId(lineId);
    }

    public int deleteLineId(String lineId) {
        return lineItemDao.deleteLineId(lineId);
    }
}
