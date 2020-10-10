package com.mns.o2o.dao;

import com.mns.o2o.entity.Shop;

public interface ShopDao {
    /**
     * 新增
     * @param shop
     * @return
     */
    int insertShop(Shop shop);

    int updateShop(Shop shop);
}