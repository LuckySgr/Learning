package com.lucky.sgr.scope;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * @author：LuckySgr.
 * @date: 2022/2/22
 */
public class SingletonBeanTest {

    @Test
    public void SingletonBean() {
        ApplicationContext context = new ClassPathXmlApplicationContext("singleton-beans.xml");
        SingletonBean singletonBean1 = context.getBean("singletonBean", SingletonBean.class);
        SingletonBean singletonBean2 = context.getBean("singletonBean", SingletonBean.class);
        System.out.println(singletonBean1);
        System.out.println(singletonBean2);
    }

}