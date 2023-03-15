package com.DCMS.main.deyiFan.entity;

/**
 * @author fandeyi
 * @date 2023/3/10 17:03
 * @description TODO
 */
public class Company {

    private Integer id;
    private String        no;
    private String name;
    private  String   type;
    private  String time;
    private  String location;
    private String person;
    private String type01;
    private String level;
    private  String  mode;
    private String tele;
//    private   String companyType;
    private String manage_range;
    private   String  companyLocation;
    private String pScale;
//    private  String   proScale;
    private String speople;
    private  String     sPTel;
    private String sDept;
    private   String   sMangePeoples;
    private String dcPeoples;
    private   String    speJobPeoples;
    private String dcTypes;
    private  String    dangeDcName;
    private String dangeDcRange;
    private   String   storageCapacity;
    private String boundary;
    private   String   img;

    @Override
    public String toString() {
        return "Unit{" +
                "id=" + id +
                ", no='" + no + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", time='" + time + '\'' +
                ", location='" + location + '\'' +
                ", person='" + person + '\'' +
                ", type01='" + type01 + '\'' +
                ", level='" + level + '\'' +
                ", mode='" + mode + '\'' +
                ", tele='" + tele + '\'' +
                ", manage_range='" + manage_range + '\'' +
                ", companyLocation='" + companyLocation + '\'' +
                ", pScale='" + pScale + '\'' +
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
                ", img='" + img + '\'' +
                '}';
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

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
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

    public String getManage_range() {
        return manage_range;
    }

    public void setManage_range(String manage_range) {
        this.manage_range = manage_range;
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

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
