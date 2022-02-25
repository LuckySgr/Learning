package com.lucky.sgr.aop.dao;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author：LuckySgr.
 * @date: 2022/2/25
 */
public class DaoTest {
    @Test
    public void DaoAllTest() {
        //获取 ApplicationContext 容器
        ApplicationContext context = new ClassPathXmlApplicationContext("aop2-beans.xml");
        //获取代理对象
        UserDao userDao = context.getBean("userAllDao", UserDao.class);
        //获取代理对象
        OrderDao orderDao = context.getBean("orderAllDao", OrderDao.class);
        //调用 UserDao 中的各个方法
        userDao.add();
        userDao.delete();
        userDao.modify();
        userDao.get();
        //调用 OrderDao 中的各个方法
        orderDao.add();
        orderDao.adds();
        orderDao.delete();
        orderDao.get();
        orderDao.modify();
    }

    @Test
    public void DaoAll1Test() {
        //获取 ApplicationContext 容器
        ApplicationContext context = new ClassPathXmlApplicationContext("aop3-beans.xml");
        //获取代理对象
        UserDao userDao = context.getBean("userAll1Dao", UserDao.class);
        //获取代理对象
        OrderDao orderDao = context.getBean("orderAll1Dao", OrderDao.class);
        //调用 UserDao 中的各个方法
        userDao.add();
        userDao.delete();
        userDao.modify();
        userDao.get();
        //调用 OrderDao 中的各个方法
        orderDao.add();
        orderDao.adds();
        orderDao.delete();
        orderDao.get();
        orderDao.modify();
    }
}
