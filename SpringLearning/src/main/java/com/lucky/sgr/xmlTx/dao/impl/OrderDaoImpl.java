package com.lucky.sgr.xmlTx.dao.impl;

import com.lucky.sgr.xmlTx.dao.OrderDao;
import com.lucky.sgr.xmlTx.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author：LuckySgr.
 * @date: 2022/2/28
 */
@Repository
public class OrderDaoImpl implements OrderDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int createOrder(Order order) {
        String sql = "insert into tx_test.`order` (order_id, user_id, product_id, count, money, status) VALUE (?, ?, ?, ?, ?, ?)";
        int update = jdbcTemplate.update(sql, order.getOrderId(), order.getUserId(), order.getProductId(), order.getCount(), order.getMoney(), order.getStatus());
        return update;
    }

    @Override
    public void updateOrderStatus(String orderId, Integer status) {
        String sql = "update tx_test.`order`  set status = 1 where order_id = ? and status = ?";
        jdbcTemplate.update(sql, orderId, status);
    }
}
