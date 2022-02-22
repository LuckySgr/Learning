package com.lucky.sgr.scope;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * @author：LuckySgr.
 * @date: 2022/2/22
 */
public class PrototypeBeanTest {

    @Test
    public void PrototypeBean() {
        ApplicationContext context = new ClassPathXmlApplicationContext("prototype-beans.xml");
        PrototypeBean prototypeBean1 = context.getBean("prototypeBean", PrototypeBean.class);
        PrototypeBean prototypeBean2 = context.getBean("prototypeBean", PrototypeBean.class);
        System.out.println(prototypeBean1);
        System.out.println(prototypeBean2);
    }

}