/*
 *                  C O P Y R I G H T  (c) 2020
 *     A G F A   H E A L T H C A R E   C O R P O R A T I O N
 *                     All Rights Reserved
 *
 *
 *         THIS IS UNPUBLISHED PROPRIETARY SOURCE CODE OF
 *                       AGFA CORPORATION
 *        The copyright notice above does not evidence any
 *       actual or intended publication of such source code.
 */
package com.mns.o2o.service;

import java.io.File;

import com.mns.o2o.dto.ShopExecution;
import com.mns.o2o.entity.Shop;

public interface ShopService {
    ShopExecution addShop(Shop shop, File shopImg);
}