package com.lucky.sgr.setter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @author：LuckySgr.
 * @date: 2022/2/21
 */
public class SetterStudent {
    private static final Log LOGGER = LogFactory.getLog(SetterStudent.class);
    private int id;
    private String name;
    private SetterGrade setterGrade;

    //无参构造方法，在没有其他带参构造方法的情况下，可以省略
    public SetterStudent() {
    }

    public void setId(int id) {
        LOGGER.info("正在执行 Student 类的 setId() 方法…… ");
        this.id = id;
    }

    public void setName(String name) {
        LOGGER.info("正在执行 Student 类的 setName() 方法…… ");
        this.name = name;
    }

    public void setSetterGrade(SetterGrade setterGrade) {
        LOGGER.info("正在执行 Student 类的 setGrade() 方法…… ");
        this.setterGrade = setterGrade;
    }

    @Override
    public String toString() {
        return "SetterStudent{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", setterGrade=" + setterGrade +
                '}';
    }
}
