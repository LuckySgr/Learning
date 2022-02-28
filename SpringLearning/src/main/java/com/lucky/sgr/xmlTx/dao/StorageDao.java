package com.lucky.sgr.xmlTx.dao;

import com.lucky.sgr.xmlTx.entity.Storage;

/**
 * @author：LuckySgr.
 * @date: 2022/2/28
 */
public interface StorageDao {
    /**
     * 查询商品的库存
     */
    Storage selectByProductId(String productId);
    /**
     * 扣减商品库存
     */
    int decrease(Storage record);
}
