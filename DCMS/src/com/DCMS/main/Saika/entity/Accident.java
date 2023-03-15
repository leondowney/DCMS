package com.DCMS.main.Saika.entity;

import java.util.Date;

/**
 * Author：jiangtao_liu
 * Date：2023/3/10
 * Description：
 */
public class Accident {

    private String no;
    private String name;
    private String level;
    private Date time;
    private String type;
    private String person;
    private String person01;
    private String num;
    private String lost;
    private String type01;
    private Integer cid;

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

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public String getPerson01() {
        return person01;
    }

    public void setPerson01(String person01) {
        this.person01 = person01;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getLost() {
        return lost;
    }

    public void setLost(String lost) {
        this.lost = lost;
    }

    public String getType01() {
        return type01;
    }

    public void setType01(String type01) {
        this.type01 = type01;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    @Override
    public String toString() {
        return "Accident{" +
                "no='" + no + '\'' +
                ", name='" + name + '\'' +
                ", level='" + level + '\'' +
                ", time=" + time +
                ", type='" + type + '\'' +
                ", person='" + person + '\'' +
                ", person01='" + person01 + '\'' +
                ", num='" + num + '\'' +
                ", lost='" + lost + '\'' +
                ", type01='" + type01 + '\'' +
                ", cid=" + cid +
                '}';
    }
}
