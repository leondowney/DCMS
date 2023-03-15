package com.DCMS.safeProblem.entity;

/**
 * Author：jiangtao_liu
 * Date：2023/3/14
 * Description：
 */
public class SafeHandleCondition {

    private String title;
    private String link;
    private String level;
    private String company;
    private String stats;
    private String begin;
    private String end;

    public SafeHandleCondition(String title, String link, String level, String company, String stats, String begin, String end) {
        this.title = title;
        this.link = link;
        this.level = level;
        this.company = company;
        this.stats = stats;
        this.begin = begin;
        this.end = end;
    }

    public SafeHandleCondition(){}

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

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getStats() {
        return stats;
    }

    public void setStats(String stats) {
        this.stats = stats;
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

    @Override
    public String toString() {
        return "SafeHandleCondition{" +
                "title='" + title + '\'' +
                ", link='" + link + '\'' +
                ", level='" + level + '\'' +
                ", company='" + company + '\'' +
                ", stats='" + stats + '\'' +
                ", begin='" + begin + '\'' +
                ", end='" + end + '\'' +
                '}';
    }
}
