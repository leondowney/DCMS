package com.DCMS.main.Saika.entity;

/**
 * Author：jiangtao_liu
 * Date：2023/3/10
 * Description：
 */
public class AccidentCondition {

    private String name;
    private String level;
    private String time;
    private Integer cid;

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

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public AccidentCondition(String name, String level, String time, Integer cid) {
        this.name = name;
        this.level = level;
        this.time = time;
        this.cid = cid;
    }

    public AccidentCondition(){};
}
