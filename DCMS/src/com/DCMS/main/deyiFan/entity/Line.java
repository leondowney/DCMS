package com.DCMS.main.deyiFan.entity;

/**
 * @author fandeyi
 * @date 2023/3/11 15:56
 * @description TODO
 */
public class Line {

    private String name;
    private Integer count;
    private String time;

    @Override
    public String toString() {
        return "Line{" +
                "name='" + name + '\'' +
                ", count=" + count +
                ", time='" + time + '\'' +
                '}';
    }

    public Line() {
    }

    public Line(String name, Integer count, String time) {
        this.name = name;
        this.count = count;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
