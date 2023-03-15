package com.DCMS.main.Saika.entity;

/**
 * Author：jiangtao_liu
 * Date：2023/3/11
 * Description：叠加柱状图的mysql实体类
 */
public class CompanySuperposition {

    private String location;
    private String type01;
    private Integer count;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getType01() {
        return type01;
    }

    public void setType01(String type01) {
        this.type01 = type01;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "CompanySuperposition{" +
                "location='" + location + '\'' +
                ", type01='" + type01 + '\'' +
                ", count=" + count +
                '}';
    }
}
