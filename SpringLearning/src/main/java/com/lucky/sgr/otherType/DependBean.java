package com.lucky.sgr.otherType;

/**
 * @author：LuckySgr.
 * @date: 2022/2/22
 */
public class DependBean {
    private String dependProperty;

    public void setDependProperty(String dependProperty) {
        this.dependProperty = dependProperty;
    }

    @Override
    public String toString() {
        return "DependBean{" +
                "dependProperty='" + dependProperty + '\'' +
                '}';
    }
}
