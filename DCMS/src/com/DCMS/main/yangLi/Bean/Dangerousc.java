package com.DCMS.main.yangLi.Bean;

import java.util.Date;

/**
 * author: 李洋
 * datetime:2023/3/10 11:20
 * email:1473321819@qq.com
 *
 * @description:
 */
public class Dangerousc {
    private  String  no;
    private String name;
    private  String goods;
    private Date time;
    private String  unit;
    private String person;
    private String tele;
    private String  num;

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGoods() {
        return goods;
    }

    public void setGoods(String goods) {
        this.goods = goods;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public String getTele() {
        return tele;
    }

    public void setTele(String tele) {
        this.tele = tele;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Dangerousc{" +
                "no='" + no + '\'' +
                ", name='" + name + '\'' +
                ", goods='" + goods + '\'' +
                ", time=" + time +
                ", unit='" + unit + '\'' +
                ", person='" + person + '\'' +
                ", tele='" + tele + '\'' +
                ", num='" + num + '\'' +
                '}';
    }
}
