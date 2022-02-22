package com.lucky.sgr.otherType;

/**
 * @author：LuckySgr.
 * @date: 2022/2/22
 */
public class ExampleBean {
    private DependBean dependBean;

    //使用级联属性赋值时，需提供一个依赖对象的 getXxx() 方法
    public void setDependBean(DependBean dependBean) {
        this.dependBean = dependBean;
    }

    public DependBean getDependBean() {
        return dependBean;
    }

    @Override
    public String toString() {
        return "ExampleBean{" +
                "dependBean=" + dependBean +
                '}';
    }
}
