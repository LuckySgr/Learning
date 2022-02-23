package com.lucky.sgr.lifeCycle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author：LuckySgr.
 * @date: 2022/2/23
 */
public class LifeCycleBeanTest {
    private static final Log LOGGER = LogFactory.getLog(LifeCycleBeanTest.class);
    @Test
    public void LifeCycleBean() {
        //获取 ClassPathXmlApplicationContext 容器
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("life-cycle-beans.xml");
        LifeCycleBean lifeCycleBean = context.getBean("lifeCycleBean", LifeCycleBean.class);
        LOGGER.info(lifeCycleBean);
        //手动销毁 Bean
        context.close();
    }

}