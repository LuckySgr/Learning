package com.lucky.sgr.extend;

/**
 * @author：LuckySgr.
 * @date: 2022/2/23
 */
public class Dog {
    private String name;
    private Integer age;
    private String call;

    public void setName(String name) {
        System.out.println("Dog setName：" + name);
        this.name = name;
    }

    public void setAge(Integer age) {
        System.out.println("Dog setAge：" + age);
        this.age = age;
    }

    public void setCall(String call) {
        System.out.println("Dog setCall：" + call);
        this.call = call;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", call='" + call + '\'' +
                '}';
    }
}
