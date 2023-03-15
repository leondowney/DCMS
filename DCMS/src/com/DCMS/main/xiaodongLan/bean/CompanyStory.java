package com.DCMS.main.xiaodongLan.bean;

import java.util.Date;

/**
 * @author 兰晓东
 * @create 2023-03-10 20:44
 * @describe:  公司产品列表实体类
 */
public class CompanyStory {

    private String id;   // 产品批次
    private String proName;   // 产品名称
    private String proType;   // 产品类型
    private String anotherName;  // 别名
    private String molecule;    // 分子式
    private String nums;          // 数量
    private int companyId;     //公司序列号
    private Date proTime;       // 生产日期

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

    public String getProType() {
        return proType;
    }

    public void setProType(String proType) {
        this.proType = proType;
    }

    public String getAnotherName() {
        return anotherName;
    }

    public void setAnotherName(String anotherName) {
        this.anotherName = anotherName;
    }

    public String getMolecule() {
        return molecule;
    }

    public void setMolecule(String molecule) {
        this.molecule = molecule;
    }

    public String getNums() {
        return nums;
    }

    public void setNums(String nums) {
        this.nums = nums;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public Date getProTime() {
        return proTime;
    }

    public void setProTime(Date proTime) {
        this.proTime = proTime;
    }


    @Override
    public String toString() {
        return "CompanyStory{" +
                "id=" + id +
                ", proName='" + proName + '\'' +
                ", proType='" + proType + '\'' +
                ", anotherName='" + anotherName + '\'' +
                ", molecule='" + molecule + '\'' +
                ", nums=" + nums +
                ", companyId=" + companyId +
                ", proTime=" + proTime +
                '}';
    }
}
