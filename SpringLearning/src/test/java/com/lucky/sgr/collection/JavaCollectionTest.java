package com.lucky.sgr.collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author：LuckySgr.
 * @date: 2022/2/22
 */
public class JavaCollectionTest {
    private static final Log LOGGER = LogFactory.getLog(JavaCollectionTest.class);

    @Test
    public void collectionTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("collection-beans.xml");
        JavaCollection javaCollection = context.getBean("collection", JavaCollection.class);
        LOGGER.info(javaCollection.toString());
    }

}