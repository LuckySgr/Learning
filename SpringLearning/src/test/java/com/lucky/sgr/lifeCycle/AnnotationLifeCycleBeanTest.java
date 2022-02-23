package com.lucky.sgr.lifeCycle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author：LuckySgr.
 * @date: 2022/2/23
 */
public class AnnotationLifeCycleBeanTest {
    private static final Log LOGGER = LogFactory.getLog(AnnotationLifeCycleBean.class);

    @Test
    public void AnnotationLifeCycle() {
        //获取 ClassPathXmlApplicationContext 容器
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotation-life-cycle-beans.xml");
        AnnotationLifeCycleBean annotationLifeCycleBean = context.getBean("annotationLifeCycleBean", AnnotationLifeCycleBean.class);
        LOGGER.info(annotationLifeCycleBean);
        //手动销毁 Bean
        context.close();
    }

}