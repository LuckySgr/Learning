package com.lucky.sgr.collection;

/**
 * @author：LuckySgr.
 * @date: 2022/2/22
 */
public class Course {
    private Integer courseId;
    private String courseName;

    public Course(Integer courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                '}';
    }
}
