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

    @Override
    public String toString() {
        return "ExampleBean{" +
                "propertyNull='" + propertyNull + '\'' +
                ", propertyEmpty='" + propertyEmpty + '\'' +
                ", propertyLiteral='" + propertyLiteral + '\'' +
                ", propertyLiterals='" + propertyLiterals + '\'' +
                '}';
    }
}
