package com.lucky.sgr.otherType;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author：LuckySgr.
 * @date: 2022/2/22
 */
public class ExampleBeanTest {
    private static final Log LOGGER = LogFactory.getLog(ExampleBeanTest.class);

    @Test
    public void otherTypeTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("other-type-beans.xml");
        ExampleBean exampleBean = context.getBean("other", ExampleBean.class);
        LOGGER.info(exampleBean.toString());
    }

}