package com.lucky.sgr.otherType;

/**
 * @author：LuckySgr.
 * @date: 2022/2/22
 */
public class ExampleBean {
    private String propertyNull;
    private String propertyEmpty;
    private String propertyLiteral;
    private String propertyLiterals;
    //依赖的 Bean(对象属性)
    private DependBean dependBean;

    public void setPropertyNull(String propertyNull) {
        this.propertyNull = propertyNull;
    }

    public void setPropertyEmpty(String propertyEmpty) {
        this.propertyEmpty = propertyEmpty;
    }

    public void setPropertyLiteral(String propertyLiteral) {
        this.propertyLiteral = propertyLiteral;
    }

    public void setPropertyLiterals(String propertyLiterals) {
        this.propertyLiterals = propertyLiterals;
    }

    public void setDependBean(DependBean dependBean) {
        this.dependBean = dependBean;
    }

    //使用级联属性赋值时，需提供一个依赖对象的 getXxx() 方法
    public DependBean getDependBean() {
        return dependBean;
    }

    @Override
    public String toString() {
        return "ExampleBean{" +
                "propertyNull='" + propertyNull + '\'' +
                ", propertyEmpty='" + propertyEmpty + '\'' +
                ", propertyLiteral='" + propertyLiteral + '\'' +
                ", propertyLiterals='" + propertyLiterals + '\'' +
                ", dependBean=" + dependBean +
                '}';
    }
}
