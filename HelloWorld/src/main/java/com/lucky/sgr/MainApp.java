package com.lucky.sgr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author：LuckySgr.
 * @date: 2022/2/21
 */
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        HelloWorld obj = context.getBean("helloWorld",HelloWorld.class);
        obj.getMessage();
    }
}
