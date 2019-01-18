package com.chenyangwen.mibackground.service.impl;

import com.chenyangwen.mibackground.dao.ProductDao;
import com.chenyangwen.mibackground.entity.Product;
import com.chenyangwen.mibackground.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ProductImpl implements ProductService {

    @Autowired
    ProductDao productDao;

    public List<Product> ProductSelect() {
        return productDao.ProductSelect();
    }

    public List<Product> productLimit(String productName, BigDecimal oldPrice, String productDesc, int pageNo, int pageSize) {
        pageNo=(pageNo-1)*pageSize;
        return productDao.productLimit(productName,oldPrice,productDesc,pageNo,pageSize);
    }

    public int addGoods(Product product) {
        return productDao.addGoods(product);
    }

    public int addPhoto(String productPhoto) {
        return productDao.addPhoto(productPhoto);
    }

    public int deleteByIds(List<Integer> ids) {
        return productDao.deleteByIds(ids);
    }

    public int editProduct(Product product) {
        return productDao.editProduct(product);
    }

    public List<Product> selectProductSize( String productName,
                                            BigDecimal oldPrice,
                                            String productDesc
    ) {
        return productDao.selectProductSize(productName,oldPrice,productDesc);
    }

    public List<Product> receptionProductByPage(int pageNo, int pageSize) {
        return productDao.receptionProductByPage(pageNo,pageSize);
    }

    public Product getProductId(Integer productId) {
        return productDao.getProductId(productId);
    }
}
