package com.lucky.sgr.employee;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author：LuckySgr.
 * @date: 2022/2/22
 */
public class EmployeeTest {

    private static final Log LOGGER = LogFactory.getLog(EmployeeTest.class);

    @Test
    public void employeeTest() {
        //获取 ApplicationContext 容器
        ApplicationContext context = new ClassPathXmlApplicationContext("employee-beans.xml");
        //获取名为 employee 的 Bean
        Employee employee = context.getBean("employee1", Employee.class);
        //通过日志打印员工信息
        LOGGER.info(employee.toString());
    }

}