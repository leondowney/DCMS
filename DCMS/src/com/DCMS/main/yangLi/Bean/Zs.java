package com.DCMS.main.yangLi.Bean;

import java.util.Date;

/**
 * author: 李洋
 * datetime:2023/3/11 14:18
 * email:1473321819@qq.com
 *
 * @description:
 */
public class Zs {
    private Date date;
    private Integer id;
    private String  name;
    private String  url;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
        return "Zs{" +
                "date=" + date +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
