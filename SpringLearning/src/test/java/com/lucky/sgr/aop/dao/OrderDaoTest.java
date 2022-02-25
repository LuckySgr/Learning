package com.lucky.sgr.aop.dao;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author：LuckySgr.
 * @date: 2022/2/25
 */
public class OrderDaoTest {
    @Test
    public void OrderDao() {
        //获取 ApplicationContext 容器
        ApplicationContext context = new ClassPathXmlApplicationContext("aop1-beans.xml");
        //获取代理对象
        OrderDao orderDao = context.getBean("orderDaoProxy", OrderDao.class);
        //调用 OrderDao 中的各个方法
        orderDao.add();
        orderDao.adds();
        orderDao.delete();
        orderDao.get();
        orderDao.modify();
    }

}