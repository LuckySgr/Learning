package com.lucky.sgr.employee;

/**
 * @author：LuckySgr.
 * @date: 2022/2/22
 */
public class Employee {
    private String empNo;
    private String empName;
    private Dept dept;

    public Employee(String empNo, String empName, Dept dept) {
        this.empNo = empNo;
        this.empName = empName;
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empNo='" + empNo + '\'' +
                ", empName='" + empName + '\'' +
                ", dept=" + dept +
                '}';
    }
}
