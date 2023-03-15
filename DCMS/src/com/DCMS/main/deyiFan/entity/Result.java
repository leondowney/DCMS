package com.DCMS.main.deyiFan.entity;

/**
 * @author fandeyi
 * @date 2023/3/11 10:54
 * @description TODO
 */
public class Result {

    private Integer status;
    private String msg;
    private Object data1;
    private Object data2;
    private Object data3;
    private Object data4;


    @Override
    public String toString() {
        return "Result{" +
                "status=" + status +
                ", msg='" + msg + '\'' +
                ", data1=" + data1 +
                ", data2=" + data2 +
                ", data3=" + data3 +
                ", data4=" + data4 +
                '}';
    }

    public Result() {
    }

    public Result(Integer status, String msg, Object data1, Object data2, Object data3, Object data4) {
        this.status = status;
        this.msg = msg;
        this.data1 = data1;
        this.data2 = data2;
        this.data3 = data3;
        this.data4 = data4;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData1() {
        return data1;
    }

    public void setData1(Object data1) {
        this.data1 = data1;
    }

    public Object getData2() {
        return data2;
    }

    public void setData2(Object data2) {
        this.data2 = data2;
    }

    public Object getData3() {
        return data3;
    }

    public void setData3(Object data3) {
        this.data3 = data3;
    }

    public Object getData4() {
        return data4;
    }

    public void setData4(Object data4) {
        this.data4 = data4;
    }
}
