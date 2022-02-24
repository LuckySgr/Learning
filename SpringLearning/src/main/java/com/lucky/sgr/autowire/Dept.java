package com.lucky.sgr.autowire;

/**
 * @author：LuckySgr.
 * @date: 2022/2/24
 */
public class Dept {
    private String deptNo;
    private String deptName;

    public Dept() {
        System.out.println("正在执行 Dept 的无参构造方法>>>>");
    }

    public Dept(String deptNo, String deptName) {
        System.out.println("正在执行 Dept 的有参构造方法>>>>");
        this.deptNo = deptNo;
        this.deptName = deptName;
    }

    public String getDeptNo() {
        System.out.println("正在执行 Dept 的 getDeptNo 方法>>>>");
        return deptNo;
    }

    public void setDeptNo(String deptNo) {
        System.out.println("正在执行 Dept 的 setDeptNo 方法>>>>");
        this.deptNo = deptNo;
    }

    public String getDeptName() {
        System.out.println("正在执行 Dept 的 getDeptName 方法>>>>");
        return deptName;
    }

    public void setDeptName(String deptName) {
        System.out.println("正在执行 Dept 的 setDeptName 方法>>>>");
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
