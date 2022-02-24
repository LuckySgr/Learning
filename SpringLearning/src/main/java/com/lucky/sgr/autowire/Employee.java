package com.lucky.sgr.autowire;

/**
 * @author：LuckySgr.
 * @date: 2022/2/24
 */
public class Employee {
    private String empNo;
    private String empName;
    private Dept dept;

    public Employee() {
        System.out.println("正在执行 Employee 的无参构造方法>>>>");
    }

    public Employee(String empNo, String empName, Dept dept) {
        System.out.println("正在执行 Employee 的有参构造方法>>>>");
        this.empNo = empNo;
        this.empName = empName;
        this.dept = dept;
    }

    public String getEmpNo() {
        System.out.println("正在执行 Employee 的 getEmpNo 方法>>>>");
        return empNo;
    }

    public void setEmpNo(String empNo) {
        System.out.println("正在执行 Employee 的 setEmpNo 方法>>>>");
        this.empNo = empNo;
    }

    public String getEmpName() {
        System.out.println("正在执行 Employee 的 getEmpName 方法>>>>");
        return empName;
    }

    public void setEmpName(String empName) {
        System.out.println("正在执行 Employee 的 setEmpName 方法>>>>");
        this.empName = empName;
    }

    public Dept getDept() {
        System.out.println("正在执行 Employee 的 getDept 方法>>>>");
        return dept;
    }

    public void setDept(Dept dept) {
        System.out.println("正在执行 Employee 的 setDept 方法>>>>");
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
