package com.lucky.sgr.setter;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author：LuckySgr.
 * @date: 2022/2/21
 */
public class StudentTest {
    private static final Log LOGGER = LogFactory.getLog(StudentTest.class);

    @Test
    public void constructorTest() {
        //获取 ApplicationContext 容器
        ApplicationContext context = new ClassPathXmlApplicationContext("setter-beans.xml");
        //获取名为 student 的 Bean
        SetterStudent setterStudent = context.getBean("setterStudent", SetterStudent.class);
        //通过日志打印学生信息
        LOGGER.info(setterStudent.toString());
    }
}