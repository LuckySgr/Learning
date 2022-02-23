package com.lucky.sgr.extend;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author：LuckySgr.
 * @date: 2022/2/23
 */
public class DogTest {

    @Test
    public void Dog() {
        ApplicationContext context = new ClassPathXmlApplicationContext("extend-beans.xml");
        Dog dog = context.getBean("dog", Dog.class);
        System.out.println(dog);
    }

}