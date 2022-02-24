package com.lucky.sgr.autowire1.controller;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author：LuckySgr.
 * @date: 2022/2/24
 */
public class UserControllerTest {

    @Test
    public void UserController() {
        ApplicationContext context = new ClassPathXmlApplicationContext("autowire1-beans.xml");
        UserController bean = context.getBean("userController", UserController.class);
        bean.doStr();
    }

}