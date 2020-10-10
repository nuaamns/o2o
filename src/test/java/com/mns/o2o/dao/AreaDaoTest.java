package com.mns.o2o.dao;

import java.util.List;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.mns.o2o.BaseTest;
import com.mns.o2o.entity.Area;

@Ignore
public class AreaDaoTest extends BaseTest {
    @Autowired
    private AreaDao areaDao;

    @Test
    public void testQueryArea() {
        List<Area> areaList = areaDao.queryArea();
        Assert.assertEquals(0, areaList.size());
    }
}