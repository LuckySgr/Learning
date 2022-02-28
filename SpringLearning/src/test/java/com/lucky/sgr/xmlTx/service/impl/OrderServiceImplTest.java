package com.lucky.sgr.xmlTx.service.impl;

import com.lucky.sgr.xmlTx.entity.Order;
import com.lucky.sgr.xmlTx.service.OrderService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.math.BigDecimal;

/**
 * @author：LuckySgr.
 * @date: 2022/2/28
 */
public class OrderServiceImplTest {

    @Test
    public void OrderService() {
        ApplicationContext context = new ClassPathXmlApplicationContext("tx-beans.xml");
        OrderService orderService = context.getBean("orderService", OrderService.class);
        Order order = new Order();
        //设置商品 id
        order.setProductId("1");
        //商品数量为 30
        order.setCount(30);
        //商品金额为 600
        order.setMoney(new BigDecimal(600));
        //设置用户 id
        order.setUserId("1");
        //订单状态为未完成
        order.setStatus(0);
        orderService.createOrder(order);
    }

}