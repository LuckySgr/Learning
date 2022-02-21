package com.lucky.sgr;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @author：LuckySgr.
 * @date: 2022/2/21
 */
public class Student {
    private static final Log LOGGER = LogFactory.getLog(Student.class);
    private int id;
    private String name;
    private Grade grade;

    public Student(int id, String name, Grade grade) {
        LOGGER.info("正在执行 Student 的有参构造方法，参数分别为：id=" + id + ",name=" + name + ",grade=" + grade);
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}
