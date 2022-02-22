package com.lucky.sgr.employee;

/**
 * @author：LuckySgr.
 * @date: 2022/2/22
 */
public class Dept {
    private String deptNo;
    private String deptName;

    public Dept(String deptNo, String deptName) {
        this.deptNo = deptNo;
        this.deptName = deptName;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "deptNo='" + deptNo + '\'' +
                ", deptName='" + deptName + '\'' +
                '}';
    }
}
