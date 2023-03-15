package com.DCMS.main.xiaodongLan.bean;

/**
 * @author 兰晓东
 * @create 2023-03-10 20:56
 * @describe:
 */
public class CompanyStoryQuery {

    private Integer companyId;      // 公司序列号
    private String id;              // 产品批次
    private String proName;         // 产品名称
    private String proTime;          // 生产日期


    public String getProTime() {
        return proTime;
    }

    public void setProTime(String proTime) {
        this.proTime = proTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }


    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }
}
