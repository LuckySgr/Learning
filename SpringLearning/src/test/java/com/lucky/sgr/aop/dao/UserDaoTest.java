package com.lucky.sgr.aop.dao;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author：LuckySgr.
 * @date: 2022/2/25
 */
public class UserDaoTest {

    @Test
    public void UserDao() {
        //获取 ApplicationContext 容器
        ApplicationContext context = new ClassPathXmlApplicationContext("aop-beans.xml");
        //获取代理对象
        UserDao userDao = context.getBean("userDaoProxy", UserDao.class);
        //调用 UserDao 中的各个方法
        userDao.add();
        userDao.delete();
        userDao.get();
        userDao.modify();
    }

}