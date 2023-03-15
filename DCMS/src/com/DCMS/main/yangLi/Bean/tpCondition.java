package com.DCMS.main.yangLi.Bean;

import java.util.Date;

/**
 * author: 李洋
 * datetime:2023/3/11 14:34
 * email:1473321819@qq.com
 *
 * @description:
 */
public class tpCondition {
    private Integer id;
    private Date date;
    private String name;
    private  String  url;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "tpCondition{" +
                "id=" + id +
                ", date=" + date +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
