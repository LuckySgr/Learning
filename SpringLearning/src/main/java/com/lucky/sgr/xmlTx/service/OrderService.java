package com.lucky.sgr.xmlTx.service;

import com.lucky.sgr.xmlTx.entity.Order;

/**
 * @author：LuckySgr.
 * @date: 2022/2/28
 */
public interface OrderService {
    /**
     * 创建订单
     */
    public void createOrder(Order order);
}
