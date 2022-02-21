package com.lucky.sgr.hello;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author：LuckySgr.
 * @date: 2022/2/21
 */
public class HelloWorldTest {

    @Test
    public void helloTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("hello-world-beans.xml");
        HelloWorld obj = context.getBean("hello",HelloWorld.class);
        obj.getMessage();
    }

}