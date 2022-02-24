package com.lucky.sgr.autowire;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author：LuckySgr.
 * @date: 2022/2/24
 */
public class EmployeeTest {

    @Test
    public void Employee() {
        ApplicationContext context = new ClassPathXmlApplicationContext("autowire-beans.xml");
        Employee bean = context.getBean("employee", Employee.class);
        System.out.println(bean);
    }

}