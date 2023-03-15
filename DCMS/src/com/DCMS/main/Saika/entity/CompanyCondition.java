package com.DCMS.main.Saika.entity;

/**
 * Author：jiangtao_liu
 * Date：2023/3/10
 * Description：
 */
public class CompanyCondition {

    private String name;
    private String location;
    private String type;
    private String begin;
    private String end;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBegin() {
        return begin;
    }

    public void setBegin(String begin) {
        this.begin = begin;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public CompanyCondition(String name, String location, String type) {
        this.name = name;
        this.location = location;
        this.type = type;
    }

    public CompanyCondition(String begin,String end) {
        this.begin = begin;
        this.end = end;
    }

    public CompanyCondition() {
    }

    @Override
    public String toString() {
        return "CompanyCondition{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
