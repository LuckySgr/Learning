package com.lucky.sgr.setter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @author：LuckySgr.
 * @date: 2022/2/21
 */
public class SetterGrade {
    private static final Log LOGGER = LogFactory.getLog(SetterGrade.class);
    private Integer gradeId;
    private String gradeName;

    public SetterGrade() {
    }

    public void setGradeId(Integer gradeId) {
        LOGGER.info("正在执行 Grade 类的 setGradeId() 方法…… ");
        this.gradeId = gradeId;
    }

    public void setGradeName(String gradeName) {
        LOGGER.info("正在执行 Grade 类的 setGradeName() 方法…… ");
        this.gradeName = gradeName;
    }

    @Override
    public String toString() {
        return "SetterGrade{" +
                "gradeId=" + gradeId +
                ", gradeName='" + gradeName + '\'' +
                '}';
    }
}
