package com.DCMS.main.yangLi.Bean;

/**
 * author: 李洋
 * datetime:2023/3/10 19:26
 * email:1473321819@qq.com
 *
 * @description:
 */
public class DangerouscCondition {
    private  Integer cid;
    private String hth;
    private String htmc;
    private String htrq;


    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getHth() {
        return hth;
    }

    public void setHth(String hth) {
        this.hth = hth;
    }

    public String getHtmc() {
        return htmc;
    }

    public void setHtmc(String htmc) {
        this.htmc = htmc;
    }

    public String getHtrq() {
        return htrq;
    }

    public void setHtrq(String htrq) {
        this.htrq = htrq;
    }

    @Override
    public String toString() {
        return "DangerouscCondition{" +
                "cid=" + cid +
                ", hth='" + hth + '\'' +
                ", htmc='" + htmc + '\'' +
                ", htrq='" + htrq + '\'' +
                '}';
    }
}
