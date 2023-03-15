package com.DCMS.main.deyiFan.entity;

/**
 * @author fandeyi
 * @date 2023/3/10 21:19
 * @description TODO
 */
public class Person {

private String name;
private Integer value;

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
