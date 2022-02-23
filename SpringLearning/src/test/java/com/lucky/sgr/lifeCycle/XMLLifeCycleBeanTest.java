package com.lucky.sgr.lifeCycle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * @author：LuckySgr.
 * @date: 2022/2/23
 */
public class XMLLifeCycleBeanTest {
    private static final Log LOGGER = LogFactory.getLog(XMLLifeCycleBeanTest.class);

    @Test
    public void XMLLifeCycle() {
        //获取 ClassPathXmlApplicationContext 容器
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("xml-life-cycle-beans.xml");
        XMLLifeCycleBean xmlLifeCycleBean = context.getBean("xmlLifeCycleBean", XMLLifeCycleBean.class);
        LOGGER.info(xmlLifeCycleBean);
        //手动销毁 Bean
        context.close();
    }

}