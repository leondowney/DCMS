package com.DCMS.safeProblem.entity;

import java.util.Date;

/**
 * Author：jiangtao_liu
 * Date：2023/3/14
 * Description：
 */
public class SafeHandle {
    private Integer id;
    private String title;
    private String link;
    private String level;
    private String content;
    private String company;
    private String person;
    private Date discoverTime;
    private Date assignTime;
    private String part;
    private String stats;
    private String result;
    private Date handTime;
    private Date closeTime;
    private String oper;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public Date getDiscoverTime() {
        return discoverTime;
    }

    public void setDiscoverTime(Date discoverTime) {
        this.discoverTime = discoverTime;
    }

    public Date getAssignTime() {
        return assignTime;
    }

    public void setAssignTime(Date assignTime) {
        this.assignTime = assignTime;
    }

    public String getPart() {
        return part;
    }

    public void setPart(String part) {
        this.part = part;
    }

    public String getStats() {
        return stats;
    }

    public void setStats(String stats) {
        this.stats = stats;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Date getHandTime() {
        return handTime;
    }

    public void setHandTime(Date handTime) {
        this.handTime = handTime;
    }

    public Date getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(Date closeTime) {
        this.closeTime = closeTime;
    }

    public String getOper() {
        return oper;
    }

    public void setOper(String oper) {
        this.oper = oper;
    }

    @Override
    public String toString() {
        return "SafeHandle{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", link='" + link + '\'' +
                ", level='" + level + '\'' +
                ", content='" + content + '\'' +
                ", company='" + company + '\'' +
                ", person='" + person + '\'' +
                ", discoverTime=" + discoverTime +
                ", assignTime=" + assignTime +
                ", part='" + part + '\'' +
                ", stats='" + stats + '\'' +
                ", result='" + result + '\'' +
                ", handTime='" + handTime + '\'' +
                ", closeTime='" + closeTime + '\'' +
                ", oper='" + oper + '\'' +
                '}';
    }
}
