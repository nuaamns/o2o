package com.mns.o2o.dao;

import static org.junit.Assert.*;
import java.util.Date;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.mns.o2o.BaseTest;
import com.mns.o2o.entity.Area;
import com.mns.o2o.entity.PersonInfo;
import com.mns.o2o.entity.Shop;
import com.mns.o2o.entity.ShopCategory;

@Ignore
public class ShopDaoTest extends BaseTest {
    @Autowired
    private ShopDao shopDao;

    @Test
    public void testInsertShop() {
        Shop shop = new Shop();
        PersonInfo owner = new PersonInfo();
        Area area = new Area();
        ShopCategory shopCategory = new ShopCategory();
        owner.setUserId(1L);
        area.setAreaId(2);
        shopCategory.setShopCategoryId(1L);
        shop.setArea(area);
        shop.setShopCategory(shopCategory);
        shop.setShopName("test shop");
        shop.setShopDesc("test");
        shop.setShopAddr("test");
        shop.setShopImg("test");
        shop.setCreateTime(new Date());
        shop.setEnableStatus(1);
        shop.setAdvice("审核中");
        int effectedNum = shopDao.insertShop(shop);
        assertEquals(1, effectedNum);
    }

    @Test
    public void testUpdateShop() {
        Shop shop = new Shop();
        shop.setShopId(1L);
        shop.setShopDesc("test---");
        shop.setShopAddr("test---");
        int effectedNum = shopDao.updateShop(shop);
        assertEquals(1, effectedNum);
    }
}