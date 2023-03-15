package com.DCMS.main.xiaodongLan.bean;

import java.util.Date;

/**
 * @author 兰晓东
 * @create 2023-03-10 11:56
 * @describe:
 */
public class Company {

    private Integer id;  //序列号
    private String no;  //  工商营业执照编号
    private String name;  // 单位名称
    private  String type;  //单位类型
    private Date time;    // 成立时间
    private String location;  //所在区域
    private String person;    //法定代表人
    private String type01;    //企业化工行业分类
    private String level;   // 安全等级
    private String mode;  //主要产品与规模
    private String tele;  // 联系电话
    private String companyType;  //公司性质
    private String manageRange; // 经营范围
    private String companyLocation; // 公司地址
    private String pScale;         // 人员规模
    private String proScale;        //产品规模
    private String speople;        //企业分管安全负责人
    private String sPTel;          //企业分管安全负责人联系电话
    private String sDept;         //安全管理部门
    private String sMangePeoples;  //安全管理人数
    private String dcPeoples;      // 危险化学品作业人数
    private String speJobPeoples;    // 特种作业人员人数
    private String dcTypes;          //重点监管的危险化工工艺总数
    private String dangeDcName;      //重点监管的危险化工工艺名称
    private String dangeDcRange;       //危险化学品库房或仓储 场所建筑面积（平方米
    private String storageCapacity;     //存储容量
    private String boundary;            //厂区边界外 1000米范围内的单位或设施情况
    private String accidentNo;       //事故编号
    private Date registTime;      // 注册时间


    public String getManageRange() {
        return manageRange;
    }

    public void setManageRange(String manageRange) {
        this.manageRange = manageRange;
    }

    public String getDcPeoples() {
        return dcPeoples;
    }

    public void setDcPeoples(String dcPeoples) {
        this.dcPeoples = dcPeoples;
    }

    public String getSpeJobPeoples() {
        return speJobPeoples;
    }

    public void setSpeJobPeoples(String speJobPeoples) {
        this.speJobPeoples = speJobPeoples;
    }

    public Date getRegistTime() {
        return registTime;
    }

    public void setRegistTime(Date registTime) {
        this.registTime = registTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public String getType01() {
        return type01;
    }

    public void setType01(String type01) {
        this.type01 = type01;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getTele() {
        return tele;
    }

    public void setTele(String tele) {
        this.tele = tele;
    }

    public String getCompanyType() {
        return companyType;
    }

    public void setCompanyType(String companyType) {
        this.companyType = companyType;
    }

    public String getManage_range() {
        return manageRange;
    }

    public void setManage_range(String manage_range) {
        this.manageRange = manage_range;
    }

    public String getCompanyLocation() {
        return companyLocation;
    }

    public void setCompanyLocation(String companyLocation) {
        this.companyLocation = companyLocation;
    }

    public String getpScale() {
        return pScale;
    }

    public void setpScale(String pScale) {
        this.pScale = pScale;
    }

    public String getProScale() {
        return proScale;
    }

    public void setProScale(String proScale) {
        this.proScale = proScale;
    }

    public String getSpeople() {
        return speople;
    }

    public void setSpeople(String speople) {
        this.speople = speople;
    }

    public String getsPTel() {
        return sPTel;
    }

    public void setsPTel(String sPTel) {
        this.sPTel = sPTel;
    }

    public String getsDept() {
        return sDept;
    }

    public void setsDept(String sDept) {
        this.sDept = sDept;
    }

    public String getsMangePeoples() {
        return sMangePeoples;
    }

    public void setsMangePeoples(String sMangePeoples) {
        this.sMangePeoples = sMangePeoples;
    }

    public String getDcTypes() {
        return dcTypes;
    }

    public void setDcTypes(String dcTypes) {
        this.dcTypes = dcTypes;
    }

    public String getDangeDcName() {
        return dangeDcName;
    }

    public void setDangeDcName(String dangeDcName) {
        this.dangeDcName = dangeDcName;
    }

    public String getDangeDcRange() {
        return dangeDcRange;
    }

    public void setDangeDcRange(String dangeDcRange) {
        this.dangeDcRange = dangeDcRange;
    }

    public String getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(String storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public String getBoundary() {
        return boundary;
    }

    public void setBoundary(String boundary) {
        this.boundary = boundary;
    }

    public String getAccidentNo() {
        return accidentNo;
    }

    public void setAccidentNo(String accidentNo) {
        this.accidentNo = accidentNo;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", no='" + no + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", time=" + time +
                ", location='" + location + '\'' +
                ", person='" + person + '\'' +
                ", type01='" + type01 + '\'' +
                ", level='" + level + '\'' +
                ", mode='" + mode + '\'' +
                ", tele='" + tele + '\'' +
                ", companyType='" + companyType + '\'' +
                ", manageRange='" + manageRange + '\'' +
                ", companyLocation='" + companyLocation + '\'' +
                ", pScale='" + pScale + '\'' +
                ", proScale='" + proScale + '\'' +
                ", speople='" + speople + '\'' +
                ", sPTel='" + sPTel + '\'' +
                ", sDept='" + sDept + '\'' +
                ", sMangePeoples='" + sMangePeoples + '\'' +
                ", dcPeoples='" + dcPeoples + '\'' +
                ", speJobPeoples='" + speJobPeoples + '\'' +
                ", dcTypes='" + dcTypes + '\'' +
                ", dangeDcName='" + dangeDcName + '\'' +
                ", dangeDcRange='" + dangeDcRange + '\'' +
                ", storageCapacity='" + storageCapacity + '\'' +
                ", boundary='" + boundary + '\'' +
                ", accidentNo='" + accidentNo + '\'' +
                ", registTime=" + registTime +
                '}';
    }
}
