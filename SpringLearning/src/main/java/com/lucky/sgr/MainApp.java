package com.lucky.sgr;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author：LuckySgr.
 * @date: 2022/2/21
 */
public class MainApp {
    private static final Log LOGGER = LogFactory.getLog(MainApp.class);
    public static void main(String[] args) {
        //获取 ApplicationContext 容器
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        //获取名为 student 的 Bean
        Student student = context.getBean("student",Student.class);
        //通过日志打印学生信息
        LOGGER.info(student.toString());
    }
}
