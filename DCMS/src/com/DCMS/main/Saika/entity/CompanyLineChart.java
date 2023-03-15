package com.DCMS.main.Saika.entity;

/**
 * Author：jiangtao_liu
 * Date：2023/3/13
 * Description：折线趋势图sql实体类
 */
public class CompanyLineChart {

    private String month;
    private String type01;
    private Integer count;

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
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
        return "CompanyLineChart{" +
                "month='" + month + '\'' +
                ", type01='" + type01 + '\'' +
                ", count=" + count +
                '}';
    }
}
