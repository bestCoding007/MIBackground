package com.chenyangwen.mibackground.dao;

import com.chenyangwen.mibackground.entity.Product;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;

public interface ProductDao {
    /*查询所有商品*/
    List<Product> ProductSelect();

    /*商品分页*/
    List<Product> productLimit(@Param("productName") String productName,
                               @Param("oldPrice") BigDecimal oldPrice,
                               @Param("productDesc") String productDesc,
                               @Param("pageNo") int pageNo,
                               @Param("pageSize") int pageSize
    );

    /*商品录入*/
    int addGoods(Product product);

    /*添加图片*/
    int addPhoto(@Param("productPhoto") String productPhoto);

    /*多删除*/
    int deleteByIds(@Param("ids") List<Integer> ids);

    /*修改商品信息*/
    int editProduct(Product product);

    /*查询商品数量*/
    List<Product> selectProductSize(@Param("productName") String productName,
                                    @Param("oldPrice") BigDecimal oldPrice,
                                    @Param("productDesc") String productDesc);

    /*前台查询手机类别数据*/
    List<Product> receptionProductByPage(@Param("pageNo") int pageNo,
                               @Param("pageSize") int pageSize
    );

    /*根据商品编号获得其他参数*/
    Product getProductId(@Param("productId") Integer productId);
}
