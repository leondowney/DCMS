package com.DCMS.main.Saika.entity;

/**
 * Author：jiangtao_liu
 * Date：2023/3/11
 * Description：饼图,柱状图实体类
 */
public class CompanyAnalysis {

    private String name;
    private Integer value;

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

    @Override
    public String toString() {
        return "CompanyAnalysis{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
