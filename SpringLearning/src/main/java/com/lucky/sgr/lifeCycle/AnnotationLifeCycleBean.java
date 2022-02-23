package com.lucky.sgr.lifeCycle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/*

@PostConstruct和@PreDestroy已在Java 11中完全删除。

要继续使用它们，需要将 javax.annotation-api 添加到依赖项中。

<!-- https://mvnrepository.com/artifact/javax.annotation/javax.annotation-api -->
<dependency>
    <groupId>javax.annotation</groupId>
    <artifactId>javax.annotation-api</artifactId>
    <version>1.3.2</version>
</dependency>

 */

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author：LuckySgr.
 * @date: 2022/2/23
 */
public class AnnotationLifeCycleBean {
    private static final Log LOGGER = LogFactory.getLog(AnnotationLifeCycleBean.class);

    private String webName;
    private String url;

    public AnnotationLifeCycleBean(String webName, String url) {
        this.webName = webName;
        this.url = url;
    }

    @Override
    public String toString() {
        return "AnnotationLifeCycleBean{" +
                "webName='" + webName + '\'' +
                ", url='" + url + '\'' +
                '}';
    }

    /**
     * 初始化回调方法
     */
    @PostConstruct
    public void init() {
        LOGGER.info("通过 @PostConstruct 注解，指定初始化方法：init() 方法");
    }

    /**
     * 销毁回调方法
     */
    @PreDestroy
    public void destroy() {
        LOGGER.info("通过 @PreDestroy 注解，指定初始化方法：destroy() 方法");
    }
}
