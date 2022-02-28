package com.lucky.sgr.xmlTx.dao;

import com.lucky.sgr.xmlTx.entity.Order;

/**
 * @author：LuckySgr.
 * @date: 2022/2/28
 */
public interface OrderDao {
    /**
     * 创建订单
     */
    int createOrder(Order order);
    /**
     * 修改订单状态
     * 将订单状态从未完成（0）修改为已完成（1）
     */
    void updateOrderStatus(String orderId, Integer status);

}
