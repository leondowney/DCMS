package com.DCMS.main.xiaodongLan.bean;

/**
 * @author 兰晓东
 * @create 2023-03-10 17:37
 * @describe:
 */
public class Result {

    private Integer status;
    private String msg;
    private Object data;


    public Result() {
    }

    public Result(Integer status, String msg, Object data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
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

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
